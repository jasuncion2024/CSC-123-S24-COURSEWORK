import java.util.ArrayList;
import java.util.List;

class Vehicle {
    String licensePlate;
    String make;
    String model;

    public Vehicle(String licensePlate, String make, String model) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
    }
}

class Owner {
    String name;
    String address;

    public Owner(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Registration {
    Vehicle vehicle;
    Owner owner;

    public Registration(Vehicle vehicle, Owner owner) {
        this.vehicle = vehicle;
        this.owner = owner;
    }
}

class Citation {
    String vehicleLicensePlate;
    String description;

    public Citation(String vehicleLicensePlate, String description) {
        this.vehicleLicensePlate = vehicleLicensePlate;
        this.description = description;
    }
}

public class DMVSystem {
    List<Registration> registrations;
    List<Citation> citations;

    public DMVSystem() {
        this.registrations = new ArrayList<>();
        this.citations = new ArrayList<>();
    }

    public void registerVehicle(Vehicle vehicle, Owner owner) {
        Registration registration = new Registration(vehicle, owner);
        registrations.add(registration);
    }

    public void registerCitation(String vehicleLicensePlate, String description) {
        Citation citation = new Citation(vehicleLicensePlate, description);
        citations.add(citation);
    }

    public void listAllRegistrations() {
        for (Registration registration : registrations) {
            System.out.println("Vehicle License Plate: " + registration.vehicle.licensePlate);
            System.out.println("Owner: " + registration.owner.name);
            System.out.println();
        }
    }

    public void listAllCitations() {
        for (Citation citation : citations) {
            System.out.println("Vehicle License Plate: " + citation.vehicleLicensePlate);
            System.out.println("Description: " + citation.description);
            System.out.println();
        }
    }

    public void listRegistrationsForVehicle(String licensePlate) {
        for (Registration registration : registrations) {
            if (registration.vehicle.licensePlate.equals(licensePlate)) {
                System.out.println("Owner: " + registration.owner.name);
                System.out.println();
            }
        }
    }

    public void listRegistrationsForPerson(String ownerName) {
        for (Registration registration : registrations) {
            if (registration.owner.name.equals(ownerName)) {
                System.out.println("Vehicle License Plate: " + registration.vehicle.licensePlate);
                System.out.println();
            }
        }
    }

    public void listCitationsForVehicle(String licensePlate) {
        for (Citation citation : citations) {
            if (citation.vehicleLicensePlate.equals(licensePlate)) {
                System.out.println("Description: " + citation.description);
                System.out.println();
            }
        }
    }

    public void listCitationsForPerson(String ownerName) {
        for (Registration registration : registrations) {
            if (registration.owner.name.equals(ownerName)) {
                for (Citation citation : citations) {
                    if (citation.vehicleLicensePlate.equals(registration.vehicle.licensePlate)) {
                        System.out.println("Description: " + citation.description);
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DMVSystem dmv = new DMVSystem();

        Vehicle vehicle1 = new Vehicle("ABC123", "Toyota", "Camry");
        Owner owner1 = new Owner("Will Smith", "123 Main St");
        dmv.registerVehicle(vehicle1, owner1);

        Vehicle vehicle2 = new Vehicle("XYZ789", "Honda", "Accord");
        Owner owner2 = new Owner("Jada Smith", "456 Elm St");
        dmv.registerVehicle(vehicle2, owner2);

        dmv.registerCitation("ABC123", "Speeding");
        dmv.registerCitation("XYZ789", "Illegal Parking");

        System.out.println("All Registrations:");
        dmv.listAllRegistrations();

        System.out.println("All Citations:");
        dmv.listAllCitations();

        System.out.println("Registrations for vehicle ABC123:");
        dmv.listRegistrationsForVehicle("ABC123");

        System.out.println("Registrations for Will Smith:");
        dmv.listRegistrationsForPerson("Will Smith");

        System.out.println("Citations for vehicle XYZ789:");
        dmv.listCitationsForVehicle("XYZ789");

        System.out.println("Citations for Jada Smith:");
        dmv.listCitationsForPerson("Jada Smith");
    }
}

