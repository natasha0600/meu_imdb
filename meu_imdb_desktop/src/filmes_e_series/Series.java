package filmes_e_series;

public class Series extends Audiovisuais{
    // atributo exclusivo da classe:
    private int temporadas, episodios;


    public Series(String nome, String codigo, String diretor, String principaisAtores, String ano, Generos generos, int temporadas, int episodios, Categorias categoria) {
        super(nome, codigo, diretor, principaisAtores, ano, generos, categoria);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
