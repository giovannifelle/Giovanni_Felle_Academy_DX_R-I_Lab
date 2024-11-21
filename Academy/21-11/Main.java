import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RegistroUtenti registroUtenti = new RegistroUtenti();
        Videoteca videoteca = new Videoteca();
        Scanner scannerStr = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        String scelta, nome, password, nomeFilm;
        Integer anno;
        //Doppio ciclo, controlla pirma se vogliamo fare l'accesso come videoteca impostando tutto l'utile, poi gli utenti potranno interagire
        while (true) {
            System.out.println("Come vuoi accedere:\n" +
                    "1. Utente\n" +
                    "2. Videoteca\n" +
                    "Premi qualsiasi tasto per uscire");
            scelta = scannerStr.nextLine();
            boolean bool=true;
            switch (scelta) {
                case "1":
                    while (bool) {
                        System.out.println("Cosa vuoi fare:\n" +
                                "1. Registrazione\n" +
                                "2. Login\n" +
                                "3. Noleggia Film\n" +
                                "4. Rilascia Film\n" +
                                "5. I miei Film\n" +
                                "Premi qualsiasi tasto per uscire");
                        scelta = scannerStr.nextLine();
                        switch (scelta) {
                            case "1":
                                System.out.println("Benvenuto nella registrazione");
                                System.out.println("Inserisce nome utente: ");
                                nome = scannerStr.nextLine();
                                System.out.println("Inserisce password: ");
                                password = scannerStr.nextLine();
                                registroUtenti.registrazione(nome, password);
                                break;
                            case "2":
                                System.out.println("Per effettuare il login inserisci le credenziali");
                                System.out.println("Inserisce nome utente: ");
                                nome = scannerStr.nextLine();
                                System.out.println("Inserisce password: ");
                                password = scannerStr.nextLine();
                                registroUtenti.login(nome, password);
                                break;
                            default:
                                bool=false;break;
                        }
                    } break;
                case "2":
                    System.out.println("Per effettuare il login inserisci le credenziali");
                    System.out.print("Inserisce nome utente: ");
                    nome = scannerStr.nextLine();
                    System.out.print("Inserisce password: ");
                    password = scannerStr.nextLine();
                    if (videoteca.verificaCredenziali(nome, password)) {
                        System.out.println("Benvenuto amministratore!");
                        while (bool) {
                            System.out.println("Cosa vuoi fare:\n" +
                                    "1. Aggiungi film\n" +
                                    "2. Rimuovi film\n" +
                                    "3. Cerca film per nome\n" +
                                    "4. Cerca film per anno\n" +
                                    "5. Mostra tutti i film\n" +
                                    "6. Mostra utenti\n" +
                                    "Premi qualsiasi tasto per uscire");
                            scelta = scannerStr.nextLine();
                            switch (scelta) {
                                case "1":
                                    System.out.print("Inserisci nome film: ");
                                    nomeFilm = scannerStr.nextLine();
                                    System.out.print("Inserisci l'anno: ");
                                    anno = scannerNum.nextInt();
                                    videoteca.aggiungiFilm(nomeFilm, anno);
                                    break;
                                case "2":
                                    System.out.print("Inserisci nome film: ");
                                    nomeFilm = scannerStr.nextLine();
                                    System.out.print("Inserisci l'anno: ");
                                    anno = scannerNum.nextInt();
                                    videoteca.rimuoviFilm(nomeFilm, anno);
                                    break;
                                case "3":
                                    System.out.print("Inserisci nome film: ");
                                    nomeFilm = scannerStr.nextLine();
                                    videoteca.cercaFilmPerNome(nomeFilm);
                                    break;
                                case "4":
                                    System.out.print("Inserisci l'anno: ");
                                    anno = scannerNum.nextInt();
                                    videoteca.cercaFilmPerAnno(anno);
                                    break;
                                case "5":
                                    videoteca.visualizzaCatalogo(); break;
                                case "6":
                                    System.out.println(registroUtenti);
                                    break;
                                default: bool=false;break;
                            }break;

                        }
                    } else {
                        System.err.println("Credenziali errate!");
                        break;
                    }
            }
        }
    }
}
