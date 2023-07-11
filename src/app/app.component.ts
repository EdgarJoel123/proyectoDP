import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup } from "@angular/forms";
import { PruebaService } from './services/prueba/prueba.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  autenticado: boolean = false;


  constructor(private pruebaService: PruebaService) {}

  isLoggedIn(): boolean {
    return this.pruebaService.canActivate();
  }
  

  /*
    Listar(){
      this.router.navigate(["listar"]);
    }
    ListarPrueba(){
      this.router.navigate(["edit"]);
    }

    Login(){
      this.router.navigate(["login"]);
    }
    Buscar(){
      this.router.navigate(["buscar"]);
    }*/
    
  }

