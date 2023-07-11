import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PruebaService } from 'src/app/services/prueba/prueba.service';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  isLoggedIn = false; // Variable para controlar el estado de autenticación

  constructor(private router: Router, private authService: PruebaService) {
    //this.isLoggedIn = this.authService.canActivate(); // Verifica el estado de autenticación al cargar el componente
  }

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
  }

  cerrarSesion() {
    localStorage.setItem('token', '');
    localStorage.setItem('isLoggedIn', 'false');
    this.router.navigate(['/login']);
  }
}
