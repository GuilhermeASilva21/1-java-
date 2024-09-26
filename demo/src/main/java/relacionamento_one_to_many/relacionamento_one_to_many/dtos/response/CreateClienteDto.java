package relacionamento_one_to_many.relacionamento_one_to_many.dtos.response;



import java.util.List;

public class CreateClienteDto {
    
    private String nome;
    private List<String> endereco;
    
    public String getNome() {
        return nome;
    }
    public void setName(String nome) {
        this.nome = nome;
    }
    public List<String> getEndreco() {
        return endereco;
    }
    public void setBooks(List<String> endereco) {
        this.endereco = endereco;
    }
    public void setEndereco(List<String> endereco2) {
        
        

        
    }

    
}
