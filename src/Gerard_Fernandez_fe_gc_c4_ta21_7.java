import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_7 {

	public static void main(String[] args) {
		//Se crea un array con las diferentes opciones
		String[] options = new String[] {"$(Dollar)", "£(Libra)", "¥(Yen)"};
				
		//Mediante un JOptionPane mostramos las opciones del array y segun cual se seleccione devolvera el numero de la posicion
	    int response = JOptionPane.showOptionDialog(null, "Escoge la conversion de € a ", "Conversor de Monedas",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		        null, options, options[0]);
	    
	  //Variables
  		boolean correct=true;
  		double numberNum=0;
  		String number="";
  		
  		//Recoge los datos del usuario y comprueba que sean numeros
  		do {
  			correct=true;
  			try {
  				//Recoge los datos del usuario
  				number = JOptionPane.showInputDialog("Introduce cuantos euros quieres conversionar");
  				//Transforma el string en un double
  				numberNum = Double.parseDouble(number);
  			} catch (Exception e) {
  				//Si el usuario introduce un valor que no es numerico salta el comprobante
  				correct=false;
  				System.out.println("valores incorrectos");
  			}
  			//Condicional para saber si es un numero negativo
  			if(numberNum<0){
  				correct=false;
  				String text="Para poder realizar la operacion tienen\n"
  						+ "que ser numeros positivos";
  				System.out.println(text);
  				JOptionPane.showMessageDialog(null, text, null, 2);
  			}
  		} while (!correct && number!=null);
  		
  		
  		//Switch para enviar el String correcto a su moneda
  		switch (response) {
		case 0: {
			conversion(numberNum, "dollar");
			break;
		}
		case 1: {
			conversion(numberNum, "libra");
			break;
		}
		case 2: {
			conversion(numberNum, "yen");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + response);
		}

	}
	
	public static void conversion(double euros, String conversion) {
		double result;
		
		//Switch para marcar el tipo de conversion que se realizara segun el string pasado
		switch (conversion) {
		case "dollar": {
			result=1.28611*euros;
			break;
		}
		case "yen": {
			result=129.852*euros;	
			break;
		}
		case "libra": {
			result=0.86*euros;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + conversion);
		}
		
		//Muestra y notifica el resultado de la conversion
		JOptionPane.showMessageDialog(null, "La conversion euro -> "+conversion+" es de "+result, null, 2);
		System.out.println("La conversion euro -> "+conversion+" es de "+result);
		
	}

}
