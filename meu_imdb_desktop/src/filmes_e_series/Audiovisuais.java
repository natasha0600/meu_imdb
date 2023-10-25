package filmes_e_series;

public  abstract class Audiovisuais {
private String codigo, nome, diretor, principaisAtores, ano;
        private Generos generos;
        private Categorias categoria;



public Audiovisuais(String nome, String codigo, String diretor, String principaisAtores, String ano, Generos generos, Categorias categoria){
    this.nome = nome;
    this.codigo = codigo;
    this.diretor = diretor;
    this.principaisAtores = principaisAtores;
    this.ano = ano;
    this.generos = generos;
    this.categoria = categoria;

}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getPrincipaisAtores() {
        return principaisAtores;
    }

    public void setPrincipaisAtores(String principaisAtores) {
        this.principaisAtores = principaisAtores;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Generos getGenero() {
        return generos;
    }

    public void setGenero(Generos generos) {
        this.generos = generos;
    }


    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}




