//Extending Person class so Passenger has access to Persons attributes and
//add specific attributes too Person making them a Passenger
//Now driver class has access to persons methods and attributes
public class Passenger extends Person {
    //Instance variable
    String email;

    //Constructors help initialize the class and gives the class specific properties
    Passenger(String email, String name, String surname, String phone_number, int cash){
        super(name, surname, phone_number, cash);
        this.email = email;
    }

    //Setters and getters provide access to the private values 
    //and allows reading and writing of them

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    //toString() converts everything that needs to be in a string to a string
    public String toString(){
        return super.toString() + " I am your passenger";
    }
}