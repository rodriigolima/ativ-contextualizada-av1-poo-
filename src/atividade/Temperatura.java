package atividade;

public class Temperatura  {
	
	
	String[][] matriz = new String[48][2];

	int[] temperatura = new int[48];

	public Temperatura() {
		super();
	}
	
	public void addDados(int indiceLinha, int valorLeitura) {
		temperatura[indiceLinha] = valorLeitura;	
	}
	

	public void imprimeDados() {
		System.out.println("n.medicao:   hora -  valor(C)\n");
	
		for(int i = 0; i < matriz.length;i++) {
			matriz[i][0] = new MomentoLeitura().getHora(i);
			if(matriz[i][1] != null) {				
				temperatura[i] = Integer.parseInt(matriz[i][1]);					
			}
			
			for(int j = i;j < matriz.length;j++) {
				
				if(temperatura[i] > temperatura[j]) {
					int temp = temperatura[i];
					temperatura[i] = temperatura[j];
					temperatura[j] = temp;		
				}
			}	
		}
		
		String texto = "";
		for(int i = 0; i < matriz.length;i++) {
			texto += "medidicao " + (i+1) +": "   + matriz[i][0]  + 
					"     " + temperatura[i] + "\n";
		}

		System.out.println(texto);
	}
}
