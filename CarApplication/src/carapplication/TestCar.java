
package carapplication;

public class TestCar {
    public static void main(String args[]){
        CarApplication c1 = new CarApplication("Toyota Carolla","petrol",2014,true,"power-steering");
        c1.displayCarInfo();
        c1.changeSteeringType("Normal-steering");
        c1.isFourWheelDrive();
        c1.displayCarInfo();
    }
}
