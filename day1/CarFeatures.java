package weekday1.day1;

public class CarFeatures {
	
	public void driveCar() {
		System.out.println("driveCar");
	}
	public void applyBrake() {
		System.out.println("applyBrake");
	}
	public void soundHorn() {
		System.out.println("soundHorn");
	}
	public void isPuncture() {
		System.out.println("isPuncture");
	}

	public static void main(String[] args) {
CarFeatures function = new CarFeatures();
function.applyBrake();
function.driveCar();
function.soundHorn();
function.isPuncture();

	}

}
