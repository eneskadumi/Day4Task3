package ConsoleUI;

import java.time.LocalDate;
import java.time.LocalTime;

import Abstract.GameService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1001, "enes10@gmail.com", "1234", 1002);
		User user2 = new User(2801, "ali28@gmail.com", "1234", 2802);
		User[] users = {user1,user2};

		
		
		Customer customer1 = new Customer(1001, "Enes", "Kadumi", "12345678910", 2001);	
		Customer customer2 = new Customer(90, "Ali", "Konar", "12347896910", 1999);
		Customer[] customers = {customer1,customer2};
		
		
		
		Game game1 = new Game(90, "Valorant", 0.0);	
		Game game2 = new Game(103, "Forza Horizon 4", 125.45);	
		Game[] games = {game1,game2};
		
		
		
		Campaign campaign1 = new Campaign(14, "Valorant VP", 50);
		Campaign campaign2 = new Campaign(21, "Forza Horizon 4 Ýndirim", 75);
		Campaign[] campaigns = {campaign1,campaign2};
		
		
		
		Order order1 = new Order(25, 1001, 90, 14, LocalDate.now(),LocalTime.now());
		Order order2 = new Order(65, 90, 103, 21, LocalDate.now(), LocalTime.now());
		Order[] orders = {order1,order2};
		
		
		System.out.println("  ");
		System.out.println("---Müþteriler---");
		System.out.println("  ");
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		customerManager.add(customer1);
		customerManager.delete(customer1);
		
		
		System.out.println("  ");
		System.out.println("---Hesap---");
		System.out.println("  ");
		UserManager userManager = new UserManager();
		userManager.signIn(user1);
		userManager.signUp(user2);
		userManager.update(user1);
		userManager.delete(user2);

		
		System.out.println("  ");
		System.out.println("---Sipariþler---");
		System.out.println("  ");
		OrderManager orderManager = new OrderManager();
		orderManager.add(order1);
		orderManager.delete(order2);
		orderManager.update(order1);
		
		System.out.println("  ");
		System.out.println("---Oyunlar---");
		System.out.println("  ");
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game1);
		
		
		System.out.println("  ");
		System.out.println("---Kampanyalar---");
		System.out.println("  ");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);
		campaignManager.update(campaign1);
		
	}
}
