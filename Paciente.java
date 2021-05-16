

// TODO: Auto-generated Javadoc
/**
 * The Class Paciente.
 */

/**
 * @author jiio2
 *14/05/2021 - 16:36:13
 * 
 */
public class Paciente implements Comparable{
	
	/** The nombre. */
	private String nombre;
	
	/** The descripcion. */
	private String descripcion;
	
	/** The code. */
	private char code;
	
	/**
	 * Instantiates a new paciente.
	 *
	 * @param nombre the nombre
	 * @param descripcion the descripcion
	 * @param code the code
	 */
	public Paciente(String nombre, String descripcion, char code) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.code = code;
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public char getCode() {
		return code;
	}
	
	/**
	 * Sets the code.
	 *
	 * @param code the code to set
	 */
	public void setCode(char code) {
		this.code = code;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return getNombre() + "," + getDescripcion() + ", " + getCode();
	}
	
	/**
	 * Compare to.
	 *
	 * @param miau the miau
	 * @return the int
	 */
	@Override // este método es el que nos permite ordenar los pacientes, haciendo uso de la interfaz Comparable
	public int compareTo(Object miau) {
		// TODO Auto-generated method stub
		
		Paciente miau1 = (Paciente) miau;
		
		return this.code - miau1.getCode();
	}

}
