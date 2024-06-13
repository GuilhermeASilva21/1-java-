public class Avaliacao {
    private String estabelecimento;
    private String itens;
    private int nota;
    private String comentario;

    public Avaliacao(String estabelecimento, int nota, String itens, String comentario) {
        this.estabelecimento = estabelecimento;
        this.nota = nota;
        this.itens = itens;
        this.comentario = comentario;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }
}
