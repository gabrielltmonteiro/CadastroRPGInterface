package model;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.*;



public class PersonagemDAO {

    private int Position;
	private List <Personagem> personagemList;

	public PersonagemDAO() {
		Position = 0;
		personagemList = new ArrayList<Personagem>();
		create();
	}
    
    private void create() {
		try {
			Connection conn = DatabaseConnection.getConnection();
			Statement stmt = conn.createStatement();
            String query =
                "create table if not exists personagem ("+
                "id integer primary key,"+
                "nome varchar(50),"+
                "idade integer,"+
                "origem varchar(50),"+
                "sexo varchar(50),"+
                "classe varchar(50),"+
                "historia varchar(255),"+
                "lider boolean,"+
                "inteligente boolean,"+
                "diplomatico boolean,"+
                "furtivo boolean,"+
                "sobrevivente boolean,"+
                "carismatico boolean,"+
                "medico boolean,"+
                "estrategista boolean,"+
                "atletico boolean)";  
                
			stmt.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

    
    public void salvaPersonagem(Personagem personagem){
        

        try {
			Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();
            // create();
            String query = "insert into personagem (nome, idade, origem, sexo, classe, historia, lider," +
                    " inteligente, diplomatico, furtivo, sobrevivente, carismatico, medico, estrategista, atletico) " +
                    "values ('" + personagem.getNome() + "','" + personagem.getIdade() +"','" + personagem.getOrigem() + "','"
                    + personagem.getSexo() + "', '" + personagem.getClasse() + "','" + personagem.getHistoria() + "','" + personagem.isLider() + "' , '"
                    + personagem.isInteligente() + "', '" + personagem.isDiplomatico() + "','" + personagem.isFurtivo()+ "','" + personagem.isSobrevivente() + "', '"
                    + personagem.isCarismatico() + "','" + personagem.isMedico()+ "','" + personagem.isEstrategista() + "', '" + personagem.isAtletico()+"')";
            stmt.executeUpdate(query);
            System.out.println("salvouu!!");
            stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    public void removePersonagem(int id){
        try {
            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();
            String query = "delete from personagem where id = " + id;
            System.out.println("personagem removido" + query);
            stmt.executeUpdate(query);
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        this.clear();
    }

    public void atualizaPersonagem(Personagem personagem){
        
    }

    public void clear() {
		Position = 0;
		personagemList.clear();
    }


    public List<Personagem> buscaPersonagens() {
        String sql = "select * from personagem";
        List<Personagem> personagemList = new ArrayList<Personagem>();
        Personagem p;


        try {
            Connection con = DatabaseConnection.getConnection();
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                p = new Personagem(
                rs.getInt("id"), rs.getString("nome"),
                rs.getInt("idade"),rs.getString("origem"),
                rs.getString("sexo"),rs.getString("classe"),
                rs.getString("historia"),rs.getBoolean("lider"),
                rs.getBoolean("inteligente"),rs.getBoolean("diplomatico"),
                rs.getBoolean("furtivo"),rs.getBoolean("sobrevivente"),rs.getBoolean("carismatico"),
                rs.getBoolean("medico"),rs.getBoolean("estrategista"),rs.getBoolean("atletico"));
                personagemList.add(p);

            }
            // con.close();
            rs.close();
            stmt.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personagemList;        
    }


  

    public Personagem next() {
		Personagem next = null;
		if (Position < personagemList.size()) {
			next = personagemList.get(Position);
			Position++;
		}
		return next;
	}


    
}
