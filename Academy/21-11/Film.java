import java.util.Objects;

public class Film {

    private String nome;
    private Integer anno;

    public Film(String nome, Integer anno) {
        this.nome = nome;
        this.anno = anno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) {
        this.anno = anno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(nome, film.nome) && Objects.equals(anno, film.anno);
    }

    @Override
    public String toString() {
        return "Film" +
                " " + nome +
                " uscito nel " + anno+";\n";
    }
}
