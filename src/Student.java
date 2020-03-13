public class Student {

    int rno;
    String name;
    int marks;

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.rno=1; s1.name="A"; s1.marks=90;
        s2.rno=2; s2.name="B"; s2.marks=80;
        s3.rno=3; s3.name="C"; s3.marks=20;
        
        if(s1.marks>=33){
            System.out.println("S1 IS PASSED WITH "+s1.marks);
        }else{
            System.out.println("S1 IS FAILED WITH "+s1.marks);
        }
        
        if(s2.marks>=33){
            System.out.println("S2 IS PASSED WITH "+s2.marks);
        }else{
            System.out.println("S2 IS FAILED WITH "+s2.marks);
        }
        
        if(s3.marks>=33){
            System.out.println("S3 IS PASSED WITH "+s3.marks);
        }else{
            System.out.println("S3 IS FAILED WITH "+s3.marks);
        }
    }
}
