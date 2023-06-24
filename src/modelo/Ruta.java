
package modelo;

public class Ruta {
    public static final String EQUIS = "/resources/Equis.png";
    public static final String CIRCULO = "/resources/Circulo.png";
    public static final String JUGADOREQUIS = "/resources/JugadorEquis.png";
    public static final String JUGADORCIRCULO = "/resources/JugadorCirculo.png";
    public static final String JUGADORAUXILLAR = "/resources/JugadorAuxillar.png";
    
    public static String LINEA1 = "/resources/CirculoLinea1.png";
    public static String LINEA2 = "/resources/CirculoLinea2.png";
    public static String LINEA3 = "/resources/CirculoLinea3.png";
    public static String LINEA4 = "/resources/CirculoLinea4.png";
    public static String LINEA5 = "/resources/CirculoLinea5.png";
    public static String LINEA6 = "/resources/CirculoLinea6.png";
    public static String LINEA7 = "/resources/CirculoLinea7.png";
    public static String LINEA8 = "/resources/CirculoLinea8.png";
    
    public static void cambiarRutas(TipoImagen tipoImagen){
        if(tipoImagen==TipoImagen.CIRCULO){
           LINEA1 = "/resources/CirculoLinea1.png";
           LINEA2 = "/resources/CirculoLinea2.png";
           LINEA3 = "/resources/CirculoLinea3.png";
           LINEA4 = "/resources/CirculoLinea4.png";
           LINEA5 = "/resources/CirculoLinea5.png";
           LINEA6 = "/resources/CirculoLinea6.png";
           LINEA7 = "/resources/CirculoLinea7.png";
           LINEA8 = "/resources/CirculoLinea8.png";
        }
        else if(tipoImagen==TipoImagen.EQUIS){
            LINEA1 = "/resources/EquisLinea1.png";
           LINEA2 = "/resources/EquisLinea2.png";
           LINEA3 = "/resources/EquisLinea3.png";
           LINEA4 = "/resources/EquisLinea4.png";
           LINEA5 = "/resources/EquisLinea5.png";
           LINEA6 = "/resources/EquisLinea6.png";
           LINEA7 = "/resources/EquisLinea7.png";
           LINEA8 = "/resources/EquisLinea8.png";
        }
    }
}
