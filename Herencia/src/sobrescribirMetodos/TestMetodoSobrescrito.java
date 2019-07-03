package sobrescribirMetodos;

/***
   Ejecuta el siguiente código y analiza su resultado. Responde a a las siguientes preguntas: 

   ¿En qué consiste sobrescribir métodos de instancia (no static)?
   Consiste en redefinir métodos de la clase padre en la clase hija con la misma
   signatura, los mismos parametros, la misma visibilidad o superior y el mismo 
   valor devuelto o subtipo del original.
   
   ¿Cuántos métodos hay sobrescritos en el código? 
   El toString.
   
   ¿Puede accederse a un método sobrescrito desde dentro de la clase que lo sobrescribe? ¿Siempre?
   Se puede acceder a un método sobrescrito utilizando la palabra reservada super.
   
   ¿Puede accederse a un método sobrescrito desde fuera de la clase que lo sobrescribe?
   No se puede.
   
   ¿En qué consiste la ligadura dinámica?¿Dónde se aplica en este código?
   La ligadura dinámica permite en tiempo de ejecución decidir qué implementación se invoca.
   
   ¿Es recomendable la sobrescritura/redefinición/refinamiento de métodos?
   Si.
   
 * @author lmagarin
 *
 */
public class TestMetodoSobrescrito {

	public static void main(String[] args) {
		A a = new A(1, 2f);
		B b = new B(3, 4f, 'z');

		System.out.println(b.toString());
		System.out.println(((A) b).toString());
	}

}
