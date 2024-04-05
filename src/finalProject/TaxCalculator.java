package finalProject;
import java.util.*;
import java.util.List;

public class TaxCalculator {
    public double calculateTotalPropertyTax(List<Property> properties) {
        double totalPropertyTax = 0.0;
        for (Property property : properties) {
            totalPropertyTax += property.calculatePropertyTax();
        }
        return totalPropertyTax;
    }

    public double calculateTotalVehicleTax(List<Vehicle> vehicles) {
        double totalVehicleTax = 0.0;
        for (Vehicle vehicle : vehicles) {
            totalVehicleTax += vehicle.calculateVehicleTax();
        }
        return totalVehicleTax;
    }
}
