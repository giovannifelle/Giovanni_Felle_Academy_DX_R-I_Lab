import java.util.Arrays;

public class ArrayStatici {

    public static void main(String[] args) {
        int[] numeri={10,20,30,40,50};

        System.out.println(numeri[1]);

        //stampa usando .length
        for(int i=0; i<numeri.length; i++){
            System.out.println("Numero in posizione "+i+": "+numeri[i]);
        }

        //numero in numeri
        for(int numero: numeri){
            System.out.println(numero);
        }

        System.out.println("Numeri: "+ Arrays.toString(numeri));
    }
}
