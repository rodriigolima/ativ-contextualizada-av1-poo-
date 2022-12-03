package atividade;

public class Teste {


    public static void main(String args[]) {
    	
    	Temperatura temperatura = new Temperatura();
    	Umidade umidade = new Umidade();
    	Quantidade_CO2 qtdeCO2 = new Quantidade_CO2();
    	
        temperatura.addDados(0, 18);
        temperatura.addDados(1, 20);
        temperatura.addDados(2, 30);
        temperatura.addDados(3, 27);
        temperatura.addDados(4, 17);
        temperatura.addDados(5, 24);
        
        umidade.addDados(0, 23.1);
        umidade.addDados(1, 33.1);
        umidade.addDados(2, 63.1);
        umidade.addDados(3, 13.1);
        umidade.addDados(4, 73.1);
        umidade.addDados(5, 153.1);
        
        qtdeCO2.addDados(0, 63.1);
        qtdeCO2.addDados(1, 13.1);
        qtdeCO2.addDados(2, 44.6);
        qtdeCO2.addDados(3, 12.15);
        qtdeCO2.addDados(4, 77.11);
        qtdeCO2.addDados(5, 135.21);
        
        
        temperatura.imprimeDados();
        
        umidade.imprimeDados();
        
        qtdeCO2.imprimeDados();
        
    }
}
