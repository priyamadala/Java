/* assignment 1 */
package circledemo;

public class CircleDemo {

    private float radious;
    private float diameter;
    
    private static float pie =  3.14159f;
    
    CircleDemo(float radious, float diameter){
        this.radious = radious;
        this.diameter = diameter;
        
    }
    
    boolean validateData(float x)
    {
      if(x <= 0){
          System.err.println("entered invalid data");
          return false;
      }  else
          return true;
      
    }
    void calculateAreaWithRadious(){
        if(validateData(radious)) {
            float area = pie*(radious*radious);
            System.out.println("area of circle with radious is"+ area);
        } 
    }
    
    void calculateAreaWithDiameter(){
        if(validateData(diameter)) {
            float area;
            area = (float) (0.25 *( pie * (diameter * diameter)));
            System.out.println("Area of circle with diameter is:" + area);
        }
    }
    void perimeterOfCircle(){
        if(validateData(radious)){
            float perimeter = 2 * pie * radious;
            System.out.println("perimeter of a circle is "+ perimeter);
        } 
    }

};
