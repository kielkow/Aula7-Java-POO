package testeaulas;

public class Conta {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
    
    
    

    public Conta(int numConta, String tipo, String dono, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
        public Conta() {
    }

    
    
        
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    

    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if(t.equals("CC")){
            this.setSaldo(50);
        }
        else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo()==0){
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
        else{
            System.out.println("Impossivél fechar a conta.");
        }
    }
    
    public void depositar(double v){
        if(this.getStatus()==true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de "+ this.getDono());
        }
        else{
            System.out.println("Impossivel depositar.");
        }
    }
    
    public void sacar(double v){
        if(this.getStatus()==true){
            if(this.getSaldo()>0){
                this.setSaldo(this.getSaldo() - v);
            }
        }
        else{
            System.out.println("Impossivel sacar.");
        }
    }
    
    public void pagarMensal(){
        int v;
        if(this.getTipo().equals("CC")){
            v = 12;
        }
        else{
            v = 20;
        }
        
        if(this.getStatus()==true){
            if(this.getSaldo()>0){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
            }
        }
        else{
            System.out.println("Saldo Insuficiente");
        }    
    }
    
    public void info(){
        System.out.println("--------------------------");
        System.out.println("Dono: " + this.getDono());
        System.out.println("Numero: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
}
