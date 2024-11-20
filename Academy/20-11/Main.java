import Esercizi.Calciatore;
import Esercizi.Libro;
import Esercizi.Partita;
import Esercizi.Squadra;

import static java.util.Objects.isNull;

public class Main {
    public static void main(String[] args) {

        String[] cognomi={"A","B","C","D","E","F","G","H","I","L","M","N","O","P"};
        Calciatore[] calciatoresA = new Calciatore[12];
        Calciatore[] calciatoresB = new Calciatore[12];

        for (int i = 0; i < 12; i++) {
            Calciatore calciatoreA = new Calciatore();
            Calciatore calciatoreB = new Calciatore();
            for(Calciatore cal: calciatoresA){
                if(isNull(cal)){
                    break;
                }
                if(cal.nome.equals(calciatoreA.nome)){
                    calciatoreA.nome=calciatoreA.nome+" "+cognomi[i];
                }
            }
            calciatoresA[i] = calciatoreA;
            for(Calciatore cal: calciatoresB){
                if(isNull(cal)){
                    break;
                }
                if(cal.nome.equals(calciatoreB.nome)){
                    calciatoreB.nome=calciatoreB.nome+" "+cognomi[i];
                }
            }
            calciatoresB[i] = calciatoreB;
        }
        Squadra squadraDiCasa = new Squadra("Squadra in Casa", calciatoresA);
        Squadra squadraTrasferta = new Squadra("Squadra ospite", calciatoresB);
        Partita partita = new Partita(squadraDiCasa, squadraTrasferta);
        partita.stampaRisultato();
        squadraDiCasa.stampaCalciatori();
        System.out.println();
        squadraTrasferta.stampaCalciatori();
    }
}
