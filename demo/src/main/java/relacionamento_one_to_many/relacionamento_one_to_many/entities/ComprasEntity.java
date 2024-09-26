package relacionamento_one_to_many.relacionamento_one_to_many.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ComprasEntity {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "produto")
    private String produto;

    
    @ManyToOne
    @JoinColumn(name="cliente_id")
    private ClienteEntity cliente;
    
    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    @Column(name= "preco")
    private String preco;

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    public void setCliente(ClienteEntity cliente){
        this.cliente = cliente;
    }
}
