//Extending Person class so Driver has access to Persons attributes and
//add specific attributes too Person making them a Driver
//Now driver class has access to persons methods and attributes
public class Driver extends Person {
    
    //Instance variables
    Car car;
    String licenseID;


    //Constructors help initialize the class and gives the class specific properties
    Driver(Car car, String licenseID, String name, String surname, String phone_number, double cash){
        super(name,surname,phone_number,cash);
        this.car = car;
        this.licenseID = licenseID;
    }

    //Setters and getters provide access to the private values 
    //and allows reading and writing of them
    public void setCar(Car car){
        this.car = car;
    }

    public void setlicenseID(String licenseID){
        this.licenseID = licenseID;
    }

    public Car getCar() {
        return this.car;
    }

    public String getlicenseID() {
        return this.licenseID;
    }


    //toString() converts everything that needs to be in a string to a string

    public String toString(){
        return super.toString() + " I am your driver";
    }

}