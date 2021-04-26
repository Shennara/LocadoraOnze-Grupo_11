package locadoraonze;
import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String cpfCliente;
    private String telefoneCliente;
    private String enderecoCliente;

    //Início construct de Cliente
    public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente, String enderecoCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefoneCliente = telefoneCliente;
        this.enderecoCliente = enderecoCliente;
    }
    //Fim construct de Cliente 
    
    //Leitura dados do CLiente
    public void cadastroCliente(){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Insira os dados do cliente");
   
    System.out.println("Nome: " );
    this.nomeCliente = teclado.nextLine();
    
    System.out.println("CPF: ");
    this.cpfCliente = teclado.nextLine();
    
    System.out.println("Telefone: ");
    this.telefoneCliente = teclado.nextLine();
    
    System.out.println("Endereco: ");
    this.enderecoCliente = teclado.nextLine();
    }
    //Fim leitura dados do Cliente
    
    //Inicio encapsulamento atributos do Cliente
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }
    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    //Fim encapsulamento atributos do Cliente
}

    
    
    
    

   
    


