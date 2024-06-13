import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaAvaliacao extends JFrame {
    private JLabel Lbltitulo;
    private JTextField textFieldEstab;
    private JTextField textFieldItens;
    private JTextField textFieldNota;
    private JTextField textFieldComentario;
    private JButton btnGuardar;
    private JButton btnBuscar;
    private JButton btnItem;
    private JButton btnMostar;
    private JButton btnFake;
    private JLabel Estabelecimento;
    private JLabel Itens;
    private JLabel Nota;
    private JLabel Comentario;
    public JPanel telaPrincipal;
    private JScrollPane scrol;
    private JTextArea txtTodos;
    private JButton btnBuscarNota;


    ArrayList<Avaliacao> avaliacaos = new ArrayList<Avaliacao>();
    ArrayList<Avaliacao> temporario = new ArrayList<Avaliacao>();


    private void mostrarTodos(){
        String s = "";
        txtTodos.setText("");
        for(Avaliacao a : avaliacaos ){
            s = s.concat(String.format("Estabelecimento : %s \nNota: %d \nItens: %s \n Comentario: %s\n---------------------\n",a.getEstabelecimento(),a.getNota(),a.getItens(),a.getComentario()));
            txtTodos.setText(s);

        }

    }
    private void mostrarFiltro(){
        String s = "";
        txtTodos.setText("");
        for(Avaliacao a : temporario ){
            s = s.concat(String.format("Estabelecimento : %s \nNota: %d \nItens: %s \n Comentario: %s\n---------------------\n",a.getEstabelecimento(),a.getNota(),a.getItens(),a.getComentario()));
            txtTodos.setText(s);

        }

    }





    public TelaAvaliacao() {
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String estabelecimento = textFieldEstab.getText();
                String itens = textFieldItens.getText();
                int nota = Integer.parseInt(textFieldNota.getText());
                String comentario =textFieldComentario.getText();
                Avaliacao a = new Avaliacao(estabelecimento,nota,itens,comentario);
                avaliacaos.add(a);


            }
        });
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temporario.clear();
                for (Avaliacao a : avaliacaos) {
                    if(a.getEstabelecimento().toLowerCase().contains(textFieldEstab.getText().toLowerCase())){
                        temporario.add(a);

                    }

                }
                mostrarFiltro();
            }


        });
        btnItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temporario.clear();
                for (Avaliacao a : avaliacaos) {
                    if(a.getItens().toLowerCase().contains(textFieldItens.getText().toLowerCase())){
                        temporario.add(a);

                    }

                }
                mostrarFiltro();
            }
        });
        btnMostar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTodos();
            }
        });
        btnFake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                avaliacaos.add(new Avaliacao("Pizzaria Dom",8,"Pizza de Calabresa","muito bom"));
                avaliacaos.add(new Avaliacao("Pizzaria da marcia",2,"Pizza de Queijo","ruim"));
                avaliacaos.add(new Avaliacao("Magrao lanches",10,"x-bacon","muito bom"));
                avaliacaos.add(new Avaliacao("hot da joelma",6,"hot-dog","da pra comer de novo"));


                mostrarTodos();
            }
        });
        btnBuscarNota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                temporario.clear();
                int nota =0;
                if(textFieldNota.getText().equals("")){
                    nota = 0;

                }else{
                    nota = Integer.parseInt(textFieldNota.getText());
                }
                for (Avaliacao a : avaliacaos){
                   if(a.getItens().toLowerCase().contains(textFieldItens.getText().toLowerCase()) && a.getNota() >= Integer.parseInt(textFieldNota.getText())) {
                     temporario.add(a);
                   }
                }
                mostrarFiltro();

            }
        });
    }
}
