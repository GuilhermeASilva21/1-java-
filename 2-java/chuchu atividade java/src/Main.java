import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Pessoa> pessoas = new ArrayList<>();


    public static void main(String[] args) {

        for(int i=0 ; i<3; i++){
            String nome =
            JOptionPane.showInputDialog("DIGITE O NOME");
            int idade= Integer.parseInt(JOptionPane.showInputDialog("idade: "));
            Pessoa p = new Pessoa(nome ,idade);
            pessoas.add(p);

        }
}
}