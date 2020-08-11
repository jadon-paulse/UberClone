
public class Person {
    //Instance variables
    private String name;
    private String surname;
    private String phone_number;
    private double cash;


    //Constructors help initialize the class and gives the class specific properties

    Person(String name, String surname, String phone_number, double cash){
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.cash = cash;
    }


    //Setters and getters provide access to the private values 
    //and allows reading and writing of them

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setPhoneNumber(String phone_number){
        this.phone_number = phone_number;
    }

    public void setCash(double cash){
        this.cash = cash;
    }



    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getPhoneNumber(){
        return this.phone_number;
    }

    public double getCash(){
        return this.cash;
    }

    //toString() converts everything that needs to be in a string to a string
    public String toString(){
        return this.name + " " + this.surname;
    }

    
}