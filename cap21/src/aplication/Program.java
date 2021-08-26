package aplication;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
				
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(7);
		
		System.out.println(seller);
		System.out.println();
		
		Department department = new Department(10,"teste");
		
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj:list) {
			System.out.println(obj);			
		}
		
		System.out.println();
		
		list = sellerDao.findAll();
		
		for(Seller obj:list) {
			System.out.println(obj);			
		}
		
		System.out.println();
		
		Seller newSeller = new Seller(null, "dvc","dvc@gmail.com", new Date(), 6333.00, department);
		
		System.out.println(newSeller);		
		System.out.println();
		
		seller.setEmail("lalalal");
		sellerDao.update(seller);
		
		sellerDao.deleteById(7);		
		

	}

}
