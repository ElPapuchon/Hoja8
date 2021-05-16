/*
 * 
 */
import java.util.Vector;

// TODO: Auto-generated Javadoc
/**
 * The Class Heap.
 *
 * @param <T> the generic type
 */

/**
 * @author jiio2
 *14/05/2021 - 19:49:24
 *Implementamos la interfaz y extendemos de la clase Comparable
 * 
 */
public class Heap<T extends Comparable<T>> implements PriorityQueu<T> {
	
	/** The datos. */ // este es el vector donde almacenamos los datos
	Vector<T> datos;

	/**
	 * Instantiates a new heap.
	 */
	public Heap() { // tenemos un constructor

		datos = new Vector<T>();
	}
	
	/**
	 * Instantiates a new heap.
	 *
	 * @param datos the datos
	 */
	public Heap(Vector<T> datos){ // el constructor del vector del tamaño de los datos que necesitiamos 
		
		int i;
		
		this.datos = new Vector<T>(datos.size());
		
		for(i = 0; i < datos.size(); i++) {
			
			add(datos.get(i));
		}
		
	}
	
	/**
	 * Nodo padre.
	 *
	 * @param valor the valor
	 * @return the int
	 */
	public static int NodoPadre(int valor) { // definimos un método nodo padre, que regresa el índice de dicho nodo
		
		return (valor - 1)/2;
	}
	
	/**
	 * Nodo derecho.
	 *
	 * @param valor the valor
	 * @return the int
	 */
	public static int NodoDerecho(int valor) { // definimos un método nodo derecho que nos regresa el índice de ese nodo
		
		return 2*(valor + 1);
	}
	
	/**
	 * Nodo izquierdo.
	 *
	 * @param valor the valor
	 * @return the int
	 */
	public static int NodoIzquierdo(int valor) {// definimos un método nodo izquierdo que nos regresa el índice de ese nodo
		
		return 2*valor + 1;
	}



	/**
	 * Adds the.
	 *
	 * @param valor the valor
	 */
	@Override
	public void add(T valor) { // definimos el método add
		// TODO Auto-generated method stub
		
		datos.add(valor);
		Subir(datos.size() - 1);
		
	}
	
	/**
	 * Subir.
	 *
	 * @param hoja the hoja
	 */
	public void Subir(int hoja) { // el método subir (para poder ordenar las cosas)
		
		int NodoPadre = NodoPadre(hoja);
		
		T valor = datos.get(hoja);
		
		while(hoja > 0 && (valor.compareTo(datos.get(NodoPadre)) < 0)) {
			
			datos.set(hoja, datos.get(NodoPadre));
			
			hoja = NodoPadre;
			
			NodoPadre = NodoPadre(hoja);
		}
		
		datos.set(hoja, valor);
	}
	
	/**
	 * Bajar ala raiz.
	 *
	 * @param raiz the raiz
	 */
	public void bajarAlaRaiz(int raiz) { // el método bajar raíz para poder ordenar las cosas 
		
		int size = datos.size();
		
		T valor = datos.get(raiz);
		
		while(raiz < size) {
			
			int posicionhijo = NodoIzquierdo(raiz);
			
			if (posicionhijo < size)
			{
				if ((NodoDerecho(raiz) < size) &&
				((datos.get(posicionhijo+1)).compareTo
				(datos.get(posicionhijo)) < 0))
				{
					posicionhijo++;
				}
			// Assert: childpos indexes smaller of two children
			if ((datos.get(posicionhijo)).compareTo
				(valor) < 0)
			{
				datos.set(raiz,datos.get(posicionhijo));
				raiz = posicionhijo; // keep moving down
			} else { // found right location
				datos.set(raiz,valor);
				return;
			}
			} else { // at a leaf! insert and halt
				datos.set(raiz,valor);
				return;
			}
		}			
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	@Override
	public int size() { // el método size
		// TODO Auto-generated method stub
		return datos.size();
	}



	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	@Override
	public boolean isEmpty() { /// el método es vacío 
		// TODO Auto-generated method stub
		return datos.isEmpty();
	}

	/**
	 * Removes the.
	 *
	 * @return the t
	 */
	@Override
	public T remove() { // el método remover 
		// TODO Auto-generated method stub
		T minimo = getFirst();
		
		datos.set(0,  datos.get(datos.size() - 1));
		datos.setSize(datos.size() - 1);
		
		if(datos.size() > 1) {
			bajarAlaRaiz(0);
		}
		
		return minimo;
	}

	/**
	 * Gets the first.
	 *
	 * @return the first
	 */
	@Override
	public T getFirst() { // el método obtener el primero 
		// TODO Auto-generated method stub
		if(!this.isEmpty()) {
			return datos.firstElement();
		}else {
			return null;
		}
	}
	

}
