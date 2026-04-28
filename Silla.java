public class Silla extends Mueble{
    private int cantidadPatas;
    
    public Silla(String nombre, String marca, int codigo, String color, int altura, int ancho, int cantidadPatas){
        super(nombre,marca,codigo,color,altura,ancho);
        this.cantidadPatas = cantidadPatas;
    }

    public int getcantidadPatas(){
        return cantidadPatas;
    }
    public void setCantidadPatas(int cantidadPatas){
        this.cantidadPatas = cantidadPatas;
    }

    public void MostrarAtributos(){
        System.out.println("La silla pertenece a " + {this.marca} + ", su color es "+ {this.color} +" y tiene " + {this.cantidadPatas}+ "patas." );
    }
}