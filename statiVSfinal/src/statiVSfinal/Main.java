package statiVSfinal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//estas instancias no estan siendo utilizadas
		    Persona p1 = new Persona();//si esta siendo utilizada
	        Persona p2 = new Persona();
	        Persona p3 = new Persona();
	        
	        System.out.println("numero de instancias creadas de la clase Persona: "+Persona.getNumPersonas());
	        //accedemos  a un metodo statico sin utilizar un objeto (instancia) creado de clase persona
	        System.out.println("\nmetodo statico---------");
	        Persona.comentario();
	        
	        System.out.println("\nmetodo final---------");
	        //accedemos  a un metodo final utilizando un objeto de la clase Persona
	        p1.incambiable(); 
	        
	        System.out.println("\nmetodo final y statico---------");
	        //accedemos  a un metodo final statico sin utilizar un objeto (instancia) creado de clase persona
	        Persona.staticoIncambiable();
	}

}
