import { PacienteComponent } from './pages/paciente/paciente.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'paciente', component: PacienteComponent }//,
  //{ path: '', redirectTo: 'paciente', pathMatch: 'full' }, // navegacion por defecto a compa
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
