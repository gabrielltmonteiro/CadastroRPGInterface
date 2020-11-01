package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.PersonagemTableModel;

public class PainelTabela extends JPanel {
    private static final long serialVersionUID = 1L;
    PersonagemTableModel ptm = new PersonagemTableModel();
    JTable tabela = new JTable();
    JButton btnEditar = new JButton("Editar");
    JButton btnRemover = new JButton("Remover");
    JButton btnCancelar = new JButton("Cancelar ação");

    public PainelTabela() {
        setLayout(new BorderLayout());
        
        //List<Personagem> personagens = new ArrayList<Personagem>();
        //personagens.add(new Personagem(00, "Legolas", 3000, "Woodland Realm", "Masculino", "Arqueiro", "Legolas, também conhecido como Legolas Verdefolha, foi um Elfo Sindarin que fazia parte da Sociedade do Anel na Terceira Era. Ele foi o filho do Rei Élfico Thranduil da Floresta das Trevas, que servia como Príncipe, mensageiro e mestre-arqueiro. Com sua visão aguçada, audição sensível, e mira excelente, Legolas era um recurso valioso para os outros oito da Sociedade do Anel, da qual fez parte em sua jornada pela Terra-Média. Legolas se tornou grande amigo do anão Gimli, mesmo apesar da grande inimizade entre as duas raças.", false, true, false, true, true, true, false, false, true));
        
        //ptm.setPersonagens(personagens);
        tabela.setSize(1200,300);
        tabela.setModel(ptm);
        add(new JScrollPane(tabela), BorderLayout.CENTER);
        
        //----------------------------------------------------------------------
        
        JPanel pBotoes = new JPanel();
        pBotoes.setLayout(new FlowLayout());
        
        pBotoes.add(btnEditar);
        pBotoes.add(btnRemover);
        pBotoes.add(btnCancelar);
        
        add(pBotoes, BorderLayout.SOUTH);
    }

    public PersonagemTableModel getPtm() {
        return ptm;
    }

    public void setPtm(PersonagemTableModel ptm) {
        this.ptm = ptm;
    }

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

    public JButton getBtnRemover() {
        return btnRemover;
    }

    public void setBtnRemover(JButton btnRemover) {
        this.btnRemover = btnRemover;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }
    
}
