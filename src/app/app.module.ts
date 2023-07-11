import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';



import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EditarComponent } from './Matriz/editar/editar.component';

import { FormsModule } from "@angular/forms";
import { ServiceService } from "../app/Service/service.service";
import { HttpClientModule } from "@angular/common/http";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatTableModule } from '@angular/material/table';

import { MatPaginatorModule } from '@angular/material/paginator';
import { MatIconModule } from '@angular/material/icon';
import { MatSelectModule } from '@angular/material/select';

import { CommonModule } from '@angular/common'; // importa el CommonModule

import { OrderByPipe } from './pipes/orderBy.pipe';

import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';
import { ReactiveFormsModule } from '@angular/forms';
import { DatePipe } from '@angular/common'; // Importa DatePipe

import { MatMenuModule } from '@angular/material/menu';
import { EditarFisicoComponent } from './Matriz/editar-fisico/editar-fisico.component';
import { EditarPresupuestarioComponent } from './Matriz/editar-presupuestario/editar-presupuestario.component';
import { EditarCertificadoComponent } from './Matriz/editar-certificado/editar-certificado.component';
import { EditarPagadoComponent } from './Matriz/editar-pagado/editar-pagado.component';

import { MatDialogModule } from '@angular/material/dialog';

import { ToastrModule } from 'ngx-toastr';
import { LoginComponent } from './Matriz/login/login.component';
import { HeaderComponent } from './Matriz/header/header.component';


import { MatSlideToggleModule } from '@angular/material/slide-toggle'
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import {PruebaService }  from 'src/app/services/prueba/prueba.service';
import { ListarNuevosComponent } from './Matriz/listar-nuevos/listar-nuevos.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ListarComponent } from './Matriz/listar/listar.component';



@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    EditarComponent,
    OrderByPipe,
    EditarFisicoComponent,
    EditarPresupuestarioComponent,
    EditarCertificadoComponent,
    EditarPagadoComponent,
    LoginComponent,
    HeaderComponent,
    ListarNuevosComponent,
    
 
  ],
  imports: [

    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatTableModule,
    MatPaginatorModule,
    CommonModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    MatNativeDateModule,
    ReactiveFormsModule,
    MatMenuModule,
    MatDialogModule,
    ToastrModule,
    MatSlideToggleModule,
    MatToolbarModule,
    MatSidenavModule,
    ToastrModule.forRoot(),
    MatIconModule,
    MatSelectModule,
    NgbModule


    
  ],
  providers: [ServiceService,
    DatePipe,
    PruebaService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
