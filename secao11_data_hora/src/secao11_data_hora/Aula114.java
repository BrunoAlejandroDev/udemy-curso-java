package secao11_data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

// Cálculos com data e hora

public class Aula114 {

	public static void main(String[] args) {
		
		// Modificar data e hora 
		LocalDate data1 = LocalDate.parse("2024-06-07");
		LocalDateTime data2 = LocalDateTime.parse("2024-06-07T15:35:25");
		Instant data3 = Instant.parse("2024-06-07T15:35:25Z");
		
		// Passar data local e adicionar ou subtrair valores
		LocalDate pastWeekLocalDate = data1.minusDays(7); // subtrair 7 dias da data1
		LocalDate nextWeekLocalDate = data1.plusDays(7); // adicionar 7 dias a data1
		
		System.out.println("lastWeekLocalDate: " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		System.out.println("--------");
		
		// Passar data-hora local e adicionar ou subtrair valores
		LocalDateTime pastWeekLocalDateTime = data2.minusDays(7); // subtrair 7 dias da data2
		LocalDateTime nextWeekLocalDateTime = data2.plusDays(7); // adicionar 7 dias a data2
		
		System.out.println("lastWeekLocalDateTime: " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		System.out.println("-------");
		
		// Passar data-hora global e adicionar ou subtrair valores
		Instant pastWeekInstant = data3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = data3.plus(7, ChronoUnit.DAYS);
		
		System.out.println("lastWeekInstant: " + pastWeekInstant);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		
		// Calcular diferença entre dias 
		System.out.println("-------");
		Duration tempo1 = Duration.between(pastWeekLocalDate.atStartOfDay(), data1.atStartOfDay());
		Duration tempo2 = Duration.between(pastWeekLocalDateTime, data2);
		Duration tempo3 = Duration.between(pastWeekInstant, data3);
		System.out.println("Duração 1: " + tempo1);
		System.out.println("Duração 2: " + tempo2);
		System.out.println("Duração 3: " + tempo3);
	}

}