//Car impements Vehicle to gain access methods and 
public class Car implements Vehicle {

    //Instance variables
    String numberPlate;
    String color;
    String model;
    String type;
    double base_rate;

    //Constructors help initialize the class and gives the class specific properties
    Car(String numberPlate, String color, String model, String type) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.model = model;
        this.type = type;
        if(type.equals("XL")) {
            this.base_rate = 15.00;
        } else {
            this.base_rate = 10.00;
        }
    }

    //Setters and getters provide access to the private values 
    //and allows reading and writing of them
    public String getNumberPlate() {
        return this.numberPlate;
    }

    public double getBaseRate() {
        return this.base_rate;
    }

    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }

    public String getVehicleType() {
        return this.type;
    }

    //toString() converts everything that needs to be in a string to a string
    public String toString() {
        return this.model + " car of " + this.color + " color, with number plate: " + this.numberPlate;
    }
}