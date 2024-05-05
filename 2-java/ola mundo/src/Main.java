
public class Main {

    public static void main(String[] args) {
        int numeroInteiro = 22;
        float numeroReal = 3.141595f;
        char letra = 'F';
        boolean terminado = false;


        System.out.println("Inteiro: " + numeroInteiro);
        System.out.println("Float: " + numeroReal);
        System.out.println("Char: " + letra);
        System.out.println("boolean: " + terminado);
        System.out.println("================================");

        System.out.printf("\no valor do Float: %.6f",numeroReal);

        System.out.println("================================");
        String nome = "Rafael";
        float media = 8.9f;
        System.out.printf("A nota de %s é %.3f \n", nome, media);
        System.out.format("A nota de %s é %.3f \n", nome, media);
    }
}