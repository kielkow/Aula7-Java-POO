package testeaula07;
import javax.swing.JOptionPane;
public class Lutador implements Interface {
    
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    
    //Metodo Construtor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    public Lutador() {
    }
    
    
    //Metodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        if(this.getPeso()<52.2){
            this.setCategoria("Invalido");
        }
        else if(this.getPeso() <= 70.3){
            this.setCategoria("Leve");
        }
        else if(this.getPeso() <= 83.9){
            this.setCategoria("Medio");
        }
        else if(this.getPeso() <= 120.2){
            this.setCategoria("Pesado");
        }
        else{
            this.setCategoria("Invalido");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
    //Metodos Abstrados
    @Override
    public void apresentar() {
        
    }

    @Override
    public void status() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n" +
                                    "Nacionalidade: " + this.getNacionalidade()+ "\n" +
                                    "Idade: " + this.getIdade()+"\n" +
                                    "Altura: " + this.getAltura()+ "\n" +                         
                                    "Peso: " + this.getPeso()+ "\n"+                         
                                    "Categoria: " + this.getCategoria()+ "\n"+                         
                                    "Vitorias: " + this.getVitorias()+ "\n"+
                                    "Derrotas: " + this.getDerrotas()+ "\n"+
                                    "Empates: " + this.getEmpates());
        
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
        
    }
    
