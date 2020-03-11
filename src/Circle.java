
//this is the blueprint of an Circle object.

public class Circle {
    //variables to store the properties of an object
    //data-members
    double radius;
    double area;
    double circumference;
    //methods to perform operatios on circle object
    //member-functions
    void computeArea(){
        area=3.14*radius*radius;
        System.out.println("Area of Circle : "+area);
    }
    void computeCircumference(){
        circumference=2*3.14*radius;
        System.out.println("Circumference of Circle : "+circumference);
    }
}
