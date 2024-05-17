package misInterfaces;

import java.util.ArrayList;
import modelo.Horario;

public interface HorarioInterface extends CRUD<Horario>{
    public ArrayList<Horario> listarHorarioPorFecha(String fecha);
}
