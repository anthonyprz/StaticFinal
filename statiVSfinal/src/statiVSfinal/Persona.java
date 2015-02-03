package statiVSfinal;

public class Persona {

	public static int numPersonas;
	
	public static void setNumPersonas (int numpersonas){
		numPersonas = numpersonas;
	}
	public static int getNumPersonas(){
		return numPersonas;
	}
	public Persona(){
		numPersonas++;
	}
	//para acceder a un atributo static, no necesitamos crear una 
	//instancia de la clase, ya que podemos acceder a ellos mediante
	//el nombre de la clase
	public static  void comentario(){
		System.out.println("para acceder a un atributo static, no necesitamos crear una"
				+ " instancia de la clase, " +"\n"+ "ya que podemos acceder a ellos mediante"
				+ " el nombre de la clase");
	}
	
	//a diferencia de un metodo statico, un metodo final debe instanciarse para poder
	//ser utilizado
	public final void incambiable(){
		System.out.println("Cuando necesitamos que el valor de un atributo no "
				+ "cambie durante el transcurso de nuestro programa, "+ "\n"
				+ "debemos utilizar el modificador final en su definición");
	}
	public static final void staticoIncambiable(){
		System.out.println("Definiendo un atributo como public, static y final, "
				+ "obtenemos una constante que podrá ser accedida desde cualquier clase (public), " +"\n"+
				 "el acceso se podrá realizar sin tener que instanciar la clase mediante el nombre de la clase (static) "
				+"\n"
				+ "y su valor no podrá ser modificado en ningún momento (final).");
	}
}
