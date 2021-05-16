// TODO: Auto-generated Javadoc
/**
 * The Interface PriorityQueu.
 *
 * @param <T> the generic type
 */

/**
 * @author jiio2
 *14/05/2021 - 17:17:49
 * 
 */
public interface PriorityQueu<T extends Comparable<T>> {
	
	/**
	 * Gets the first.
	 *
	 * @return the first
	 */
	public T getFirst();

	/**
	 * Adds the.
	 *
	 * @param valor the valor
	 */
	public void add(T valor);
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size();
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Removes the.
	 *
	 * @return the t
	 */
	public T remove();

}
