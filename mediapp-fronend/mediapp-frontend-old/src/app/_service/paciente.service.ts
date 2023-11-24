
import { Paciente } from '../_model/paciente';
import { HOST } from '../_shared/var.constant';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Subject } from '../../../node_modules/rxjs';

@Injectable({
    providedIn: 'root'
})
export class PacienteService {

    pacienteCambio = new Subject<Paciente[]>();
    mensaje = new Subject<string>();
    url: string = `${HOST}/pacientes`;

    constructor(private http: HttpClient) { }

    listarPacientes() {
        return this.http.get<Paciente[]>(this.url);
    }

    listarPacientesPorId(id: number) {
        return this.http.get<Paciente>(`${this.url}/${id}`);
    }

    registrar(paciente: Paciente) {
        return this.http.put(`${this.url}/registrar`, paciente);
    }

    modificar(paciente: Paciente) {
        return this.http.put(`${this.url}/modificar`, paciente);
    }

    eliminar(id: number) {
        return this.http.delete(`${this.url}/eliminar/${id}`);
    }
}