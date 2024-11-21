package EsercizioRistorante;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nome,email,scelta,password;
        Ristorante ristorante=new Ristorante();
        Utente utente=null;
        while(true){
            System.out.print("Inserisci nome: ");
            nome= scanner.nextLine();
            System.out.print("Email: ");
            email= scanner.nextLine();
            System.out.println("Che ruolo ricopri?");
            System.out.print("1. Chef\n" +
                    "2. Critico\n");
            scelta= scanner.nextLine();
            switch(scelta){
                case "1":
                    System.out.println("Inserire password chef: ");
                    password=scanner.nextLine();
                    if(Chef.checkPassword(password)){
                        System.out.println("Benvenuto Chef!");
                        utente=new Chef(email, nome);
                    }else{
                        System.out.println("Password errata!");
                        break;
                    }
                case "2":
                    System.out.println("Inserire password critico: ");
                    password=scanner.nextLine();
                    if(Critico.checkPassword(password)){
                        System.out.println("Benvenuto Critico!");
                        utente=new Critico(email, nome);
                    }else{
                        System.out.println("Password errata!");
                        break;
                    }
                default:
                    System.out.println("Carattere non riconosciuto");
                    break;
            }
            if(utente instanceof Chef){
                int numPiatti=0;
                String piatto;
                while(true){
                    System.out.println("---------------------");
                    System.out.println("Cosa vuoi fare:\n" +
                            "1. Guarda profilo\n" +
                            "2. Aggiungi piatti\n");
                    if(numPiatti>=3){
                        System.out.println("3. Stampa piatti\n");
                    }
                    scelta= scanner.nextLine();
                    switch (scelta){
                        case "1":
                            System.out.println("La tua mail è "+email+" con nome: Chef"+nome);
                            break;
                        case "2":
                            System.out.print("Aggiungi piatto:");
                            piatto= scanner.nextLine();
                            utente.aggiungiPiatto(piatto);
                            ristorante.aggiungiPiatto(piatto);
                            break;
                    }
                }
            }
        }
    }
}
