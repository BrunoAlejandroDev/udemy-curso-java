package secao11_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula113 {

	public static void main(String[] args) {
		
		// Converter data-hora global (instant) para local
		Instant data1 = Instant.parse("2022-07-20T01:30:26Z");
		LocalDateTime data2 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		LocalDate local1 = LocalDate.ofInstant(data1, ZoneId.systemDefault()); // data com fuso horário GMT para fuso horário local
		LocalDateTime local2 = LocalDateTime.ofInstant(data1, ZoneId.systemDefault()); // data e hora com fuso horário GMT para fuso horário local
		LocalDateTime local3 = LocalDateTime.ofInstant(data1, ZoneId.of("Portugal")); // data e hora com fuso horário GMT para fuso horário local
		System.out.println(local1);
		System.out.println(local2);
		System.out.println(local3);
		
		// Obter dia, mês e ano de uma data
		System.out.println("--------");
		System.out.println(data2.getDayOfMonth());
		System.out.println(data2.getMonthValue());
		System.out.println(data2.getYear());
		
		// Obter hora e minuto de uma data
		System.out.println("--------");
		System.out.println(data2.getHour());
		System.out.println(data2.getMinute());
				
		/* 
		obter todas as zonas de fuso horário
		for (String zonas : ZoneId.getAvailableZoneIds()) { 
			sysout(zonas);
		}
		*/
		
	}

}