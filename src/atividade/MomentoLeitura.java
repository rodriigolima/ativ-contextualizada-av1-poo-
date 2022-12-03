package atividade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class MomentoLeitura {

	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm", Locale.US);
	
	private List<String> horas = new ArrayList<String>();
	
	
	Calendar date = Calendar.getInstance();
	
	public MomentoLeitura() {
		super();
	}
	
	
	protected String getHora(int indice) {
		
		Calendar date = Calendar.getInstance();

		for(int i = 0; i < 24; i++) {
			date.set(Calendar.HOUR_OF_DAY, i);
			date.set(Calendar.MINUTE, 0);
			horas.add(i, sdf.format(date.getTime()));
			
		}
		
		for (int j = 0; j < 24; j++) {
			date.set(Calendar.HOUR_OF_DAY, j);
			date.set(Calendar.MINUTE, 30);
			horas.add(j, sdf.format(date.getTime()));
		}
		Collections.sort(horas);
		
		
		try {
			return horas.get(indice);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Tamanho do indice é maior do que o indice da lista ");
		}
		return null;
		
	}

}
