package Application;

import java.util.Date;

import model.Entities.Department;
import model.Entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {


		SellerDao sellerDao = DaoFactory.creatSellerDao();
		System.out.println("=== Test 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
