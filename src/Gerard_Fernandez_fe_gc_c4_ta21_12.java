import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_12 {

	public static void main(String[] args) {
		//Declaracion de variables
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
		
		int[] arraynum1= new int[dimensionArrayNum];
		
		//Llama al metodo para obtener numeros random
		arraynum1=setValueRandom(arraynum1);
		
		//Declaracion de variables
		int lastDigitNum=0;
		String lastDigit="";
		
		//Recoge los datos del usuario y comprueba que sean numeros
		do {
			correct=true;
			try {
				//Recoge los datos del usuario
				lastDigit = JOptionPane.showInputDialog("Introduce el ultimo digito de los "
						+ "\nnumeros almacenados y se te mostraran");
				//Transforma el string en un Integer
				lastDigitNum = Integer.parseInt(lastDigit);
			} catch (Exception e) {
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
				System.out.println("valores incorrectos");
			}
			//Condicional que controla que solo se introduzcan numeros dentro de ese rango
			if(lastDigitNum<0 || lastDigitNum>9) {
				JOptionPane.showMessageDialog(null, "Valor no apto solo \n puede de 0 - 9");
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
			}
		} while (!correct && dimensionArray!=null);
		
		//Llama al metodo para obtener el array filtrado con el ultimo digito
		int[] filterArray = getArrayLastDigit(arraynum1, lastDigit.charAt(0));
		
		//Llama al metodo que muestra los datos
		showArrays(arraynum1, filterArray);
	}

	//Metodo para asignar numeros aleatorios en los array
	public static int[] setValueRandom(int[] array){
		//En el enunciado no se indica que los rangos los tenga que introducir el usuario
		//Los rangos se introducen manualmente dentro del propio codigo
		int min=1;
		int max=300;
		for (int i = 0; i < array.length; i++) {
			array[i] =(int)Math.floor(Math.random() * (max - min + 1) + min);
		}
		return array;
	}
	
	//Metodo para filtrar los datos en un nuevo array
	public static int[] getArrayLastDigit(int[] array, char lastDigit) {
		//char lastDigitChar= lastDigit;
		int[] newArray;
		String numberString;
		int count=0;
		
		//En este bucle cuenta cuantos espacios necesita el nuevo array
		for (int i = 0; i < array.length; i++) {
			numberString=String.valueOf(array[i]);
			if (numberString.charAt(numberString.length()-1) == lastDigit) {
				count++;
			}
		}
		
		//Se define el tamaño del nuevo array
		newArray=new int[count];
		count=0;
		
		//en este bucle se añaden los valores filtrados al nuevo array
		for (int i = 0; i < array.length; i++) {
			numberString=String.valueOf(array[i]);
			
			if (numberString.charAt(numberString.length() - 1) == lastDigit) {
				//Guarda valor
				newArray[count]= array[i];
				//Lleva la cuenta de la posicion del array
				count++;
			}
			
		}
		
		//Devuelve el nuevo array
		return newArray;
	}
	
	//Metodo para mostrar los resulatados de los 2 arrays (normal y filtrado)
	public static void showArrays(int[] array1, int[] arrayFiltered) {
		String[] result= new String[array1.length];
		
		//Concatena el array 1 en un array string
		for (int i = 0; i < array1.length; i++) {
			result[i]="posicion "+(i+1)+": "+array1[i];
		}
		
		//Concatena 
		for (int i = 0; i < arrayFiltered.length; i++) {
			result[i]+=" -------- "+arrayFiltered[i];
		}
		
		String concateResult="Array sin filtro ------ Array contiene el ultimo digito";
		
		//Bucle para concatenar texto para mostrarlo visualmente con JOptionPane
		for (int i = 0; i < result.length; i++) {
			concateResult+="\n"+result[i];
		}
		//Muestra datos por consola
		System.out.println(concateResult);
		//Muestra la informacion de manera grafica
		JOptionPane.showMessageDialog(null, concateResult, null, 2);
	}
}
