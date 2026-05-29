
package modelo;

public class Requisito {
    private int orden;
    private String descripcion;
    private boolean estado;
    
    public Requisito(int orden, String descripcion){
        this.orden = orden;
        this.descripcion = descripcion;
        this.estado = true;
    }
    
    public boolean habilitar(){return false;}
    
    public boolean deshabilitar(){return false;}
}
