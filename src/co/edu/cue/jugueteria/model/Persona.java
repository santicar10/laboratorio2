package co.edu.cue.jugueteria.model;

public class Persona {

    private String nombre;
    private String cedula;
    private String telefono;
     private String direcUbicacion;

    public Persona(String nombre, String cedula, String telefono, String direcUbicacion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direcUbicacion = direcUbicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirecUbicacion() {
        return direcUbicacion;
    }

    public void setDirecUbicacion(String direcUbicacion) {
        this.direcUbicacion = direcUbicacion;
    }
}
