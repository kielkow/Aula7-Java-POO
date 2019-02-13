package testeaula07;
import java.util.Random;
import javax.swing.JOptionPane;

public class Luta{
    
    
    //Atributos
    private Lutador desafiado; //indica que desafiado e desafiante sao objetos de Lutador
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    Random r = new Random();

    
    //Construtores
    public Luta(Lutador desafiado, Lutador desafiante, int rounds, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }
    public Luta() {
    }
    
    
    
    //Getters e Setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
    
    
    
    //Metodos 
    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if(lutador1.getCategoria().equals(lutador2.getCategoria()) && (lutador1!=lutador2)){
            this.setAprovada(true);
            this.setDesafiado(lutador1);
            this.setDesafiante(lutador2);
        }
        else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if(this.getAprovada()){
            
            this.desafiado.status();
            this.desafiante.status();
            
            int vencedor = r.nextInt(2);
            
            switch(vencedor){
                case 0:
                    JOptionPane.showMessageDialog(null, "Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                 
                case 1:
                    JOptionPane.showMessageDialog(null,"Vencedor:" + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                
                case 2:
                    JOptionPane.showMessageDialog(null,"Vencedor:" + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "ERROR");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Luta nao pode acontecer.");
        }
    }
    
    
    
    
}
