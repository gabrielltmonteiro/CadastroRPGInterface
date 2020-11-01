package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.Janela;
import view.PainelBoasVindas;

public class BoasVindasController {
    Janela janela = new Janela();
    PainelBoasVindas painel = null;

    public BoasVindasController(PainelBoasVindas p) {
        painel = p;
        
        TrataBotao trataBotao = new TrataBotao();
        painel.getBtnCadastro().addActionListener(trataBotao);
        painel.getBtnTabela().addActionListener(trataBotao);
        
    }
    
    public class TrataBotao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            switch (e.getActionCommand()){
                case "Quero cadastrar meu personagem": janela.cadastro(); break;
                case "Me mostre os personagens ja cadastrados": btnTabela(); break;
            }
        }
    }
    
    public void btnCadastro(){
        janela.cadastro();
    }
    
    public void btnTabela() {
        janela.tabela();
    }
    
}
