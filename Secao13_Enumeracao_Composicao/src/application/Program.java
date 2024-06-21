package application;

import java.util.Date;
import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order pedido1 = new Order(1020, new Date(), OrderStatus.Pedido_Enviado);
		System.out.println(pedido1.toString());
		
		OrderStatus status1 = OrderStatus.Processando_Pagamento;
		OrderStatus status2 = OrderStatus.Pedido_Entregue;
		
		OrderStatus status3 = OrderStatus.valueOf("Pedido_Nao_Entregue"); // valor não especificado no enum não será aceito
		
		Order pedido2 = new Order(1021, new Date(), status1);
		System.out.println(pedido2.toString());
		
		Order pedido3 = new Order(1022, new Date(), status2);
		System.out.println(pedido3.toString());
		
		Order pedido4 = new Order(1022, new Date(), status3);
		System.out.println(pedido4.toString());
		
	}
	
}
