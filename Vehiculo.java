/**
 * Superclase Vehiculo que deriva de la clase Coche
 * 
 * @author Javier Fernandez Rubio
 *
 */
public class Vehiculo {

	protected int num_serie;
	protected String fabricante;
	protected Color color;

	/**
	 * Constructor de la super clase
	 * 
	 */
	public Vehiculo() {
		super();
	}

	/**
	 * Getter de Color
	 * 
	 * @return
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Setter de Color
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Getter de Numero de Serie
	 * 
	 * @return
	 */
	public int getNum_serie() {
		return num_serie;
	}

	/**
	 * Setter de Numero de Serie
	 * 
	 * @param num_serie
	 */
	public void setNum_serie(int num_serie) {
		this.num_serie = num_serie;
	}

	/**
	 * Getter de Fabricante
	 * 
	 * @return
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * Setter de Fabricante
	 * 
	 * @param fabricante
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}