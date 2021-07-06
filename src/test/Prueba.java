
package test;

import dominio.ManejoArchivos;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba {

    static private FileWriter archivo;
    static private PrintWriter salida;
    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            archivo = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\Archivos.txt");
            salida = new PrintWriter(archivo);
            ManejoArchivos[] personal;
        int m = 1;
        int edad;
        personal = new ManejoArchivos[m];
        boolean bandera = false;
        while (bandera == false) {
            System.out.println("----Menu---\n"
                    + "1.- Abrir /Crear Archivo\n"
                    + "2.- Insertar Datos\n"
                    + "3.- Leer Datos\n"
                    + "4.- Cerrar Archivo\n"
                    + "5.- Salir");
            salida.println("\"----Menu---\"\n" +
"                    + \"1.- Abrir /Crear Archivo\\n\"\n" +
"                    + \"2.- Insertar Datos\\n\"\n" +
"                    + \"3.- Leer Datos\\n\"\n" +
"                    + \"4.- Cerrar Archivo\\n\"\n" +
"                    + \"5.- Salir\"");
            System.out.println("Escoja una opcion ");
            salida.println("Escoja una opcion ");
            int n = datos.nextInt();
            salida.println(n);
            if (n == 1) {
                System.out.println("Abrir /Crear Archivo\n");
                salida.println("Abrir /Crear Archivo\n");
            }
            if (n == 2) {
                System.out.println("Insertar Datos\n");
                salida.println("Insertar Datos\n");
                IngresarDatos(personal);
            }
            if (n == 3) {
                System.out.println("Leer Datos\n");
                salida.println("Leer Datos\n");
                for(int i=0;i<personal.length;i++){
               edad=calcularEdad(personal[i].getDia(),personal[i].getMes(),personal[i].getAnio());
               System.out.println("Empelado No: "+(i+1));
               salida.println("Empleado No: "+(i+1));
               System.out.println("Nombre: "+ personal[i].getNombre()+"\n Nacio el "+personal[i].getDia()+"/"+ personal[i].getMes()+"/"+personal[i].getAnio());
               salida.println("Nombre: "+ personal[i].getNombre()+"\n Nacio el "+personal[i].getDia()+"/"+ personal[i].getMes()+"/"+personal[i].getAnio());
               System.out.println("Tiene: "+ edad+"años");
               salida.println("Tiene: "+ edad+"años");
               System.out.println("");
               salida.println();
               salida.flush();
           }
                for (int i = 0; i < personal.length; i++) {
                    System.out.println(personal[i]);
                    salida.println(personal[i]);
                    }
            }
            if (n == 4) {
                    System.out.println("Cerrar Archivo\n");
//                     if (nArchivo != null) {
//                        try {
//                            archivo.close();
//                        } catch (IOException ex) {
//                            Logger.getLogger(TestEmpleado.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                        System.out.println("");
//                        System.out.println("-- Archivo Cerrado ---");
//                        nArchivo = null;
//                    } else {
//                        System.out.println("");
//                        System.out.println("--- Nota: No existe ningun archivo abierto ---");
//                    }
                }
            if (n == 5) {
                System.out.println("");
                    System.out.println("--- Saliendo del programa ---");
                    System.out.println("");
                    bandera = true;
                }

        }
      }catch(IOException ex){
          Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    public static void IngresarDatos(ManejoArchivos per[]) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido;
        int anio, mes, dia;
        System.out.println("INGRESE EL NOMBRE DEL TRABAJADOR");
        salida.println("INGRESE EL NOMBRE DEL TRABAJADOR");
        nombre = entrada.nextLine();
        salida.println(nombre);
        System.out.println("INGRESE EL APELLIDO DEL TRABAJADOR");
        salida.println("INGRESE EL APELLIDO DEL TRABAJADOR");
        apellido = entrada.nextLine();
        salida.println(apellido);
        System.out.println("INGRESE EL AÑO DE NACIMIENTO DEL TRABAJADOR");
        salida.println("INGRESE EL AÑO DE NACIMIENTO DEL TRABAJADOR");
        anio = entrada.nextInt();
        salida.println(anio);
        System.out.println("INGRESE EL MES DE NACIMIENTO DEL TRABAJADOR");
        salida.println("INGRESE EL MES DE NACIMIENTO DEL TRABAJADOR");
        mes = entrada.nextInt();
        salida.println(mes);
        System.out.println("INGRESE EL DIA DE NACIMIENTO DEL TRABAJADOR");
        salida.println("INGRESE EL DIA DE NACIMIENTO DEL TRABAJADOR");
        dia = entrada.nextInt();
        salida.println(dia);
        per[0] = new ManejoArchivos(nombre, apellido, anio, mes, dia);
        datos.nextLine();

    }
    public static void CreacionA (){
    try{
       FileWriter archivo = null;
       String cadena ;
       Scanner datos =new Scanner (System.in);
       archivo = new FileWriter("C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\Archivos.txt");
       PrintWriter salida=new PrintWriter (archivo);
       System.out.println("se creo");
    }catch(IOException ex){
          Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
    }

}
   public static int calcularEdad(int dia,int mes,int anio){
    LocalDate fechaHoy=LocalDate.now();
    LocalDate fechaNacimiento=LocalDate.of(anio,mes,dia);
    Period periodo = Period.between(fechaNacimiento, fechaHoy);
    return periodo.getYears();

} 
}
     
    