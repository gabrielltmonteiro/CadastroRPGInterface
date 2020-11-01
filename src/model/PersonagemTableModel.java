package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class PersonagemTableModel extends AbstractTableModel {
    private static final long serialVersionUID = 1L;
    private List<Personagem> personagens = new ArrayList<Personagem>();
    
    public void setPersonagens(List<Personagem> personagens) {
        this.personagens.clear();
        this.personagens.addAll(personagens);
        fireTableDataChanged();
    }

    public void addPersonagem(Personagem personagem) {
        personagens.add(personagem);
        fireTableDataChanged();
    }

    public Personagem getPersonagem(int idx) {
        return personagens.get(idx);
    }

    public void delPersonagem(int idx) {
        personagens.remove(idx);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return personagens.size();
    }

    @Override
    public int getColumnCount() {
        return 16;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Personagem p = personagens.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getNome();
            case 2:
                return p.getIdade();
            case 3:
                return p.getOrigem();
            case 4:
                return p.getSexo();
            case 5:
                return p.getClasse();
            case 6:
                return p.getHistoria();
            case 7:
                return p.isLider();
            case 8:
                return p.isInteligente();
            case 9:
                return p.isDiplomatico();
            case 10:
                return p.isFurtivo();
            case 11:
                return p.isSobrevivente();
            case 12:
                return p.isCarismatico();
            case 13:
                return p.isMedico();
            case 14:
                return p.isEstrategista();
            case 15:
                return p.isAtletico();
            default:
                return null;
        }
    }
    
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Nome";
            case 2:
                return "Idade";
            case 3:
                return "Origem";
            case 4:
                return "Sexo";
            case 5:
                return "Classe";
            case 6:
                return "Historia";
            case 7:
                return "Líder";
            case 8:
                return "Inteligente";
            case 9:
                return "Diplomático";
            case 10:
                return "Furtivo";
            case 11:
                return "Sobrevivente";
            case 12:
                return "Carismático";
            case 13:
                return "Médico";
            case 14:
                return "Estrategista";
            case 15:
                return "Atlético";
            default:
                return null;
        }
    }

    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return String.class;
            case 7:
                return Boolean.class;
            case 8:
                return Boolean.class;
            case 9:
                return Boolean.class;
            case 10:
                return Boolean.class;
            case 11:
                return Boolean.class;
            case 12:
                return Boolean.class;
            case 13:
                return Boolean.class;
            case 14:
                return Boolean.class;
            case 15:
                return Boolean.class;
            default:
                return null;
        }
    }
    
}
