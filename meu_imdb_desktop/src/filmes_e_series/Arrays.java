package filmes_e_series;

public class Arrays {

    private static final int MAXIMO_ELEMENTOS = 10;
//precisei adicionar esse invalid_position
    private static final int INVALID_POSITION = -1;
    private Audiovisuais[] arrays;
    private int numeroElementos;
//adicionei essa função
    public Arrays() {
        this(MAXIMO_ELEMENTOS);
    }

//mudei para o parametro tamanho
    public Arrays(int tamanho) {
        arrays = new Audiovisuais[tamanho];
        numeroElementos = 0;
    }
// essa já tinha, ela valida se já alcançou o numero de elementos no array
    public boolean adicionaFilme(Audiovisuais classificador) {
        if (numeroElementos == arrays.length)
            return false;

        arrays[numeroElementos++] = classificador;
        return true;
    }
    //faltava uma função essa de baixo, ela adiciona o filme na lista
public boolean adicionaFilme(Audiovisuais classificador, int posicao){
        if(!positionIsValid(posicao))
            return false;

        if(arrays[posicao]==null)
            numeroElementos++;

        arrays[posicao]=classificador;
        return true;
}
    public Audiovisuais buscaFilme (int position){
        if(!positionIsValid(position)) return null;

        return arrays[position];
    }

    private boolean positionIsValid(int position){
        return position >= 0 && position < arrays.length;
    }

    public Audiovisuais[] getArrays() {
        return arrays;
    }

     public int getNumeroElementos() {
        return numeroElementos;
    }




}
