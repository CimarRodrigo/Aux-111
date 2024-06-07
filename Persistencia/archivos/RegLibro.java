package archivos;

import java.io.Serializable;
import java.util.Scanner;

public class RegLibro implements Serializable{
    private String cod;
    private String titulo;
    private double precio;

    public void leer(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nIngrese Codigo de libro");
        this.cod = input.nextLine();
        System.out.println("Ingrese titulo de libro");
        this.titulo = input.nextLine();
        System.out.println("Ingrese precio del libro");
        this.precio = input.nextDouble();

    }

    public void Mostrar(){
        System.out.println("\nCodigo: " + this.cod);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Precio: " + this.precio);
    }

    public String getCod(){
        return this.cod;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public double getPrecio(){
        return this.precio;
    }
}
