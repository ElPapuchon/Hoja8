import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
/**
 * 
 */

/**
 * @author jiio2
 *15/05/2021 - 22:51:06
 * 
 */
class HeapTest {
	  Heap datos = new Heap();
	    public HeapTest() {
	        Scanner myReader = new Scanner("Juan Perez, fractura de pierna, C\n" +
	"Lorenzo Toledo, chikunguya, E\n" +
	"Carmen Sarmientos, dolores de parto, B");
	                                 while (myReader.hasNextLine()) {
	                                     String data = myReader.nextLine();
	                                     String[] clave = data.split(",");
	                                     datos.add(new Paciente(clave[0],clave[1],clave[2].trim().charAt(0)));
	    }
	    }
	    @BeforeClass
	    public static void setUpClass() {
	    }
	    
	    @AfterClass
	    public static void tearDownClass() {
	    }
	    
	    @Before
	    public void setUp() {
	    }
	    
	    @After
	    public void tearDown() {
	    }
	    
	    @Test
	    public void testAdd(){// porbamos el método add
	        datos.add(new Paciente("Juan Perez", "fractura de cadera", 'A'));
	        assertEquals(((Paciente) datos.getFirst()).getCode(), 'A');
	    }
	    
	    @Test
	    public void testOrden(){ // probamos el méotodp ara ordenar 
	        assertEquals(((Paciente) datos.remove()).getCode()< ((Paciente) datos.remove()).getCode(), true);
	    }


}

