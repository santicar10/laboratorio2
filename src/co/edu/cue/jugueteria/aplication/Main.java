package co.edu.cue.jugueteria.aplication;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Emplado;
import co.edu.cue.jugueteria.model.Persona;

import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("santiago",1094889442,322528,"barrio la virginia","20 junio","santi@gmail.com");
        Cliente cliente[]= new Cliente[20];
        cliente[0]=cliente1;

        Emplado jefe = new Emplado("gerar",10000,3344,"castellon","3000 dls","3/abril/2020");
        Emplado empleado[] = new Emplado[5];
        empleado[0]=jefe;


        while (true){
            String opcion = JOptionPane.showInputDialog("usted es un empleado o un cliente ?  cliente =1/empleado=2 ");
            if(opcion.equals("1")){
                String opcionCuenta = JOptionPane.showInputDialog("ya tiene cuenta ? ");
                if (opcionCuenta.equals("si")) {
                    String clienteVer = "";
                    String verificaClien = JOptionPane.showInputDialog("ingrese su correo");
                    for (int i = 0;i<cliente.length ; i++){
                        if (verificaClien.equals(cliente[i].getMail())) {
                            clienteVer = verificaClien;
                        }
                        else break;
                    }
                }
                else if (opcionCuenta.equals("no")) {
                    String decision = JOptionPane.showInputDialog("desea crear una cuenta?");
                    int acum = 0;
                    if (decision.equals("si")){
                        acum++;
                        String nombre = JOptionPane.showInputDialog("ingrese su nombre");
                        int cedula = Integer.parseInt(JOptionPane.showInputDialog("ingrese su cedula"));
                        int telefono = Integer.parseInt(JOptionPane.showInputDialog("ingrese su telefono"));
                        String direccion = JOptionPane.showInputDialog("direccion");
                        String cumple = JOptionPane.showInputDialog("ingrese su fecha de nacimiento");
                        String mail = JOptionPane.showInputDialog("ingrese su correo");

                        Cliente clienteNew = new Cliente(nombre,cedula,telefono,direccion,cumple,mail);
                        cliente[acum]=clienteNew;

                    }
                    else break;
                }

            } else if (opcion.equals("2")) {
                String correoVeri = JOptionPane.showInputDialog("porfavor ingrese su cedula");
                String empleVer = "";
                for (int i = 0;i< empleado.length ; i++){
                    if (Objects.equals(correoVeri, String.valueOf(empleado[i].getCedula()))) {
                        empleVer = correoVeri;
                        int acum = 0;
                        String opcEmpleado = JOptionPane.showInputDialog("que accion desea realizar? "+"\n 1) agregar un nuevo empleado"+"\n 2) agregar un nuevo juguete"+"\n 3) editar un producto"+"\n 4) ver caracterizticas generales");
                        switch (opcEmpleado){
                            case "1":
                                acum++;
                                String nombre = JOptionPane.showInputDialog("ingrese su nombre");
                                int cedula = Integer.parseInt(JOptionPane.showInputDialog("ingrese su cedula"));
                                int telefono = Integer.parseInt(JOptionPane.showInputDialog("ingrese su telefono"));
                                String direccion = JOptionPane.showInputDialog("direccion");
                                String salario = JOptionPane.showInputDialog("ingrese su fecha de nacimiento");
                                String fecha = JOptionPane.showInputDialog("ingrese su correo");

                                Emplado empleadoNew = new Emplado(nombre,cedula,telefono,direccion,salario,fecha);
                                empleado[acum]=empleadoNew;
                            break;
                            case "2":

                            default:break;

                        }
                    }
                    else break;
                }


            }
            else {
                JOptionPane.showMessageDialog(null,"ingrese una opcion valida");
            }
        }

    }
}