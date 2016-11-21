/* assignment 2 */
package carapplication;

public class CarApplication {

    private static int noofwheels = 4;
    private String carmodel;
    private String gastype;
    private int manufacture_year;
    private boolean isfourWheelDrive;
    private String steering_type;
    
    CarApplication(String carmodel ,String gastype , int manufacture_year, 
            boolean isfourWheelDrive, String steering_type){
        
        this.carmodel = carmodel;
        this.gastype = gastype;
        this.manufacture_year = manufacture_year;
        this.isfourWheelDrive = isfourWheelDrive;
        this.steering_type = steering_type;
    }
    
    void changeSteeringType(String steering_type)
    {
        this.steering_type = steering_type;
    }
    void isFourWheelDrive(){
        if(isfourWheelDrive == true)
            System.out.println("yes, the vehicle is a Four wheel drive");
        else
            System.out.println("No, the vehicle is not a Four Wheel Drive ");
    }
    
    void displayCarInfo()
    {
        System.out.println( "we have a car of type "+ carmodel+" with number of "
                        + "wheels "+ noofwheels+" and gas type is "+gastype + " with "
               + steering_type + " and manufacturing year " + manufacture_year);
    }
    
}
