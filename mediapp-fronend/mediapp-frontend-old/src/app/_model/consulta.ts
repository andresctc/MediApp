import { DetalleConsulta } from "./detalleConsulta";
import { Paciente } from "./paciente";
import { Especialidad } from './especialidad';
import { Medico } from "./medico";

export class Consulta {
    public idConsulta: number;
    public paciente: Paciente;
    public fecha: Date;
    public medico: Medico;
    public especialidad: Especialidad;
    public detalleConsulta: DetalleConsulta[];

}