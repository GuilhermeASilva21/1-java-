import javax.swing.*;
import javax.swing.JOptionPane;

public class Main {
//    static void escreva(String t) {
//        JOptionPane.showMessageDialog(null,t);
//    }
//    public static void main (String[] args){
//        escreva("oi gente ");
//
////    }
//   static float media (int a, int b){
//        float soma = (float) a+b;
//        return soma/2;
//   }
    public static void main(String[] args) {

        Pessoa p = new Pessoa("breno", 18);
//        p.setIdade();
//        p.setIdade(p.getIdade()+ 1);
        System.out.println( p.getNome()+ " tem "+p.getIdade()+" anos ");


    }

}