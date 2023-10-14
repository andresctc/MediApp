import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-perro',
  templateUrl: './perro.component.html',
  styleUrls: ['./perro.component.css']
})
export class PerroComponent {

  @Input() nombre: string;
  @Output() emisor = new EventEmitter();

  ladrar(){
    this.emisor.emit('¡Guauu!');
  }
}
