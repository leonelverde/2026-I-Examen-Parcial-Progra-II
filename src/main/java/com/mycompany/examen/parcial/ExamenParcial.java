package com.mycompany.examen.parcial;

import controlador.Controlador;
import vista.VistaPrincipal;

public class ExamenParcial {

    public static void main(String[] args) {
        // 1. Creamos la ventana (Vista)
        VistaPrincipal ventana = new VistaPrincipal();
        
        // 2. Creamos el Controlador
        Controlador ctrl = new Controlador();
        
        // 3. Le decimos al controlador que inicie pasándole la ventana
        ctrl.iniciar(ventana);
    }
}