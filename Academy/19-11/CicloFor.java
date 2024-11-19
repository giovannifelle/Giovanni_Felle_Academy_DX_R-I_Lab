public class CicloFor {

    public static void main(String[] args) {

        //For classico
        for(int i=0; i<5; i++){
            System.out.println(i);
        }

        //For each che cicla sugli elementi di un array (o collection)
        //Definisco array statico
        int[] array={2,4,6,7,5};
        for(int i: array){
            System.out.println(i);
        }
    }
}
