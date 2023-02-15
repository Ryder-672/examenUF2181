
package libs;

/**
 * Examen de Javier Rider Jimenez
 * @author Ryder
 *
 */
public class Funciones {
	/**
	 * Funcion a la que se le pasan 3 numeros e indica el numero intermedio
	 * @param num1 primer numero
	 * @param num2 segundo numero
	 * @param num3 tercer numero
	 * @return devuelve el numero intermedio
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ((num1>=num2) && (num1<=num3) || (num1>=num3) && (num1<=num2)) {
			enMedio=num1;
		}  else if  ((num2>=num1) && (num2<=num3) || (num2>=num3) && (num2<=num1)) {
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	/**
	 * funcion que devuelve los minutos existentes entre 2 horas dadas
	 * 
	 * @param hora1 hora 1
	 * @param min1 minutos de la hora 1
	 * @param hora2 hora 2
	 * @param min2 minutos de la hora 2
	 * @exception ArithmeticException si tiene + de 24 horas salta una excepcion
	 * @exception ArithmeticException si son horas negaticas salta una excepcion
	 * @return devuelve el total de los minutos entre las 2 horas
	 */
	public int minutosEntre(int hora1, int min1, int hora2, int min2) {
		int resu =0;
		if  (hora1>24  || min1>60 ||hora2>24 || min2>60) {
			throw new ArithmeticException("un dia solo tiene 24horas y una hora solo tiene 60 minutos");
		}else if (hora1==hora2 && min1==min2)  {
			throw new ArithmeticException("inserte horas diferentes");
		}else {
			hora1 = hora1 *60;
			hora2 = hora2*60;
			min1 = hora1 + min1;
			min2 = hora2 + min2;
			if (min1>min2) {
				resu = min1 - min2;
			}else {
				resu = min2 - min1;
			}
			
		}

		return resu;
	}
	
	/**
	 * funcion que comprueba si un array de numeros dado es capicua o no
	 * @param v array de numeros
	 * @return true si es capicua o false si no lo es
	 */
	public  boolean esCapicua(int v[]) {
		boolean capicua = true;
		
		for (int i=0, j=v.length-1; i<v.length/2; i++,j--) {
			if (v[i]!=v[j]) {
				capicua=false;
			}
		}
		return capicua;
	}
	/**
	 * funcion que suma los valores entre 2 arrays, manteniendo la longitud del array
	 * @exception ArithmeticException lanza una excepcion si tienen los arrays diferentes logitudes
	 * @param v array1
	 * @param v2 array2
	 * @return devuelve un nuevo array con los valores sumados.
	 */
	public  int [] suma_vectores(int v[], int v2[]) {
		int vector_suma [] = new int[v.length];
		
		if (v.length!=v2.length) 
		   throw new ArithmeticException("Los vectores deben tener el mismo tama�o");
		
		for (int i = 0; i < vector_suma.length; i++) {
			vector_suma[i]=v[i]+v2[i];
		}
		return vector_suma;
	}
	
	
}
