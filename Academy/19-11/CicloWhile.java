public class CicloWhile {

    public static void main(String[] args) {

        //Ciclo matematico
        int i=1;
        while(i<5){
            System.out.println(i);
            i++;
        }

        //Ciclo logico
        boolean bool=true;
        while(bool){
            System.out.println(bool);
            if(i==5){
                bool=false;
            }
        }

        //Ciclo rotto volontariamente
        while(true){
            System.out.println("Ciclo rotto volontariamente");
            if(i==5){
                break;
            }
        }

        //Ciclo do-while, prima esegue e poi controlla
        i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);
    }
}
