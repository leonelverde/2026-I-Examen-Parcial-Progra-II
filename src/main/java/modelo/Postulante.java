
package modelo;

import java.util.Date;

public class Postulante {
    private String email;
    private String nombres;
    private String apellidos;
    private String direccion;
    private Date nacimiento;
    private String clave;
    
    private GradoEstudio gradoEstudio;
    private Postulacion[] postulaciones;
    private int contadorPostulaciones;
    
    public Postulante(String email, String nombres, String apellidos, String direccion, Date nacimiento, String clave){
        this.email = email;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.clave = clave;
        
        this.gradoEstudio = null;
        this.postulaciones = new Postulacion[50];
        this.contadorPostulaciones = 0;
    }
    
    public boolean asignarGradoEstudio(GradoEstudio grado){
        this.gradoEstudio = grado;
        return false;
    }
    
    public boolean postular(Oferta oferta){
        //Verificar si el arreglo no esta lleno
        if (this.contadorPostulaciones < this.postulaciones.length) {
            Postulacion nueva = new Postulacion(new Date(), oferta);
            this.postulaciones[this.contadorPostulaciones] = nueva;
            this.contadorPostulaciones++;
        }
        return false; //Arreglo lleno
    }
    
    public boolean anularPostulacion(Postulacion postulacion){
        for (int i = 0; i < this.contadorPostulaciones; i++) {
            if (this.postulaciones[i] == postulacion) {
                this.postulaciones[i].anular(); 
                return true;
            }
        }
        return false;
    }
    
    public Postulacion[] getPostulaciones(){return this.postulaciones;}
}
