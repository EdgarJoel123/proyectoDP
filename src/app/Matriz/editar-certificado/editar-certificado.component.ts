import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Matriz } from 'src/app/Modelo/Matriz';
import { ServiceService } from 'src/app/Service/service.service';
import { VentanaEmergenteComponent } from '../ventana-emergente/ventana-emergente.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-editar-certificado',
  templateUrl: './editar-certificado.component.html',
  styleUrls: ['./editar-certificado.component.css']
})
export class EditarCertificadoComponent {

  matriz: Matriz = new Matriz();
  codigoUnico: number;
  ppapre_PARTIDA_PRESUPUESTARIA: string;
  pcer_ACTIVIDAD_ENERO: number;
  pcer_ACTIVIDAD_FEBRERO: number;
  pcer_ACTIVIDAD_MARZO: number;
  pcer_ACTIVIDAD_ABRIL: number;
  pcer_ACTIVIDAD_MAYO: number;
  pcer_ACTIVIDAD_JUNIO: number;
  pcer_ACTIVIDAD_JULIO: number;
  pcer_ACTIVIDAD_AGOSTO: number;
  pcer_ACTIVIDAD_SEPTIEMBRE: number;
  pcer_ACTIVIDAD_OCTUBRE: number;
  pcer_ACTIVIDAD_NOVIEMBRE: number;
  pcer_ACTIVIDAD_DICIEMBRE: number;


  constructor(private dialog: MatDialog,private service: ServiceService, private router: Router,) { }

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
            this.pcer_ACTIVIDAD_ENERO = this.matriz.pcer_ACTIVIDAD_ENERO;
            this.pcer_ACTIVIDAD_FEBRERO = this.matriz.pcer_ACTIVIDAD_FEBRERO;
            this.pcer_ACTIVIDAD_MARZO = this.matriz.pcer_ACTIVIDAD_MARZO;
            this.pcer_ACTIVIDAD_ABRIL = this.matriz.pcer_ACTIVIDAD_ABRIL;
            this.pcer_ACTIVIDAD_MAYO = this.matriz.pcer_ACTIVIDAD_MAYO;
            this.pcer_ACTIVIDAD_JUNIO = this.matriz.pcer_ACTIVIDAD_JUNIO;
            this.pcer_ACTIVIDAD_JULIO = this.matriz.pcer_ACTIVIDAD_JULIO;
            this.pcer_ACTIVIDAD_AGOSTO = this.matriz.pcer_ACTIVIDAD_AGOSTO;
            this.pcer_ACTIVIDAD_SEPTIEMBRE = this.matriz.pcer_ACTIVIDAD_SEPTIEMBRE;
            this.pcer_ACTIVIDAD_OCTUBRE = this.matriz.pcer_ACTIVIDAD_OCTUBRE;
            this.pcer_ACTIVIDAD_NOVIEMBRE = this.matriz.pcer_ACTIVIDAD_NOVIEMBRE;
            this.pcer_ACTIVIDAD_DICIEMBRE = this.matriz.pcer_ACTIVIDAD_DICIEMBRE;











          }
        });
    }
  }

  ActualizarCertificado(matriz: Matriz) {

    const dialogRef = this.dialog.open(VentanaEmergenteComponent, {
      data: {
        title: 'Confirmación',
        message: '¿Estás seguro que quieres actualizar este registro?'
      }
    });

    dialogRef.afterClosed().subscribe(result => {

      if (result) {

    matriz.pcer_ACTIVIDAD_ENERO = this.pcer_ACTIVIDAD_ENERO;
    matriz.pcer_ACTIVIDAD_FEBRERO = this.pcer_ACTIVIDAD_FEBRERO;
    matriz.pcer_ACTIVIDAD_MARZO = this.pcer_ACTIVIDAD_MARZO;
    matriz.pcer_ACTIVIDAD_ABRIL = this.pcer_ACTIVIDAD_ABRIL;
    matriz.pcer_ACTIVIDAD_MAYO = this.pcer_ACTIVIDAD_MAYO;
    matriz.pcer_ACTIVIDAD_JUNIO = this.pcer_ACTIVIDAD_JUNIO;
    matriz.pcer_ACTIVIDAD_JULIO = this.pcer_ACTIVIDAD_JULIO;
    matriz.pcer_ACTIVIDAD_AGOSTO = this.pcer_ACTIVIDAD_AGOSTO;
    matriz.pcer_ACTIVIDAD_SEPTIEMBRE = this.pcer_ACTIVIDAD_SEPTIEMBRE;
    matriz.pcer_ACTIVIDAD_OCTUBRE = this.pcer_ACTIVIDAD_OCTUBRE;
    matriz.pcer_ACTIVIDAD_NOVIEMBRE = this.pcer_ACTIVIDAD_NOVIEMBRE;
    matriz.pcer_ACTIVIDAD_DICIEMBRE = this.pcer_ACTIVIDAD_DICIEMBRE;
    this.service.updateMatrizCertificado(matriz)
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
        this.router.navigate(["edit4"]);
      }
    )
}
});
}
}
