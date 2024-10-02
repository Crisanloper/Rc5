import java.util.Scanner;// Se importa java.util

public class Codigo5 {

	    Scanner s = new Scanner(System.in);// Se agrega (System.in)
	    System.out.print("Introduzca un número: ");
	    String input = s.nextLine();
	    int ni = Integer.parseInt(input);//convirtiendo String a numero entero
	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito =ni % 10;
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }// se cierra else
		  ni /= 10;
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");//Se corrige print 
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    s.close(); //Se cierra scanner
	  }
	  
	}