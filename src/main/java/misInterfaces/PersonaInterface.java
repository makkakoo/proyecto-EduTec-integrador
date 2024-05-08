
package misInterfaces;

import modelo.Persona;

public interface PersonaInterface extends CRUD<Persona>{
    public Persona validarLogueo(String codRecepcionista, String contraRecepcionista);
    
}
