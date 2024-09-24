package Application;

import java.util.Date;

import model.Entities.Department;
import model.Entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21,"bob","bo@gmail.com",new Date(), 3000.0, obj);
		System.out.println(seller);
	}

}
