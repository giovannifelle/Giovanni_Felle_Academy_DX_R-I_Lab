using System;
using System.Collections.Generic;

class Program
{
/*      static void Main(string[] args)
    {
        List<int> listaPari = new List<int>();
        List<int> listaDispari = new List<int>();

        while (true)
        {
            Console.WriteLine("Inserisci un numero (oppure digita 'q' per uscire):");
            string stringa = Console.ReadLine();
            int num;

            if (int.TryParse(stringa, out num))
            {
                if (num % 2 == 0)
                {
                    listaPari.Add(num);
                }
                else
                {
                    listaDispari.Add(num);
                }
            }
            else
            {
                if (stringa == "q")
                {
                    break;
                }
                else
                {
                    Console.WriteLine("Inserire un numero valido!");
                    continue;
                }
            }

            Console.WriteLine("Scegli un'opzione:");
            Console.WriteLine("1. Stampa numeri pari");
            Console.WriteLine("2. Stampa numeri dispari");
            Console.WriteLine("Premi altro per continuare");

            string scelta = Console.ReadLine();

            switch (scelta)
            {
                case "1":
                    Console.WriteLine("Numeri pari: " + string.Join(", ", listaPari));
                    break;
                case "2":
                    Console.WriteLine("Numeri dispari: " + string.Join(", ", listaDispari));
                    break;
                default:
                    Console.WriteLine("Continuo...");
                    break;
            }
        }

        Console.WriteLine("Programma terminato.");
    }
*/
  /*      static void Main(string[] args)
    {
		Console.WriteLine("Inserisci una frase e ti conterò le parole: ");
		string frase=Console.ReadLine();
		int count=0;
		foreach(char c in frase)
		{
			if(c==' ')
			{
				count++;
			}
		}
		count++;
		Console.WriteLine($"Ci sono {count} parole");
	}*/
        static void Main(string[] args)
        {
            Giocattolo giocattolo1=new Giocattolo("Bambola", "pezza", 3, 5.3m);
            Giocattolo giocattolo2=new Giocattolo("Power Ranger", "plastica", 2, 4.2m);
            Giocattolo giocattolo3=new Giocattolo("Aeroplano", "carta", 0.24m, 1);

            FabbricaGiocattoli fabbricaGiocattoli=new FabbricaGiocattoli();

            fabbricaGiocattoli.addGiocattolo(giocattolo1,giocattolo2,giocattolo3);
            fabbricaGiocattoli.stampaGiocattoli();
            decimal costo=fabbricaGiocattoli.calcoloGuadagnoTotale();

            Console.WriteLine($"Numero di guadagno totale per i giocattoli: {costo}");

        }
}
public class Giocattolo
{
    public string Nome { get;set;}
    public string Materiale { get; set; }
    public decimal PrezzoDiProduzione { get; set; }
    public decimal PrezzoDiVendita { get; set; }

    public Giocattolo(string nome, string materiale, decimal prezzoDiProduzione, decimal prezzoDiVendita)
    {
        Nome=nome;
        Materiale=materiale;
        PrezzoDiProduzione=prezzoDiProduzione;
        PrezzoDiVendita=prezzoDiVendita;
    }


}

public class FabbricaGiocattoli
{
    public List<Giocattolo> Giocattoli;

    public FabbricaGiocattoli()
    {
        Giocattoli=new List<Giocattolo>();
    }

// Vado a creare un metodo con un numero di parametri variabili come visto in Java
// che sarebbe Giocattolo... giocattoli, in modo tale che nel main posso passare 
// tutte le istanze di Giocattolo in una botta sola
    public void addGiocattolo(params Giocattolo[] giocattoli)
    {   
        foreach(Giocattolo giocattolo in giocattoli){
            Giocattoli.Add(giocattolo);
            Console.WriteLine("Giocattolo aggiunto con successo!");
    }
    }

    public void stampaGiocattoli()
    {
        Console.WriteLine("Lista di giocattoli:");
        foreach(Giocattolo g in Giocattoli)
        {
            Console.WriteLine($"Giocattolo {g.Nome} fatto di {g.Materiale}, costa {g.PrezzoDiVendita}");
        }
    }

    public decimal calcoloGuadagnoTotale()
    {   
        decimal sum=0;
        foreach(Giocattolo g in Giocattoli)
        {
            sum+=(g.PrezzoDiVendita-g.PrezzoDiProduzione);
        }
        return sum;
    }
}