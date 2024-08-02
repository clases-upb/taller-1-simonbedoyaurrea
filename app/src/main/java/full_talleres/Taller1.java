/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    
    public static String Convertir_km_seg(int velocidad) {
        try {
            String resultado_conversion = "";
            double metrosxsegundo = 0;
            double metrosxhora = 0;
            final double tasa_metros_segundo = 1000;
            final double tasa_metros_hora = 3600000;

            metrosxsegundo = velocidad * tasa_metros_segundo;
            metrosxhora = velocidad * tasa_metros_hora;

            resultado_conversion = metrosxsegundo + " m/s - " + metrosxhora + " m/h.";

            return resultado_conversion;
        }
        catch (Exception e) {
            return "Error en la conversion";
        }

    }

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
  
     public static float Convertir_cm_lt(double cc) {
        try {
            float conversion_litro = 0;
            final int tasa_litro = 1000;

            conversion_litro = (float) cc / tasa_litro;

            return conversion_litro;
        }
        catch (Exception e) {
            return 0;
        }
    }

  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   
   public static int Convertir_us_cops(int dolares) {
        try {
            int pesos = 0;
            int TRM = 4170;

            pesos = dolares * TRM;

            return pesos;

        }
        catch (Exception e) {
            return -1;
        }
    } 
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */

   public static double Convertir_cent_far(double centigrados) {
        try {
            double grados_fahrenheit = 0;
            double conversion = 32 + (9 * centigrados / 5);

            grados_fahrenheit = conversion;

            return grados_fahrenheit;

        }
        catch (Exception e) {
            return 0;
        }
    }       

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */

   public static int Calcular_segs(short dias, short horas, short minutos, short segundos) {
        try {
            int total = (dias * 24 * 60 * 60) + (horas * 60 * 60) + (minutos * 60) + (segundos);
            return total;
        }
        catch (Exception e) {
            return -1;
        }
    }

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga(float peso_total, float peso_vacio) {
        try {
            float peso_neto_toneladas = 0;
            float peso_neto_kilogramos = 0;
            String peso_neto = "";
            int tasa_kilogramos = 1000;

            peso_neto_toneladas = peso_total - peso_vacio;
            peso_neto_kilogramos = peso_neto_toneladas * tasa_kilogramos;

            peso_neto = peso_neto_kilogramos + " kilos - " + peso_neto_toneladas + " toneladas";

            return peso_neto;

        }
        catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
        }

    }

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */

  public static float Calcular_horasxviaje(String destino, short distancia, short velocidad) {
        try {
            float horas = 0;
            horas = (float) (distancia / velocidad);

            return horas;
        }
        catch (Exception e) {
            return -1;
        }
    }
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

  public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4) {
        try {
            float combustible_total = 0;
            final int numero_rutas = 4;
            final double combustible_gastado_despegue = 1.2;
            final double combustible_gastado_aterrizaje = 0.4;
            final double combustiblexkm = 0.2 / 60.8;
            int kilometraje_recorrido = ruta1 + ruta2 + ruta3 + ruta4;

            double combustible_despegue_aterrizaje_total = numero_rutas*(combustible_gastado_aterrizaje + combustible_gastado_despegue);
            double combustible_rutas = combustiblexkm * kilometraje_recorrido;

            combustible_total = (float) (combustible_rutas + combustible_despegue_aterrizaje_total);

            return combustible_total;
        }
        catch (Exception e) {
            return -1;
        }
    } 
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
   
 public static double Calcular_peso_luna(byte peso_tierra_kilos) {
        try {
            double gravedad_tierra = 9.81;
            double factor_peso_luna = 0.16500000000000002;

            double peso_tierra_new = peso_tierra_kilos * gravedad_tierra;
            double peso_luna_new = peso_tierra_new * factor_peso_luna;

            return peso_luna_new;

        }
        catch (Exception e) {
            return 0;
        }

    }  
   
}
