import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
import { Consulta } from '../_model/consulta';
import { HOST } from '../_shared/var.constant';

@Injectable({
  providedIn: 'root'
})
export class ConsultaService {

  consultaCambio = new Subject<Consulta[]>();
  mensaje = new Subject<string>();
  url: string = `${HOST}/Consultas`;

  constructor(private http: HttpClient) { }

  listarConsultas() {
      return this.http.get<Consulta[]>(this.url);
  }

  listarConsultasPorId(id: number) {
      return this.http.get<Consulta>(`${this.url}/${id}`);
  }

  registrar(consulta: Consulta) {
      return this.http.post(this.url, consulta);
  }

  modificar(consulta: Consulta) {
      return this.http.put(`${this.url}/modificar`, consulta);
  }

  eliminar(id: number) {
      return this.http.delete(`${this.url}/eliminar/${id}`);
  }
}
