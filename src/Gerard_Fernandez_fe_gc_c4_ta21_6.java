import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_6 {

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
				number = JOptionPane.showInputDialog("Introduce un numero y se te devolvera\nel numero de digitos");
				//Transforma el string en un Integer
				numberNum = Integer.parseInt(number);
			} catch (Exception e) {
				//Si el usuario introduce un valor que no es numerico salta el comprobante
				correct=false;
				System.out.println("valores incorrectos");
			}
			if(numberNum<0){
				correct=false;
				String text="Para poder realizar la operacion tienen\n"
						+ "que ser numeros enteros positivos";
				System.out.println(text);
				JOptionPane.showMessageDialog(null, text, null, 2);
			}
		} while (!correct && number!=null);
		
		//Muestra los resultados
		int numberDigits=getDigits(numberNum);
		JOptionPane.showMessageDialog(null, "El numero de digitos del entero positivo "+numberNum+" es de "+numberDigits+" digitos", null, 1);
		System.out.println("El numero de digitos del entero positivo "+numberNum+" es de "+numberDigits+" digitos");

	}
	
	public static int getDigits(int number) {
		//Convierte el numero en un String y a partir del string
		//Conforma un array de caracteres
		char[] ch = (String.valueOf(number)).toCharArray();
		//Devuelve el tamaño de la array
		return ch.length;
	}

}
