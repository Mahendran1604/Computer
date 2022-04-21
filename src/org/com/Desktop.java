package org.com;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Desktop size is 18inch");
	}

	public static void main(String[] args) {
		Desktop b = new Desktop();
		b.computerModel();
		b.desktopSize();
		
		
		}

}
