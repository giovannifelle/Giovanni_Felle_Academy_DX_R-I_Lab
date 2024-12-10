using System;


public class Program{

	   static void Main(string[] args)
    {
		ProgettoSoftware progettoSoftwareMobile=new MobileApp("MobileApp", 5.0m, 3.0m);
		WebApp progettoSoftwareWeb=new WebApp("Webz", 6.0m, 0.50m);

		progettoSoftwareWeb.addUtente();
		progettoSoftwareWeb.addUtente();
		progettoSoftwareWeb.addUtente();

		progettoSoftwareMobile.stampa();
		progettoSoftwareWeb.stampa();

	}

}

public abstract class ProgettoSoftware{

	protected string nome;
	
	protected decimal prezzoVendita;

	public ProgettoSoftware(string nome, decimal prezzoVendita){
			this.nome= nome;
			this.prezzoVendita=prezzoVendita;
		}
	public abstract decimal CalcoloGuadagno();

	public abstract void stampa();

}

public class WebApp : ProgettoSoftware{

	private int numeroUtenti;
	public int NumeroUtenti
	{
        get { return numeroUtenti; }
        set { numeroUtenti = value; }
    }

	private decimal costoGestioneUtente;
	public decimal CostoGestioneUtente
	{
        get { return costoGestioneUtente; }
        set { costoGestioneUtente = value; }
    }
	public WebApp(string nome, decimal prezzoVendita, decimal costoGestioneUtente):base(nome, prezzoVendita){
		this.costoGestioneUtente=costoGestioneUtente;
		this.numeroUtenti=0;
	}

	public void addUtente(){
		numeroUtenti++;
	}

	override public decimal CalcoloGuadagno(){
		return prezzoVendita - costoGestioneUtente*numeroUtenti;
	}

    public override void stampa()
    {
        Console.WriteLine($"App: {nome}, numero utenti {numeroUtenti}, costo di gesione per utenti {CostoGestioneUtente}, prezzo di vendita {prezzoVendita}");
    }

}

public class MobileApp : ProgettoSoftware{
	private decimal costoOnlineStore;
	public decimal CostoOnlineStore {
        get { return costoOnlineStore; }
        set { costoOnlineStore = value; }
    }
	public MobileApp(string nome, decimal prezzoVendita, decimal costoOnlineStore):base(nome, prezzoVendita){
		this.costoOnlineStore=costoOnlineStore;
	}

	override public decimal CalcoloGuadagno(){
		return prezzoVendita - costoOnlineStore;
	}
	  public override void stampa()
    {
        Console.WriteLine($"App: {nome}, costo dello store online {costoOnlineStore}, prezzo di vendita {prezzoVendita}");
    }
}