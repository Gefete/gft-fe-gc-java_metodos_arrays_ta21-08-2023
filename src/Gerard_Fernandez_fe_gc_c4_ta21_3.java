import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_3 {

	public static void main(String[] args) {
		boolean correct=true;
		int numberNum=0;
		String number="";
		
		//Recoge los datos del usuario y comprueba que sean numeros
		do {
			correct=true;
			try {
				number = JOptionPane.showInputDialog("Introduce un numero y te diremos si es primo");
		
				numberNum = Integer.parseInt(number);
			} catch (Exception e) {
				correct=false;
				System.out.println("valores incorrectos");
			}
			
		} while (!correct && number!=null);
			
		
		
		//LLama al metodo y recoge el boleano que retorna
		boolean prime = isPrime(numberNum);
		
		//Dependiendo el resultado del metodo imprime una información u otra
		if(prime && numberNum != 0) {
			System.out.println(numberNum+" es un numero primo");
		}else {
			System.out.println(numberNum+" 'no' es un numero primo");
		}
	}

	//Metodo para saber si es primo
	public static boolean isPrime(int number) {
		int count=0;
		for (int i = 1; i < 100; i++) {
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
		
	}
}
