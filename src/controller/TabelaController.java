package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.Personagem;
import model.PersonagemDAO;
import model.PersonagemTableModel;
import view.Janela;
import view.PainelTabela;

public class TabelaController {
    Janela janela = new Janela();
    PersonagemTableModel ptm = new PersonagemTableModel();
    PainelTabela pt = null;
    //PersonagemDAO personagemDAO = new PersonagemDAO();
    CadastroController cc = new CadastroController();
    private int idPersonagem = 0;

    public TabelaController(PainelTabela p) {
        pt = p;
        TrataBotao1 trataBotao = new TrataBotao1();
        TrataTabela1 trataTabela = new TrataTabela1();
        pt.getBtnEditar().addActionListener(trataBotao);
        pt.getBtnRemover().addActionListener(trataBotao);
        pt.getBtnCancelar().addActionListener(trataBotao);
        pt.getTabela().getSelectionModel().addListSelectionListener(trataTabela);
        //carregaTabela();
    }
    
    public class TrataBotao1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            switch (e.getActionCommand()){
                case "Editar": editar(); break;
                case "Remover": remover(); break;
                case "Cancelar ação": cancelar(); break;
            }
        }
    }
    
    public void editar(){
        /*
        if(pt.getTabela().getModel().getRowCount()>0){
            idPersonagem = Integer.parseInt(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 0).toString());

            Personagem p = new Personagem(
                    Integer.parseInt(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 0).toString()),
                    pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 1).toString(),
                    Integer.parseInt(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 2).toString()),
                    pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 3).toString(),
                    pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 4).toString(),
                    pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 5).toString(),
                    pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 6).toString(),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 7).toString()),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 8).toString()),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 9).toString()),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 10).toString()),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 11).toString()),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 12).toString()),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 13).toString()),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 14).toString()),
                    Boolean.parseBoolean(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 15).toString())
            );
            cc.pegaDadosTabela(p);
            
        }
        */
    }
    
    public void remover() {
        /*
        personagemDAO.removePersonagem(Integer.parseInt(pt.getTabela().getValueAt(pt.getTabela().getSelectedRow(), 0).toString()));
        atualizaTabela();
        janela.atualizaPainel();
        carregaTabela();
        */
    }
    
    public void cancelar(){
        //limpaSelecao();
    }
    
    public class TrataTabela1 implements ListSelectionListener {
        
        @Override
        public void valueChanged(ListSelectionEvent e) {
            //
        }
    }
    
    public void atualizaTabela(){
        //pt.getPtm().fireTableDataChanged();
    }
    
    public void limpaSelecao(){
        /*
        if(pt.getTabela().getSelectionModel().getSelectedItemsCount()>0){
            //pt.getTabela().getSelectionModel().clearSelection();
            //System.out.println("itens selecionados: "+pt.getTabela().getSelectionModel().getSelectedItemsCount());
        }
        */
    }
    
    public void carregaTabela() {
        /*
        List<Personagem> personagens = personagemDAO.buscaPersonagens();      
        pt.getPtm().setPersonagens(personagens);
        atualizaTabela();
        */
    }
    
}
