package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	public CustomerCheckService _customerCheck;

	public CustomerManager(CustomerCheckService _customerCheck) {
		this._customerCheck = _customerCheck;
	}

	@Override
    public void add(Customer customer) {
        if(_customerCheck.checkIfRealPerson(customer)) {
            System.out.println(customer.getFirstName()+" Musteri eklendi.");
        }else {
            System.out.println("Bilgileriniz dogru degil.");
        }


    }

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getFirstName() + "Bilgileriniz g�ncellendi.");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getFirstName() + "Bilgileriniz silindi.");

	}

}
