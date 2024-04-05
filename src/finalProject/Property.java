package finalProject;
import java.util.*;

public class Property {
    private double baseValue;
    private double builtUpArea;
    private double ageOfConstruction;
    private boolean isInCity;
    double propertyId;
    public Property() {
    	super();
    }
    

    public Property(double propertyId,double baseValue, double builtUpArea, double ageOfConstruction, boolean isInCity) {
        this.propertyId = propertyId;
    	this.baseValue = baseValue;
        this.builtUpArea = builtUpArea;
        this.ageOfConstruction = ageOfConstruction;
        this.isInCity = isInCity;
    }


	public double getPropertyId() {
		return propertyId;
	}


	public void setPropertyId(double propertyId) {
		this.propertyId = propertyId;
	}


	public double getBaseValue() {
		return baseValue;
	}


	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}


	public double getBuiltUpArea() {
		return builtUpArea;
	}


	public void setBuiltUpArea(double builtUpArea) {
		this.builtUpArea = builtUpArea;
	}


	public double getAgeOfConstruction() {
		return ageOfConstruction;
	}


	public void setAgeOfConstruction(double ageOfConstruction) {
		this.ageOfConstruction = ageOfConstruction;
	}


	public boolean isInCity() {
		return isInCity;
	}


	public void setInCity(boolean isInCity) {
		this.isInCity = isInCity;
	}

    public double calculatePropertyTax() {
        double propertyTax;
        if (isInCity) {
            propertyTax = (builtUpArea * ageOfConstruction * baseValue) + (0.5 * builtUpArea);
        } else {
            propertyTax = builtUpArea * ageOfConstruction * baseValue;
        }
        return propertyTax;
    }
}
