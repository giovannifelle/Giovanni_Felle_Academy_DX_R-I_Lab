package Esercizi;// Scrivi un programma che continua a chiedere all'utente di inserire un
// numero fino a quando l'utente inserisce un numero negativo. Durante ogni iterazione,
// controlla con un if se il numero è pari o dispari e stampalo.
//
//Chiedi all'utente di inserire un numero.
//Continua a chiedere il numero finché l'utente non inserisce un numero negativo.
//Usa if per verificare se il numero è pari o dispari.
//Stampa il risultato


import java.util.Scanner;

public class EsercizioUno {

    public static void main(String[] args) {
        //Definisco lo scanner di input
        Scanner keyboardNum=new Scanner(System.in);
        int numero;

        //Utilizzo un do-while per eseguire la prima volta e poi controllare
        do{
            //Chiede e fa inserire il numero
            System.out.print("Per favore, inserisci un numero negativo: ");
            numero= keyboardNum.nextInt();
            //Se il resto della divisione per 2 è 0 allora il numero è pari, altrimetni è dispari
            if(numero<0){
            if(numero%2==0){
                System.out.println("Il numero inserito è pari");
            }else{
                System.out.println("Il numero inserito è dispari");
            }}else{
                if(numero%2==0){
                    System.out.println("Il numero inserito è pari, ma positivo");
                }else{
                    System.out.println("Il numero inserito è dispari, ma positivo");
                }
            }
        }while(numero>=0);

    }
}
