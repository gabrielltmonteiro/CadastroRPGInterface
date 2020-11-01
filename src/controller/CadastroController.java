package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import model.*;
import view.*;

public class CadastroController {
    PersonagemTableModel ptm = new PersonagemTableModel();
    PainelTabela pt = new PainelTabela();
    PainelCadastro pc = null;
    //PersonagemDAO personagemDAO = new PersonagemDAO();
    private int idPersonagem = 0;
    private int contCheckBox = 0;

    public CadastroController(PainelCadastro p) {
        pc = p;
        
        TrataBotao trataBotao = new TrataBotao();
        pc.getBtnSalvar().addActionListener(trataBotao);
        pc.getBtnRemover().addActionListener(trataBotao);
        pc.getBtnLimpar().addActionListener(trataBotao);
        
        TrataCheckBox trataCheckBox = new TrataCheckBox();
        pc.getOp1().addItemListener(trataCheckBox);
        pc.getOp2().addItemListener(trataCheckBox);
        pc.getOp3().addItemListener(trataCheckBox);
        pc.getOp4().addItemListener(trataCheckBox);
        pc.getOp5().addItemListener(trataCheckBox);
        pc.getOp6().addItemListener(trataCheckBox);
        pc.getOp7().addItemListener(trataCheckBox);
        pc.getOp8().addItemListener(trataCheckBox);
        pc.getOp9().addItemListener(trataCheckBox);
        
    }

    public CadastroController() {
    }
    
    public void reset(){
        pc.getCampoNome().setText("");
        pc.getCampoIdade().setText("");
        pc.getCampoOrigem().setText("");
        pc.getComboSexo().setSelectedIndex(0);
        pc.getComboClasses().setSelectedIndex(0);
        pc.getHistoria().setText("");
        pc.getOp1().setSelected(false);
        pc.getOp2().setSelected(false);
        pc.getOp3().setSelected(false);
        pc.getOp4().setSelected(false);
        pc.getOp5().setSelected(false);
        pc.getOp6().setSelected(false);
        pc.getOp7().setSelected(false);
        pc.getOp8().setSelected(false);
        pc.getOp9().setSelected(false);
        
    }
    
    public class TrataBotao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            switch (e.getActionCommand()){
                case "Salvar": btnSalvar(); break;
                case "Remover": btnRemover(); break;
                case "Limpar dados": btnLimpar(); break;
            }
        }
    }
    
    public class TrataCheckBox implements ItemListener {
        
        @Override
        public void itemStateChanged(ItemEvent e) {
            
            if(e.getStateChange() == ItemEvent.SELECTED){
                contCheckBox++;
                if(contCheckBox>3){
                    JOptionPane.showMessageDialog(null, "Você só pode selecionar 3 habilidades!");
                }            
            }else{
                contCheckBox--;
            }
        }
    }
    
    public boolean verificaPreenchimento(){
        int contStatus = 0;
        int contHabilidades = 0;
        
        if(pc.getCampoNome().getText().isEmpty()){
            contStatus++;
        }
        
        if(pc.getCampoIdade().getText().isEmpty()){
            contStatus++;
        }
        
        if(pc.getCampoOrigem().getText().isEmpty()){
            contStatus++;
        }
        
        if(pc.getComboSexo().getSelectedIndex()==0){
            contStatus++;
        }
        
        if(pc.getComboClasses().getSelectedIndex()==0){
            contStatus++;
        }
        
        if(pc.getHistoria().getText().isEmpty()){
            contStatus++;
        }
        
        if(pc.getOp1().isSelected()){
            contHabilidades++;
            
        }
        
        if(pc.getOp2().isSelected()){
            contHabilidades++;
            
        }
        
        if(pc.getOp3().isSelected()){
            contHabilidades++;
            
        }
        
        if(pc.getOp4().isSelected()){
            contHabilidades++;
            
        }
        
        if(pc.getOp5().isSelected()){
            contHabilidades++;
            
        }
        
        if(pc.getOp6().isSelected()){
            contHabilidades++;
            
        }
        
        if(pc.getOp7().isSelected()){
            contHabilidades++;
            
        }
        
        if(pc.getOp8().isSelected()){
            contHabilidades++;
            
        }
        
        if(pc.getOp9().isSelected()){
            contHabilidades++;
            
        }
        
        if(contStatus>0){
            JOptionPane.showMessageDialog(null, "Preencha todos os dados!");
            return false;
        }else{
            if(contHabilidades < 3){
                JOptionPane.showMessageDialog(null, "Escolha 3 habilidades!");
                return false;
            }else{
                return true;
            }
        }
    }
    
    public void btnSalvar(){
        /*
        if(verificaPreenchimento()==true){
            Personagem p = new Personagem(
                idPersonagem,
                pc.getCampoNome().getText(),
                Integer.parseInt(pc.getCampoIdade().getText()),
                pc.getCampoOrigem().getText(),
                pc.getComboSexo().getSelectedItem().toString(),
                pc.getComboClasses().getSelectedItem().toString(),
                pc.getHistoria().getText(),
                pc.getOp1().isSelected(),
                pc.getOp2().isSelected(),
                pc.getOp3().isSelected(),
                pc.getOp4().isSelected(),
                pc.getOp5().isSelected(),
                pc.getOp6().isSelected(),
                pc.getOp7().isSelected(),
                pc.getOp8().isSelected(),
                pc.getOp9().isSelected()
            );
            personagemDAO.salvaPersonagem(p);
            reset();
        }
        */
    }
    
    public void btnRemover(){
        //personagemDAO.removePersonagem(idPersonagem);
    }
    
    public void btnLimpar(){
        reset();
    }
    
    public void pegaDadosTabela(Personagem pe){
        /*
        System.out.println(
            "id: "+pe.getId()+"\n"+
            "nome: "+pe.getNome()
        );
        */
    }
}
