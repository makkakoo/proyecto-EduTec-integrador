package modelo;

public class ReservaDTO {
    private int codigo;
    private Persona persona; //El tipo de dato es un objeto de la clase Alumno para poder acceder a sus atributos (nombre,apellido,ect)
    private ClaseDTO clase; 

    
    
    public ClaseDTO getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(ClaseDTO clase) {
        this.clase = clase;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
