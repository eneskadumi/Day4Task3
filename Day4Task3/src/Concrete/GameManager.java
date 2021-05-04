package Concrete;

import Abstract.GameService;
import Entities.Game;


public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " Oyununuz kütüphaneye eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+ " Oyununuz güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+ " Oyununuz silindi.");
		
	}

	

	

}
