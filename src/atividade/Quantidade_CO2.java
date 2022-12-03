package atividade;

public class Quantidade_CO2 {

	String[][] matriz = new String[48][2];

	double[] qtdeCO2 = new double[48];

	public Quantidade_CO2() {
		super();
	}
	
	public void addDados(int indiceLinha, double valorLeitura) {	
		qtdeCO2[indiceLinha] = valorLeitura;	
	}
	
	public void imprimeDados() {
		System.out.println("n.medicao:   hora -  valor(µmol.m-2 s-1)\n");
	
		for(int i = 0; i < matriz.length;i++) {
			matriz[i][0] = new MomentoLeitura().getHora(i);
			if(matriz[i][1] != null) {				
				qtdeCO2[i] = Double.parseDouble(matriz[i][1]);					
			}
			
			for(int j = i;j < matriz.length;j++) {
				if(qtdeCO2[i] > qtdeCO2[j]) {
					double temp = qtdeCO2[i];
					qtdeCO2[i] = qtdeCO2[j];
					qtdeCO2[j] = temp;
					
				}
			}	
		}
		
		String texto = "";
		for(int i = 0; i < matriz.length;i++) {
			texto += "medidicao " + (i+1) +": "   + matriz[i][0]  + 
					"     " + qtdeCO2[i] + "\n";
		}
		
		System.out.println(texto);		
	}
}
