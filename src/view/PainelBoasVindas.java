package view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelBoasVindas extends JPanel {
    JButton btnCadastro = new JButton("Quero cadastrar meu personagem");
    JButton btnTabela = new JButton("Me mostre os personagens ja cadastrados");

    public PainelBoasVindas() {
        JPanel pImagem = new JPanel();
        JPanel pMensagem = new JPanel();
        JPanel pBotoes = new JPanel();
        
        setLayout(new GridBagLayout());
        GridBagConstraints cp = new GridBagConstraints();
        cp.fill = GridBagConstraints.CENTER;
        cp.weightx = 0.5;
        cp.insets = new Insets(0,0,5,0);
        
        //----------------------------------------------------------------------
        
        pImagem.setLayout(new FlowLayout(0, 0, 0));
        ImageIcon imagem = new ImageIcon("imagens/imagem-boas-vindas.jpg");
        imagem.setImage(imagem.getImage().getScaledInstance(500, 200, 100));
        JLabel label = new JLabel(imagem);
        pImagem.add(label);
        
        cp.gridx = 0;
        cp.gridy = 0;
        add(pImagem,cp);
        
        //----------------------------------------------------------------------
        
        pMensagem.setLayout(new GridBagLayout());
        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.CENTER ;
        c1.weightx = 0.5;
        c1.insets = new Insets(5,5,5,5);
        
        c1.gridx = 0;
        c1.gridy = 0;
        pMensagem.add(new JLabel("Bem vindo, aventureiro(a)!"),c1);
        
        c1.gridx = 0;
        c1.gridy = 1;
        pMensagem.add(new JLabel("O que deseja fazer?"),c1);
        
        cp.gridx = 0;
        cp.gridy = 1;
        add(pMensagem,cp);
        
        //----------------------------------------------------------------------
        
        pBotoes.setLayout(new GridBagLayout());
        GridBagConstraints c2 = new GridBagConstraints();
        c2.fill = GridBagConstraints.CENTER ;
        c2.weightx = 0.5;
        c2.insets = new Insets(5,5,5,5);
        
        c2.gridx = 0;
        c2.gridy = 0;
        pBotoes.add(btnCadastro,c2);
        
        c2.gridx = 0;
        c2.gridy = 1;
        pBotoes.add(btnTabela,c2);
        
        cp.gridx = 0;
        cp.gridy = 2;
        add(pBotoes,cp);
        
    }

    public JButton getBtnCadastro() {
        return btnCadastro;
    }

    public void setBtnCadastro(JButton btnCadastro) {
        this.btnCadastro = btnCadastro;
    }

    public JButton getBtnTabela() {
        return btnTabela;
    }

    public void setBtnTabela(JButton btnTabela) {
        this.btnTabela = btnTabela;
    }
    
}
