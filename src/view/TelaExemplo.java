package view;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TelaExemplo extends JFrame {
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblEndereco;
    private JTextField txtEndereco;
    private JLabel lblTelefone;
    private JFormattedTextField txtTelefone;
    private JLabel lblCPF;
    private JFormattedTextField txtCPF;
    private JLabel lblTipoSanguineo;
    private JComboBox cmbTipoSanguineo;
    private final String TIPOSANGUINEO[] = {"A","B","AB","O"};
    private JLabel lblFatorRh;
    private JComboBox cmbFatorRh;
    private final String TIPOFRH[] = {"+", "-"};
    private JLabel lblCurso;
    private JComboBox cmbCurso;
    private final String NOMECURSO[] = {"ADMINISTRAÇÃO", "DIRETO", "SISTEMAS DE INFORMAÇÃO"};
    private JLabel lblContato;
    private JTextField txtContato;
    private JLabel lblTelefoneContato;
    private JFormattedTextField txtTelefoneContato;
    private JButton btnInserir;
    private JButton btnCancelar;


    public TelaExemplo(){
        setSize(420,370);
        setTitle("Sistema de Cadastro");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container tela = getContentPane();
        tela.setLayout(null);

        lblNome = new JLabel("Nome");
        lblEndereco = new JLabel("Endereço");
        lblTelefone = new JLabel("Telefone");
        try {
            txtTelefone = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
        } catch (Exception e){
            e.printStackTrace();
        }
        lblCPF = new JLabel("CPF");
        try {
            txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (Exception e){
            e.printStackTrace();
        }
        lblTipoSanguineo = new JLabel("Tipo Sanguíneo");
        lblFatorRh = new JLabel("Fator RH");
        lblCurso = new JLabel("Curso");
        lblContato = new JLabel("Contato");
        lblTelefoneContato = new JLabel("Telefone de Emergência");
        try {
            txtTelefoneContato = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
        } catch (Exception e){
            e.printStackTrace();
        }

        txtNome = new JTextField();
        txtEndereco = new JTextField();
        cmbTipoSanguineo = new JComboBox(TIPOSANGUINEO);
        cmbFatorRh = new JComboBox(TIPOFRH);
        cmbCurso = new JComboBox(NOMECURSO);
        cmbCurso.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    trataEventoSelecao();
                }
            }
        });

        txtContato = new JTextField();
        btnInserir = new JButton("Inserir");
        btnInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trataEventoOnClick();
            }
        });
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trataEnventoOnClickCancelar();
            }
        });


        lblNome.setBounds(10,10,200,25);
        lblEndereco.setBounds(10,40,200,25);
        lblTelefone.setBounds(10,70,200,25);
        lblCPF.setBounds(10,100,200,25);
        lblTipoSanguineo.setBounds(10,130,200,25);
        lblFatorRh.setBounds(265,130,200,25);
        lblCurso.setBounds(10,160,200,25);
        lblContato.setBounds(10,190,200,25);
        lblTelefoneContato.setBounds(10,220,200,25);

        txtNome.setBounds(190,10,200,25);
        txtEndereco.setBounds(190,40,200,25);
        txtTelefone.setBounds(190,70,200,25);
        txtCPF.setBounds(190,100,200,25);
        cmbTipoSanguineo.setBounds(190,130,70,25);
        cmbFatorRh.setBounds(320,130,70,25);
        cmbCurso.setBounds(190,160,200,25);
        txtContato.setBounds(190,190,200,25);
        txtTelefoneContato.setBounds(190,220,200,25);
        btnInserir.setBounds(100,260,100,40);
        btnCancelar.setBounds(200,260,100,40);

        tela.add(lblNome);
        tela.add(txtNome);
        tela.add(lblEndereco);
        tela.add(txtEndereco);
        tela.add(lblTelefone);
        tela.add(txtTelefone);
        tela.add(lblCPF);
        tela.add(txtCPF);
        tela.add(lblTipoSanguineo);
        tela.add(cmbTipoSanguineo);
        tela.add(lblFatorRh);
        tela.add(cmbFatorRh);
        tela.add(lblCurso);
        tela.add(cmbCurso);
        tela.add(lblContato);
        tela.add(txtContato);
        tela.add(lblTelefoneContato);
        tela.add(txtTelefoneContato);
        tela.add(btnInserir);
        tela.add(btnCancelar);
    }
    void trataEventoOnClick(){
        JOptionPane.showMessageDialog(this, "Você clicou no botão Inserir");
    }
    void trataEnventoOnClickCancelar(){
        JOptionPane.showMessageDialog(this,"Você clicou no botão Cancelar" );
    }
    void trataEventoSelecao(){
        JOptionPane.showMessageDialog(this, "Selecionado " + cmbCurso.getSelectedItem());
    }
}
