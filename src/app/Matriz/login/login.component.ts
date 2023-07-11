import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { map } from 'rxjs/operators';
import { PruebaService } from 'src/app/services/prueba/prueba.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  formData = {
    username: '',
    password: ''
  };

  constructor(public pruebaService: PruebaService, private router: Router, private http: HttpClient) {
    if (pruebaService.canActivate()) {
      this.router.navigate(['/listar']);
    }
  }

  validarUsuario(formulario: any) {
    const url = 'https://app.eeasa.com.ec/WSSisgerhServices/rest/security/validarUsuario';
    const cuenta = btoa(formulario.username);
    const clave = btoa(formulario.password);

    const params = {
      inDsgus_cuenta: cuenta,
      inDsgus_clave: clave
    };

    this.http.get(url, { params }).pipe(
      map((response: any) => {
        return {
          MESSAGE: response.MESSAGE,
          STATE: response.STATE,
          TOKEN: response.TOKEN
        };
      })
    ).subscribe(
      (loginInstance: any) => {
        console.log(loginInstance.MESSAGE);
        alert(loginInstance.MESSAGE);

        if (loginInstance.STATE === 'OK') {
          localStorage.setItem('token', loginInstance.TOKEN);
          localStorage.setItem('isLoggedIn', 'true');
          this.router.navigate(["listar"]);
        } else {
          // Limpiar campos de usuario y contraseña
          formulario.username = '';
          formulario.password = '';
        }
      },
      (error) => {
        console.error(error);
        alert(error.MESSAGE);
          // Limpiar campos de usuario y contraseña
      formulario.username = '';
      formulario.password = '';
      }
    );
  }
}
