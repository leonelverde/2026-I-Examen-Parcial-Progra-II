
package modelo;

public class Rubro {
    private String nombre;
    private boolean estado;
    
    public Rubro(String nombre) {
        this.nombre = nombre;
        this.estado = true;
    }
    
    public boolean habilitar(){return false;}
    
    public boolean deshabilitar(){return false;}
}
