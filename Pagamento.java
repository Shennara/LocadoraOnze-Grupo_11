package locadoraonze;
import java.util.Scanner;
public class Pagamento {
    private String cartao;
    private String bandeira;
    private float valor;
    private int qtdeParcela;

    //Início construct de Pagamento
    public Pagamento(String cartao, String bandeira, float valor, int qtdeParcela) {
        this.cartao = cartao;
        this.bandeira = bandeira;
        this.valor = valor;
        this.qtdeParcela = qtdeParcela;
    }
    //Fim construct de Pagamento
    
    //Início da seleção de forma de pagamento
    public void formaPagamento (){
    Scanner entrada = new Scanner (System.in);
    
        System.out.println(" Escolha a forma de pagamento:");
        System.out.println("1 - A vista");
        System.out.println("2 - Parcelado");
        int formaPagamento = entrada.nextInt();
            if (formaPagamento == 1){
                /*Inserir fórmula: valorDiária * quantidade de dias */
                }if (formaPagamento == 2){
                    System.out.println("Informe a quantidade de parcelas: ");
                        int quantidadeParcela = entrada.nextInt();
                            if (quantidadeParcela<=12){
                               
                            }
                                    
            }
    }
    
    //Fim seleção de forma de pagamento
    
    //Inicio encapsulamento atributos de Pagamento
    public String getCartao() {
        return cartao;
    }
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQtdeParcela() {
        return qtdeParcela;
    }
    public void setQtdeParcela(int qtdeParcela) {
        this.qtdeParcela = qtdeParcela;
    }
    //Fim encapsulamento atributos de Pagamento
}
