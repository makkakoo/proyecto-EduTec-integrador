package misInterfaces;

import java.util.ArrayList;
import modelo.Aula;

public interface AulaInterface extends CRUD<Aula>{
    public ArrayList<Aula> listarAulaPorFecha(String fecha);
}
