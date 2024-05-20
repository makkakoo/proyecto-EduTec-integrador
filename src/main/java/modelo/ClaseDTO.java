package modelo;

public class ClaseDTO {
    private String cod_clase;
    private String estado;
    private String fecha;
    private Aula aula;
    private Tema tema;
    private Horario horario;
    private Persona persona;
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public String getCod_clase() {
        return cod_clase;
    }

    public void setCod_clase(String cod_clase) {
        this.cod_clase = cod_clase;
    }
}
