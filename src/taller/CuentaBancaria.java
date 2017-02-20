
package taller;


/// se crea la clase cuenta bancaria

public class CuentaBancaria {
    
/// le damos unos atributos a esa clase
    
private String name;
private int identificacion;
private double saldo;
private double interesAnual;


/// creamos un constructor parq eu cuando se llame a esta clase se pida estos datos o atributos

    public CuentaBancaria(String name, int identificacion, double saldo, double interesAnual) {
        this.name = name;
        this.identificacion = identificacion;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }
    
    /// creamos una funcion que nos permita modificar el saldo cuando se hace un deposito
    
public void depositar(double depositar){
    if(depositar <0){
        System.out.println("El valor depositado debe ser positivo ");
    }
    else 
    this.saldo= saldo+depositar;}


/// creamos una funcion que permita modificar el saldo cuando se hace un retiro

public void retirar (double retirar){
    if (retirar<0){
        System.out.println("No se puede retirar valores negativos");   
    }
    else
    this.saldo=saldo-retirar;
}


/// creamos una fucnion que permita calcualr el interes anual

public void calcularInteres(){
    
    saldo = saldo* Math.pow(1+((interesAnual/100)/12),12*1);
    
}
      // creamos una funcion que nos permita imprimir el saldo 

    
    public String imprimirSaldo() {
        return "El saldo de su cuenta bancaria es "+ saldo;
    }


        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int Identificacion) {
        this.identificacion = Identificacion;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    
}



    

