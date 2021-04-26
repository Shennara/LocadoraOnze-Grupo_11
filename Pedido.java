package locadoraonze;

public class Pedido {
 
private String quantidadeDias;
    //Início construct de Pedido
    public Pedido(String quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    //Fim construct de Pedido
    
    //Início encapsulamento atributos de Pedido
    public String getquantidadeDias() {
        return quantidadeDias;
    }
    public void setquantidadeDias(String quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    //Fim encapsulamento atributos de Carro
}

