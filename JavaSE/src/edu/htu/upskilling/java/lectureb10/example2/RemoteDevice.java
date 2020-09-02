package edu.htu.upskilling.java.lectureb10.example2;

public interface RemoteDevice {
	public void m1();

	public void m2();

	public void m3();

	public default void m4() {
		System.out.println("M4");
	}
}
