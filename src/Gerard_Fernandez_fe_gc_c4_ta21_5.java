import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_5 {

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
				number = JOptionPane.showInputDialog("Introduce un numero decimal para dar la conversion en decimal");
				//Transforma el string en un Integer
				numberNum = Integer.parseInt(number);
			} catch (Exception e) {
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
				System.out.println("valores incorrectos");
			}
			
		} while (!correct && number!=null);
		
		//Llama al metodo y obtiene en string el numero binario
		String binary = getBinary(numberNum);
		System.out.println("El resultado binario del decimal "+numberNum+" es "+binary);

	}
	
	public static String getBinary(int number){
		String binary="";
		//Se ira dividiendo el numero hasta que no se pueda dividir mas 
		//entre 2 (va recogiendo el resto de cada division)
		while (number>=2) {
			binary+=number%2;
			number=number/2;
		}
		//Coge el ultimo numero que no se podia dividir
		binary+=number;
		//separa el resultado en un array de caracteres
		char[] ch = binary.toCharArray();
		//Limpia el valor dejandolo listo para otra concatenacion de caracteres
		binary="";
		
		//Con este for se invertira el orden de los numeros que teniamos en binary
		for (int i = ch.length-1; i >= 0; i--) {
			binary+=ch[i];
		}

		return binary;
		
	}

}
