package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PainelCadastro extends JPanel {
    
    JTextField campoNome = new JTextField(30);
    JTextField campoIdade = new JTextField(30);
    JTextField campoOrigem = new JTextField(30);
    JComboBox comboSexo = new JComboBox();
    JComboBox comboClasses = new JComboBox();
    
    JCheckBox op1 = new JCheckBox("Líder");
    JCheckBox op2 = new JCheckBox("Inteligente");
    JCheckBox op3 = new JCheckBox("Diplomático");
    JCheckBox op4 = new JCheckBox("Furtivo");
    JCheckBox op5 = new JCheckBox("Sobrevivente");
    JCheckBox op6 = new JCheckBox("Carismático");
    JCheckBox op7 = new JCheckBox("Médico");
    JCheckBox op8 = new JCheckBox("Estrategista");
    JCheckBox op9 = new JCheckBox("Atlético");
    
    JTextArea historia = new JTextArea(5, 15);
    
    JButton btnSalvar = new JButton("Salvar");
    JButton btnRemover = new JButton("Remover");
    JButton btnLimpar = new JButton("Limpar dados");

    public PainelCadastro() {
        
        setLayout(new GridBagLayout());
        GridBagConstraints constraintsPersonagem = new GridBagConstraints();
        constraintsPersonagem.fill = GridBagConstraints.HORIZONTAL;
        constraintsPersonagem.weightx = 0.5;
        constraintsPersonagem.insets = new Insets(0,0,0,0);
        
        //-----------------------------------------------------------------
        
        JPanel painelImagem = new JPanel(new FlowLayout(0,0,0));
        
        ImageIcon imagemFundo = new ImageIcon("imagens/dragon-age.jpg");
        
        imagemFundo.setImage(imagemFundo.getImage().getScaledInstance(480, 200, 100));
        
        JLabel label = new JLabel(imagemFundo);
        
        painelImagem.add(label);
        
        constraintsPersonagem.gridx = 0;
        constraintsPersonagem.gridy = 0;
        add(painelImagem,constraintsPersonagem);
        
        //-----------------------------------------------------------------
        
        JPanel painelTitulo = new JPanel();

        JLabel titulo = new JLabel("Cadastre seu personagem!");
        painelTitulo.add(titulo);
        
        constraintsPersonagem.gridx = 0;
        constraintsPersonagem.gridy = 1;
        add(painelTitulo,constraintsPersonagem);
        
        //-----------------------------------------------------------------
        
        JPanel painelCampos = new JPanel();
        
        painelCampos.setLayout(new GridBagLayout());
        
        GridBagConstraints constraintsCampos = new GridBagConstraints();
        constraintsCampos.fill = GridBagConstraints.HORIZONTAL ;
        constraintsCampos.weightx = 0.5;
        constraintsCampos.insets = new Insets(5,5,5,5);
        
        constraintsCampos.gridx = 0;
        constraintsCampos.gridy = 0;
        painelCampos.add(new JLabel("Nome:"),constraintsCampos);
        
        constraintsCampos.gridx = 1;
        constraintsCampos.gridy = 0;
        painelCampos.add(campoNome,constraintsCampos);
        
        constraintsCampos.gridx = 0;
        constraintsCampos.gridy = 1;
        painelCampos.add(new JLabel("Idade:"),constraintsCampos);
        
        constraintsCampos.gridx = 1;
        constraintsCampos.gridy = 1;
        painelCampos.add(campoIdade,constraintsCampos);
        
        constraintsCampos.gridx = 0;
        constraintsCampos.gridy = 2;
        painelCampos.add(new JLabel("Origem:"),constraintsCampos);
        
        constraintsCampos.gridx = 1;
        constraintsCampos.gridy = 2;
        painelCampos.add(campoOrigem,constraintsCampos);
        
        constraintsCampos.gridx = 0;
        constraintsCampos.gridy = 3;
        painelCampos.add(new JLabel("Sexo:"),constraintsCampos);
        
        comboSexo.addItem("Selecione...");
        comboSexo.addItem("Masculino");
        comboSexo.addItem("Feminino");
        
        constraintsCampos.gridx = 1;
        constraintsCampos.gridy = 3;
        painelCampos.add(comboSexo,constraintsCampos);
        
        constraintsPersonagem.gridx = 0;
        constraintsPersonagem.gridy = 2;
        add(painelCampos,constraintsPersonagem);
        
        //-----------------------------------------------------------
        
        JPanel painelCombo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelCombo.add(new JLabel("Classe:"));
        
        comboClasses.addItem("Selecione...");
        comboClasses.addItem("Guerreiro");
        comboClasses.addItem("Mago");
        comboClasses.addItem("Arqueiro");
        comboClasses.addItem("Bardo");
        //comboClasses.setSelectedIndex(-1);
        /* 
        imagem = new ImageIcon(file.getPath());//pega dir da imagem 
        novaImagem = new ImageIcon(imagem.getImage().getScaledInstance(90, -1, Image.SCALE_DEFAULT));//pega a imagem com novo tam
        atualizaLabel(novaImagem);
        repaint();
        
        switch ((String)  comboClasses.getSelectedItem()) {
            case "Guerreiro":
            imagemFundo.setImage();
            break;
            case "Mago":
            imagemFundo.setImage(new DefaultComboBoxModel<String>(getEventosFevereiro()));
            break;
            case "Arqueiro":
            imagemFundo.setImage(new DefaultComboBoxModel<String>(getEventosFevereiro()));
            break;
            case "Bardo":
            imagemFundo.setImage();
                break;
                default:
                break;
            }
            */
            
            painelCombo.add(comboClasses);
            
            constraintsPersonagem.gridx = 0;
            constraintsPersonagem.gridy = 3;
            add(painelCombo,constraintsPersonagem);
            
            //-------------------------------------------------------------
            
            if((comboClasses.getSelectedItem()=="Bardo")){
                comboClasses.addItem("Funcionou");
                /*
                ImageIcon imagem = new ImageIcon("imgens/imagem-boas-vindas.jpg");
                imagemFundo.setImage = new ImageIcon(imagem.getImage().getScaledInstance(480, 200, Image.SCALE_DEFAULT));
                JLabel label = new JLabel(imagemFundo);
                painelImagem.add(label);
                */
            }
        JPanel painelHabilidades = new JPanel(new FlowLayout());
        
        painelHabilidades.setLayout(new GridBagLayout());
        
        GridBagConstraints constraintsHabilidades = new GridBagConstraints();
        constraintsHabilidades.fill = GridBagConstraints.HORIZONTAL ;
        constraintsHabilidades.weightx = 0.5;
        constraintsHabilidades.insets = new Insets(5,5,5,5);
        
        constraintsHabilidades.gridx = 0;
        constraintsHabilidades.gridy = 0;

        painelHabilidades.add(new JLabel("Escolha 3 habilidades iniciais"),constraintsHabilidades);
        
        constraintsHabilidades.gridx = 0;
        constraintsHabilidades.gridy = 1;
        
        painelHabilidades.add(op1,constraintsHabilidades);
        
        constraintsHabilidades.gridx = 1;
        constraintsHabilidades.gridy = 1;
        
        painelHabilidades.add(op2,constraintsHabilidades);
        
        constraintsHabilidades.gridx = 2;
        constraintsHabilidades.gridy = 1;
        
        painelHabilidades.add(op3,constraintsHabilidades);
        
        constraintsHabilidades.gridx = 0;
        constraintsHabilidades.gridy = 2;
        
        painelHabilidades.add(op4,constraintsHabilidades);
        
        constraintsHabilidades.gridx = 1;
        constraintsHabilidades.gridy = 2;
        
        painelHabilidades.add(op5,constraintsHabilidades);
        
        constraintsHabilidades.gridx = 2;
        constraintsHabilidades.gridy = 2;
        
        painelHabilidades.add(op6,constraintsHabilidades);
        
        constraintsHabilidades.gridx = 0;
        constraintsHabilidades.gridy = 3;
        
        painelHabilidades.add(op7,constraintsHabilidades);
        
        constraintsHabilidades.gridx = 1;
        constraintsHabilidades.gridy = 3;
        
        painelHabilidades.add(op8,constraintsHabilidades);
        
        constraintsHabilidades.gridx = 2;
        constraintsHabilidades.gridy = 3;
        
        painelHabilidades.add(op9,constraintsHabilidades);
        
        constraintsPersonagem.gridx = 0;
        constraintsPersonagem.gridy = 4;
        add(painelHabilidades,constraintsPersonagem);
        
        //-------------------------------------------------------------
        
        JPanel painelHistoria = new JPanel(new BorderLayout());

        painelHistoria.add(new JLabel("Conte um pouco da história do seu personagem..."), BorderLayout.NORTH);
        
        historia.setEditable(true);
        historia.setLineWrap(true);
        historia.setWrapStyleWord(true);
        
        JScrollPane barraRolagem = new JScrollPane(historia);
        painelHistoria.add(barraRolagem, BorderLayout.SOUTH);
        
        constraintsPersonagem.gridx = 0;
        constraintsPersonagem.gridy = 5;
        add(painelHistoria,constraintsPersonagem);
        
        //------------------------------------------------------------
        
        JPanel painelBotoes = new JPanel(new FlowLayout());
        
        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnRemover);
        painelBotoes.add(btnLimpar);
        
        constraintsPersonagem.gridx = 0;
        constraintsPersonagem.gridy = 6;
        add(painelBotoes,constraintsPersonagem);
        
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JTextField getCampoIdade() {
        return campoIdade;
    }

    public void setCampoIdade(JTextField campoIdade) {
        this.campoIdade = campoIdade;
    }

    public JTextField getCampoOrigem() {
        return campoOrigem;
    }

    public void setCampoOrigem(JTextField campoOrigem) {
        this.campoOrigem = campoOrigem;
    }

    public JComboBox getComboSexo() {
        return comboSexo;
    }

    public void setComboSexo(JComboBox comboSexo) {
        this.comboSexo = comboSexo;
    }

    public JComboBox getComboClasses() {
        return comboClasses;
    }

    public void setComboClasses(JComboBox comboClasses) {
        this.comboClasses = comboClasses;
    }

    public JTextArea getHistoria() {
        return historia;
    }

    public void setHistoria(JTextArea historia) {
        this.historia = historia;
    }

    public JButton getBtnSalvar() {
        return btnSalvar;
    }

    public void setBtnSalvar(JButton btnSalvar) {
        this.btnSalvar = btnSalvar;
    }

    public JButton getBtnRemover() {
        return btnRemover;
    }

    public void setBtnRemover(JButton btnRemover) {
        this.btnRemover = btnRemover;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public void setBtnLimpar(JButton btnLimpar) {
        this.btnLimpar = btnLimpar;
    }

    public JCheckBox getOp1() {
        return op1;
    }

    public void setOp1(JCheckBox op1) {
        this.op1 = op1;
    }

    public JCheckBox getOp2() {
        return op2;
    }

    public void setOp2(JCheckBox op2) {
        this.op2 = op2;
    }

    public JCheckBox getOp3() {
        return op3;
    }

    public void setOp3(JCheckBox op3) {
        this.op3 = op3;
    }

    public JCheckBox getOp4() {
        return op4;
    }

    public void setOp4(JCheckBox op4) {
        this.op4 = op4;
    }

    public JCheckBox getOp5() {
        return op5;
    }

    public void setOp5(JCheckBox op5) {
        this.op5 = op5;
    }

    public JCheckBox getOp6() {
        return op6;
    }

    public void setOp6(JCheckBox op6) {
        this.op6 = op6;
    }

    public JCheckBox getOp7() {
        return op7;
    }

    public void setOp7(JCheckBox op7) {
        this.op7 = op7;
    }

    public JCheckBox getOp8() {
        return op8;
    }

    public void setOp8(JCheckBox op8) {
        this.op8 = op8;
    }

    public JCheckBox getOp9() {
        return op9;
    }

    public void setOp9(JCheckBox op9) {
        this.op9 = op9;
    }
     
}
