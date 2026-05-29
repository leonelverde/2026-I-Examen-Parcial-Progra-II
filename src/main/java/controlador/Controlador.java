package controlador;

import modelo.Cliente;
import modelo.Oferta;
import modelo.Postulante;

public class Controlador {
    private Cliente[] clientesRegistrados;
    private int contadorClientes;
    
    private Postulante[] postulantesRegistrados;
    private int contadorPostulantes;

    public Controlador() {
        this.clientesRegistrados = new Cliente[100];
        this.contadorClientes = 0;
        
        this.postulantesRegistrados = new Postulante[200];
        this.contadorPostulantes = 0;
    }

    public boolean registrarCliente(Cliente nuevoCliente) {
        if (contadorClientes < clientesRegistrados.length) {
            clientesRegistrados[contadorClientes] = nuevoCliente;
            contadorClientes++;
            return true;
        }
        return false;
    }

    public boolean registrarPostulante(Postulante nuevoPostulante) {
        if (contadorPostulantes < postulantesRegistrados.length) {
            postulantesRegistrados[contadorPostulantes] = nuevoPostulante;
            contadorPostulantes++;
            return true;
        }
        return false;
    }

    public boolean publicarOferta(Cliente cliente, Oferta nuevaOferta) {
        if (cliente != null && nuevaOferta != null) {
            return cliente.agregarOferta(nuevaOferta);
        }
        return false;
    }

    public boolean procesarPostulacion(Postulante postulante, Oferta ofertaDeseada) {
        if (postulante != null && ofertaDeseada != null) {
            return postulante.postular(ofertaDeseada);
        }
        return false;
    }

    // --- MÉTODO DE ARRANQUE MVC ---
    public void iniciar(javax.swing.JFrame ventana) {
        ventana.setTitle("Sistema de Reclutamiento TI - UNMSM");
        ventana.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        ventana.setVisible(true); // Muestra la interfaz
    }
}