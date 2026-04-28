public abstract class Mueble {
    private String nombre;
    private String marca;
    private int codigo;
    private String color;
    private int altura;
    private int ancho;

    public Mueble(String nombre, String marca, int codigo, String color, int altura, int ancho){
        this.nombre = nombre;
        this.marca = marca;
        this.codigo = codigo;
        this.color = color;
        this.altura = altura;
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getColor() {
        return color;
    }

   public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setMarca(String marca) {
        this.marca=marca;
    }

    public void setCodigo(int codigo) {
       this.codigo=codigo;
    }

    public void setColor(String color) {
        this.color=color;
    }



}