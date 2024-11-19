package Esercizi;

import java.util.Scanner;

public class EsercizioUnoExtra {
    public static void main(String[] args) {
        //Definisco la dimensione dell'array
        int dim=5;
        //Definisco l'array di dimensione dim
        int[] numeri = new int[dim];
        //Scanner per prendere in input
        Scanner keyboardNum = new Scanner(System.in);
        //Mi definisco le variabili che mi torneranno utili
        int numero, i = 0, count=0, salvato=0;

        //Utilizzo un do-while per eseguire la prima volta e poi controllare
        do {
            //Chiede e fa inserire il numero
            System.out.print("Per favore, inserisci un numero negativo, hai "+dim+" tentativi: ");
            numero = keyboardNum.nextInt();
            numeri[i] = numero;
            i++;
        } while (numero >= 0 && i<dim);


        for(int num: numeri){
            System.out.print("Numero " + num+ ": ");
            //Verifica se il numero è negativo o positivo
            if (num < 0) {
                //Salvo il numero negativo
                salvato=num;
                //Se il resto della divisione per 2 è 0 allora il numero è pari, altrimetni è dispari
                if (num % 2 == 0) {
                    System.out.println("il numero inserito è pari");
                } else {
                    System.out.println("il numero inserito è dispari");
                }
                //Esco al primo numero negativo
                break;
            } else {
                //Conto i positivi
                count++;
                if (num % 2 == 0) {
                    System.out.println("il numero inserito è pari, ma positivo");
                } else {
                    System.out.println("il numero inserito è dispari, ma positivo");
                }
            }
        }
        //Controllo che tutti i numeri non siano positivi
        if(count==dim){
            System.out.println("Tutti i numeri inseriti sono positivi!");
        }else{
            System.out.println("Ci sono "+count+ " numeri positivi, il numero negativo inserito è "+salvato+"!");
        }
    }
}
