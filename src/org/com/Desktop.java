package org.com;

public class Desktop implements Hardware,Software {

	@Override
	public void softwareResources() {
		// TODO Auto-generated method stub
		Software.super.softwareResources();
	}

	@Override
	public void hardwareResources() {
		// TODO Auto-generated method stub
		Hardware.super.hardwareResources();
	}
	private void desktopModel() {
		System.out.println("software,hardware");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.softwareResources();
		d.hardwareResources();
		d.desktopModel();
		System.out.println("lines aded");
	}

}
