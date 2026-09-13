public class Estudiante extends Persona {
    
    private String matricula;
    private String carrera;

    public Estudiante() {
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }
}