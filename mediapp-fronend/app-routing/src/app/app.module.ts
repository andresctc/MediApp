import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CompAComponent } from './pages/comp-a/comp-a.component';
import { CompBComponent } from './pages/comp-b/comp-b.component';
import { CompCComponent } from './pages/comp-c/comp-c.component';
import { NoPaginaComponent } from './pages/no-pagina/no-pagina.component';
import { SubAComponent } from './pages/comp-a/sub-a/sub-a.component';
import { SubBComponent } from './pages/comp-a/sub-b/sub-b.component';

@NgModule({
  declarations: [
    AppComponent,
    CompAComponent,
    CompBComponent,
    CompCComponent,
    NoPaginaComponent,
    SubAComponent,
    SubBComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
