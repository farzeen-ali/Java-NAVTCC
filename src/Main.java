class Super { // Parent 
    void sayHello(){
        System.out.println("Hello");
    }
    int getSum(int a, int b){
        return a+b;
    }
}

class Sub extends Super{ //Child
    void sayGoodBye(){
        System.out.println("Good Bye");
    }
} 

public class Main {
    public static void main(String[] args) {
        // Super sp = new Super();
        // sp.sayHello();

        Sub sb = new Sub();
        // sb.sayGoodBye();
        // sb.sayHello();

        int num1 = 2;
        int num2 = 4;

       int sum = sb.getSum(num1, num2);
       System.out.println("Your sum is: "+ sum);

    }
}
