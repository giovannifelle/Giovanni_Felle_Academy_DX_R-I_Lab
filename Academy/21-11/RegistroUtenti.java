import java.util.ArrayList;

public class RegistroUtenti {

    private ArrayList<Utente> registroUtenti;
    private Utente utenteInSessione;
    private Integer numeroUtenti;

    public RegistroUtenti() {
        this.registroUtenti = new ArrayList<>();
        this.numeroUtenti=1;
    }

    public ArrayList<Utente> getRegistroUtenti() {
        return registroUtenti;
    }


    public void aggiungiUtente(Utente u){
        registroUtenti.add(u);
    }

    public void registrazione(String nome, String password){
        if(!cercaPerNome(nome)){
            Utente u=new Utente(numeroUtenti, nome, password);
            aggiungiUtente(u);
            numeroUtenti++;
            System.out.println("Registrazione avvenuta con successo!");
            return;
        }
        System.err.println("Nome già in uso");

    }
    public void login(String nome, String password){
        Utente u=cerca(nome, password);
        if(u==null){
            System.err.println("Nessun Utente trovato");
            return;
        }else{
            System.out.println("Login avvenuto con successo;");
            utenteInSessione=u;
        }
    }
    public boolean cercaPerNome(String nome){
        for(Utente u: registroUtenti){
            if(u.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    public Utente cerca(String nome, String password){
        for(Utente u: registroUtenti){
            if(u.getNome().equals(nome)&&u.getPassword().equals(password)){
                return u;
            }
        }
        return null;
    }

    public String toString(){
        String listaUtenti="Lista Utenti\n";
        for(Utente u: registroUtenti){
            listaUtenti=listaUtenti+u.toString();
        }
        return listaUtenti;
    }
}
