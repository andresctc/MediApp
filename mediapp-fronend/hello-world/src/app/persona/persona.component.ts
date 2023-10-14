import { Component } from '@angular/core';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent {

  saludo: string;
  dni: string;
  listaDNI: string[] = [];
  estadoBotonAgregar: boolean = true;

  teclear(evento: any){
    this.saludo = evento.target.value;
  }

  agregar(){
    this.listaDNI.push(this.dni);
  }

  teclearDNI(evento: any){
    this.saludo =evento.target.value;
    if(this.saludo != null && this.saludo.length>0){
      this.estadoBotonAgregar = false;
    }else{
      this.estadoBotonAgregar = true;
    }
  }

  remover(index: number){
    this.listaDNI.splice(index, 1);
  }

}
