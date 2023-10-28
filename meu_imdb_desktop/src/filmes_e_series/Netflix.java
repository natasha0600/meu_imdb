package filmes_e_series;

public class Netflix extends Streamings {


    public Netflix(Filmes filme, Series serie, Categorias categoria) {
        super(filme, serie, categoria);

    }


    Filmes filme1 = new Filmes("Interestelar", "1234", "Christopher Nolan", "Matthew McConaughey", "2014", Generos.FICCAO, 2.14, Categorias.TOP10);
    Series serie = new Series("Jovem Sheldon ", "314", "Chuck Lorre", "Iain Armitage, Zoe Perry, Lance Barber,", "2022", Generos.COMEDIA, 6, 22, Categorias.EM_FAMILIA);
    Series serie2 = new Series("Sex Education ", "45678 ", "Laurie Nunn ", "Asa Butterfield, Gillian Anderson, Aimee Lou Wood, Ncuti Gatwa ", "2023", Generos.COMEDIA, 4, 8, Categorias.TEEN);
    Series serie3 = new Series ("Emily em Paris ", "451454", "Darren Star ", "Lily Colins, Philippine Leroy-Beaulieu, Ashley Park", "2022 ", Generos.COMEDIA, 3, 10, Categorias.MARATONAR );


}