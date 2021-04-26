package locadoraonze;
import  java.util.ArrayList;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private float quilometragem;
    private String placa;
    private float valorDiaria;
    boolean disponibilidade;
    
public Carro(){
}

    //Início construct de Carro
    public Carro(String marca, String modelo, String cor, int ano, float quilometragem, String placa, float valorDiaria, boolean disponibilidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
        this.disponibilidade = disponibilidade;
    }
    //Fim construct de Carro   
             
    //Inicio encapsulamento atributos de Carro
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
   //Fim encapsulamento atributos de Carro 
    
    //Método lista de Carros

    /**
    **/
    public static void listaCarro (){
        
        ArrayList<Carro> listaCarro = new ArrayList();
        
            Carro gol = new Carro();
            Carro polo = new Carro();
            Carro argo = new Carro();
            Carro mobi = new Carro();
            Carro kwid = new Carro();
            Carro hb20 = new Carro();
            Carro onix = new Carro();
            Carro hrv = new Carro();
            Carro jeep = new Carro();
            
            //Instanciar GOL
            gol.setMarca("Volksvagen");
            gol.setModelo("Gol");
            gol.setCor("Preto");
            gol.setAno(2013);
            gol.setQuilometragem(20013.00f);
            gol.setPlaca("AAA1111");
            gol.setValorDiaria(20.13f);
            gol.setDisponibilidade(false);
            
            //Instanciar POLO
            polo.setMarca("Volksvagen");
            polo.setModelo("Polo");
            polo.setCor("Branco");
            polo.setAno(2014);
            polo.setQuilometragem(20014.00f);
            polo.setPlaca("BBB2222");
            polo.setValorDiaria(20.14f);
            polo.setDisponibilidade(false);
        
            //Instanciar FIAT ARGO
            argo.setMarca("Fiat");
            argo.setModelo("Fiat ARGO");
            argo.setCor("Preto");
            argo.setAno(2015);
            argo.setQuilometragem(20015.00f);
            argo.setPlaca("CCC3333");
            argo.setValorDiaria(20.15f);
            argo.setDisponibilidade(false);
            
            //Instanciar FIAT MOBI
            mobi.setMarca("Fiat");
            mobi.setModelo("Fiat MOBI");
            mobi.setCor("Branco");
            mobi.setAno(2016);
            mobi.setQuilometragem(20016.00f);
            mobi.setPlaca("DDD4444");
            mobi.setValorDiaria(20.16f);
            mobi.setDisponibilidade(false);
            
            //Instanciar KWID
            kwid.setMarca("Renault");
            kwid.setModelo("Kwid");
            kwid.setCor("Preto");
            kwid.setAno(2017);
            kwid.setQuilometragem(20017.00f);
            kwid.setPlaca("EEE5555");
            kwid.setValorDiaria(20.17f);
            kwid.setDisponibilidade(false);

            //Instanciar KWID
            hb20.setMarca("Hyundai");
            hb20.setModelo("HB20");
            hb20.setCor("Branco");
            hb20.setAno(2018);
            hb20.setQuilometragem(20018.00f);
            hb20.setPlaca("FFF6666");
            hb20.setValorDiaria(20.18f);
            hb20.setDisponibilidade(false);
        
            //Instanciar ONIX
            onix.setMarca("Chevrolet");
            onix.setModelo("Onix");
            onix.setCor("Preto");
            onix.setAno(2019);
            onix.setQuilometragem(20019.00f);
            onix.setPlaca("GGG7777");
            onix.setValorDiaria(20.19f);
            onix.setDisponibilidade(false);
        
            //Instanciar HRV
            onix.setMarca("Honda");
            onix.setModelo("HR-V");
            onix.setCor("Branco");
            onix.setAno(2020);
            onix.setQuilometragem(20020.00f);
            onix.setPlaca("HHH8888");
            onix.setValorDiaria(20.20f);
            onix.setDisponibilidade(false);
        
            //Instanciar JEEP
            jeep.setMarca("Jeep");
            jeep.setModelo("Jeep Renegade");
            jeep.setCor("Preto");
            jeep.setAno(2021);
            jeep.setQuilometragem(20021.00f);
            jeep.setPlaca("III9999");
            jeep.setValorDiaria(20.21f);
            jeep.setDisponibilidade(false);
        
            for(int i = 0; i < listaCarro.size(); i++){
                System.out.println("Marca            :" +listaCarro.get(i).getMarca());
                System.out.println("Modelo           :" +listaCarro.get(i).getModelo());
                System.out.println("Cor              :" +listaCarro.get(i).getCor());
                System.out.println("Ano              :" +listaCarro.get(i).getAno());
                System.out.println("Quilometragem    :" +listaCarro.get(i).getQuilometragem());
                System.out.println("Placa            :" +listaCarro.get(i).getPlaca());
                System.out.println("Valor diario     :" +listaCarro.get(i).getValorDiaria());
                System.out.println("Disponibilidade  :" +listaCarro.get(i).isDisponibilidade());
                System.out.println("/n");
            }
            }
    }   
    
