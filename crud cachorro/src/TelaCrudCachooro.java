
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaCrudCachooro extends JFrame{
    private JTextField txtNome;
    private JTextField txtAltura;
    private JTextField txtPeso;
    private JButton cadastrarButton;
    private JButton localizarButton;
    private JButton editarButton;
    private JButton apagarButton;
    private JButton mostarTodosButton;
    private JButton fakesButton;
    private JTextArea txtTodos;
    public JPanel telaPrincipal;
    private Cachorro alvo = null;

    ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();

    private void mostrarTodos(){
        String s = "";
        txtTodos.setText("");
        for(Cachorro c : cachorros ){
            s = s.concat(String.format("Nome : %s \nAltura: %.2f cm\nPeso: %.2f kg\n---------------------\n",c.getNome(),c.getAltura(),c.getPeso()));
            txtTodos.setText(s);

        }

    }

    private void limparGeral(){
        txtNome.setText("");
        txtAltura.setText("");
        txtPeso.setText("");
    }

    public TelaCrudCachooro() {





        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                float altura = Float.parseFloat(txtAltura.getText());
                float peso = Float.parseFloat(txtPeso.getText());
                Cachorro c = new Cachorro(nome,altura,peso);
                cachorros.add(c);

                mostrarTodos();
                limparGeral();

            }
        });
        localizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Cachorro c : cachorros) {
                    if(txtNome.getText().equals(c.getNome())){
                        alvo = c;
                        txtAltura.setText(Float.toString(c.getAltura()));
                        txtPeso.setText(Float.toString(c.getPeso()));                    }
                }
                }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if (alvo != null){
                   alvo.setAltura(Float.parseFloat(txtAltura.getText()));
                   alvo.setPeso(Float.parseFloat(txtPeso.getText()));
               }
               mostrarTodos();
               limparGeral();
            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < cachorros.size(); i++) {

                    Cachorro c = cachorros.get(i);
                    if(c.getNome().equals(txtNome.getText())){
                        cachorros.remove(i);

                    }
                }
                mostrarTodos();
                limparGeral();

            }
        });
        mostarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTodos();
            }
        });
        fakesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cachorros.add(new Cachorro("joel",10f,11.30f));
                cachorros.add(new Cachorro("toby",50f,51.90f));
                cachorros.add(new Cachorro("carla",5f,1.30f));

                mostrarTodos();
            }
        });
    }
    }