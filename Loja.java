package locadoraonze;

import java.util.Scanner;

public class Loja {
    private String nome;
    private String telefone; 
    private String cnpj;
    private String endereco;

//Início construct de Loja
    public Loja(String nome, String telefone, String cnpj, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
//Fim construct de Loja
    
//Início Registra Loja    
    public void registraLoja(){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Insira os dados da loja onde esta sendo feita a locacao");
   
    System.out.println("Nome: " );
    this.nome = teclado.nextLine();
    
    System.out.println("CNPJ: ");
    this.cnpj = teclado.nextLine();
    
    System.out.println("Telefone: ");
    this.telefone = teclado.nextLine();
    
    System.out.println("Endereco: ");
    this.endereco = teclado.nextLine();
    }
//Fim Registra Loja
    
//Inicio encapsulamento atributos do Loja
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
//Fim encapsulamento atributos do Loja   
    
}
