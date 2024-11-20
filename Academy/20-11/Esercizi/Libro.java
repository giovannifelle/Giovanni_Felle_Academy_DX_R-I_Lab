package Esercizi;

public class Libro {
    //Primi esercizi sulle classi, le variabili vengono poste publiche per conoscenze basilira
    public String nomeLibro;
    public String nomeAutore;

    public Integer numPagine;

    //Costruttore
    public Libro(String nomeLibro, String nomeAutore, Integer numPagine) {
        this.nomeLibro = nomeLibro;
        this.nomeAutore = nomeAutore;
        this.numPagine = numPagine;
    }
}
