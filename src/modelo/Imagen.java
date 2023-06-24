
package modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Imagen extends JLabel{
    private String ruta = "";

    @Override
    protected void paintComponent(Graphics gg) {
        Graphics2D g = (Graphics2D)gg;
        URL rutaAbsoluta =  getClass().getResource(ruta);
        
        if(rutaAbsoluta!=null){
            ImageIcon imagen = new ImageIcon(rutaAbsoluta);
            g.drawImage(imagen.getImage(),0,0,this.getWidth(),this.getHeight(),null);
        }
        g.dispose();
    }

    
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
