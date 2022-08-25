package co.edu.cue.jugueteria.model;

public class Emplado extends Persona {

    private String salario;
    private String ingresoDate;

    public Emplado(String nombre, String cedula, String telefono, String direcUbicacion,String salario,String ingresoDate) {
        super(nombre, cedula, telefono, direcUbicacion);
        this.salario=salario;
        this.ingresoDate=ingresoDate;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getIngresoDate() {
        return ingresoDate;
    }

    public void setIngresoDate(String ingresoDate) {
        this.ingresoDate = ingresoDate;
    }
}
