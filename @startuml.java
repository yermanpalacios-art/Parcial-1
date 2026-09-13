@startuml

class Paciente {
  - idPaciente : String
  - nombre : String
  - fechaNacimiento : Date
  - telefono : String
  + agendarCita(fecha : Date) : boolean
  + consultarHistorial() : HistorialClinico
}

class Medico {
  - idMedico : String
  - nombre : String
  - especialidad : String
  - colegiatura : String
  + atenderCita(cita : Cita) : void
  + prescribirTratamiento(tratamiento : Tratamiento) : void
}

class Cita {
  - idCita : String
  - fechaHora : Date
  - motivo : String
  - estado : String
  + confirmarCita() : void
  + cancelarCita() : void
}

class HistorialClinico {
  - idHistorial : String
  - fechaCreacion : Date
  - grupoSanguineo : String
  - alergias : String
  + agregarEntrada(diagnostico : String) : void
  + obtenerResumen() : String
}

class Tratamiento {
  - idTratamiento : String
  - descripcion : String
  - duracionDias : int
  - costo : double
  + iniciarTratamiento() : void
  + finalizarTratamiento() : void
}

class Receta {
  - idReceta : String
  - medicamentos : String
  - indicaciones : String
  - fechaEmision : Date
  + generarOrden() : String
  + validarVigencia() : boolean
}

class Habitacion {
  - numeroHabitacion : int
  - tipo : String
  - piso : int
  - ocupada : boolean
  + asignarPaciente(idPaciente : String) : void
  + liberarHabitacion() : void
}

Paciente "1" -- "*" Cita
Paciente "1" -- "1" HistorialClinico
Paciente "0..1" -- "0..1" Habitacion

Medico "1" -- "*" Cita
Medico "1" -- "*" Receta

Cita "1" -- "*" Tratamiento
Cita "0..1" -- "1" Receta

@enduml