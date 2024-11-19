//Scrivi un programma che calcoli e stampi il giorno della settimana corrispondente a numeri da 1 a 7.
// Usa un ciclo for e un switch per abbinare ogni numero al nome del giorno.
//
//
//
//Usa un ciclo for per iterare dal numero 1 al numero 7.
//Per ogni numero, usa un switch per determinare il giorno della settimana (ad esempio, 1 = Lunedì, 2 = Martedì, ecc.).
//Stampa il giorno della settimana corrispondente.

package Esercizi;

public class EsercizioDue {

    public static void main(String[] args) {


        //Ciclo con un for sui numeri da 1 a 7
        for (int i = 1; i < 8; i++) {
            //Switch sui vari giorni
            switch (i) {
                case 1:
                    System.out.println("Lunedì");
                    break;
                case 2:
                    System.out.println("Martedì");
                    break;
                case 3:
                    System.out.println("Mercoledì");
                    break;
                case 4:
                    System.out.println("Giovedì");
                    break;
                case 5:
                    System.out.println("Venerdì");
                    break;
                case 6:
                    System.out.println("Sabato");
                    break;
                case 7:
                    System.out.println("Domenica");
                    break;
            }
        }
    }
}