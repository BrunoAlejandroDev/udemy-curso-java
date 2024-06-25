package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	// ATRIBUTOS
	private Integer numeroDoQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// CONSTRUTOR
	public Reservation(Integer numeroDoQuarto, Date checkin, Date checkout) {
		this.numeroDoQuarto = numeroDoQuarto;
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	// GETTERS E SETTERS
	public Integer getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public void setNumeroDoQuarto(Integer numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}

	public Date getCheckin() {
		return checkIn;
	}
	
	public Date getCheckout() {
		return checkOut;
	}

	// METODOS PUBLICOS
	public long duracaoReserva() {
		long diferencaDatas = checkOut.getTime() - checkIn.getTime(); // retorna a diferença entre as datas em milissegundos
		return TimeUnit.DAYS.convert(diferencaDatas, TimeUnit.MILLISECONDS); // converte milissegundos para dias
	}
	
	public void atualizarReserva(Date checkin, Date checkout) {
		this.checkIn = checkin;
		this.checkOut = checkout;
	}

	@Override
	public String toString() {
		return "Reserva" + 
				"\nNumero do quarto: " + numeroDoQuarto + 
				"\ncheckIn: " + sdf.format(checkIn) + 
				"\ncheckOut: " + sdf.format(checkOut) +
				"\nDuração: " + duracaoReserva() + " noites";
	}
	
}