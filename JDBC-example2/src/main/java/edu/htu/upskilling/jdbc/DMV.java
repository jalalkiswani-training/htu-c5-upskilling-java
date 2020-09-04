package edu.htu.upskilling.jdbc;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class DMV {

	///////////////////////////////////////////////
	public static void main(String[] args) throws ClassNotFoundException {
		
		boolean stop = false;
		while (!stop) {
			try {
				int ch = showMenu();
				switch (ch) {
				case 1:
					processAdd();
					break;
				case 2:
					processFind();
					break;
				case 3:
					processUpdate();
					break;
				case 4:
					processDelete();
					break;
				case 5:
					processShowAll();
					break;
				case 6:
					stop = true;
					break;
				default:
					System.out.println("Invalid Input");
				}
			} catch (Exception e) {
				System.out.println("Error occured with Message : " + e.getMessage());
				e.printStackTrace();
			}
		}
		System.out.println("========================================");
		System.out.println("Thank you, good bye");
	}

	///////////////////////////////////////////////
	private static int showMenu() {
		System.out.println("1- Add Vehicle");
		System.out.println("2- Find Vehicle");
		System.out.println("3- Update Vehicle");
		System.out.println("4- Delete Vehicle");
		System.out.println("5- Show All Vehicles");
		System.out.println("6- Quit");
		System.out.println("====================================");
		System.out.print("Please enter your choice: ");
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		return ch;
	}

	///////////////////////////////////////////////
	private static void processShowAll() throws ClassNotFoundException, SQLException {
		VehicleDao dao = new VehicleDao();
		Vector<Vehicle> list = dao.getAll();
		for (Vehicle vehicle : list) {
			System.out.println(vehicle);
		}
	}

	///////////////////////////////////////////////
	private static void processDelete() throws ClassNotFoundException, SQLException {
		VehicleDao dao = new VehicleDao();
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter VIN number:");
		String vin = s.next();

		dao.delete(vin);
	}

	///////////////////////////////////////////////
	private static void processUpdate() throws ClassNotFoundException, SQLException {
		VehicleDao dao = new VehicleDao();
		Vehicle vehicle = getVehicleFromUser();

		dao.update(vehicle);
	}

	///////////////////////////////////////////////
	private static Vehicle getVehicleFromUser() {
		Scanner s = new Scanner(System.in);
		Vehicle vehicle = new Vehicle();
		System.out.print("Enter Vin:");
		vehicle.setVehVin(s.next());
		System.out.print("Enter Brand:");
		vehicle.setVehBrand(s.next());
		System.out.print("Enter Model: ");
		vehicle.setVehModel(s.next());
		System.out.print("Enter Year:");
		vehicle.setVehYear(s.nextInt());
		return vehicle;
	}

	///////////////////////////////////////////////
	private static void processFind() throws ClassNotFoundException, SQLException {
		VehicleDao dao = new VehicleDao();
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter VIN number:");
		String vin = s.next();

		Vehicle v = dao.find(vin);
		if (v != null) {
			System.out.println(v);
		}
	}

	///////////////////////////////////////////////
	private static void processAdd() throws ClassNotFoundException, SQLException {
		VehicleDao dao = new VehicleDao();
		Vehicle v = getVehicleFromUser();
		dao.add(v);
	}
	///////////////////////////////////////////////
}
