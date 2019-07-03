package Practica1;

public class Test{
public static void main(String[] args){
Test.test(new String("Probando instanceof"));
}
public static void test(Object o){
System.out.println(o instanceof String);
System.out.println(o instanceof Object);
System.out.println(o instanceof Integer);
System.out.println(o instanceof java.util.Calendar);
}
}