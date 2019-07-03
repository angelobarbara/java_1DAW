/**
Crea laclase NotasAlumnos.  Declara  y  crea  un  tipo  de  variable  que sea capaz de
contener  la  nota  que  han  obtenido  4  alumnos  en  los  diferentes  módulos en los que 
están matriculados. Sabemos que el primer alumno está matriculado en 4 módulos; el segundo en 7, el tercero en 3 módulos y el cuarto en dos módulos.
Genera aleatoriamente  las  notas  de  los  alumnos  y  muéstralos.  Utiliza  métodos  de  la  forma más eficiente y clara.

@author Angelo Barbara
@version 1.0
*/
class NotasAlumnos{
	public static void main (String[] args){
		int[][] matriz = new int [4][];
		matriz[0] = new int[4];
		matriz[1] = new int[7];
		matriz[2] = new int[3];
		matriz[3] = new int[2];
		inicializarMatrizAleatoriamente(matriz);
		mostrar(matriz);
	}
	static void mostrar(int[][] matriz){
		int l=0;
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;j++){
				if(i==0 && j==0)
					System.out.print("Alumno 1: ");
				if(i==1 && j==0)
					System.out.print("Alumno 2: ");
				if(i==2 && j==0)
					System.out.print("Alumno 3: ");
				if(i==3 && j==0)
					System.out.print("Alumno 4: ");
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	static void inicializarMatrizAleatoriamente(int[][] matriz){
		for(int i=0;i<matriz.length;i++)
			for(int j=0;j<matriz[i].length;j++)
				matriz[i][j]=(int)Math.round(Math.random()*10);
	}
}