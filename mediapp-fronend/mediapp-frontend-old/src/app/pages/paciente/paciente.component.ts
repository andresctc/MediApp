import { PacienteService } from 'src/app/_service/paciente.service';
import { Paciente } from 'src/app/_model/paciente';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource, MatPaginator, MatSort, MatSnackBar } from '@angular/material';

@Component({
  selector: 'app-paciente',
  templateUrl: './paciente.component.html',
  styleUrls: ['./paciente.component.css']
})
export class PacienteComponent implements OnInit {

  lista: Paciente[] = [];
  displayedColumns: string[] = ['idPaciente', 'nombres', 'apellidos', 'acciones'];
  dataSource: MatTableDataSource<Paciente>;
  @ViewChild(MatPaginator) paginator: MatPaginator;
  @ViewChild(MatSort) sort: MatSort;

  constructor(private pacienteService: PacienteService, private snackBar: MatSnackBar) { }

  ngOnInit() {
    this.pacienteService.pacienteCambio.subscribe(data => {
      this.lista = data;
      this.dataSource = new MatTableDataSource(this.lista);
      this.dataSource.paginator = this.paginator;
      this.dataSource.sort = this.sort;

      this.pacienteService.mensaje.subscribe(data => { 
        this.snackBar.open(data, 'Aviso', { duration: 2000 });
      });
    });

    this.pacienteService.listarPacientes().subscribe(data => {
      this.lista = data;
      this.dataSource = new MatTableDataSource(this.lista);
      this.dataSource.paginator = this.paginator;
      this.dataSource.sort = this.sort;
      console.log(data);
    });

    /**setTimeout(() => {
      this.dataSource = new MatTableDataSource(this.lista);
      this.dataSource.paginator = this.paginator;
      this.dataSource.sort = this.sort;
    }, 1000);**/

  }

  applyFilter(filterValue: string){
    filterValue = filterValue.trim();
    filterValue = filterValue.toLowerCase();
    this.dataSource.filter = filterValue;
  }

  eliminar(idPaciente: number){
    this.pacienteService.eliminar(idPaciente).subscribe(data => {
      this.pacienteService.listarPacientes().subscribe(data => {
          this.lista = data;
          this.dataSource = new MatTableDataSource(this.lista);
          this.dataSource.paginator = this.paginator;
          this.dataSource.sort = this.sort;
      });
    });
  }
}