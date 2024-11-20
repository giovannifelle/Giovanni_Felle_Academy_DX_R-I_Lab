import Esercizi.Calciatore;
import Esercizi.Libro;
import Esercizi.Partita;
import Esercizi.Squadra;

public class Main {
    public static void main(String[] args) {

        Calciatore[] calciatoresA = new Calciatore[12];
        Calciatore[] calciatoresB = new Calciatore[12];

        for (int i = 0; i < 12; i++) {
            Calciatore calciatoreA = new Calciatore();
            Calciatore calciatoreB = new Calciatore();
            calciatoresA[i] = calciatoreA;
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
