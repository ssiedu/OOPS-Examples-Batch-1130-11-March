
public class Student {

    private int marks;
    private static int passingMarks=33;
    
    public static void changePassingMarks(int value){
        passingMarks=value;
    }
    
    public  void showResult(){
        System.out.println("PASSING MARKS   : "+passingMarks);
        if(marks>=passingMarks){
            System.out.println("PASSED WITH     : "+marks);
        }else{
            System.out.println("FAILED WITH     : "+marks);
        }
        System.out.println("__________________________________");
    }

    public static void main(String[] args) {
        Student s1=new Student(); s1.marks=50;
        Student s2=new Student(); s2.marks=60;
      
        s1.showResult();
        s2.showResult();
        
        changePassingMarks(55);
        
        s1.showResult();
        s2.showResult();
    }
}
