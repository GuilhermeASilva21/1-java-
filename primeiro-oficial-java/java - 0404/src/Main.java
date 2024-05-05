//import javax.swing.*;

import javax.swing.*;
import java.util.Scanner;
//
public  class Main {
    public static void  main(String[] args){
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Nome: ");
//        String nome = teclado.nextLine();
//        System.out.print("Nota: ");
//        float nota1 = teclado.nextFloat();
//        System.out.print("Nota: ");
//        float nota2 = teclado.nextFloat();
//        System.out.print("Nota: ");
//        float nota3 = teclado.nextFloat();
//
//        float notamedia = (nota1+nota2+nota3)/3;
//
//        if (notamedia >= 7){
//            System.out.printf("o aluno %s passou de ano com a media de %.2f ",nome,notamedia);
//        }else{
//            System.out.printf("o aluno %s nao passou de ano com a media de %.2f ",nome,notamedia);
//        }
//
//        JOptionPane.showMessageDialog(null,"ola mundo");
//        int idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade: "));
//        System.out.println(idade);
//
//        System.out.println(JOptionPane.showConfirmDialog(null,"tem certeza?"));
//        System.out.println(JOptionPane.showConfirmDialog(null,"tem certeza?"));
//        System.out.println(JOptionPane.showConfirmDialog(null,"tem certeza?"));


        Scanner teclado = new Scanner(System.in);
        System.out.print("numero: ");
        float numero = teclado.nextFloat();

        if(numero>0){
            System.out.printf("o numero é positivo %.1f ",numero);
        }else if(numero<0){
            System.out.printf("o numero é negativo %.1f ",numero);
        }else{
            System.out.printf("esse numero é zero %.1f ",numero);
        }
    }
}
