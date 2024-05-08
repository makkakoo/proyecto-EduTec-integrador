package modelo;

public class ClaseDTO {
    private String estado;
    private String fecha;
    private String cod_aula;
    private Tema tema;
    private Horario horario;

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

    public String getCod_aula() {
        return cod_aula;
    }

    public void setCod_aula(String cod_aula) {
        this.cod_aula = cod_aula;
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
}
