 
package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import modelo.Jugador;
import modelo.TipoImagen;


public class FormInicio extends javax.swing.JFrame {

    public FormInicio() {
        init();
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
        panelFondo.requestFocus();  
        panelFondo.setOpaque(false);
        Border bordeBoton = BorderFactory.createLineBorder(new Color(243,211,246),2);
        panelBoton.setBorder(bordeBoton);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new modelo.PanelRedondeado();
        lblCierre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtJugador2 = new javax.swing.JTextField();
        txtJugador1 = new javax.swing.JTextField();
        panelBoton = new javax.swing.JPanel();
        lblInicar = new javax.swing.JLabel();
        imagen1 = new modelo.Imagen();
        imagen2 = new modelo.Imagen();
        imagen3 = new modelo.Imagen();
        imagen4 = new modelo.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(14, 19, 49));
        panelFondo.setPreferredSize(new java.awt.Dimension(416, 315));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
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
        jLabel1.setText("TIK TAC TOE");
        panelFondo.add(jLabel1);
        jLabel1.setBounds(0, 30, 420, 45);

        txtJugador2.setBackground(new java.awt.Color(249, 230, 254));
        txtJugador2.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador2.setForeground(new java.awt.Color(202, 105, 220));
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador2.setText("JUGADOR2");
        txtJugador2.setBorder(null);
        txtJugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador2FocusLost(evt);
            }
        });
        txtJugador2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador2MouseExited(evt);
            }
        });
        txtJugador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador2KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador2);
        txtJugador2.setBounds(100, 160, 230, 40);

        txtJugador1.setBackground(new java.awt.Color(214, 252, 249));
        txtJugador1.setFont(new java.awt.Font("Montserrat", 1, 28)); // NOI18N
        txtJugador1.setForeground(new java.awt.Color(101, 175, 245));
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("JUGADOR1");
        txtJugador1.setBorder(null);
        txtJugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtJugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtJugador1FocusLost(evt);
            }
        });
        txtJugador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtJugador1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtJugador1MouseExited(evt);
            }
        });
        txtJugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJugador1KeyTyped(evt);
            }
        });
        panelFondo.add(txtJugador1);
        txtJugador1.setBounds(100, 100, 230, 40);

        panelBoton.setBackground(new java.awt.Color(42, 22, 79));

        lblInicar.setFont(new java.awt.Font("Montserrat", 1, 20)); // NOI18N
        lblInicar.setForeground(new java.awt.Color(241, 227, 252));
        lblInicar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicar.setText("INICIAR");
        lblInicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonLayout = new javax.swing.GroupLayout(panelBoton);
        panelBoton.setLayout(panelBotonLayout);
        panelBotonLayout.setHorizontalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelBotonLayout.setVerticalGroup(
            panelBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelFondo.add(panelBoton);
        panelBoton.setBounds(130, 230, 160, 50);

        imagen1.setText("imagen1");
        imagen1.setRuta("/resources/Circulo.png");
        panelFondo.add(imagen1);
        imagen1.setBounds(340, 160, 40, 40);

        imagen2.setText("imagen1");
        imagen2.setRuta("/resources/JugadorEquis.png");
        panelFondo.add(imagen2);
        imagen2.setBounds(40, 100, 40, 40);

        imagen3.setText("imagen1");
        imagen3.setRuta("/resources/JugadorCirculo.png");
        panelFondo.add(imagen3);
        imagen3.setBounds(40, 160, 40, 40);

        imagen4.setText("imagen1");
        imagen4.setRuta("/resources/Equis.png");
        panelFondo.add(imagen4);
        imagen4.setBounds(340, 100, 40, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtJugador1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(52,136,235),2);
        txtJugador1.setBorder(borde);
    }//GEN-LAST:event_txtJugador1MouseEntered

    private void txtJugador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador1MouseExited
        txtJugador1.setBorder(null);
    }//GEN-LAST:event_txtJugador1MouseExited

    private void txtJugador2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseEntered
        Border borde = BorderFactory.createLineBorder(new Color(165,40,174),2);
        txtJugador2.setBorder(borde);
    }//GEN-LAST:event_txtJugador2MouseEntered

    private void txtJugador2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtJugador2MouseExited
        txtJugador2.setBorder(null);
    }//GEN-LAST:event_txtJugador2MouseExited

    private void txtJugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusGained
        if(txtJugador1.getText().equals("JUGADOR1"))
            txtJugador1.setText("");
    }//GEN-LAST:event_txtJugador1FocusGained

    private void txtJugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusGained
        if(txtJugador2.getText().equals("JUGADOR2"))
            txtJugador2.setText("");
    }//GEN-LAST:event_txtJugador2FocusGained

    private void txtJugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador1FocusLost
        if(txtJugador1.getText().equals(""))
            txtJugador1.setText("JUGADOR1");
    }//GEN-LAST:event_txtJugador1FocusLost

    private void txtJugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtJugador2FocusLost
        if(txtJugador2.getText().equals(""))
            txtJugador2.setText("JUGADOR2");
    }//GEN-LAST:event_txtJugador2FocusLost

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        panelFondo.requestFocus();
    }//GEN-LAST:event_panelFondoMousePressed

    private void txtJugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador1KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtJugador1.getText().length()>=8)
            evt.consume();
        
    }//GEN-LAST:event_txtJugador1KeyTyped

    private void txtJugador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJugador2KeyTyped
        char caracter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(caracter);
        if(txtJugador2.getText().length()>=8)
            evt.consume();  
    }//GEN-LAST:event_txtJugador2KeyTyped

    private void lblInicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMouseEntered
        panelBoton.setBackground(new Color(126,49,196));
    }//GEN-LAST:event_lblInicarMouseEntered

    private void lblInicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMouseExited
        panelBoton.setBackground(new Color(42,22,79));
    }//GEN-LAST:event_lblInicarMouseExited

    private void lblInicarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicarMousePressed
        this.dispose();
        
        Jugador jugador1 = new Jugador(TipoImagen.EQUIS);
        if(txtJugador1.getText().equals(""))
            jugador1.setNombre("JUGADOR1");
        else
            jugador1.setNombre(txtJugador1.getText());
        
        Jugador jugador2 = new Jugador(TipoImagen.CIRCULO);
        if(txtJugador2.getText().equals(""))
            jugador2.setNombre("JUGADOR2");
        else
            jugador2.setNombre(txtJugador2.getText());
        
        FormTikTacToe tikTacToe = new FormTikTacToe(jugador1,jugador2);
        tikTacToe.setVisible(true);
    }//GEN-LAST:event_lblInicarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.Imagen imagen1;
    private modelo.Imagen imagen2;
    private modelo.Imagen imagen3;
    private modelo.Imagen imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCierre;
    private javax.swing.JLabel lblInicar;
    private javax.swing.JPanel panelBoton;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables
}
