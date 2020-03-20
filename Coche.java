/**
 * Clase Coche
 * 
 * @author Javier Fernandez Rubio
 */
/*Refactorización
Extrae una superclase Vehículo con los campos
	num_serie
	fabricante
	color
y los métodos
	getNum_serie(), setNum_serie()
	getFabricante(), setFabricante()
	getColor(), setColor()*/
enum Color {
	ROJO, AZUL, VERDE, AMARILLO, NARANJA
};

public class Coche extends Vehiculo {
	private int cilindrada;
	protected Coche(int num_serie, int cilindrada, String fabricante, Color color) {
		this.num_serie = num_serie;
		this.cilindrada = cilindrada;
		this.fabricante = fabricante;
		this.color = color;
	}
	
	
	/**
	 * Metodo getCilidrada que te devuelve el valor de cilindrada
	 * 
	 * @return cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Metodo setter de Cilindrada para modificar el valor de cilindrada
	 * 
	 * @param cilindrada
	 */

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
