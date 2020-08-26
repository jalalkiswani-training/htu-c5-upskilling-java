package edu.htu.upskilling.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaTest {
	public static void main(String[] args) {
//		addDriver();
//		updateDriver();
//		deleteDriver();
//		getAllDrivers();
//		findByName();
	}

	private static void findByName() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("upskilling");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT d FROM Driver d WHERE d.name=?1");//JPQL
		query.setParameter(1, "Jalal1");
		List<Driver> resultList = query.getResultList();
		
		for (Driver driver : resultList) {
			System.out.println(driver);
		}
		
		em.close();
		emf.close();
		
		System.out.println("Select exectued Successfully");
	}

	private static void getAllDrivers() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("upskilling");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT d FROM Driver d");//JPQL
		List<Driver> resultList = query.getResultList();
		
		for (Driver driver : resultList) {
			System.out.println(driver);
		}
		
		em.close();
		emf.close();
		
		System.out.println("Select exectued Successfully");
	}

	private static void addDriver() {
		Driver driver=new Driver();
		driver.setName("Jalal1");
		driver.setAge(11);
		driver.setEmail("jalal1@jalal.com");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("upskilling");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(driver);		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Inserted Successfully");
	}
	
	private static void updateDriver() {
		Driver driver=new Driver();
		driver.setId(1);
		driver.setName("Ata1");
		driver.setAge(20);
		driver.setEmail("ata1@ata1.com");
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("upskilling");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(driver);		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Updated Successfully");
	}
	
	private static void deleteDriver() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("upskilling");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Driver dr = em.find(Driver.class, 1);
		em.remove(dr);		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Deleted Successfully");
	}

}
