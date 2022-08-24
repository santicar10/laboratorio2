package co.edu.cue.jugueteria.model;

public class Cliente extends Persona {

    private String cumple;
    private String mail;

    public Cliente(String nombre, int cedula, int telefono, String direcUbicacion, String cumple,String mail) {
        super(nombre, cedula, telefono, direcUbicacion);
        this.cumple=cumple;
        this.mail=mail;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
