package filmes_e_series;

public class Filmes  extends Audiovisuais{
    // atributo exclusivo da classe:
    private double tempoDuracao;



    public Filmes(String nome, String codigo, String diretor, String principaisAtores, String ano, Generos generos, double tempoDuracao, Categorias categoria ) {
        super(nome, codigo, diretor, principaisAtores, ano, generos, categoria);
        this.tempoDuracao = tempoDuracao;

    }

    public double getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public boolean imprimeInfo(){
        System.out.println("----------------------------------------------");
        System.out.println("Nome: "+getNome());
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Diretor: "+getDiretor());
        System.out.println("Principais atores: "+getPrincipaisAtores());
        System.out.println("Ano: "+getAno());
        System.out.println("Gênero: "+getGenero());
        System.out.println("Tempo de duração: "+getTempoDuracao());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("----------------------------------------------");
        return false; //porque tive que fazer virar boolean?
    }
}

