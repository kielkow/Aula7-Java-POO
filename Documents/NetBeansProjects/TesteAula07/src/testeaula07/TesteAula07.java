package testeaula07;
import javax.swing.JOptionPane;
public class TesteAula07 {

    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[5];
        String x = "s";
        int i = 0;
        while(i < lutador.length && x.equals("s")){
                lutador[i] = new Lutador();
                
                lutador[i].setNome(JOptionPane.showInputDialog("Nome do lutador:"));
                lutador[i].setNacionalidade(JOptionPane.showInputDialog("Nacionalidade:"));
                lutador[i].setAltura(Double.parseDouble(JOptionPane.showInputDialog("Altura:")));
                lutador[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
                lutador[i].setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso:")));
                lutador[i].getCategoria();
                lutador[i].setVitorias(Integer.parseInt(JOptionPane.showInputDialog("Vitorias:")));
                lutador[i].setDerrotas(Integer.parseInt(JOptionPane.showInputDialog("Derrotas:")));
                lutador[i].setEmpates(Integer.parseInt(JOptionPane.showInputDialog("Empates:")));

                lutador[i].status();
                i++;

               x = JOptionPane.showInputDialog("Deseja continuar preenchendo: s ou n");
            }

            Luta uec01 = new Luta();
            uec01.marcarLuta(lutador[0], lutador[1]);
            uec01.lutar();
            lutador[0].status();
            lutador[1].status();
    }
   }
    
