import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Matriz } from 'src/app/Modelo/Matriz';
import { ServiceService } from 'src/app/Service/service.service';
import { VentanaEmergenteComponent } from '../ventana-emergente/ventana-emergente.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-editar-presupuestario',
  templateUrl: './editar-presupuestario.component.html',
  styleUrls: ['./editar-presupuestario.component.css']
})
export class EditarPresupuestarioComponent {

  matriz: Matriz = new Matriz();
  codigoUnico: number;
  ppapre_PARTIDA_PRESUPUESTARIA: string;

  ppres_ACTIVIDAD_ENERO: number;
  ppres_ACTIVIDAD_FEBRERO: number;
  ppres_ACTIVIDAD_MARZO: number;
  ppres_ACTIVIDAD_ABRIL: number;
  ppres_ACTIVIDAD_MAYO: number;
  ppres_ACTIVIDAD_JUNIO: number;
  ppres_ACTIVIDAD_JULIO: number;
  ppres_ACTIVIDAD_AGOSTO: number;
  ppres_ACTIVIDAD_SEPTIEMBRE: number;
  ppres_ACTIVIDAD_OCTUBRE: number;
  ppres_ACTIVIDAD_NOVIEMBRE: number;
  ppres_ACTIVIDAD_DICIEMBRE: number;

  constructor(private dialog: MatDialog, private service: ServiceService, private router: Router,) { }

  ngOnInit() {
    this.Editar();
  }

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
            this.ppres_ACTIVIDAD_ENERO = this.matriz.ppres_ACTIVIDAD_ENERO;
            this.ppres_ACTIVIDAD_FEBRERO = this.matriz.ppres_ACTIVIDAD_FEBRERO;
            this.ppres_ACTIVIDAD_MARZO = this.matriz.ppres_ACTIVIDAD_MARZO;
            this.ppres_ACTIVIDAD_ABRIL = this.matriz.ppres_ACTIVIDAD_ABRIL;
            this.ppres_ACTIVIDAD_MAYO = this.matriz.ppres_ACTIVIDAD_MAYO;
            this.ppres_ACTIVIDAD_JUNIO = this.matriz.ppres_ACTIVIDAD_JUNIO;
            this.ppres_ACTIVIDAD_JULIO = this.matriz.ppres_ACTIVIDAD_JULIO;
            this.ppres_ACTIVIDAD_AGOSTO = this.matriz.ppres_ACTIVIDAD_AGOSTO;
            this.ppres_ACTIVIDAD_SEPTIEMBRE = this.matriz.ppres_ACTIVIDAD_SEPTIEMBRE;
            this.ppres_ACTIVIDAD_OCTUBRE = this.matriz.ppres_ACTIVIDAD_OCTUBRE;
            this.ppres_ACTIVIDAD_NOVIEMBRE = this.matriz.ppres_ACTIVIDAD_NOVIEMBRE;
            this.ppres_ACTIVIDAD_DICIEMBRE = this.matriz.ppres_ACTIVIDAD_DICIEMBRE;








          }
        });
    }
  }

  ActualizarPresupuesto(matriz: Matriz) {

    const dialogRef = this.dialog.open(VentanaEmergenteComponent, {
      data: {
        title: 'Confirmación',
        message: '¿Estás seguro que quieres actualizar este registro?'
      }
    });

    dialogRef.afterClosed().subscribe(result => {

      if (result) {

        matriz.ppres_ACTIVIDAD_ENERO = this.ppres_ACTIVIDAD_ENERO;
        matriz.ppres_ACTIVIDAD_FEBRERO = this.ppres_ACTIVIDAD_FEBRERO;
        matriz.ppres_ACTIVIDAD_MARZO = this.ppres_ACTIVIDAD_MARZO;
        matriz.ppres_ACTIVIDAD_ABRIL = this.ppres_ACTIVIDAD_ABRIL;
        matriz.ppres_ACTIVIDAD_MAYO = this.ppres_ACTIVIDAD_MAYO;
        matriz.ppres_ACTIVIDAD_JUNIO = this.ppres_ACTIVIDAD_JUNIO;
        matriz.ppres_ACTIVIDAD_JULIO = this.ppres_ACTIVIDAD_JULIO;
        matriz.ppres_ACTIVIDAD_AGOSTO = this.ppres_ACTIVIDAD_AGOSTO;
        matriz.ppres_ACTIVIDAD_SEPTIEMBRE = this.ppres_ACTIVIDAD_SEPTIEMBRE;
        matriz.ppres_ACTIVIDAD_OCTUBRE = this.ppres_ACTIVIDAD_OCTUBRE;
        matriz.ppres_ACTIVIDAD_NOVIEMBRE = this.ppres_ACTIVIDAD_NOVIEMBRE;
        matriz.ppres_ACTIVIDAD_DICIEMBRE = this.ppres_ACTIVIDAD_DICIEMBRE;
        this.service.updateMatrizPresupuesto(matriz)
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
              this.router.navigate(["edit3"]);
            }
          )
      }
    });
  }
}