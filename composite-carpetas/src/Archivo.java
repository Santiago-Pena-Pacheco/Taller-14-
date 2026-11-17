public class Archivo implements Elemento {
    private String nombre;
    private int tamanoKB;

    public Archivo(String nombre, int tamanoKB) {
        this.nombre = nombre;
        this.tamanoKB = tamanoKB;
    }

    @Override 
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamaño() {
        return tamanoKB;
    }

    @Override 
    public String mostrar(String x){
        return "";
    }
}
