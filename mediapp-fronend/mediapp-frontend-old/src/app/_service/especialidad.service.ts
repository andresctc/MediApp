import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { Especialidad } from '../_model/especialidad';
import { HOST } from '../_shared/var.constant';

@Injectable({
  providedIn: 'root'
})
export class EspecialidadService {

  especialidadCambio = new Subject<Especialidad[]>();
  mensaje = new Subject<string>();
  url: string = `${HOST}/Especialidads`;

  constructor(private http: HttpClient) { }

  listarEspecialidads() {
      return this.http.get<Especialidad[]>(this.url);
  }

  listarEspecialidadsPorId(id: number) {
      return this.http.get<Especialidad>(`${this.url}/${id}`);
  }

  registrar(especialidad: Especialidad) {
      return this.http.post(this.url, especialidad);
  }

  modificar(especialidad: Especialidad) {
      return this.http.put(`${this.url}/modificar`, especialidad);
  }

  eliminar(id: number) {
      return this.http.delete(`${this.url}/eliminar/${id}`);
  }
}
