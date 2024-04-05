package finalProject;
import java.util.*;

public class Vehicle {
    private String registrationNumber;
    private String brand;
    private double purchaseCost;
    private double maxVelocity;
    private int passengerCount;
    private String vehicleType;
    public Vehicle()
    {
    	super();
    }

    public Vehicle(String registrationNumber, String brand, double purchaseCost, double maxVelocity, int passengerCount, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.purchaseCost = purchaseCost;
        this.maxVelocity = maxVelocity;
        this.passengerCount = passengerCount;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPurchaseCost() {
		return purchaseCost;
	}

	public void setPurchaseCost(double purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	public double getMaxVelocity() {
		return maxVelocity;
	}

	public void setMaxVelocity(double maxVelocity) {
		this.maxVelocity = maxVelocity;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

    public double calculateVehicleTax() {
        double vehicleTax = 0.0;
        switch (vehicleType) {
            case "Petrol":
                vehicleTax = maxVelocity + passengerCount + (0.10 * purchaseCost);
                break;
            case "Diesel":
                vehicleTax = maxVelocity + passengerCount + (0.11 * purchaseCost);
                break;
            case "CNG/LPG":
                vehicleTax = maxVelocity + passengerCount + (0.12 * purchaseCost);
                break;
        }
        return vehicleTax;
    }
}
