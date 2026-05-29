
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
    private int contadorOfertas;
    
    public Cliente(String RUC, String razonSocial, String email, String contacto, String telefono, String clave){
        this.RUC = RUC;
        this.razonSocial = razonSocial;
        this.email = email;
        this.contacto = contacto;
        this.telefono = telefono;
        this.clave= clave;
        
        this.rubro = null;
        this.ofertas = new Oferta[20];
        this.contadorOfertas = 0;
    }
    
    public boolean agregarOferta(Oferta oferta){
        if (this.contadorOfertas < this.ofertas.length) {
            this.ofertas[this.contadorOfertas] = oferta;
            this.contadorOfertas++;
            return true;
        }
        return false;
    }
    
    public boolean eliminarOferta(Oferta oferta){
        //Algoritmo de eliminacion con desplazamiento
        for (int i = 0; i < this.contadorOfertas; i++) {
            if (this.ofertas[i] == oferta) {
                for (int j = i; j < this.contadorOfertas - 1; j++) {
                    this.ofertas[j] = this.ofertas[j + 1];
                }
                this.ofertas[this.contadorOfertas - 1] = null;
                this.contadorOfertas--;
                return true;
            }
        }
        return false;
    }
    
    public Oferta[] getOfertas(){return this.ofertas;}
}
