
public class Result {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.maths=80; s1.physics=90; s1.chemistry=60;
        s1.computeTotalMarks();
        s1.computeDivision();
        System.out.println("___________________________________________");
        Student s2=new Student();
        s2.maths=30; s2.physics=40; s2.chemistry=20;
        s2.computeTotalMarks();
        s2.computeDivision();
        
    }
}
