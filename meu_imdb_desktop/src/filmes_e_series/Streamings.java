package filmes_e_series;

public abstract class Streamings {

    private Filmes filme; //preciso filmes ou series? Acabei inserindo
    private Categorias categoria;
    Series serie;


    public Streamings ( Filmes filme, Series serie, Categorias categoria){
        this.categoria = categoria;
        this.filme = filme;
        this.serie = serie;
    }



    public Filmes getFilme() {
        return filme;
    }

    public void setFilme(Filmes filme) {
        this.filme = filme;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }
}
