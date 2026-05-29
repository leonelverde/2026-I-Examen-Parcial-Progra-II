
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
        
        this.requisitos = new Requisito[15];
        this.contadorRequisitos = 0;
    }
    
    public boolean agregarRequisito(int orden, String descripcion){
        // Verificar si el arreglo no esta lleno
        if(this.contadorRequisitos < this.requisitos.length){
            Requisito nuevoReq = new Requisito(orden, descripcion);
            this.requisitos[this.contadorRequisitos] = nuevoReq;
            this.contadorRequisitos++;
            return true;
        }
        
        return false; //Arreglo lleno
    }
    
    public boolean eliminarRequisito(int orden){
        //Algoritmo de eliminacion con desplazamiento
        for(int i = 0; i < this.contadorRequisitos; i++){
            if(this.requisitos[i].getOrden() == orden){
                //Desplazar elementos hacia la izquierda
                for(int j = i; j < this.contadorRequisitos - 1; j++){
                    this.requisitos[j] = this.requisitos[j+1];
                }
                this.requisitos[this.contadorRequisitos - 1] = null;
                this.contadorRequisitos--;
               return true;
            }
        }
        return false; 
    }
        
    public Requisito[] getRequisitos(){return this.requisitos;}
    
}
