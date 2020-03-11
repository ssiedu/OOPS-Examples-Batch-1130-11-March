//this class defines the blueprint of an Student object
public class Student {
    int rno;
    String name;
    int maths;
    int physics;
    int chemistry;
    int total;
    public void computeTotalMarks(){
        total=maths+physics+chemistry;
        System.out.println("Total Marks  : "+total);
    }
    public void computeDivision(){
        int per=total/3;
        if(per>=60){
            System.out.println("I Div");
        }else if(per>=45){
            System.out.println("II Div");
        }else if(per>=33){
            System.out.println("II Div");
        }else{
            System.out.println("Fail ");
        }
    }
}
