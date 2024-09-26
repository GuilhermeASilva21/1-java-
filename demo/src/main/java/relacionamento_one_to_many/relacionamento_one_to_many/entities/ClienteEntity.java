package relacionamento_one_to_many.relacionamento_one_to_many.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="cliente")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    @OneToOne(mappedBy = "cliente")
    private List<EnderecoEntity> endereco;

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<EnderecoEntity> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<EnderecoEntity> endereco) {
        this.endereco = endereco;
    }
}
