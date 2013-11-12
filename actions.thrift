/* Model */
struct thrift.Doctor{
 	1: string clave,
 	2: string nombre,
 	3: string direccion,
 	4: string especialidad,
 	5: string telefono,
 	6: string foto
}

struct thrift.AnalisisClinico{
    1: string clave,
    2: string tipo,
    3: string descripcion
}

struct thrift.Atiende{
    1: string claveDoctor,
    2: string clavePaciente,
    3: string fecha,
    4: string tratamiento,
    5: string diagnostico,
    6: string fotoDoctor,
    7: string fotoPaciente
}

struct thrift.Paciente{
    1: string clave,
    2: string nombre,
    3: string direccion,
    4: string telefono,
    5: string foto
}

struct thrift.SeRealiza{
    1: string claveAnalisis,
    2: string clavePaciente,
    3: string fechaAplic,
    4: string fechaEntrega,
    5: string fotoPaciente
}

/* Reportes */
struct thrift.ReporteAnalisisPaciente{
    1: string clavePaciente,
    2: string claveAnalisis,
    3: string fechaAplic,
    4: string nombrePaciente,
    5: string fechaentrega,
    6: string tipo,
    7: string descripcion
    8: string fotoPaciente
}

struct thrift.ReporteDoctoresPaciente{
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

struct thrift.ReportePacientesAnalisis{
    1: string clavePaciente,
    2: string claveAnalisis,
    3: string fechaAplica,
    4: string nombrePaciente,
    5: string fechaentrega,
    6: string tipo,
    7: string descripcion,
    8: string fotoPaciente
}

struct thrift.ReportePacientesDoctor{
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
service thrift.Actions{
    //Actualizar
    bool actualizarAnalisis(1: thrift.AnalisisClinico analisis),
    bool actualizarDoctor(1: thrift.Doctor doctor),
    bool actualizarPaciente(1: thrift.Paciente paciente),

    //Borrar
    bool borrarAnalisis(1: string claveAnalisis),
    bool borrarDoctor(1: string claveDoctor),
    bool borrarPaciente(1: string clavePaciente),

    //Capturar
    bool capturarAnalisis(1: thrift.AnalisisClinico analisis),
    bool capturarDoctor(1: thrift.Doctor doctor),
    bool capturarPaciente(1: thrift.Paciente paciente),
    bool capturarAtiende(1: thrift.Atiende atiende),
    bool capturarSeRealiza(1: thrift.SeRealiza seRealiza),

    //Consultas Generales
    list<thrift.AnalisisClinico> consultarAnalisis(),
    list<thrift.Atiende> consultarAtiende(),
    list<thrift.Doctor> consultarDoctores(),
    list<thrift.Paciente> consultarPacientes(),
    list<thrift.SeRealiza> consultarSeRealiza(),

    //Consultas por Clave
    thrift.AnalisisClinico consultarAnalisisClave(1: string clave),
    thrift.Paciente consultarPacienteClave(1: string clave),
    thrift.Doctor consultarDoctorClave(1: string clave),

    //Consultas Tipo/Especialidad
    list<thrift.AnalisisClinico> consultarAnalisisTipo(1: string tipo),
    list<thrift.Doctor> consultarDoctoresEspecialidad(1: string especialidad),

    //Reportes
    list<thrift.ReporteAnalisisPaciente> generarReporteAnalisisPaciente(1: string clavePaciente),
    list<thrift.ReportePacientesAnalisis> generarReportePacientesAnalisis(1: string claveAnalisis),
    list<thrift.ReporteDoctoresPaciente> generarReporteDoctoresPaciente(1: string clavePaciente),
    list<thrift.ReportePacientesDoctor> generarReportePacientesDoctor(1: string claveDoctor)
}