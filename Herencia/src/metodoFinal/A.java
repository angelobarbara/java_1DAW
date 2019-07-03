/**
 Implementa el siguiente código y contesta a las preguntas:

 ¿Cuál es el resultado de la ejecución?
 No se puede sobrescribir un método final
 
 ¿Existe alguna manera de solucionarlo?
 Quitando el final
 
 ¿Qué sentido tiene implementarlo de esta forma?
 Es util implementar métodos final cuando se desea que no se modifique
 dicha implementación;
 
 */
package metodoFinal;

class A {
	void meth() {
		System.out.println("This is a final method");
	}
}
