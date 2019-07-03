package Practica1;

public class StringBufferTest_1{
public static void main(String[] args) {
StringBuffer sb2 = new StringBuffer(2);
System.out.println(sb2.length());
System.out.println(sb2.capacity());
for(int i=0; i<10; i++)
sb2.append(i);
System.out.println(sb2.length());
System.out.println(sb2.capacity());
System.out.println(sb2);
}
}