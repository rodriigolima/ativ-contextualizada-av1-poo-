package atividade;

public class Umidade {

	String[][] matriz = new String[48][2];

	double[] umidade = new double[48];

	public Umidade() {
		super();
	}
	
	public void addDados(int indiceLinha, double valorLeitura) {
		umidade[indiceLinha] = valorLeitura;	
	}
	

	public void imprimeDados() {
		System.out.println("n.medicao:   hora -  valor(g/m³)\n");
	
		for(int i = 0; i < matriz.length;i++) {
			matriz[i][0] = new MomentoLeitura().getHora(i);
			if(matriz[i][1] != null) {				
				umidade[i] = Double.parseDouble(matriz[i][1]);					
			}
		
			for(int j = i;j < matriz.length;j++) {
				
				if(umidade[i] < umidade[j]) {
					double temp = umidade[i];
					umidade[i] = umidade[j];
					umidade[j] = temp;	
				}
			}	
		}
		
		String texto = "";
		for(int i = 0; i < matriz.length;i++) {
			texto += "medidicao " + (i+1) +": "   + matriz[i][0]  + 
					"     " + umidade[i] + "\n";
		}
		
		System.out.println(texto);
	}
}
