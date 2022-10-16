package week3.day1;

public class AccessVehicle {
	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBreak();
		obj.soundHorn();
		obj.openSunroof();
		obj.turnOnAC();
		Vehicle mainvehicle=new Vehicle();
		BMW obj1=new BMW();
		obj1.autoPark();
		obj1.applyBreak();
		obj1.soundHorn();
		obj1.openSunroof();
		Audi Audi=new Audi();
		Audi.hybridFuel();
		Audi.applyBreak();
		Audi.openSunroof();
		Audi.soundHorn();
		Audi.turnOnAC();
		Auto Ato=new Auto();
		Ato.handStarter();
		Ato.applyBreak();
		Ato.handStarter();
		Bajaj Bj=new Bajaj();
		Bj.electronicMeter();
		Bj.applyBreak();
		Bj.soundHorn();
		Bj.handStarter();
		Bj.soundHorn();
		System.out.println("----------------------------");
		Audi.applyBreak();
		mainvehicle.applyBreak();
		Audi.applyBreak();
		Audi.soundHorn();
		Audi.hybridFuel();
	}

}
