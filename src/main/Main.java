package main;

import controller.BoasVindasController;
import database.DatabaseConnection;
import view.Janela;
import view.PainelBoasVindas;

public class Main {
        public static void main(String[] args) {
        //DatabaseConnection.setConfig("jdbc:sqlite:personagem.db", "", "", "org.sqlite.JDBC");
        PainelBoasVindas pbv = new PainelBoasVindas();
        new Janela(pbv);
        new BoasVindasController(pbv);
    }
    
}
