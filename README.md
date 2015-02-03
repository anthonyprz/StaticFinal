# StaticFinal

Static------
      Un atributo de una clase se puede modificar con la palabra reservada static para indicar que este atributo no pertenece a las instancias de la clase si no a la propia clase, esto quiere decir que si tenemos varias instancias de una misma clase, cada una de ellas no tendrán una copia propia de ese atributo, si no que todas estas instancias compartirán una misma copia del atributo, a los atributos definidos como static, se les suele llamar atributos de la clase.

Final------ 
      Cuando necesitamos que el valor de un atributo no cambie durante el transcurso de nuestro programa, debemos utilizar el modificador final en su definición.
      
      
      al compilar 
      
metodo statico<><><><><><>
para acceder a un atributo static, no necesitamos crear una instancia de la clase, 
ya que podemos acceder a ellos mediante el nombre de la clase

metodo final<><><><><><>
Cuando necesitamos que el valor de un atributo no cambie durante el transcurso de nuestro programa, 
debemos utilizar el modificador final en su definición

metodo final y statico<><><><><><>
Definiendo un atributo como public, static y final, obtenemos una constante que podrá ser accedida desde cualquier clase (public), 
el acceso se podrá realizar sin tener que instanciar la clase mediante el nombre de la clase (static) 
y su valor no podrá ser modificado en ningún momento (final).

