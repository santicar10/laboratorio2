package co.edu.cue.jugueteria.model;

public class Persona {

    private String nombre;
    private int cedula;
    private int telefono;
     private String direcUbicacion;

    public Persona(String nombre, int cedula, int telefono, String direcUbicacion) {
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDirecUbicacion() {
        return direcUbicacion;
    }

    public void setDirecUbicacion(String direcUbicacion) {
        this.direcUbicacion = direcUbicacion;
    }
}
