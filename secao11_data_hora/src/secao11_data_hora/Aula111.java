package secao11_data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula111 {

	public static void main(String[] args) {
		
		// Instanciação -> agora para formato data-hora
		LocalDate data1 = LocalDate.now(); // gerar data local no formato ano/mes/dia
		System.out.println(data1);
		
		LocalDateTime data2 = LocalDateTime.now(); // gerar data e hora local
		System.out.println(data2);
		
		Instant data3 = Instant.now(); // gerar data e hora no formato GMT (fuso de Londres)
		System.out.println(data3);
		
		// Instanciação -> formato ISO8601 para formato data-hora
		System.out.println("--------");
		LocalDate data4 = LocalDate.parse("2024-05-06");
		System.out.println(data4);
		
		LocalDateTime data5 = LocalDateTime.parse("2024-05-06T15:55:31");
		System.out.println(data5);
		
		Instant data6 = Instant.parse("2024-05-06T15:55:31Z");
		System.out.println(data6);
		
		Instant data7 = Instant.parse("2024-05-06T15:55:31-03:00"); // passa o fuso de são paulo e retorna o horário com o fuso de londres 
		System.out.println(data7);
		
		// Instanciação -> data personalizada para formato data hora via formatador
		System.out.println("--------");
		DateTimeFormatter formatador1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formatador para dia/mês/ano
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate data8 = LocalDate.parse("05/06/2024", formatador1);
		LocalDateTime data9 = LocalDateTime.parse("05/06/2024 16:24", formatador2);
		System.out.println(data8);
		System.out.println(data9);
		
		// Formatação
		System.out.println("--------");
		LocalDateTime data10 = LocalDateTime.parse("2024-06-06T01:30:26");
		Instant data11 = Instant.parse("2024-06-06T01:30:26Z");
		
		DateTimeFormatter formatador3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter formatador4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter formatador5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("data 11: " + formatador3.format(data11));
		System.out.println("Data 10: " + formatador4.format(data10));
		System.out.println("data 11: " + formatador5.format(data11));
	}

}