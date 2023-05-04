/*
 a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
 que tiene la frase ingresada.
 b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
 por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
 asac".
 c) Método vecesRepetido(String letra), recibirá un carácter ingresado
 por el usuario y contabilizar cuántas veces se repite el carácter en la
 frase, por ejemplo:
 d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
 veces.
 e) Método compararLongitud(String frase), deberá comparar la longitud
 de la frase que compone la clase con otra nueva frase ingresada por
 el usuario.
 f) Método unirFrases(String frase), deberá unir la frase contenida en la
 clase Cadena con una nueva frase ingresada por el usuario y mostrar
 la frase resultante.
 g) Método reemplazar(String letra), deberá reemplazar todas las letras
 “a” que se encuentren en la frase, por algún otro carácter
 seleccionado por el usuario y mostrar la frase resultante.
 h) Método contiene(String letra), deberá comprobar si la frase contiene
 una letra que ingresa el usuario y devuelve verdadero si la contiene y
 falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class CadenaServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    /*
     a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
     que tiene la frase ingresada.
     */
    public Cadena crearFrase() {
        System.out.println("Ingrese una frase");
        String frase = input.nextLine();
        Cadena c = new Cadena(frase);
        System.out.println("");
        return c;

    }

    public void mostrarVocales(Cadena c) {
        int contador = 0;
        String frase = c.getFrase();
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase("a") || frase.substring(i, i + 1).equalsIgnoreCase("e") || frase.substring(i, i + 1).equalsIgnoreCase("i") || frase.substring(i, i + 1).equalsIgnoreCase("o") || frase.substring(i, i + 1).equalsIgnoreCase("u")) {
                contador++;
            }

        }
        System.out.println("La cantidad de vocales de su frase son: " + contador);
        System.out.println("");
    }

    /*
     b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
     por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
     asac".
     */
    public void invertirFrase(Cadena c) {
        StringBuilder sb = new StringBuilder(c.getFrase());
        System.out.println("La frase ingresada invertida es: " + sb.reverse());
        System.out.println("");
    }

    /*
     c) Método vecesRepetido(String letra), recibirá un carácter ingresado
     por el usuario y contabilizar cuántas veces se repite el carácter en la
     frase, por ejemplo:
     d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
     veces.
     */
    public void vecesRepetido(Cadena c) {
        System.out.println("Ingrese la vocal que caracter quiere buscar");
        String caracter = input.next();
        int contador = 0;
        String frase = c.getFrase();
        //for (int i = 0; i < frase.lenght(); i++) 
        for (int i = 0; i < c.getLongitud(); i++) {
            if (frase.substring(i, i + 1).equalsIgnoreCase(caracter)) {
                contador++;
            }

        }
        System.out.println("Su caracter se repite " + contador + " veces.");
    }

    /*
     e) Método compararLongitud(String frase), deberá comparar la longitud
     de la frase que compone la clase con otra nueva frase ingresada por
     el usuario.
     */
    public void compararLongitud(Cadena c, String frase) {

        if (frase.length() > c.getLongitud()) {
            System.out.println("Su nueva frase es mas larga que la primera.");
        } else if (frase.length() < c.getLongitud()) {
            System.out.println("Su nueva frase es mas corta que la primera.");
        } else {
            System.out.println("Las dos frases tienen la misma longitud.");
        }
    }

    /*
     f) Método unirFrases(String frase), deberá unir la frase contenida en la
     clase Cadena con una nueva frase ingresada por el usuario y mostrar
     la frase resultante.
     */
    public void unirFrases(Cadena c, String frase) {
        System.out.println(c.getFrase().concat(" " + frase));

    }

    /*
     g) Método reemplazar(String letra), deberá reemplazar todas las letras
     “a” que se encuentren en la frase, por algún otro carácter
     seleccionado por el usuario y mostrar la frase resultante.
     */
    public void reemplazar(Cadena c) {
        System.out.println("Ingrese un caracter para reemplazar la letra 'a'");
        String caracter = input.next();
        String frase = c.getFrase().replace("a", caracter);
        System.out.println("su nueva frase es: " + frase);
    }

    /*
     h) Método contiene(String letra), deberá comprobar si la frase contiene
     una letra que ingresa el usuario y devuelve verdadero si la contiene y
     falso si no.
     */
    public boolean contiene(Cadena c) {
        System.out.println("Que letra desea buscar?");
        String caracter = input.next();
        return c.getFrase().contains(caracter);

    }

}
