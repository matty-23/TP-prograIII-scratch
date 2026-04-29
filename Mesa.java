public class Mesa extends Mueble{
    private int cantidadPatas;
    

    public Mesa(String nombre, String marca, int codigo, String color, int altura, int ancho,Madera madera, int cantidadPatas){
        super(nombre,marca,codigo,color,altura,ancho,madera);
        this.cantidadPatas = cantidadPatas;
    }

    public int getcantidadPatas(){
        return cantidadPatas;
    }
    public void setCantidadPatas(int cantidadPatas){
        this.cantidadPatas = cantidadPatas;
    }

    public void MostrarAtributos(){
        System.out.println("La mesa pertenece a " + getMarca()+ ", su color es "+ getColor() +" y tiene " + getcantidadPatas()+ "patas." );
        System.out.println("El tiempo de vida util que le queda a la mesa es " + getMadera().tiempoRestante());
}
}