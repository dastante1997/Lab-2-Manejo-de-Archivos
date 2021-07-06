package dominio;
public class ManejoArchivos {
    String nombre,apellido;
    int anio,mes,dia;

    
    public ManejoArchivos (String nombre,String apellido, int anio,int mes,int dia) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.anio = anio;
        this.mes = mes;
        this.dia=dia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
     @Override //esto me permite imprimir
    public String toString(){
        return "El Nombre es "+this.nombre+" "+this.apellido+"\nFecha de nacimientos es "+this.anio+"/"+this.mes+"/"+this.dia;
}
    
}