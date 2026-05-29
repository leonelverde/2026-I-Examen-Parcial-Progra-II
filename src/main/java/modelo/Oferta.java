
package modelo;

import java.util.Date;

public class Oferta {
    private String puesto;
    private String descripcion;
    private String area;
    private Date fechaInicio;
    private Date fechaTermino;
    
    private Requisito[] requisitos;
    private int contadorRequisitos;
    
    public Oferta(String puesto, String descripcion, String area, Date fechaInicio, Date fechaTermino){
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        
        this.requisitos = new Requisito[20];
        this.contadorRequisitos = 0;
    }
    
    public boolean agregarRequisito(int orden, String descripcion){return false;}
    
    public Requisito[] getRequisitos(){return null;}
    
    public boolean eliminarRequisito(int orden){return false;}
}
