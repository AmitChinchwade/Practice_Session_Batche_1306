package com.interfaces;

public interface VehicleFeatures {

	interface ElectricVehicle {
	    void chargeBattery();
	}

	interface FuelVehicle {
	    void fillFuel();
	}

	class HybridCar implements ElectricVehicle, FuelVehicle {

		public void chargeBattery() {
	        System.out.println("HybridCar: Charging battery...");
	    }

	    public void fillFuel() {
	        System.out.println("HybridCar: Filling fuel tank...");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        HybridCar car = new HybridCar();
	        car.chargeBattery();
	        car.fillFuel();
	    }
	}

}
