import java.util.Arrays;

import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_11 {

	public static void main(String[] args) {
		boolean correct=true;
		int dimensionArrayNum=0;
		String dimensionArray="";
		
		//Recoge los datos del usuario y comprueba que sean numeros
		do {
			correct=true;
			try {
				//Recoge los datos del usuario
				dimensionArray = JOptionPane.showInputDialog("Introduce el tamaño del array");
				//Transforma el string en un Integer
				dimensionArrayNum = Integer.parseInt(dimensionArray);
			} catch (Exception e) {
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
				System.out.println("valores incorrectos");
			}
		} while (!correct && dimensionArray!=null);
		//Crea 2 arrays con la misma dimension
		int[] arrayNum1=new int[dimensionArrayNum];
		int[] arrayNum2=new int[dimensionArrayNum];

		//llama al metodo que agregara num. randoms a todas las posiciones del array
		arrayNum1=setValueRandom(arrayNum1);
		
		//Se utiliza Arrays.copyof, ya que si se pasa directamente nos encontramos con la incidencia
		//que las 2 arrays se conectan a la misma posicion de memoria por lo que si se modifica una modifica la otra.
		//De esta manera solo copia el contenido y no la posicion de memoria
		arrayNum2=Arrays.copyOf(arrayNum1, arrayNum1.length);
		
		//llama al metodo que agregara num. randoms a todas las posiciones del array
		arrayNum2=setValueRandom(arrayNum2);
		
		//Llama al metodo para obtener el array resultado de multiplicar 2 arrays
		int[] arrayNum3=createArrayMultiplication(arrayNum1, arrayNum2);
		
		//Llama al metodo imprimir
		printArrays(arrayNum1, arrayNum2, arrayNum3);
	}
	
	//Metodo para asignar numeros aleatorios en los array
	public static int[] setValueRandom(int[] array){
		//En el enunciado no se indica que los rangos los tenga que introducir el usuario
		//Los rangos se introducen manualmente dentro del propio codigo
		int min=1;
		int max=100;
		for (int i = 0; i < array.length; i++) {
			array[i] =(int)Math.floor(Math.random() * (max - min + 1) + min);
		}
		return array;
	}
	
	//Metodo que Crea una nueva array con los valores multiplicados de los 2 arrays pasados como argumentos
	public static int[] createArrayMultiplication(int[] array1, int[] array2) {
		int[] newArray= new int[array1.length];
		
		//Itera con cada fila de las arrays y multiplica array1 con array2 
		for (int i = 0; i < array1.length; i++) {
			newArray[i]=array1[i]*array2[i];
		}
		//el resultado de cada mutiplicacion se guarda en una nueva array que se devuelve a quien lo llama
		return newArray;
	}
	
	public static void printArrays(int[] array1, int[] array2, int[] arrayResult) {
		//Contendra todos los resultados de los arrays
		String concateResult="\nArray1  *  Array2	 = 	 Result";
		//Se rtecoge cada fila y se concatena con los datos de cada array
		for (int i = 0; i < arrayResult.length; i++) {
			concateResult+="\n"+array1[i]+"  *  "+array2[i]+"	 = 	 "+arrayResult[i];
		}
		//Muestra datos por consola
		System.out.println(concateResult);
		//Muestra la informacion de manera grafica
		JOptionPane.showMessageDialog(null, concateResult, null, 2);
	}
}
