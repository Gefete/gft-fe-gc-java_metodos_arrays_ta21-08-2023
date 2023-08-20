import javax.swing.JOptionPane;

public class Gerard_Fernandez_fe_gc_c4_ta21_1 {

	public static void main(String[] args) {
		//Se crea un array con las diferentes opciones
		String[] options = new String[] {"▲", "■", "●"};
		
		//Mediante un JOptionPane mostramos las opciones del array y segun cual se seleccione devolvera el numero de la posicion
	    int response = JOptionPane.showOptionDialog(null, "Selecciona que area quieres calcular", "Calculo de area",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
		        null, options, options[0]);
	    
	    //Boleano para controlar errores a la hora de entrar datos
	    boolean correct=true;
	    
	    //Donde se guardaran los datos
	    double result=0;
		
	    //En este switch dependiendo la opcion calculada llamara un metodo u otro
		switch (response) {
		
		//Caso donde se escoge calcular traingulo
		case 0: {
			//Este while se repetira mientras no se pongan bien los valores de los calculos (introducir valores numericos unicamente)
			do {
				//Reinicia el boleano comprobante de errores
				correct=true;
				//Este try catch salta desde el metodo, donde este no termina correctamente, lo que indica que el usuario a cometido un error al introducir valores
				try {
					//Llama al metodo
					result = getTriangleArea();
				} catch (Exception e) {
					//Indica al usuario que lo ha hecho mal al introducir valores
					JOptionPane.showMessageDialog(null, "Valor introducido incorrecto\nRecuerda que tienes que poner valores numericos\nEjemplo: (36.23)", "Alert", 0);
					correct=false;
				}
			}while(!correct);
	    	JOptionPane.showMessageDialog(null, "Resultado del calculo: "+result);
	    	System.out.println("Resultado del calculo: "+result);
			break;
		}
		
		//Caso donde se escoge calcular Cuadrado
		case 1: {
			//Este while se repetira mientras no se pongan bien los valores de los calculos (introducir valores numericos unicamente)
			do {
				//Reinicia el boleano comprobante de errores
				correct=true;
				//Este try catch salta desde el metodo, donde este no termina correctamente, lo que indica que el usuario a cometido un error al introducir valores
				try {
					//Llama al metodo
					result = getSquareArea();
				} catch (Exception e) {
					//Indica al usuario que lo ha hecho mal al introducir valores
					JOptionPane.showMessageDialog(null, "Valor introducido incorrecto\nRecuerda que tienes que poner valores numericos\nEjemplo: (36.23)", "Alert", 0);
					correct=false;
				}
			}while(!correct);
	    	JOptionPane.showMessageDialog(null, "Resultado del calculo: "+result);
	    	System.out.println("Resultado del calculo: "+result);
			break;
		}
		
		//Caso donde se escoge calcular Circulo
		case 2: {
			//Este while se repetira mientras no se pongan bien los valores de los calculos (introducir valores numericos unicamente)
			do {
				//Reinicia el boleano comprobante de errores
				correct=true;
				//Este try catch salta desde el metodo, donde este no termina correctamente, lo que indica que el usuario a cometido un error al introducir valores
				try {
					//Llama al metodo
					result = getCircleArea();
				} catch (Exception e) {
					//Indica al usuario que lo ha hecho mal al introducir valores
					JOptionPane.showMessageDialog(null, "Valor introducido incorrecto\nRecuerda que tienes que poner valores numericos\nEjemplo: (36.23)", "Alert", 0);
					correct=false;
				}
			}while(!correct);
	    	JOptionPane.showMessageDialog(null, "Resultado del calculo: "+result);
	    	System.out.println("Resultado del calculo: "+result);
			break;
		}
		
		//En caso de cerrar el programa sin escoger ninguna opcion se notifica al usuario
		default:
			JOptionPane.showMessageDialog(null, "Has cerrado el programa sin realizar ningun calculo");
			System.out.println("Has cerrado el programa sin realizar ningun calculo");
		}
	    
	}
	
	//Metodo para obtener area traingulo
	public static double getTriangleArea() {
		//Recoge los datos del JOptionPane recogida de datos de manera visual
		String base = JOptionPane.showInputDialog("Introduce la 'base' del triangulo");
    	String height = JOptionPane.showInputDialog("Introduce la 'altura' del triangulo");
    	
    	//Transforma el texto en un valor numerico
    	double baseNum = Double.parseDouble(base);
    	double heightNum = Double.parseDouble(height);
    	
    	//Devuelve el calculo directamente
    	return (baseNum*heightNum)/2;
	}
	
	//Metodo para obtener area circulo
	public static double getCircleArea() {
		//Recoge los datos del JOptionPane recogida de datos de manera visual
		String radio = JOptionPane.showInputDialog("Introduce el radio del círculo");
		
		//Transforma el texto en un valor numerico
		double radioNum = Double.parseDouble(radio);
        
		//Devuelve el calculo directamente
        return Math.PI * Math.pow(radioNum, 2);
    }

	//Metodo para obtener area cuadrado
    public static double getSquareArea() {
    	//Recoge los datos del JOptionPane recogida de datos de manera visual
    	String side = JOptionPane.showInputDialog("Introduce el lado del cuadrado");
    	
    	//Transforma el texto en un valor numerico
    	double sideNum = Double.parseDouble(side);
       
    	//Devuelve el calculo directamente
        return Math.pow(sideNum, 2);
    }

}
