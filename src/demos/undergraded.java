package demos;

public class undergraded extends Person2  {
    public void method2() {
        System.out.print("Undergrad 2 ");
    }
public static void main(String[] args) {
    undergraded u = (undergraded)new Person2() ; 
    ((undergraded)u).method2();   
}    
}


