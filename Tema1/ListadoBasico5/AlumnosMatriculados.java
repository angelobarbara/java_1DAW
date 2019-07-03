/**
Crea la clase AlumnosMatriculados. Queremos guardar en la memoria del ordenador el 
número de alumnos matriculados en cada grupo del ciclo de "Desarrollo de
Aplicaciones  Web"  (por  módulos).  Existen  dos  grupos  y  se  imparten  seis  módulos 
distintos en cada grupo. Utiliza métodos en la medida de lo posible.
Sabemos que:

a. En el primer grupo hay:
i.30 alumnos matriculados en Sistemas informáticos
ii.27 alumnos matriculados en Bases de datos
iii.25 alumnos matriculados en Programación
iv.21 alumnos matriculados en Lenguaje de marcas
v.19 alumnos matriculados en Entornos de desarrollo
vi.16 alumnos matriculados en FOL

b. En el segundo grupo hay:
i.15 alumnos matriculados en Desarrollo Web en entorno cliente
ii.14 alumnos matriculados en Desarrollo Web en entorno servidor
iii.15 alumnos matriculados en Despliegue de aplicaciones Web
iv.15 alumnos matriculados en Diseño de interfaces Web
v.15 alumnos matriculados en Desarrollo Web en entorno cliente

@author Angelo Barbara
@version 1.0
*/
class AlumnosMatriculados{
	public static void main(String[] args){
		int[][] matriz={{30,27,25,21,19,16},{15,14,15,15,15}};
		asignaturasGrupo1();
		notasGrupo(matriz,0);
		asignaturasGrupo2();
		notasGrupo(matriz,1);
	}
	static void asignaturasGrupo2(){
		System.out.println("SI"
		+"\tDWC"
		+"\tDWS"
		+"\tDAW"
		+"\tDIW"
		+"\tDWC");
	}
	static void notasGrupo(int[][] matriz, int numero){
		for(int i=0;i<matriz[numero].length;i++)
				System.out.print(matriz[0][i]+"\t");
		System.out.println("");
	}
	static void asignaturasGrupo1(){
		System.out.println("SI"
		+"\tBD"
		+"\tPGN"
		+"\tLM"
		+"\tED"
		+"\tFOL");
	}
}