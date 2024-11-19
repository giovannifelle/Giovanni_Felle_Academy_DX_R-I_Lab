package Esercizi;

import java.util.ArrayList;
import java.util.Scanner;

public class EsercizioTre {

    public static void main(String[] args) {

        int dimRighe = 3, dimColonne = 8;

        ArrayList<String> nomiPren = new ArrayList<>();
        ArrayList<Integer> postiPren = new ArrayList<>();
        Scanner keyboardStr = new Scanner(System.in);
        Scanner keyboardNum = new Scanner(System.in);
        String scelta, nome, cerca;
        int fila, posto, percentuale;

        int[][] matricePosti = new int[dimRighe][dimColonne];

        while (true) {
            System.out.println("Cosa vuoi fare?");
            System.out.println("1. Prenotare un posto\n" +
                    "2. Cercare prenotazione per nome/posto\n" +
                    "3. Visualizzare i posti\n" +
                    "4. Creare un report posti occuapti/totali\n" +
                    "5. Modificare prenotazione\n" +
                    "Premi qualsiasi tasto per uscire");
            scelta = keyboardStr.nextLine();
            switch (scelta) {
                case "1"://Aggiungo i posti chiedendo nome, fila e posto e controllando che il posto esista
                    System.out.println("Posti disponibili:");
                    stampaPosti(matricePosti, dimRighe, dimColonne);
                    System.out.print("Inserisci il tuo nome: ");
                    nome = keyboardStr.nextLine();
                    System.out.print("Inserisci la fila: ");
                    fila = keyboardNum.nextInt();
                    System.out.print("Inserisci il posto: ");
                    posto = keyboardNum.nextInt();
                    //Controllo che il posto esista e che non sia occupato
                    if (fila > dimRighe || posto > dimColonne) {
                        System.err.println("Posto inesistente!");
                        break;
                    } else if (matricePosti[fila - 1][posto - 1] == 1) {
                        System.err.println("Posto già occupato");
                        break;
                    } else {
                        matricePosti[fila - 1][posto - 1] = 1;
                        nomiPren.add(nome.toLowerCase());
                        postiPren.add(fila * dimColonne + (posto + 1));
                        System.out.println("Posto prenotato!");
                        break;
                    }
                case "2":
                    //Scelta mi permette di capire in base a cosa voglio cercare il posto, se per nome o per posto
                    System.out.println("Vuoi cercare per:\n1. nome\n2. posto");
                    scelta = keyboardStr.nextLine();
                    //Entrambi i metodi fanno un confronto incrociato tra i due ArrayList per controllare la
                    // corrispondenza posto/nome
                    switch (scelta) {
                        case "1":
                            System.out.print("Inserisci il nome da cercare: ");
                            cerca = keyboardStr.nextLine();
                            cerca = cerca.toLowerCase();
                            if (nomiPren.contains(cerca)) {
                                //Da migliorare
                                for (int i = 0; i < nomiPren.size(); i++) {
                                    if (nomiPren.get(i).equals(cerca)) {//Non funziona == sulle stringhe
                                        int postoOccupato = postiPren.get(i);
                                        int filaOccupata = (postoOccupato) / dimColonne;
                                        postoOccupato = (postoOccupato - 1) % dimColonne;
                                        System.out.println("E' presente una prenotazione a questo nome alla fila " + filaOccupata + ", posto " +
                                                "" + postoOccupato);
                                    }
                                }
                            } else {
                                System.err.println("Non è presente alcuna prenotazione a questo nome");
                            }
                            break;
                        case "2":
                            System.out.print("Inserisci la fila: ");
                            fila = keyboardNum.nextInt();
                            System.out.print("Inserisci il posto: ");
                            posto = keyboardNum.nextInt();
                            if (fila > dimRighe || posto > dimColonne) {
                                System.err.println("Posto inesistente!");
                                break;
                            }
                            int postoOccupato = (fila * dimColonne + (posto + 1));
                            if (postiPren.contains(postoOccupato)) {
                                nome = nomiPren.get(postiPren.indexOf(postoOccupato));
                                nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);
                                System.out.println("Il posto è occupato da " + nome);

                            } else {
                                System.out.println("Il posto è libero");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case "3":
                    stampaPosti(matricePosti, dimRighe, dimColonne);
                    break;
                case "4":
                    percentuale = 0;
                    for (int[] p : matricePosti) {
                        for (int w : p) {
                            if (w != 0) {
                                percentuale++;
                            }
                        }
                    }
                    System.out.println("Sono occupati " + percentuale + " posti ovvero il " + percentuale * 100 / (dimRighe * dimColonne) + "%");
                    break;


                case "5":
                    //Riciclo del codice per modificare il posto segue il codice della prenotazione
                    System.out.println("Attenzione! stai modificando la tua prenotazione");
                    System.out.print("Inserisci il tuo nome: ");
                    nome = keyboardStr.nextLine();
                    System.out.print("Inserisci la fila: ");
                    fila = keyboardNum.nextInt();
                    System.out.print("Inserisci il posto: ");
                    posto = keyboardNum.nextInt();
                    if (fila > dimRighe || posto > dimColonne) {
                        System.err.println("Posto inesistente!");
                        break;
                    }
                    int postoOccupato = (fila * dimColonne + (posto + 1));
                    if (!postiPren.contains(postoOccupato)) {
                        System.err.println("Il posto non è occupato!");
                        break;
                    } else if (!nomiPren.get(postiPren.indexOf(postoOccupato)).equals(nome.toLowerCase())) {
                        System.err.println("Il posto non è occupato da te!");
                        break;
                    }
                    boolean occupato;
                    do {
                        System.out.println("Scegli il nuovo posto");
                        System.out.print("Inserisci la fila: ");
                        int newFila = keyboardNum.nextInt();
                        System.out.print("Inserisci il posto: ");
                        int newPosto = keyboardNum.nextInt();
                        if (newFila > dimRighe || newPosto > dimColonne) {
                            System.err.println("Posto inesistente!");
                            occupato = true;
                        } else if (matricePosti[newFila - 1][newPosto - 1] == 1) {
                            System.err.println("Posto già occupato");
                            occupato = true;
                        } else {
                            matricePosti[fila - 1][posto - 1] = 0;
                            matricePosti[newFila - 1][newPosto - 1] = 1;
                            nomiPren.remove(postiPren.indexOf(postoOccupato));
                            postiPren.remove(postiPren.indexOf(postoOccupato));
                            nomiPren.add(nome.toLowerCase());
                            postiPren.add(newFila * dimColonne + (newPosto + 1));
                            System.out.println("Posto cambiato!");
                            occupato = false;
                        }
                    } while (occupato);
                    break;
                default:
                    return;

            }

            System.out.println("");
        }
    }

    public static void stampaPosti(int[][] matrice, int file, int posti) {
        for (int i = 0; i < file; i++) {
            for (int j = 0; j < posti; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}