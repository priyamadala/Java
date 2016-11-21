
package circledemo;

import circledemo.CircleDemo;

public class TestCircle {
    public static void main(String args[]){
        CircleDemo c1 = new CircleDemo((float) 2.5,5);
        c1.calculateAreaWithRadious();
        c1.calculateAreaWithDiameter();
        c1.perimeterOfCircle();
    }
}
