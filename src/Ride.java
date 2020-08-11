//Ride is restricted and will be used by uber ride
public abstract class Ride {

    String estartingPoint;
    String endingPoint;

    public abstract double calculateDistance(String startingPoint, String endingPoint);
    public abstract Driver assignDriver();
    public abstract double calculateCost(String startingPoint, String endingPoint);
    public abstract void completePayment(Driver driver, Passenger passenger);

 }