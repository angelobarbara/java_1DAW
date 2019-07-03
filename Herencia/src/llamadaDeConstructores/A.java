package llamadaDeConstructores;

class A{
	A(){
		System.out.println("Inside A's constructor");
	}
}

class B extends A{	//Si no implementara su constructor se ejecutaría sin problema
					//sin imprimir el mensaje.
	private static String string;
	B(String string){
		this.string = string;
		System.out.println("Inside B's constructor");
	}
}

class C extends B{
	C(String string){
		super(string);	//Si la clase B implementa en su constructor un argumento
						//invocamos, en c, el constructor del padre pasandole dicho argumento;
		System.out.println("Inside C's constructor");
	}
}

class CallingCons{
	public static void main(String[] args) {
		C c = new C("hola");
		
//		Inside A's constructor
//		Inside B's constructor
//		Inside C's constructor
	}
}
