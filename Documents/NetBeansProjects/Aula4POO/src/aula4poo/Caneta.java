package aula4poo;
public class Caneta {
    
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampa;

    public Caneta(String modelo, String cor, double ponta, int carga, boolean tampa) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampa = tampa;
    }

    public Caneta() {
    }


    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public double getPonta(){
        return this.ponta;
    }
    public void setPonta(double p){
        this.ponta = p;
    }
    
           
    public void rabiscar(){
        if(this.tampa == true){
            System.out.println("Não possivel rabiscar");
        }
        else{
            System.out.println("Rabiscar");
        }
    }
    
    public void tampar(){
        this.tampa = true;
    }
    
    public void destampar(){
        this.tampa = false;
    }
    
    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampa: " + this.tampa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);   
    }
    
}
