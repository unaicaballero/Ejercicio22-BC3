import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerProductos {
    public static void main(String[] args) {

        System.out.println("Leyendo productos desde productos.txt:\n");

        try (BufferedReader reader = new BufferedReader(new FileReader("productos.txt"))) {

            String linea;

            while ((linea = reader.readLine()) != null) {

                String[] partes = linea.split(",");

                String nombre = partes[0];
                double precio = Double.parseDouble(partes[1]);

                System.out.println("Producto: " + nombre + " , Precio: " + precio );
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
