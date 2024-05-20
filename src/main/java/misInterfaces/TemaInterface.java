package misInterfaces;

import java.util.ArrayList;
import modelo.Tema;

public interface TemaInterface extends CRUD<Tema>{
    public ArrayList<Tema> listarSinRepetir();
}
