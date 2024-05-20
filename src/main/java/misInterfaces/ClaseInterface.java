
package misInterfaces;

import java.util.ArrayList;
import modelo.ClaseDTO;

public interface ClaseInterface extends CRUD<ClaseDTO>{
    public ArrayList<ClaseDTO> listarporFiltros(String aula_amnbiente, String fecha, int id_hora, int tema_id_tema, String persona_dni);
}
