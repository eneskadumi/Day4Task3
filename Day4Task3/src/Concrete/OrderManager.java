package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println("Sipariþ oluþturuldu. Bilgileri aþþaðýdadýr.");
		System.out.println("---------");
		System.out.println("Id: "+order.getId());
		System.out.println("Customer Id: "+order.getCustomerId());
		System.out.println("Game Id: "+order.getGameId());
		System.out.println("Campaign Id: "+order.getCampaignId());
		System.out.println("Order Date: "+order.getOrderDate());
		
		
		
	}

	@Override
	public void update(Order order) {
			System.out.println("Sipariþ güncellenmiþtir. Yeni bilgileri aþþaðýdadýr.");
			System.out.println("---------");
			System.out.println("Id: "+order.getId());
			System.out.println("Customer Id: "+order.getCustomerId());
			System.out.println("Game Id: "+order.getGameId());
			System.out.println("Campaign Id: "+order.getCampaignId());
			System.out.println("Order Date: "+order.getOrderDate());
			
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sipariþiniz silinmiþtir.");
		System.out.println("---------");
		System.out.println("Id: "+order.getId());
		System.out.println("Customer Id: "+order.getCustomerId());
		System.out.println("Game Id: "+order.getGameId());
		System.out.println("Campaign Id: "+order.getCampaignId());
		System.out.println("Order Date: "+order.getOrderDate());
	}

}
