import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MatButtonModule } from '@angular/material/button'; 
import { MatIconModule } from '@angular/material/icon';
import { MatMenuModule } from '@angular/material/menu';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatDividerModule } from '@angular/material/divider';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatSortModule } from '@angular/material/sort';
import { MatInputModule } from '@angular/material/input';
import { MatAutocompleteModule, MatCardModule, MatDatepickerModule, MatDialogModule, MatExpansionModule, MatListModule, MatNativeDateModule, MatSelectModule, MatSnackBarModule } from "@angular/material";

@NgModule({
    imports:[
        CommonModule,
        BrowserAnimationsModule,
        MatButtonModule,
        MatIconModule,
        MatMenuModule,
        MatSidenavModule,
        MatDividerModule,
        MatToolbarModule,
        MatFormFieldModule,
        MatTableModule,
        MatPaginatorModule,
        MatSortModule,
        MatInputModule,
        MatCardModule,
        MatSnackBarModule,
        MatDialogModule,
        MatSelectModule,
        MatDatepickerModule,
        MatListModule,
        MatExpansionModule,
        MatNativeDateModule,
        MatAutocompleteModule
    ],
    exports:[
        MatButtonModule,
        MatIconModule,
        MatMenuModule,
        MatSidenavModule,
        MatDividerModule,
        MatToolbarModule,
        MatFormFieldModule,
        MatTableModule,
        MatPaginatorModule,
        MatSortModule,
        MatInputModule,
        MatCardModule,
        MatSnackBarModule,
        MatDialogModule,
        MatSelectModule,
        MatDatepickerModule,
        MatListModule,
        MatExpansionModule,
        MatNativeDateModule,
        MatAutocompleteModule
    ],
    providers:[],
    declarations:[]
})

export class MaterialModule {

}