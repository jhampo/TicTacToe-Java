
package vista;

import java.awt.Color;
import javax.swing.JLabel;
import modelo.Imagen;
import modelo.Jugador;
import modelo.Tablero;
import modelo.TipoImagen;

public class FormTikTacToe extends javax.swing.JFrame {
    
    public static Imagen imgJugadorEquis;
    public static Imagen imgJugadorCirculo;
    public static JLabel nombreJugadorEquis;
    public static JLabel nombreJugadorCirculo;
    public static JLabel puntajeEquis;
    public static JLabel puntajeCirculo;
    
    private Jugador jugador1;
    private Jugador jugador2;
    private Tablero tablero;
    
    public FormTikTacToe(Jugador jugador1,Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        init();
        imgJugadorEquis = jugadorEquis;
        imgJugadorCirculo = jugadorCirculo;
        nombreJugadorEquis = lblNombreJ1;
        nombreJugadorCirculo = lblNombreJ2;
        puntajeEquis = lblPuntajeJ1;
        puntajeCirculo = lblPuntajeJ2;
        tablero.cambiarEstilos(TipoImagen.EQUIS);
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelFondo.setOpaque(false);
        setBackground(new Color(0,0,0,0));
        
        lblNombreJ1.setText(jugador1.getNombre());
        lblNombreJ2.setText(jugador2.getNombre());
        
        tablero = new Tablero();
        tablero.setJugador1(jugador1);
        tablero.setJugador2(jugador2);
        tablero.setAlturaCI(100);
        tablero.setAnchoCI(100);
        tablero.setMargen(5);
        tablero.setColorCI(new Color(14,19,43));
        tablero.setColorTablero(new Color(239,180,255));
        tablero.setLocation(40,150);
        tablero.crearTablero();
        tablero.setVisible(true);
        
        panelFondo.add(tablero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jugadorCirculo = new modelo.Imagen();
        jugadorEquis = new modelo.Imagen();
        lblNombreJ2 = new javax.swing.JLabel();
        lblNombreJ1 = new javax.swing.JLabel();
        lblPuntajeJ2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPuntajeJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 43));
        panelFondo.setPreferredSize(new java.awt.Dimension(400, 500));
        panelFondo.setLayout(null);

        lblCierre.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        lblCierre.setForeground(new java.awt.Color(240, 192, 255));
        lblCierre.setText("X");
        lblCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCierreMouseExited(evt);
            }
        });
        panelFondo.add(lblCierre);
        lblCierre.setBounds(360, 10, 30, 30);

        jugadorCirculo.setText("imagen1");
        jugadorCirculo.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(jugadorCirculo);
        jugadorCirculo.setBounds(275, 50, 50, 50);

        jugadorEquis.setText("imagen1");
        jugadorEquis.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(jugadorEquis);
        jugadorEquis.setBounds(75, 50, 50, 50);

        lblNombreJ2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblNombreJ2.setForeground(new java.awt.Color(255, 200, 255));
        lblNombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ2.setText("NAME");
        panelFondo.add(lblNombreJ2);
        lblNombreJ2.setBounds(255, 100, 90, 30);

        lblNombreJ1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lblNombreJ1.setForeground(new java.awt.Color(180, 232, 255));
        lblNombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJ1.setText("NAME");
        panelFondo.add(lblNombreJ1);
        lblNombreJ1.setBounds(55, 100, 90, 30);

        lblPuntajeJ2.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblPuntajeJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ2.setText("0");
        panelFondo.add(lblPuntajeJ2);
        lblPuntajeJ2.setBounds(210, 50, 60, 60);

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        panelFondo.add(jLabel8);
        jLabel8.setBounds(190, 50, 20, 60);

        lblPuntajeJ1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lblPuntajeJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntajeJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntajeJ1.setText("0");
        panelFondo.add(lblPuntajeJ1);
        lblPuntajeJ1.setBounds(130, 50, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private modelo.Imagen jugadorCirculo;
    private modelo.Imagen jugadorEquis;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombreJ1;
    private javax.swing.JLabel lblNombreJ2;
    private javax.swing.JLabel lblPuntajeJ1;
    private javax.swing.JLabel lblPuntajeJ2;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
