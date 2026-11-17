import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Elemento {
    private String nombre;
    private List<Elemento> elementos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Elemento e) {
        elementos.add(e);
    }

    @Override 
    public String getNombre(){
        return nombre;
    }

    @Override 
    public int getTamaño() {
        int total = 0;
        for (Elemento e : elementos) {
            total += e.getTamaño();
        }
        return total;
    }

    @Override 
    public String mostrar(String sangria) {
        System.out.println(sangria + "[" + nombre + "] " + getTamaño() + " KB");
        for (Elemento e : elementos) {
            System.out.println(sangria + "   " + e.getNombre() + " " + e.getTamaño() + " KB");
            e.mostrar(sangria+=" ");
        }
        return "";
    }
}
