/* Model */
struct Doctor{
 	1: string clave,
 	2: string nombre,
 	3: string direccion,
 	4: string especialidad,
 	5: string telefono,
 	6: string foto
}

struct AnalisisClinico{
    1: string clave,
    2: string tipo,
    3: string descripcion
}

struct Atiende{
    1: string claveDoctor,
    2: string clavePaciente,
    3: string fecha,
    4: string tratamiento,
    5: string diagnostico,
    6: string fotoDoctor,
    7: string fotoPaciente
}

struct Paciente{
    1: string clave,
    2: string nombre,
    3: string direccion,
    4: string telefono,
    5: string foto
}

struct SeRealiza{
    1: string claveAnalisis,
    2: string clavePaciente,
    3: string fechaAplic,
    4: string fechaEntrega,
    5: string fotoPaciente
}

/* Reportes */
struct ReporteAnalisisPaciente{
    1: string clavePaciente,
    2: string claveAnalisis,
    3: string fechaAplic,
    4: string nombrePaciente,
    5: string fechaEntrega,
    6: string tipo,
    7: string descripcion,
    8: string fotoPaciente
}

struct ReporteDoctoresPaciente{
    1: string clavePaciente,
    2: string claveDoctor,
    3: string nombrePaciente,
    4: string nombreDoctor,
    5: string tratamiento,
    6: string diagnostico,
    7: string fecha,
    8: string fotoDoctor,
    9: string fotoPaciente
}

struct ReportePacientesAnalisis{
    1: string clavePaciente,
    2: string claveAnalisis,
    3: string fechaAplic,
    4: string nombrePaciente,
    5: string fechaEntrega,
    6: string tipo,
    7: string descripcion,
    8: string fotoPaciente
}

struct ReportePacientesDoctor{
    1: string clavePaciente,
    2: string claveDoctor,
    3: string nombrePaciente,
    4: string nombreDoctor,
    5: string tratamiento,
    6: string diagnostico,
    7: string fecha,
    8: string fotoDoctor,
    9: string fotoPaciente
}

/* Methods */
service Actions{
    //Actualizar
    bool actualizarAnalisis(1: AnalisisClinico analisis),
    bool actualizarDoctor(1: Doctor doctor),
    bool actualizarPaciente(1: Paciente paciente),

    //Borrar
    bool borrarAnalisis(1: string claveAnalisis),
    bool borrarDoctor(1: string claveDoctor),
    bool borrarPaciente(1: string clavePaciente),

    //Capturar
    bool capturarAnalisis(1: AnalisisClinico analisis),
    bool capturarDoctor(1: Doctor doctor),
    bool capturarPaciente(1: Paciente paciente),
    bool capturarAtiende(1: Atiende atiende),
    bool capturarSeRealiza(1: SeRealiza seRealiza),

    //Consultas Generales
    list<AnalisisClinico> consultarAnalisis(),
    list<Atiende> consultarAtiende(),
    list<Doctor> consultarDoctores(),
    list<Paciente> consultarPacientes(),
    list<SeRealiza> consultarSeRealiza(),

    //Consultas por Clave
    AnalisisClinico consultarAnalisisClave(1: string clave),
    Paciente consultarPacienteClave(1: string clave),
    Doctor consultarDoctorClave(1: string clave),

    //Consultas Tipo/Especialidad
    list<AnalisisClinico> consultarAnalisisTipo(1: string tipo),
    list<Doctor> consultarDoctoresEspecialidad(1: string especialidad),

    //Reportes
    list<ReporteAnalisisPaciente> generarReporteAnalisisPaciente(1: string clavePaciente),
    list<ReportePacientesAnalisis> generarReportePacientesAnalisis(1: string claveAnalisis),
    list<ReporteDoctoresPaciente> generarReporteDoctoresPaciente(1: string clavePaciente),
    list<ReportePacientesDoctor> generarReportePacientesDoctor(1: string claveDoctor),

    //Consultas auxiliares
    list<string> consultarEspecialidades()
}