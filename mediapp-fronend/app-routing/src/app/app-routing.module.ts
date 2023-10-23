import { NgModule } from '@angular/core';
import {CompAComponent} from './pages/comp-a/comp-a.component';
import {CompBComponent} from './pages/comp-b/comp-b.component';
import {CompCComponent} from './pages/comp-c/comp-c.component';
import {SubAComponent} from './pages/comp-a/sub-a/sub-a.component';
import { RouterModule, Routes } from '@angular/router';
import { SubBComponent } from './pages/comp-a/sub-b/sub-b.component';
import { NoPaginaComponent } from './pages/no-pagina/no-pagina.component';

const routes: Routes = [ 
  {
    path: 'compa', component: CompAComponent, children:[
      { path: 'subb', component: SubBComponent },// hijo del compoennte compa
      { path: 'suba', component: SubAComponent }
    ]
  },
  { path: 'compb', component: CompBComponent },
  { path: 'compc', component: CompCComponent },
  { path: '', redirectTo: 'compa', pathMatch: 'full' }, // navegacion por defecto a compa
  { path: '**', component: NoPaginaComponent } // si se busca un recurso que no existe
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 


}
