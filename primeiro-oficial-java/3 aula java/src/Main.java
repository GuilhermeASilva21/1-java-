import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//    String nome , nomeUsuario ;
//    nome = JOptionPane.showInputDialog("Nome");
//    nomeUsuario = JOptionPane.showInputDialog("nomeUsuario");
//     if(nome.equals(nomeUsuario)){
//        System.out.println("Igual");
//     }else{
//        System.out.println("Diferente");
//     }
//        Scanner teclado = new Scanner(System.in);

//        System.out.print("Escreva um int: ");
//        int i = teclado.nextInt();
//        System.out.println("Eco do int: " + i);
//
//        long li = i+1;
//        System.out.println("Int+1 convertido automaticamente pra long na atribuição: " + li);
//
//        li++;
//        i = (int) li;
//        System.out.println("\nLong incrementado convertido explicitamente para int: " + i);
//
//

//        import javax.swing.*;
//        public class Main {
//            public static void main(String[] args) {
                int n, maior = -1;
                for(int i=0; i<10; i++){
                    do {
                        n = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "o número: "));
                    }while(n<0 || n>100);
                    if(n>maior){
                        maior = n;
                    }
                }
                System.out.println("Maior: " + maior);


//                int n, maior = -1;
//                for(int i=0;i<5;i++){
//                    while(n<0 || n>100){
//                        n= Integer.parseInt(JOptionPane.showInputDialog((i + 1) + " o numero: "));
//                    }
//                    if (n>maior){
//                        maior = n;
//                    }
//                }
//                System.out.println("maior: " + maior);
            }
        }