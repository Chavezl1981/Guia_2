/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author arLuChavez
 */
public class Libro {
    private String ISBN, Titulo, Autor;
    private int numpag;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, int numpag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numpag = numpag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }
    
    public void cargarLibro (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número ISBN");
       this.ISBN = sc.nextLine();
        
        System.out.println("Ingrese el título del libro");
        this.Titulo = sc.nextLine();
        
        System.out.println("Ingrese el nombre del Autor");
        this.Autor = sc.nextLine();
        
        System.out.println("Ingrese la cantidad de páginas que posee el libro");
        this.numpag = sc.nextInt(); 
    
    }
    
    public void Mostrar (){
        System.out.println("El número ISBN es: "+this.ISBN);
        System.out.println("El título de su libro es: "+this.Titulo);
        System.out.println("El autor es: "+this.Autor);
        System.out.println("Su libro tiene "+this.numpag+" páginas");
    }

}
