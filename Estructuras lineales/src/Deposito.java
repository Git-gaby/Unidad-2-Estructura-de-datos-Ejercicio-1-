import java.util.Scanner;
import java.util.Stack;

class Contenedor {

    private String codigo;
    private String descripcion;
    private String area;
    private double peso;
    private String estado;

    public Contenedor(String codigo,
                      String descripcion,
                      String area,
                      double peso) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.area = area;
        this.peso = peso;
        this.estado = "Almacenado";
    }

    public void retirar() {
        estado = "Retirado";
    }

    @Override
    public String toString() {
        return codigo + " - " +
                descripcion + " - " +
                area + " - " +
                peso + " kg - " +
                estado;
    }
}

public class Deposito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Contenedor> almacenados = new Stack<>();
        Stack<Contenedor> retirados = new Stack<>();

        int opcion;

        do {

            System.out.println("\n===== DEPOSITO DE CONTENEDORES =====");
            System.out.println("1. Registrar contenedor");
            System.out.println("2. Consultar disponible");
            System.out.println("3. Retirar contenedor");
            System.out.println("4. Mostrar almacenados");
            System.out.println("5. Mostrar retirados");
            System.out.println("6. Cantidad almacenada");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();

                    System.out.print("Área: ");
                    String area = sc.nextLine();

                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    almacenados.push(
                            new Contenedor(
                                    codigo,
                                    descripcion,
                                    area,
                                    peso));

                    System.out.println("Contenedor registrado.");
                    break;

                case 2:

                    if (almacenados.isEmpty()) {

                        System.out.println(
                                "No hay contenedores almacenados.");

                    } else {

                        System.out.println(
                                almacenados.peek());
                    }

                    break;

                case 3:

                    if (almacenados.isEmpty()) {

                        System.out.println(
                                "El depósito está vacío.");

                    } else {

                        Contenedor c = almacenados.pop();

                        c.retirar();

                        retirados.push(c);

                        System.out.println(
                                "Contenedor retirado:");
                        System.out.println(c);
                    }

                    break;

                case 4:

                    if (almacenados.isEmpty()) {

                        System.out.println(
                                "No hay contenedores almacenados.");

                    } else {

                        System.out.println(
                                "\nCONTENEDORES ALMACENADOS:");

                        for (Contenedor c : almacenados) {
                            System.out.println(c);
                        }
                    }

                    break;

                case 5:

                    if (retirados.isEmpty()) {

                        System.out.println(
                                "No existen contenedores retirados.");

                    } else {

                        System.out.println(
                                "\nCONTENEDORES RETIRADOS:");

                        for (Contenedor c : retirados) {
                            System.out.println(c);
                        }
                    }

                    break;

                case 6:

                    System.out.println(
                            "Cantidad almacenada: "
                                    + almacenados.size());

                    break;

                case 0:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}