public class Cachorro {

    private String Nome;
    private float Altura;
    private float Peso;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public Cachorro(String nome, float altura, float peso) {
        Nome = nome;
        Altura = altura;
        Peso = peso;
    }
}