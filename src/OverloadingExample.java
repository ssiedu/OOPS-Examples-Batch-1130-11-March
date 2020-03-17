
public class OverloadingExample {

    public static void add(int a, int b){
        int result=a+b;
        System.out.println("Addion "+result);   
    }
    public static void add(int a, int b, int c){
        int result=a+b+c;
        System.out.println("Addion "+result);   
    }
    public static void add(int a, int b, int c, int d){
        int result=a+b+c+d;
        System.out.println("Addion "+result);   
    }
    public static void add(int a, int b, int c, int d, int e){
        int result=a+b+c+d+e;
        System.out.println("Addion "+result);   
    }
    public static void main(String[] args) {
        
        add(10,20); // int,int
        add(10,20,30);//int,int,int
        add(10,20,30,40);//int,int,int,int
        add(10,20,30,40,50);
    }
}
