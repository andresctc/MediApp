import { HttpClient } from '@angular/common/http';
import { HOST } from '../_shared/var.constant';
import { Medico } from '../_model/medico';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MedicoService {

  medicosCambio = new Subject<Medico[]>();
  mensaje = new Subject<string>();
  url: string = `${HOST}/medicos`;

  constructor(private http: HttpClient) { }

  listarMedicos() {
      return this.http.get<Medico[]>(`${this.url}/listar`);
  }

  listarMedicosPorId(id: number) {
      return this.http.get<Medico>(`${this.url}/listar/${id}`);
  }

  registrar(medico: Medico) {
      return this.http.post(`${this.url}/registrar`, medico);
  }

  modificar(medico: Medico) {
      return this.http.put(`${this.url}/registrar`, medico);
  }

  eliminar(id: number) {
      return this.http.delete(`${this.url}/eliminar/${id}`);
  }
}
