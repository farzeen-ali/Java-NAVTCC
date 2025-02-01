class Base{
    int add(int a, int b){
        return a+b;
    }
    int add(int c, int d, int a){
        return a+c+d;
    }
}
class Super{
    public static void say(){
        System.out.println("Good");
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Base b = new Base();
       System.out.println(b.add(3, 4, 8));
    }
}
