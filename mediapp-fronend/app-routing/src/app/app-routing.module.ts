import { NgModule } from '@angular/core';
import {CompAComponent} from './pages/comp-a/comp-a.component';
import {CompBComponent} from './pages/comp-b/comp-b.component';
import {CompCComponent} from './pages/comp-c/comp-c.component';
import {SubAComponent} from './pages/comp-a/sub-a/sub-a.component';
import { RouterModule, Routes } from '@angular/router';
import { SubBComponent } from './pages/comp-a/sub-b/sub-b.component';

const routes: Routes = [ 
  {
    path: 'compa', component: CompAComponent, children:[
      {path: 'suba', component: SubAComponent},
      {path: 'subb', component: SubBComponent}
    ]
  },
  {
    path: 'compb', component: CompBComponent
  },
  {
    path: 'compc', component: CompCComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 


}
