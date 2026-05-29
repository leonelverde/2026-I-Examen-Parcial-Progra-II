
package modelo;

public class Cliente {
    private String RUC;
    private String razonSocial;
    private String email;
    private String contacto;
    private String telefono;
    private String clave;
    
    private Rubro rubro;
    private Oferta[] ofertas;
    
    public Cliente(String RUC, String razonSocial, String email, String contacto, String telefono, String clave){
        this.RUC = RUC;
        this.razonSocial = razonSocial;
        this.email = email;
        this.contacto = contacto;
        this.telefono = telefono;
        this.clave= clave;
    }
    
    public boolean agregarOferta(Oferta oferta){return false;}
    
    public boolean eliminarOferta(Oferta oferta){return false;}
    
    public Oferta[] getOFertas(){return null;}
}
