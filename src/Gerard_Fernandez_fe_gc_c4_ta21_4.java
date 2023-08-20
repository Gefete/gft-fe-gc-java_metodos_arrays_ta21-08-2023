import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_4 {

	public static void main(String[] args) {
		//Variables
		boolean correct=true;
		int numberNum=0;
		String number="";
		
		//Recoge los datos del usuario y comprueba que sean numeros
		do {
			correct=true;
			try {
				//Recoge los datos del usuario
				number = JOptionPane.showInputDialog("Introduce un numero y te diremos si es primo");
				//Transforma el string en un Integer
				numberNum = Integer.parseInt(number);
			} catch (Exception e) {
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
				System.out.println("valores incorrectos");
			}
			
		} while (!correct && number!=null);

		//LLama al metodo y almacena su resultado
		int result=getFactorial(numberNum);
		
		//Imprime el resultado que ha devuelto el metodo
		System.out.println("El factorilal de "+numberNum+" es "+result);
	}
	
	//Metodo para obtener el factorial
	public static int getFactorial(int number){
		//Creamos una variable que ira guardando las operaciones
		int result=1;
		
		//ira multiplicando el valor con el iterador pertinente hasta llegar al numero marcado
		for (int i = 1; i <= number; i++) {
			result*=i;
		}
		
		return result;
	}

}
