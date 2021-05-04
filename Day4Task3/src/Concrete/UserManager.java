package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void signUp(User user) {
		System.out.println("Kay�t olundu. " + user.getEmail() + " Ho� geldiniz.");

	}

	@Override
	public void signIn(User user) {
		System.out.println(user.getEmail()+ " Ba�ar�yla giri� yapt�n�z..");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getEmail()+ " Ba�ar�yla silindi");

	}

	@Override
	public void update(User user) {
		System.out.println(user.getEmail()+ " Ba�ar�yla g�ncellendi.");
		System.out.println("------------");
		System.out.println("Yeni emailiniz : " + user.getEmail());
		
	}

}
