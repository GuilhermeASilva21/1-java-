public class ImovelDeVenda extends  Imovel{
    private String valorDoAluguel;
    private String diponibilidade;

    public ImovelDeVenda(String endereco, String area, int numeroQuartos, int id, String tipo, String padrao, String valorDoAluguel, String diponibilidade) {
        super(endereco, area, numeroQuartos, id, tipo, padrao);
        this.valorDoAluguel = valorDoAluguel;
        this.diponibilidade = diponibilidade;
    }

    public void alugar(){

    }
    public void devolver(){

    }

    public String getDiponibilidade() {
        return diponibilidade;
    }

    public void setDiponibilidade(String diponibilidade) {
        this.diponibilidade = diponibilidade;
    }

    public String getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(String valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }
}
