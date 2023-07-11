import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditarComponent } from './Matriz/editar/editar.component';
import { ListarComponent } from './Matriz/listar/listar.component';
import { EditarFisicoComponent } from './Matriz/editar-fisico/editar-fisico.component';
import { EditarPresupuestarioComponent } from './Matriz/editar-presupuestario/editar-presupuestario.component';
import { EditarCertificadoComponent } from './Matriz/editar-certificado/editar-certificado.component';
import { EditarPagadoComponent } from './Matriz/editar-pagado/editar-pagado.component';
import { LoginComponent } from './Matriz/login/login.component';
import { PruebaService } from './services/prueba/prueba.service';
import { ListarNuevosComponent } from './Matriz/listar-nuevos/listar-nuevos.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent }, // Ruta para el componente de inicio de sesión
  { path: '', redirectTo: 'login', pathMatch: 'full' }, // Redirigir a la página de inicio de sesión por defecto
  { path: 'listar', component: ListarComponent, canActivate: [PruebaService] },
  { path: 'listarAtrasados', component: ListarNuevosComponent, canActivate: [PruebaService] },
  { path: 'edit1', component: EditarComponent, canActivate: [PruebaService] },
  { path: 'edit2', component: EditarFisicoComponent, canActivate: [PruebaService] },
  { path: 'edit3', component: EditarPresupuestarioComponent, canActivate: [PruebaService] },
  { path: 'edit4', component: EditarCertificadoComponent, canActivate: [PruebaService] },
  { path: 'edit5', component: EditarPagadoComponent, canActivate: [PruebaService] },
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{ useHash: false, onSameUrlNavigation: "reload" })],
  exports: [RouterModule]
})
export class AppRoutingModule {}

