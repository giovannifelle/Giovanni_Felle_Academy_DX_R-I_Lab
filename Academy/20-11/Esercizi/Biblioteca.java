package Esercizi;

import java.util.ArrayList;

public class Biblioteca {

    //Array di libri
    public ArrayList<Libro> libri=new ArrayList<>();

    //Costruttore
    public Biblioteca(ArrayList<Libro> libri) {
        this.libri = libri;
    }

    //Per ogni libro, stampa i libri (in realtà va creato un toString perfezionato nella classe Libro, ma va bene anche così)
    public void stampaLibri(){
        for(Libro lib: libri){
            System.out.println(libri);
        }
    }
    public void cercaPerAutore(String nome){
        for(Libro lib: libri){
            if(lib.nomeAutore.equals(nome)){
                System.out.println("Libro dell'autore "+ nome+": "+lib.nomeLibro);
            }
        }
    }

    public void cercaPerAutore(Integer maxPagine){
        for(Libro lib: libri){
            if(lib.numPagine<maxPagine){
                System.out.println("Libro con meno di "+maxPagine+": "+lib);
            }
        }
    }
}
