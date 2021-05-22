//swap two numbers without using a third 
variable

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        System.out.println("before swapping"+a+" "+ b);
        b=b+a;
        a=b-a;
        b=b-a;
System.out.println("After swapping"+a+" "+ b);
    }
}
