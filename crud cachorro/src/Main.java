import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaCrudCachooro t = new TelaCrudCachooro();
        t.setContentPane(t.telaPrincipal);
        t.setTitle("Cachorro");
        t.setSize(800,600);
        t.setLocationRelativeTo(null);
        t.setVisible(true);
        t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}