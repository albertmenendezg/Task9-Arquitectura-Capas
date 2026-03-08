package amg.digitechfp.ad.app;

import amg.digitechfp.ad.model.Libro;
import amg.digitechfp.ad.repository.LibroRepository;
import amg.digitechfp.ad.repository.jdbc.JdbcLibroRepository;
import amg.digitechfp.ad.service.LibroService;

public class CrudDemo {
    public static void main(String[] args) {
        LibroRepository repo = new JdbcLibroRepository();
        LibroService service = new LibroService(repo);

        System.out.println("=== LISTADO ===");
        service.listar().forEach(System.out::println);

        System.out.println("\n=== ALTA ===");
        Libro nuevo = new Libro("Clean Code", "9780132350884-X", 2008, true);
        int id = service.alta(nuevo);

        System.out.println("Creado: " + nuevo);

        System.out.println("\n=== MARCAR NO DISPONIBLE ===");
        service.marcarNoDisponible(id);
        System.out.println(service.verDetalle(id));

        System.out.println("\n=== BORRAR ===");
        service.borrar(id);
        System.out.println("Borrado OK");
    }
}
