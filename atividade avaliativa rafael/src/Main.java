import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaAvaliacao t = new TelaAvaliacao();
        t.setContentPane(t.telaPrincipal);
        t.setTitle("AVALIAÇÃO");
        t.setSize(800,600);
        t.setLocationRelativeTo(null);
        t.setVisible(true);
        t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}