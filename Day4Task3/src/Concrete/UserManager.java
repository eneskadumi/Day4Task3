package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void signUp(User user) {
		System.out.println("Kayýt olundu. " + user.getEmail() + " Hoþ geldiniz.");

	}

	@Override
	public void signIn(User user) {
		System.out.println(user.getEmail()+ " Baþarýyla giriþ yaptýnýz..");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getEmail()+ " Baþarýyla silindi");

	}

	@Override
	public void update(User user) {
		System.out.println(user.getEmail()+ " Baþarýyla güncellendi.");
		System.out.println("------------");
		System.out.println("Yeni emailiniz : " + user.getEmail());
		
	}

}
