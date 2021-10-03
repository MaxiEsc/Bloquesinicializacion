
package domain;

//Existen los bloques Staticos y los bloques no staticos 
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static{
        //ejecucion la primera vez de carga en memoria por clase
        System.out.println("Ejecucion del bloque de inicializacion estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; no se puede inicializar en un bloque Statico por que no se podra asignar a nada
        }
    
    {
        System.out.println("Ejecucion de bloque no estatico o contexto dinamico");
        this.idPersona = Persona.contadorPersonas++;
        //ejecucion de creacion de objeto por clase
    }
    
    public Persona(){
        System.out.println("Ejecucion de constructor");
        
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
        
}
