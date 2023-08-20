import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_2 {

	public static void main(String[] args) {
		//Variables
		boolean correct=true;
		int quantityNum=0;
		int maxNum=0;
		int minNum=0;
			
		//Si el comprobante es falso quiere decir que los datos introducidos son incorrectos
		do {
			try {
				//Reinicia comprobante de error
				correct=true;
				//Recoge los datos del usuario
				String quantity = JOptionPane.showInputDialog("Introduce la cantidad de numeros aleatorios que quieres");
				String min = JOptionPane.showInputDialog("Introduce el numero minimo de los aleatorios");
				String max = JOptionPane.showInputDialog("Introduce el numero maximo de los aleatorios");
				
				//Transforma los datos en Integer
				quantityNum=Integer.parseInt(quantity);
				maxNum=Integer.parseInt(max);
				minNum=Integer.parseInt(min);
				
			} catch (Exception e) {
				//en caso de error el comprobante pasa a falso
				System.out.println("Valores incorrectos intente de nuevo");
				correct=false;
			}
			
		}while(!correct);
		
		//Repite la cantidad introducida por el usuario
		for (int i = 0; i < quantityNum; i++) {
			System.out.println(getNumRandom(maxNum, minNum));
		}
		
	}

	public static int getNumRandom(int max, int min) {
		//Devuelve un numero aleatorio en el rango marcado por el usuario
		return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}
}
