public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Carlos");
        estudiante.setEdad(20);
        estudiante.setMatricula("12345");
        estudiante.setCarrera("Ingeniería de Sistemas");

        System.out.println("ESTUDIANTE");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Matrícula: " + estudiante.getMatricula());
        System.out.println("Carrera: " + estudiante.getCarrera());

        System.out.println();

        Docente docente = new Docente();

        docente.setNombre("Pedro");
        docente.setEdad(35);
        docente.setMateria("Programación");

        System.out.println("DOCENTE");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("Materia: " + docente.getMateria());
    }
}