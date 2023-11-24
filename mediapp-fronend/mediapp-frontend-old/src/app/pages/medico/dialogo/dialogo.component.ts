import { MedicoService } from 'src/app/_service/medico.service';
import { Medico } from 'src/app/_model/medico';
import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogRef } from '@angular/material';
@Component({
  selector: 'app-dialogo',
  templateUrl: './dialogo.component.html',
  styleUrls: ['./dialogo.component.css']
})
export class DialogoComponent implements OnInit {

  medico: Medico;

  constructor(public dialogRef: MatDialogRef<DialogoComponent>,
    @Inject(MAT_DIALOG_DATA) public data: Medico,
    private medicoService: MedicoService) { 

    }

  ngOnInit() {
    this.medico = new Medico();
    this.medico.idMedico = this.data.idMedico;
    this.medico.nombres = this.data.nombres;
    this.medico.apellidos = this.data.apellidos;
    this.medico.cmp = this.data.cmp;
  }

  
  operar(){

    if (this.medico.idMedico == null && this.medico.idMedico > 0){
      this.medicoService.modificar(this.medico).subscribe(data => {
        if(data == 1) {
          this.medicoService.listarMedicos().subscribe(medicos => {
            //
            this.medicoService.mensaje.next("Se modifico");
          });
        } else {
          this.medicoService.mensaje.next("No se pudo modificar");
        }
      });
    }else{
      this.medicoService.registrar(this.medico).subscribe(data => {
        if(data == 1) {
          this.medicoService.listarMedicos().subscribe(medicos => {
            //
            this.medicoService.mensaje.next("Se modifico");
          });
        } else {
          this.medicoService.mensaje.next("No se pudo modificar");
        }
        });
      }
      this.dialogRef.close();
    }

    cancelar(){
      this.dialogRef.close();
      this.medicoService.mensaje.next('false');
    }

}
