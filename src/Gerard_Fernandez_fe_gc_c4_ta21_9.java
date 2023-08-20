import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_9 {
	//El array se define como variable global por que en el enunciado especifica 
	//los argumentos a pasar al metodo y entre ellos no se encuentra la array.
	//Tampoco se especifica que el array tenga que ser retornado por lo que se asimila
	//que son metodos void
	
	//Enunciado: Tareas a realizar: Haz un mètodo para rellenar el array(que tenga 
	//como parámetros los números entre los que tenga que generar) y otro para mostrar 
	//el contenido y la suma del array.
	private static int[] arrayNumber;
	
	public static void main(String[] args) {
		boolean correct=true;
		int numberNum=0;
		String number="";
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
		
		//Se define el tamaño del array definido como variable global
		arrayNumber=new int[numberNum];
		
		//Llama a los dos metodos añadir valores y mostrar valores
		setValuesArray(0,9);
		getValuesArray();
	}
	
	public static void setValuesArray(int min, int max) {
		for (int i = 0; i < arrayNumber.length; i++) {
			//Genera numeros aleatorios en el rango que se ha pasaodo por parametros
			//Luego se van añadiendo a la variable global array
			arrayNumber[i]=(int)Math.floor(Math.random() * (max - min + 1) + min);
		}
	}
	
	public static void getValuesArray(){
		int total=0;
		String concateText="";
		for (int i = 0; i < arrayNumber.length; i++) {
			//Muestra la informacion por consola
			System.out.println("\nEn la posicion "+(i+1)+" del array esta almacenado el valor: "+arrayNumber[i]);
			//Concatena el texto para mostrarlo luego graficamente
			concateText+="\nEn la posicion "+(i+1)+" del array esta almacenado el valor: "+arrayNumber[i];
			//almacena el valor total
			total += arrayNumber[i];
		}
		
		//Muestra la informacion por consola
		System.out.println("\nLa suma total de los valores dentro del array dan como resultado "+total);
		//Suma a la concatenacion el texto anterior que se muestra por consola (suma total)
		concateText+="\nLa suma total de los valores dentro del array dan como resultado "+total;
		
		//Muestra la informacion de manera grafica
		JOptionPane.showMessageDialog(null, concateText, null, 2);
		
	}

}
