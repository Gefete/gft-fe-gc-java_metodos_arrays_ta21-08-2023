import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_8 {

	public static void main(String[] args) {
		//Crea el Array de 10 posiciones
		int [] numbers = new int[10];
		
		//Llamara al metodo 10 veces para introducir un valor, por argumento se pasa el indice
		for (int i = 0; i < 10; i++) {
			numbers[i]=setNumbers(i);
		}
		
		//Envia el array al metodo para que muestre su contenido
		getNumbers(numbers);
	}

	// -- -- METODO INTRODUCIR NUMEROS -- --
	public static int setNumbers(int index) {
		//Variables
		boolean correct=true;
		int numberNum=0;
		String number="";
		
		//Recoge los datos del usuario y comprueba que sean numeros
		do {
			correct=true;
			try {
				//Recoge los datos del usuario
				number = JOptionPane.showInputDialog("Introduce el valor de la posicion "+index);
				//Transforma el string en un Integer
				numberNum = Integer.parseInt(number);
			} catch (Exception e) {
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
				System.out.println("valores incorrectos");
			}
			
		} while (!correct && number!=null);
		
		return numberNum;
	}
	
	// -- -- METODO OBTENER DATOS ARRAY -- --
	public static void getNumbers(int [] numbers) {
		String numberText="";
		for (int i = 0; i < numbers.length; i++) {
			numberText=numberText+"\n Posicion del array "+(i+1)+" su valor es "+numbers[i];
		}
		//Muestra y notifica el resultado de la conversion
		JOptionPane.showMessageDialog(null, numberText, null, 2);
		System.out.println(numberText);
	}
}
