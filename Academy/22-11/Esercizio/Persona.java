package Esercizio;

public class Persona {
    public Persona(){

    }
    public void saluta(String saluto){
        System.out.println(saluto);
    }

}
class Pirata extends Persona{
    @Override
    public void saluta(String saluto){
        System.out.println(saluto+", sono un Pirata!");
    }
}
class Main{
    public static void main(String[] args) {


        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona pirata = new Pirata();
        persona1.saluta("Ciao!");
        persona2.saluta("Salve!");
        pirata.saluta("Ciao");


    }
}
abstract class Astratta implements Interfaccia{
    public abstract void method();
    public void methods(){
        System.out.println("metodo di interfaccia");
    }
}

abstract class AstrattaAstrattissima extends Astratta{

}
class NormalClass extends Astratta{

    @Override
    public void method() {

    }

    @Override
    public void methods() {

    }

}
class EstendeClass extends NormalClass implements Interfaccia{
}
interface Interfaccia{
    public void methods();
}