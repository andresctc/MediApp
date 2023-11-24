import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { Examen } from '../_model/examen';
import { HOST } from '../_shared/var.constant';

@Injectable({
  providedIn: 'root'
})
export class ExamenService {
  examenCambio = new Subject<Examen[]>();
  mensaje = new Subject<string>();
  url: string = `${HOST}/Examens`;

  constructor(private http: HttpClient) { }

  listarExamens() {
      return this.http.get<Examen[]>(this.url);
  }

  listarExamensPorId(id: number) {
      return this.http.get<Examen>(`${this.url}/${id}`);
  }

  registrar(examen: Examen) {
      return this.http.post(this.url, examen);
  }

  modificar(examen: Examen) {
      return this.http.put(`${this.url}/modificar`, examen);
  }

  eliminar(id: number) {
      return this.http.delete(`${this.url}/eliminar/${id}`);
  }
}
