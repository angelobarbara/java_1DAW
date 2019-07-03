/**
Crea la clase Rectángulo que repita n veces (indicadas por usuario):

-Solicite la base de un rectángulo pedirBase()-> pedirDimension(String mensaje)
-Solicite la altura de un rectángulo pedirAltura() -> pedirDimension(String mensaje)
-Muestre el área calcularArea()
-Muestre el perímetro calcularPerimetro()
	
@author Angelo Barbara
@version 1.0
*/
class Rectangulo{
	public static void main (String[] args){
		double base, altura, dimension;
		String mensaje="";
		int numVeces = pedirEntero();
		dimension=pedirDimension();
		for (int i = 0; i < numVeces; i++) {
			base = pedirBase();
			altura = pedirAltura();
			System.out.println("El area del rectangulo es "+calcularArea(base,altura));
			System.out.println("El perimetro del rectangulo es "+calcularPerimetro(base,altura));
		}
	}

	static double pedirDimension(String mensaje){
		double dimension;
		do{
			dimension=Teclado.leerDecimal(mensaje);
		}while(dimension<=0);
		return dimension;
	}
	static double pedirBase(){
		return pedirDimension("\nDame base");
	}
	static double pedirAltura(){
		return pedirDimension("\nDame altura");
	}
	static double calcularArea(double base,double altura){
		return base * altura;
	}
	static double calcularPerimetro(double base, double altura){
		return (base + altura)*2;
	}
	private static int pedirEntero() {
        int entero;
        do{
            entero = Teclado.leerEntero("\nDame las veces que quieres realizar el ejercicio:");
        }while (entero <= 0);
        return entero;
    }
}