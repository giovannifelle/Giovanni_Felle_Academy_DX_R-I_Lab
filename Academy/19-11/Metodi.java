public class Metodi {

    public static int somma(int... numeri){
        int somma=0;
        for(int numero: numeri){
            somma= somma+numero;
        }
        return somma;
    }

    public static void main(String[] args) {
        System.out.println(somma(1,2,3,4,5,6,7,8));

    }
}
