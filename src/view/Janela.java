package view;

import controller.BoasVindasController;
import controller.CadastroController;
import controller.TabelaController;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Janela extends JFrame {
    PainelBoasVindas pbv = new PainelBoasVindas();
    PainelCadastro pc = new PainelCadastro();
    PainelTabela pt = new PainelTabela();
    
    JFrame janela = new JFrame();
    Container container = new Container();
    
    private JMenuBar menubar = null;
    private JMenu menu1 = null;
    private JMenuItem menu1i1 = null;
    private JMenuItem menu1i2 = null;
    private JMenuItem menu1i3 = null;
    private JMenuItem menu1i4 = null;
    TrataMenu trataMenu = new TrataMenu();

    public Janela(JPanel p) {
        janela.setTitle("Cadastro de personagens");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setJMenuBar(getMenubar());
        container = janela.getContentPane();
        container.add(p);
        janela.setVisible(true);
        janela.setResizable(true);
        janela.pack();
        janela.setLocationRelativeTo(null);
    }

    public Janela() {
    }
    
    public void trocaPainel(JPanel painel){
        janela.dispose();
        janela.getContentPane().removeAll();
        container = janela.getContentPane();
        container.add(painel);
        container.revalidate();
        container.validate();
        container.repaint();
    }
    
    public void atualizaPainel(){
        container.repaint();
    }

    public JMenuBar getMenubar() {
        if (menubar == null){
            menubar = new JMenuBar();
            menubar.add(getMenu1());
        }
        return menubar;
    }

    public JMenu getMenu1() {
        if (menu1 == null){
            menu1 = new JMenu();
            menu1.setText("Opções");
            menu1.add(getMenu1i1());
            menu1.addSeparator();
            menu1.add(getMenu1i2());
            menu1.add(getMenu1i3());
            menu1.addSeparator();
            menu1.add(getMenu1i4());
        }
        return menu1;
    }

    public JMenuItem getMenu1i1() {
        if (menu1i1 == null){
            menu1i1 = new JMenuItem();
            menu1i1.setText("Painel inicial");
            menu1i1.addActionListener(trataMenu);
        }
        return menu1i1;
    }

    public JMenuItem getMenu1i2() {
        if (menu1i2 == null){
            menu1i2 = new JMenuItem();
            menu1i2.setText("Cadastro de personagem");
            menu1i2.addActionListener(trataMenu);
        }
        return menu1i2;
    }

    public JMenuItem getMenu1i3() {
        if (menu1i3 == null){
            menu1i3 = new JMenuItem();
            menu1i3.setText("Tabela de personagens");
            menu1i3.addActionListener(trataMenu);
        }
        return menu1i3;
    }
    
    public JMenuItem getMenu1i4() {
        if (menu1i4 == null){
            menu1i4 = new JMenuItem();
            menu1i4.setText("Sair");
            menu1i4.addActionListener(trataMenu);
        }
        return menu1i4;
    }
    
    public class TrataMenu implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()){
                case "Painel inicial": inicio(); break;
                case "Cadastro de personagem": cadastro(); break;
                case "Tabela de personagens": tabela(); break;
                case "Sair": sair(); break;
            }
        }
    }
    
    private void inicio(){
        trocaPainel(pbv);
        new Janela(pbv);
        new BoasVindasController(pbv);

    }

    public void cadastro(){
        trocaPainel(pc);
        new Janela(pc);
        new CadastroController(pc);
    }

    public void tabela() {
        trocaPainel(pt);
        new Janela(pt);
        new TabelaController(pt);
    }
    
    public void sair(){
        dispose();
    }
    
}
