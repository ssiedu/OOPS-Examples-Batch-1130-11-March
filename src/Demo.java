
public class Demo {

    private int x, y;        //instance (non-static)
    private static int p, q; //class (static)

    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.x=10; d2.x=20; d3.x=30;
        System.out.println(d1.x);
        System.out.println(d2.x);
        System.out.println(d3.x);
        System.out.println("_____________________________");
        d1.p=50; d2.p=60; d3.p=70;
        System.out.println(d1.p);
        System.out.println(d2.p);
        System.out.println(d3.p);
        System.out.println("_____________________________");
        
    }
}
