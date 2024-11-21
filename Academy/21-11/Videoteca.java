import java.util.ArrayList;

public class Videoteca {

    private ArrayList<Film> catalogo;
    private ArrayList<Film> catalogoNoleggiati;
    public final Integer MAX_NOLEGGI=3;

    //Non si mettono le credenziali in caro nel codice, ma per questa volta va bene
    private String nomeUtente = "admin";
    private String password = "password";

    public Videoteca() {
        this.catalogo = new ArrayList<>();
        this.catalogoNoleggiati = new ArrayList<>();
    }

    public ArrayList<Film> getCatalogo() {
        return catalogo;
    }


    public void aggiungiFilm(String nome, Integer anno) {
        Film film = new Film(nome, anno);
        if (!cercaFilm(film)) {
            catalogo.add(film);
            System.out.println("Film aggiunto con successo!");
            return;
        }
        System.err.println("Il film è gia presente!");
    }

    public void rimuoviFilm(String nome, Integer anno) {
        Film film = new Film(nome, anno);
        if (cercaFilm(film)) {
            catalogo.remove(film);
            System.out.println("Film rimosso con successo!");
            return;
        }
        System.err.println("Il film non è presente");
    }

    public boolean cercaFilm(Film film) {
        for (Film f : catalogo) {
            if (f.equals(film)) {
                System.out.println("Il film è gia presente");
                return true;
            }
        }
        return false;
    }

    public void cercaFilmPerNome(String nome) {
        boolean nonTrovato = true;
        for (Film f : catalogo) {
            if (f.getNome().equals(nome)) {
                System.out.println(f.toString());
                nonTrovato = false;
            }
        }
        if (nonTrovato) {
            System.out.println("Non è presente alcun film con il nome indicato");
        }
    }

    public void cercaFilmPerAnno(Integer anno) {
        boolean nonTrovato = true;
        for (Film f : catalogo) {
            if (f.getAnno().equals(anno)) {
                System.out.println(f.toString());
                nonTrovato = false;
            }
        }
        if (nonTrovato) {
            System.out.println("Non è presente alcun film con l'anno indicato");
        }
    }

    public void visualizzaCatalogo() {
        System.out.println("Film presenti nel catalogo:");
        for (Film film : catalogo) {
            System.out.println(film);
        }
    }

    public boolean verificaCredenziali(String nome, String password) {
        if (nome.equals(nomeUtente) && password.equals(this.password)) {
            return true;
        }
        return false;
    }

    public void noleggiaFilm(Utente u, String nome, Integer anno){
        Film film=new Film(nome, anno);
        if(!catalogo.contains(film)){
            System.err.println("Il film descritto non esiste!");
            return;
        }
        if(catalogoNoleggiati.contains(film)){
            System.out.println("Il film non è disponibile!");
            return;
        }
        if(u.getFilmNoleggiati().size()>=MAX_NOLEGGI){
            System.out.println("Hai già noleggiato " + MAX_NOLEGGI+ "film, non puoi noleggiare altri film!");
            return;
        }
        u.addFilm(film);
        catalogoNoleggiati.add(film);
        System.out.println("Film noleggiato con successo!");
    }

    public void rilasciaFilm(Utente u, String nome, Integer anno){
        Film film=new Film(nome, anno);
        if(catalogo.contains(film)){
            System.err.println("Il film descritto non esiste!");
            return;
        }
        if(!u.getFilmNoleggiati().contains(film)){
            System.out.println("Non hai noleggiato questo film!");
            return;
        }
        u.removeFilm(film);
        catalogoNoleggiati.remove(film);
        System.out.println("Film rilasciato con successo");
    }}
