
package misInterfaces;

import java.util.ArrayList;
import modelo.Persona;

public interface PersonaInterface{
    public Persona validarLogueo(String codRecepcionista, String contraRecepcionista);
    public boolean agregar(Persona p);
    public boolean eliminar(String codigo);
    public boolean modificar(Persona p);
    public ArrayList<Persona> listarTodos(int tipo);
    public Persona listarUno(String codigo);
    public ArrayList<Persona> listarSinRepetir();
    
}
