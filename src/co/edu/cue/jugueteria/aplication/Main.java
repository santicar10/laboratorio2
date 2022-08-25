package co.edu.cue.jugueteria.aplication;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Emplado;
import co.edu.cue.jugueteria.model.Juguete;

import javax.swing.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("santiago","1094889442","322528","barrio la virginia","20 junio","santi@gmail.com");
        Cliente cliente[]= new Cliente[20];
        cliente[0]=cliente1;

        Emplado jefe = new Emplado("gerar","10000","3344","castellon","3000 dls","3/abril/2020");
        Emplado empleado[] = new Emplado[5];
        empleado[0]=jefe;

        Juguete juguete1 = new Juguete("carro","plastico",35000,30);
        Juguete juguete[]= new Juguete[100];
        juguete[0] = juguete1;

        int contadorCli = 1;
        int contadorEmp = 1;
        int contadorJu = 1;
        int contadorPlas = 0;
        int contadorTela = 0;
        int contadorElec = 0;
        int acum=0;
        //recordarr para cuando se cree un juguete sumarle al comtador


        while (true){
            String opcion = JOptionPane.showInputDialog("usted es un empleado o un cliente ?  cliente =1/empleado=2 ");
            System.out.println(contadorCli);
            if(opcion.equals("1")){
                String opcionCuenta = JOptionPane.showInputDialog("ya tiene cuenta ? ");
                if (opcionCuenta.equals("si")) {
                    String verificaClien = JOptionPane.showInputDialog("ingrese su nombre");
                    for (int h=0; h < 20;h++){
                        if (verificaClien.equals(cliente[h].getNombre())){
                            int jugueteOpt = Integer.parseInt(JOptionPane.showInputDialog(mostrarArreglos(juguete,contadorJu)+"que producto desea adquirir? (la compra se realiza con el codigo)"));
                            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("cuantas cantidades desea llevar?\n"+"cantidades: "+juguete[jugueteOpt].getCantidad()));
                            String material = juguete[jugueteOpt].getMaterial();
                            JOptionPane.showMessageDialog(null,productoX(jugueteOpt,juguete,cantidad,verificaClien,empleado,contadorEmp,material));
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "el nombre no es valido por favor intente nuevamente");
                            break;
                        }
                    }
                }
                else if (opcionCuenta.equals("no")) {
                    Cliente cliente2 = new Cliente(JOptionPane.showInputDialog("ingrese su nombre"),JOptionPane.showInputDialog("ingrese su cedula"),JOptionPane.showInputDialog("ingrese su telefono"),JOptionPane.showInputDialog("direccion"),JOptionPane.showInputDialog("ingrese su fecha de nacimiento"),JOptionPane.showInputDialog("ingrese su correo"));
                    contadorCli++;
                    cliente[acum]=cliente2;
                }

            } else if (opcion.equals("2")) {
                String correoVeri = JOptionPane.showInputDialog("porfavor ingrese su cedula");
                String empleVer = "";
                for (int i = 0;i< contadorEmp ; i++){
                    if (correoVeri.equals(empleado[i].getCedula())) {
                        empleVer = correoVeri;
                        String opcEmpleado = JOptionPane.showInputDialog("que accion desea realizar? "+"\n 1) agregar un nuevo empleado"+"\n 2) agregar un nuevo juguete"+"\n 3) editar un producto"+"\n 4) ver caracterizticas generales");
                        switch (opcEmpleado){
                            case "1":
                                String nombre = JOptionPane.showInputDialog("ingrese su nombre");
                                String cedula = JOptionPane.showInputDialog("ingrese su cedula");
                                String telefono = JOptionPane.showInputDialog("ingrese su telefono");
                                String direccion = JOptionPane.showInputDialog("direccion");
                                String salario = JOptionPane.showInputDialog("ingrese su fecha de nacimiento");
                                String fecha = JOptionPane.showInputDialog("ingrese su correo");

                                Emplado empleadoNew = new Emplado(nombre,cedula,telefono,direccion,salario,fecha);
                                contadorEmp++;
                                empleado[acum]=empleadoNew;
                            break;
                            case "2":
                                String nombreJ = JOptionPane.showInputDialog("ingrese el nombre del juguete");
                                String materialJ = JOptionPane.showInputDialog("de que material sera el producto");
                                double precioJ = Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del producto"));
                                int cantidadJ = Integer.parseInt(JOptionPane.showInputDialog("que cantidad tendra el producto"));

                                Juguete jugueteNew = new Juguete(nombreJ,materialJ,precioJ,cantidadJ);
                                contadorJu++;
                                juguete[contadorJu]=jugueteNew;

                            break;
                            case "3":
                                String editor = JOptionPane.showInputDialog("ingrese el codigo del producto que desea editar?\n"+mostrarArreglos(juguete,contadorJu));
                                for (int k=0; k < contadorJu;k++) {
                                    if (editor.equals(juguete[k].getNombre())) {
                                        int newCant = Integer.parseInt(JOptionPane.showInputDialog("cuales seran las nuevas cantidades del producto?"+ editor));
                                        juguete[k].setCantidad(newCant);
                                    }
                                }
                            break;
                            case "4":
                                for (int k=0; k < contadorJu;k++){
                                    if ("plastico".equals(juguete[k].getMaterial())){
                                        contadorPlas++;
                                    }
                                    else if ("tela".equals(juguete[k].getMaterial())) {
                                        contadorTela++;
                                    }
                                    else{
                                        contadorElec++;
                                    }
                                }

                                int sumatoria = contadorTela+contadorElec+contadorPlas;
                                double valorTotal =0;
                                String mayor =null;
                                String menor =null;

                                for (int j = 0; j < contadorJu; j++) {
                                    valorTotal=valorTotal + juguete[j].getPrecio();
                                }

                                if (contadorTela>contadorElec && contadorTela>contadorPlas){
                                    mayor = "tela";
                                    if (contadorElec>contadorPlas){
                                        menor = "plastico";
                                    }
                                    else{
                                        menor = "electronico";
                                    }
                                }
                                else if (contadorElec>contadorPlas && contadorElec>contadorTela){
                                    mayor = "electronico";
                                    if (contadorTela>contadorPlas){
                                        menor = "plastico";
                                    }
                                    else{
                                        menor = "tela";
                                    }
                                }
                                else{
                                    mayor = "plastico";
                                    if (contadorElec>contadorTela){
                                        menor = "tela";
                                    }
                                    else{
                                        menor = "electronico";
                                    }
                                }

                                JOptionPane.showMessageDialog(null,"juguetes de plastico ahi: "+contadorPlas+"\n juguetes de tela ahi: "+contadorTela+"\njuguetes electrnicos ahi: "+contadorElec
                                 +"\nla cantidad total es de: "+sumatoria+"\nel valor total de todos los productos es de: "+valorTotal+"\n el que mayor existencias tiene es: "+mayor+"\n el que menor existencias tiene: "+menor);
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

    private static String mostrarArreglos(Juguete[] juguete, int contador) {
        String seleccion = null;
        for (int i = 0; i < contador; i++) {
            seleccion = "estos son los juguetes disponibles \n" + juguete[i].getNombre() + "\n " + juguete[i].getPrecio() + "\n" + juguete[i].getMaterial() + "\n " + juguete[i].getCantidad() + "codigo:"+(i)+"\n" + "-----------------\n";
        }
        return seleccion;
    }
    private static String productoX(int jugueteOpt, Juguete[] juguete, int cantidad, String verificaClien, Emplado[] empleado, int contador, String material) {
        String factura = JOptionPane.showInputDialog("el producto: " + juguete[jugueteOpt].getNombre() + ", tiene un valor: " + juguete[jugueteOpt].getPrecio() + "\ndesea adquirir el producto?");
        String comfirmacion = null;
        String materialUsado= null;
        int numero = (int)(Math.random()*contador);
        int numero1 = (int)(Math.random()*20+1);
        int numero2 = (int)(Math.random()*12+1);
        if (factura.equals("si")) {
            JOptionPane.showInputDialog("ingrese su targeta de credito");
            juguete[jugueteOpt].setCantidad(juguete[jugueteOpt].getCantidad() - cantidad);
            double precioFinal = juguete[jugueteOpt].getPrecio() * cantidad;
            switch (material){
                case "plastico": materialUsado="El juguete no requiere cuidados especiales"; break;
                case "tela": materialUsado="El juguete no debe ser mojado"; break;
                case "electrnico": materialUsado="El juguete no debe ser mojado y requiere baterías"; break;
            }
            comfirmacion = "     SU FACTURA ES: "+"\n producto adquirido: "+juguete[jugueteOpt].getNombre()+"\n precio final: " + precioFinal + "\n cliente: " + verificaClien+"\n empleado: "+empleado[numero].getNombre()+"\n la fecha de su compra es: "+numero1+"/"+numero2+"/2022"+"\n RECUERDE:  "+materialUsado;

        }
        return comfirmacion;
    }
}