package model;

public class Personagem {
    private int id;
    private String nome;
    private int idade;
    private String origem;
    private String sexo;
    private String classe;
    private String historia;
    
    private boolean lider;
    private boolean inteligente;
    private boolean diplomatico;
    private boolean furtivo;
    private boolean sobrevivente;
    private boolean carismatico;
    private boolean medico;
    private boolean estrategista;
    private boolean atletico;

    public Personagem(int id, String nome, int idade, String origem, String sexo, String classe, String historia, boolean lider, boolean inteligente, boolean diplomatico, boolean furtivo, boolean sobrevivente, boolean carismatico, boolean medico, boolean estrategista, boolean atletico) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.origem = origem;
        this.sexo = sexo;
        this.classe = classe;
        this.historia = historia;
        this.lider = lider;
        this.inteligente = inteligente;
        this.diplomatico = diplomatico;
        this.furtivo = furtivo;
        this.sobrevivente = sobrevivente;
        this.carismatico = carismatico;
        this.medico = medico;
        this.estrategista = estrategista;
        this.atletico = atletico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isLider() {
        return lider;
    }

    public void setLider(boolean lider) {
        this.lider = lider;
    }

    public boolean isInteligente() {
        return inteligente;
    }

    public void setInteligente(boolean inteligente) {
        this.inteligente = inteligente;
    }

    public boolean isDiplomatico() {
        return diplomatico;
    }

    public void setDiplomatico(boolean diplomatico) {
        this.diplomatico = diplomatico;
    }

    public boolean isFurtivo() {
        return furtivo;
    }

    public void setFurtivo(boolean furtivo) {
        this.furtivo = furtivo;
    }

    public boolean isSobrevivente() {
        return sobrevivente;
    }

    public void setSobrevivente(boolean sobrevivente) {
        this.sobrevivente = sobrevivente;
    }

    public boolean isCarismatico() {
        return carismatico;
    }

    public void setCarismatico(boolean carismatico) {
        this.carismatico = carismatico;
    }

    public boolean isMedico() {
        return medico;
    }

    public void setMedico(boolean medico) {
        this.medico = medico;
    }

    public boolean isEstrategista() {
        return estrategista;
    }

    public void setEstrategista(boolean estrategista) {
        this.estrategista = estrategista;
    }

    public boolean isAtletico() {
        return atletico;
    }

    public void setAtletico(boolean atletico) {
        this.atletico = atletico;
    }

    
    
}
