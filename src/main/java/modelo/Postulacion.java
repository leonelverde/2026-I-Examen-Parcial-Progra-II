
package modelo;

import java.util.Date;

public class Postulacion {
    private Date fecha;
    private boolean anulado;
    private Date fechaAnulacion;
    
    private Oferta oferta;
    
    public Postulacion(Date fecha, Oferta oferta){
        this.fecha = fecha;
        this.anulado = false;
        this.fechaAnulacion = null;
        this.oferta = oferta;
    }
    
    public void anular(){
        this.anulado = true;
        this.fechaAnulacion = new Date();
    }
}
