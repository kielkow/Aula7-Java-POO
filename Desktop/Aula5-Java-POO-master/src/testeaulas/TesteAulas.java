package testeaulas;
public class TesteAulas {

    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        
        conta1.abrirConta("CC");
        conta1.setDono("João");
        conta1.setNumConta(203040);
        
        conta1.depositar(300);
        conta1.sacar(150);
        conta1.pagarMensal();
        conta1.sacar(188);
        conta1.fecharConta();
        
        conta1.info();
        
        
        Conta conta2 = new Conta();
        
        conta2.abrirConta("CP");
        conta2.setDono("Maria");
        conta2.setNumConta(506070);
        
        conta2.depositar(500);
        conta2.sacar(200);
        conta2.pagarMensal();
        conta2.sacar(430);
        conta2.fecharConta();
              
        conta2.info();
    }
    
}
