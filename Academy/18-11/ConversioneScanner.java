import java.util.Scanner;

public class ConversioneScanner {
    public static void main(String[] args) {

        //Scanner per i numeri
        Scanner keyboardNumber = new Scanner(System.in);

        //Scanner per le stringhe, utilizzato per evetare errori
        Scanner keyboardString = new Scanner(System.in);

        System.out.print("Inserisci un numero con la virgola: ");
        //Prende numero con la virgola
        float numeroVirgola = keyboardNumber.nextFloat();
        //Converte il numero
        int numeroSenzaVirgola = (int) numeroVirgola;
        //Stampa
        System.out.println("Il numero inserito reso intero è: " + numeroSenzaVirgola);

        //Richiede intero
        System.out.print("Inserisci un numero intero: ");
        //Prende numero intero
        numeroSenzaVirgola = keyboardNumber.nextInt();
        //Converte numero
        numeroVirgola = (float) numeroSenzaVirgola;
        System.out.println("Il numero inserito con la virgola è: " + numeroVirgola);

        //Richiede stringa
        System.out.print("Inserisci una stringa: ");
        //Prende stringa
        String stringa = keyboardString.nextLine();
        System.out.println(stringa);
    }
}
