import { MaterialModule } from './material/material.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PacienteComponent } from './pages/paciente/paciente.component';
import { HttpClientModule } from '@angular/common/http';
import { PacienteEdicionComponent } from './pages/paciente/paciente-edicion/paciente-edicion.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ConsultaComponent } from './pages/consulta/consulta.component';
import { EspecialidadComponent } from './pages/especialidad/especialidad.component';
import { ExamenComponent } from './pages/examen/examen.component';
import { MedicoComponent } from './pages/medico/medico.component';
import { Not403Component } from './pages/not403/not403.component';
import { EspecialidadEdicionComponent } from './pages/especialidad/especialidad-edicion/especialidad-edicion.component';
import { ExamenEdicionComponent } from './pages/examen/examen-edicion/examen-edicion.component';
import { DialogoComponent } from './pages/medico/dialogo/dialogo.component'; // FormsMudule para utlizar 2way binding / ReactiveFormsModule para utlizar formularios

@NgModule({
  declarations: [
    AppComponent,
    PacienteComponent,
    PacienteEdicionComponent,
    ConsultaComponent,
    EspecialidadComponent,
    ExamenComponent,
    MedicoComponent,
    Not403Component,
    EspecialidadEdicionComponent,
    ExamenEdicionComponent,
    DialogoComponent
  ],
  entryComponents: [DialogoComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MaterialModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
