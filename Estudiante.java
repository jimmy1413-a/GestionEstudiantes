

public class Estudiante
{
    String nombre,apellido,nMeroEstudiante;
    int edad;
    
    
     public Estudiante(String nombre, String apellido, int edad, String nMeroEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nMeroEstudiante = nMeroEstudiante;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getNmeroEstudiante(){
        return nMeroEstudiante;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setNmeroEstudiante(String nMeroEstudiante){
        this.nMeroEstudiante = nMeroEstudiante;
    }
    
    public void setNombre(int edad){
        this.edad = edad;
    }
    
    
    public String getInfo() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Número de Estudiante: " + nMeroEstudiante;
    }

    
    public String getNumeroEstudiante() {
        return nMeroEstudiante;
    }
}

