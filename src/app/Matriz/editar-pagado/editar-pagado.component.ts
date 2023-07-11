import { Component, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { Matriz } from 'src/app/Modelo/Matriz';
import { ServiceService } from 'src/app/Service/service.service';
import { VentanaEmergenteComponent } from '../ventana-emergente/ventana-emergente.component';
import { ToastrService } from 'ngx-toastr';
import { error } from 'jquery';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-editar-pagado',
  templateUrl: './editar-pagado.component.html',
  styleUrls: ['./editar-pagado.component.css']
})
export class EditarPagadoComponent {



  matriz: Matriz = new Matriz();
  codigoUnico: number;
  ppapre_PARTIDA_PRESUPUESTARIA: string;
  ppag_ACTIVIDAD_ENERO: number;
  ppag_ACTIVIDAD_FEBRERO: number;
  ppag_ACTIVIDAD_MARZO: number;
  ppag_ACTIVIDAD_ABRIL: number;
  ppag_ACTIVIDAD_MAYO: number;
  ppag_ACTIVIDAD_JUNIO: number;
  ppag_ACTIVIDAD_JULIO: number;
  ppag_ACTIVIDAD_AGOSTO: number;
  ppag_ACTIVIDAD_SEPTIEMBRE: number;
  ppag_ACTIVIDAD_OCTUBRE: number;
  ppag_ACTIVIDAD_NOVIEMBRE: number;
  ppag_ACTIVIDAD_DICIEMBRE: number;

  @ViewChild(VentanaEmergenteComponent) ventanaEmergente: VentanaEmergenteComponent;


  constructor(private dialog: MatDialog,private service: ServiceService, private router: Router,private toastr: ToastrService) { }

  ngOnInit() {
    this.Editar();
  }

  /*mostrarVentanaEmergente(  matriz: Matriz) {
    this.ventanaEmergente.abrir(() => {
      this.ActualizarPagado(matriz);
    }, null);    
  }
  */
  

  Editar() {
    let id = localStorage.getItem("id");
    if (id !== null) {
      this.service.getMatrizID(+id)
        .subscribe(data => {
          this.matriz = data[0];
          console.log(this.matriz);
          if (this.matriz) {
            this.codigoUnico = this.matriz.pk_PPRO_CODIGO_UNICO;
            this.ppapre_PARTIDA_PRESUPUESTARIA = this.matriz.ppapre_PARTIDA_PRESUPUESTARIA;
            this.ppag_ACTIVIDAD_ENERO = this.matriz.ppag_ACTIVIDAD_ENERO;
            this.ppag_ACTIVIDAD_FEBRERO = this.matriz.ppag_ACTIVIDAD_FEBRERO;
            this.ppag_ACTIVIDAD_MARZO = this.matriz.ppag_ACTIVIDAD_MARZO;
            this.ppag_ACTIVIDAD_ABRIL = this.matriz.ppag_ACTIVIDAD_ABRIL;
            this.ppag_ACTIVIDAD_MAYO = this.matriz.ppag_ACTIVIDAD_MAYO;
            this.ppag_ACTIVIDAD_JUNIO = this.matriz.ppag_ACTIVIDAD_JUNIO;
            this.ppag_ACTIVIDAD_JULIO = this.matriz.ppag_ACTIVIDAD_JULIO;
            this.ppag_ACTIVIDAD_AGOSTO  = this.matriz.ppag_ACTIVIDAD_AGOSTO;
            this.ppag_ACTIVIDAD_SEPTIEMBRE = this.matriz.ppag_ACTIVIDAD_SEPTIEMBRE;
            this.ppag_ACTIVIDAD_OCTUBRE = this.matriz.ppag_ACTIVIDAD_OCTUBRE;
            this.ppag_ACTIVIDAD_NOVIEMBRE = this.matriz.ppag_ACTIVIDAD_NOVIEMBRE;
            this.ppag_ACTIVIDAD_DICIEMBRE = this.matriz.ppag_ACTIVIDAD_DICIEMBRE;


            


            





          }
        });
    }
  }

ActualizarPagado(matriz: Matriz) {
  const dialogRef = this.dialog.open(VentanaEmergenteComponent, {
    data: {
      title: 'Confirmación',
      message: '¿Estás seguro que quieres actualizar este registro?'
    }
  });

  dialogRef.afterClosed().subscribe((result: any) => {
    if (result) {
      // Aquí se ejecuta la acción si el usuario confirmó la acción
      matriz.ppag_ACTIVIDAD_ENERO = this.ppag_ACTIVIDAD_ENERO;
      matriz.ppag_ACTIVIDAD_FEBRERO = this.ppag_ACTIVIDAD_FEBRERO;
      matriz.ppag_ACTIVIDAD_MARZO = this.ppag_ACTIVIDAD_MARZO;
      matriz.ppag_ACTIVIDAD_ABRIL = this.ppag_ACTIVIDAD_ABRIL;
      matriz.ppag_ACTIVIDAD_MAYO = this.ppag_ACTIVIDAD_MAYO;
      matriz.ppag_ACTIVIDAD_JUNIO = this.ppag_ACTIVIDAD_JUNIO;
      matriz.ppag_ACTIVIDAD_JULIO = this.ppag_ACTIVIDAD_JULIO;
      matriz.ppag_ACTIVIDAD_AGOSTO = this.ppag_ACTIVIDAD_AGOSTO;
      matriz.ppag_ACTIVIDAD_SEPTIEMBRE = this.ppag_ACTIVIDAD_SEPTIEMBRE;
      matriz.ppag_ACTIVIDAD_OCTUBRE = this.ppag_ACTIVIDAD_OCTUBRE;
      matriz.ppag_ACTIVIDAD_NOVIEMBRE = this.ppag_ACTIVIDAD_NOVIEMBRE;
      matriz.ppag_ACTIVIDAD_DICIEMBRE = this.ppag_ACTIVIDAD_DICIEMBRE;
      this.service.updateMatrizPagado(matriz)
        .subscribe(
          data => {
          this.matriz = data;
          // Reemplazar alert con una notificación de Bootstrap
          alert("se actualizo");
          this.router.navigate(["listar"]);
        },
        error => {
          alert("Hubo un error en la actualizacion intentelo de nuevo");
          console.log(error);
          this.router.navigate(["edit5"]);
        }
        )
    }
  });
}

}
