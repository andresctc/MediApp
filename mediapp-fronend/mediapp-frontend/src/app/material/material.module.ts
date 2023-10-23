import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import {MatButtonModule} from '@angular/material/button';

@NgModule({
    imports:[
        BrowserAnimationsModule,
        MatButtonModule
    ],
    exports:[
        MatButtonModule
    ],
    providers:[],
    declarations:[]
})

export class MaterialModule {

}