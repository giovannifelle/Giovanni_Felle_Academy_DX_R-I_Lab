package Esercizi;

import java.util.ArrayList;

public class Chef {
//Primi esercizi sulle classi, le variabili vengono poste publiche per conoscenze basilira
    public String nome;
    public String tipoChef;
    public ArrayList<String> ingredienti;

    public Chef(String nome, String tipoChef, ArrayList<String> ingredienti) {
        this.nome = nome;
        this.tipoChef = tipoChef;
        this.ingredienti = ingredienti;
    }

    public void creaPiatto(){
        for(String ingrediente: ingredienti){
            ingrediente=ingrediente.toLowerCase();
            switch (ingrediente){
                case "patate":
                    System.out.println("Crea patate al forno");
                    break;
                case "carne":
                    System.out.println("Crea carne alla griglia");
                    break;
                case "pomodiri":
                    System.out.println("Crea insalata");
                    break;
            }
        }
    }
}

