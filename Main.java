
import java.io.File;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.PriorityQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
/**
 * @author jiio2
 *15/05/2021 - 02:33:32
 * 
 */
public class Main {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String args[]){
    	// definimos las opciones que puede escoger el usuario
		 Object[] options = {"JFC Priority Queu", "Vector Heap", "Salir"};
		 
		 int accion = 0;
		 while(accion != 2) {
		// le preguntamos al usuario qué tipo de acción quiere realizar 	 
		 int opcion = JOptionPane.showOptionDialog(null,
				 "¿Qué opción desea escoger?",// preguntamos la acción
				 "Opciones",
				 JOptionPane.YES_NO_CANCEL_OPTION,
				 JOptionPane.QUESTION_MESSAGE,
				 null,
				 options,
				 options[0]);
		    /**
		     * PARA USAR PRIORITY QUEU
		     */
		 if(opcion == 0) { PriorityQueue datos = new PriorityQueue(); //instanciamos un objeto de tipo PriorityQueu
	        // Leemos el archivo de texto e imprimimos los datos ordenados 
	        try {
	      File myObj = new File("ListaPacientes.txt");
	      Scanner myReader = new Scanner(myObj);
	      System.out.println("\nSe ha utilizado el JCF Priority Queu \n");
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        String[] clave = data.split(","); // separamos los datos por coams
	        
	        datos.add(new Paciente(clave[0],clave[1],clave[2].trim().charAt(0))); //agregamos los datos
	      }
	      myReader.close();
	      // si el archivo no se encuentra lo notificamos
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	        while(!datos.isEmpty()){
	            System.out.println(datos.remove().toString()); // mostramos los datos con el formato de la hoja 
	        	}
		 }
		 
		    /**
		     * PARA USAR VECTOR HEAP
		     */
		 else if (opcion == 1) {Heap datos = new Heap(); //instanciamos un objeto de tipo Heap
	        // Leemos el archivo de texto e imprimimos los datos ordenados 
	        try {
	      File myObj = new File("ListaPacientes.txt");
	      Scanner myReader = new Scanner(myObj);
	      System.out.println("\nSe ha utilizado el Vector Heap \n");
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        String[] clave = data.split(",");// separamos los datos por comas 
	        
	        datos.add(new Paciente(clave[0],clave[1],clave[2].trim().charAt(0))); // agregamos los datos 
	      }
	      myReader.close();
	      // si el archivo no se encuentra lo notificamos
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	        while(!datos.isEmpty()){
	            System.out.println(datos.remove().toString());// mostramos los datos con el formato de la hoja 
	        	}
		 
		 }
		 
		 else {accion = 2;}
        

		 }
		 
    }
}