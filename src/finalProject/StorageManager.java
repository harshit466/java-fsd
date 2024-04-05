package finalProject;
import java.util.ArrayList;
import java.util.List;

public class StorageManager {
    private List<Property> properties;
    private List<Vehicle> vehicles;

    public StorageManager() {
        properties = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Property> getProperties() {
        return properties;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
