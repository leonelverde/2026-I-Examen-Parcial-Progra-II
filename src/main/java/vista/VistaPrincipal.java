package vista;

import controlador.Controlador;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class VistaPrincipal extends javax.swing.JFrame {
    
    // Corregido al nombre exacto de la clase
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());
    
    private Controlador controlador;

    public VistaPrincipal() {
        initComponents(); 
        
        this.controlador = new Controlador();
        
        // Ya no ponemos setTitle ni setLocation aquí, el Controlador se encarga.
        construirMenuRapido();
    }
    
    private void construirMenuRapido() {
        JPanel panelMenu = new JPanel(new GridLayout(5, 1, 10, 10));
        panelMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JButton btnEmpresa = new JButton("1. Registrar Empresa");
        JButton btnOferta = new JButton("2. Publicar Oferta");
        JButton btnCandidato = new JButton("3. Registrar Candidato");
        JButton btnPostular = new JButton("4. Aplicar a Oferta");
        JButton btnSalir = new JButton("5. Salir");
        
        btnEmpresa.addActionListener(e -> JOptionPane.showMessageDialog(this, "[Módulo en construcción: Registro de Empresa]\nControlador conectado correctamente."));
        btnOferta.addActionListener(e -> JOptionPane.showMessageDialog(this, "[Módulo en construcción: Publicar Oferta]"));
        btnCandidato.addActionListener(e -> JOptionPane.showMessageDialog(this, "[Módulo en construcción: Registrar Candidato]"));
        btnPostular.addActionListener(e -> JOptionPane.showMessageDialog(this, "[Módulo en construcción: Postulación]"));
        btnSalir.addActionListener(e -> System.exit(0));
        
        panelMenu.add(btnEmpresa);
        panelMenu.add(btnOferta);
        panelMenu.add(btnCandidato);
        panelMenu.add(btnPostular);
        panelMenu.add(btnSalir);
        
        this.setContentPane(panelMenu);
        this.setSize(350, 400); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* --- ARRANQUE MVC CORREGIDO --- */
        java.awt.EventQueue.invokeLater(() -> {
            VistaPrincipal ventana = new VistaPrincipal();
            Controlador ctrl = new Controlador();
            
            // El controlador toma el mando y arranca la vista
            ctrl.iniciar(ventana); 
        });
    }
}