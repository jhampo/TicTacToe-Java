 
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.Ruta;
import modelo.Tablero;
import modelo.TipoImagen;


public class FormResultado extends javax.swing.JFrame {

    private Tablero tablero;
    private TipoImagen jugadorGanador;
    
    public FormResultado(TipoImagen jugadorGanador,Tablero tablero) {
        init();
        this.tablero = tablero;
        this.jugadorGanador = jugadorGanador;
        if(jugadorGanador==TipoImagen.EQUIS){
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
            imgDerecha.setRuta(Ruta.EQUIS);
            lblNombre.setText(FormTikTacToe.nombreJugadorEquis.getText());
        }
        else if(jugadorGanador==TipoImagen.CIRCULO){
            imgIzquierda.setRuta(Ruta.JUGADORCIRCULO);
            imgDerecha.setRuta(Ruta.CIRCULO);
            lblNombre.setText(FormTikTacToe.nombreJugadorCirculo.getText());
        }
        else if(jugadorGanador==TipoImagen.EMPATE){
            imgIzquierda.setRuta(Ruta.JUGADOREQUIS);
            imgDerecha.setRuta(Ruta.JUGADORCIRCULO);
            lblNombre.setText("EMPATE");
        }
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus();  
        panelFondo.setOpaque(false);
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgIzquierda = new modelo.Imagen();
        imgDerecha = new modelo.Imagen();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 49));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
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
        lblCierre.setBounds(380, 10, 30, 30);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 251, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VICTORIA");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(0, 30, 420, 45);

        imgIzquierda.setText("imagen1");
        imgIzquierda.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(imgIzquierda);
        imgIzquierda.setBounds(70, 100, 40, 40);

        imgDerecha.setText("imagen1");
        imgDerecha.setRuta("/resources/Equis.png");
        panelFondo.add(imgDerecha);
        imgDerecha.setBounds(310, 100, 40, 40);

        lblNombre.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(241, 227, 252));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("NOMBRE");
        lblNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelFondo.add(lblNombre);
        lblNombre.setBounds(0, 90, 420, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseClicked
        dispose();
        tablero.reiniciarTablero(jugadorGanador);
    }//GEN-LAST:event_lblCierreMouseClicked

    private void lblCierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseEntered
        lblCierre.setForeground(Color.RED);
    }//GEN-LAST:event_lblCierreMouseEntered

    private void lblCierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCierreMouseExited
        lblCierre.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lblCierreMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imgDerecha;
    private modelo.Imagen imgIzquierda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
