interface Person{
    void sayHello();
}

interface A{
    void displayName();
}

class Employee implements Person, A{
    public void sayHello(){
        System.out.println("Hello");
    }
    public void displayName(){
        System.out.println("Hi");
    }
}

public class Interfaces {
    public static void main(String[] args) {
     Employee emp = new Employee();
     emp.sayHello();  
     emp.displayName(); 
    }
}
