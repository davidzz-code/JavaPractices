/**
 *  CLASES ENVOLTORIO PARA TIPOS PRIMITIVOS
 */
package ClaseVarios;
public class ClasesEnvoltorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Podemos procesar una cadena de caracteres
		//para obtener un valor int
		int x = Integer.parseInt("12345");		
		System.out.println(x);
				
		//Podemos obtener el maximo entre dos enteros
		System.out.println(Integer.max(x, 12346));
		
		//Podemos obtener la representacion binaria, 
		//hexadecimal u octal de un numero entero
		System.out.println(Integer.toBinaryString(x));
		
		//Podemos obtener instancias de cualquier tipo con los metodos valueOf(...).
		Long l = Long.valueOf("34597623495729346");
		Double d = Double.valueOf(3.141592);
		System.out.println(l);
		System.out.println(d);
		
		//Podemos saber si un caracter es una letra o un numero
		char c = 'a';
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isDigit(c));
		
		//Podemos realizar operaciones logicas con valores booleanos
		System.out.println(Boolean.logicalXor(true, true));
	}
}