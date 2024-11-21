import java.util.ArrayList;
import java.util.Objects;

public class Utente {
    private Integer Id;
    private String nome;
    private String password;
    private ArrayList<Film> filmNoleggiati;

    public Utente(Integer id, String nome, String password) {
        Id = id;
        this.nome = nome;
        this.password = password;
        filmNoleggiati = new ArrayList<>();
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Film> getFilmNoleggiati() {
        return filmNoleggiati;
    }

    public void getListaNoleggi(){
        System.out.println("Lista di film noleggiati:");
        for(Film f : filmNoleggiati){
            System.out.println(f);
        }

    }

    public void setFilmNoleggiati(ArrayList<Film> filmNoleggiati) {
        this.filmNoleggiati = filmNoleggiati;
    }

    public void addFilm(Film film) {
        filmNoleggiati.add(film);
    }
    public void removeFilm(Film film) {
        filmNoleggiati.remove(film);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(nome, utente.nome) && Objects.equals(password, utente.password);
    }

    @Override
    public String toString() {
        return "Utente n." + Id + "con nome " + nome + " ha noleggiato " + filmNoleggiati.size() + " film\n";
    }
}
