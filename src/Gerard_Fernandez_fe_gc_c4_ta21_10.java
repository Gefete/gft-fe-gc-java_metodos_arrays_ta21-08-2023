import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_10 {
	
	public static void main(String[] args) {
		boolean correct=true;
		int numberNum=0;
		String number="";
		int minNum=0;
		int maxNum=0;
		
		//Recoge los datos del usuario y comprueba que sean numeros
		do {
			correct=true;
			try {
				//Recoge los datos del usuario
				number = JOptionPane.showInputDialog("Introduce cuantos numeros quieres almacenar en la Array de elementos");
				//Transforma el string en un Integer
				numberNum = Integer.parseInt(number);
			} catch (Exception e) {
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
				System.out.println("valores incorrectos");
			}
		} while (!correct && number!=null);
		
		//Introduccion de rangos
		do {
			correct=true;
			try {
				//Recoge los datos del usuario
				String min = JOptionPane.showInputDialog("Introduce el numero minimo del rango");
				//Transforma el string en un Integer
				minNum = Integer.parseInt(min);
				//Recoge los datos del usuario
				String max = JOptionPane.showInputDialog("Introduce el numero maximo del rango");
				//Transforma el string en un Integer
				maxNum = Integer.parseInt(max);
			} catch (Exception e) {
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
				System.out.println("valores incorrectos");
			}
		} while (!correct && number!=null);
		
		int[] arrayNumber;
		//Se define el tamaño del array definido como variable global
		arrayNumber=new int[numberNum];
		
		arrayNumber=managerArrayPrime(arrayNumber, minNum, maxNum);
		
		getValuesArray(arrayNumber);
	}
	
	public static int[] managerArrayPrime(int[] numbers,int min, int max) {
		boolean prime= false;
		int numberRandom=0;
		
		//repeticion que itera las veces que marca el usuario
		for (int i = 0; i < numbers.length; i++) {
			//reinicia boleano
			prime=false;
			
			//Si encuentra que el numero random no es primo repite
			while(!prime) {
				//genera numeros random dentro del rango
				numberRandom =(int)Math.floor(Math.random() * (max - min + 1) + min);
				
				//pasa los numeros que recupera del random al metodo que comprueba si es primo
				//si devuelve que es falso significa que no era primo y por lo tanto vuelve
				//a iterar con el random
				prime = isPrime(numberRandom);
			}
			numbers[i]=numberRandom;
		}
		
		return numbers;
		
	}
	
	//Metodo para saber si es primo
	public static boolean isPrime(int number) {
		int count=0;
		int max=100;
		
		//en caso de que el numero introducido supere 100 se cambiara por el introducido
		//el maximo base es 100 para evitar fallas en el cuenteo de cuantos 
		//divisibles tiene realmente number (numero argumento)
		if(number>max) {
			max=number;
		}
		//Se utiliza el primer condicional para que no se cuelen 0 o 
		//numeros negativos ya que son numeros introducidos por el usuario
		if(number>0) {
			for (int i = 1; i < max; i++) {
				//Comprueba con cuantos numeros es divisible
				if(number%i==0) {
					//Mantiene la cuenta de cuantos divisibles tiene el numero pasado por el usuario
					count++;
				}
			}
			//Comprueba que sea divisible entre uno y consigo mismo y tambien que no supere la cantidad de 2 divisiones en las que da resto 0
			if(count<=2 && number%1==0 && number%number==0) {
				//Devuelve true (es primo)
				return true;
			}else {
				//Devuelve false (no es primo)
				return false;
			}
		}else {
			return false;
		}
		
	}
	
	public static void getValuesArray(int[] arrayNumber){

		String concateText="";
		for (int i = 0; i < arrayNumber.length; i++) {
			//Muestra la informacion por consola
			System.out.println("\nEn la posicion "+(i+1)+" del array esta almacenado el primo: "+arrayNumber[i]);
			//Concatena el texto para mostrarlo luego graficamente
			concateText+="\nEn la posicion "+(i+1)+" del array esta almacenado el primo: "+arrayNumber[i];
		}
		
		//Muestra la informacion de manera grafica
		JOptionPane.showMessageDialog(null, concateText, null, 2);
		
	}

}
