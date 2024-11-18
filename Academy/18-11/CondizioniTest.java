import java.util.Scanner;

public class CondizioniTest {

    public static void main(String[] args) {

        Scanner keyboardStr=new Scanner(System.in);
        System.out.print("Come ti chiami: ");
        String nome=keyboardStr.nextLine();
        nome=nome.toLowerCase();
        if(nome.equals("giovanni")){
            System.out.println("Wow! Abbiamo lo stesso nome.");
        } else if (nome.equals("gianluca")||nome.equals("gianpiero")||nome.equals("gianmaria")) {
            System.out.println("Abbiamo quasi lo stesso nome, io sono Giovanni");
        } else{
            System.out.println("Piacere! sono Giovanni.");
        }

        int time=20;
        //String result= (time<18)? "Buongiorno.":"Buonasera.
        System.out.println((time<18)? "Buongiorno.":"Buonasera.");

    }
}
