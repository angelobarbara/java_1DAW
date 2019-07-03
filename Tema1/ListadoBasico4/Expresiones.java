/**
Indica el resultado de las siguientes expresiones, suponiendo que inicialmente x vale 1:
a.(1 > x) && ( 1 > x++)
b.(1 == x) || (10 > x++)
c.(++x) + x;
d.x + (++x)
e.(1 > x) || ( 1 > x--)
f.(1 > x) || ( 1 > --x)

@author Angelo Barbara
@version 1.0
*/
class Expresiones{
	public static void main (String[] args){
		int x = 1;
		System.out.println((1 > x) && ( 1 > x++)); //false
		System.out.println((1 == x) || (10 > x++)); //true
		System.out.println((++x) + x); //4
		x=1;
		System.out.println(x + (++x)); //3
		x=1;
		System.out.println((1 > x) || ( 1 > x--)); //false
		x=1;
		System.out.println((1 > x) || ( 1 > --x)); //true
	}
}