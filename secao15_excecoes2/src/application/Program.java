package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do quarto: ");
		int numeroQuarto = input.nextInt();
		
		System.out.print("CheckIn date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(input.next());
		
		System.out.print("CheckOut date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(input.next());
		
		// verificar se a data de checkout vem antes da data de checkin
		if (!checkOut.after(checkIn)) {
			System.out.println("Erro: a data de Check-out precisa vir após a data de Check-in.");
		}
		else {
			Reservation reserva = new Reservation(numeroQuarto, checkIn, checkOut); // instanciando um obj da classe reservation
			System.out.println(reserva.toString()); 
			System.out.println();
			
			// atualizando a data da reserva
			System.out.println("Insira a nova data da reserva: ");
			System.out.print("CheckIn date (dd/MM/yyyy): ");
			checkIn = sdf.parse(input.next());
			
			System.out.print("CheckOut date (dd/MM/yyyy): ");
			checkOut = sdf.parse(input.next());
			
			// atualização do programa: 
			String error = reserva.atualizarReserva(checkIn, checkOut); // variável erro faz referência ao objeto reserva
			if (error != null) {
				System.out.println(error);
			}
			else {				
				System.out.println(reserva.toString()); // caso nenhum erro ocorra, os dados atualizados serão mostrados
			}
			
		}
		
		input.close();

	}

}