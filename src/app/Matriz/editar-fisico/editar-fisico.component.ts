import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Matriz } from 'src/app/Modelo/Matriz';
import { ServiceService } from 'src/app/Service/service.service';
import { VentanaEmergenteComponent } from '../ventana-emergente/ventana-emergente.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-editar-fisico',
  templateUrl: './editar-fisico.component.html',
  styleUrls: ['./editar-fisico.component.css']
})
export class EditarFisicoComponent {



  matriz: Matriz = new Matriz();
  codigoUnico: number;
  ppapre_PARTIDA_PRESUPUESTARIA: string;
  pac_ACTIVIDAD_ENERO: string;
  pac_ACTIVIDAD_NOVIEMBRE: string;
  pac_ACTIVIDAD_DICIEMBRE: string;
  pac_ACTIVIDAD_OCTUBRE: string;
  pac_ACTIVIDAD_SEPTIEMBRE: string;
  pac_ACTIVIDAD_AGOSTO: string;
  pac_ACTIVIDAD_JULIO: string;
  pac_ACTIVIDAD_JUNIO: string;
  pac_ACTIVIDAD_MAYO: string;
  pac_ACTIVIDAD_ABRIL: string;
  pac_ACTIVIDAD_MARZO: string;
  pac_ACTIVIDAD_FEBRERO: string;


  constructor(private dialog: MatDialog, private service: ServiceService, private router: Router,) { }

  ngOnInit() {
    this.Editar();
  }

  onInput() {
    this.pac_ACTIVIDAD_ENERO = this.pac_ACTIVIDAD_ENERO.toUpperCase();
    this.pac_ACTIVIDAD_FEBRERO = this.pac_ACTIVIDAD_FEBRERO.toUpperCase();
    this.pac_ACTIVIDAD_MARZO = this.pac_ACTIVIDAD_MARZO.toUpperCase();
    this.pac_ACTIVIDAD_ABRIL = this.pac_ACTIVIDAD_ABRIL.toUpperCase();
    this.pac_ACTIVIDAD_MAYO = this.pac_ACTIVIDAD_MAYO.toUpperCase();
    this.pac_ACTIVIDAD_JUNIO = this.pac_ACTIVIDAD_JUNIO.toUpperCase();
    this.pac_ACTIVIDAD_JULIO = this.pac_ACTIVIDAD_JULIO.toUpperCase();
    this.pac_ACTIVIDAD_AGOSTO = this.pac_ACTIVIDAD_AGOSTO.toUpperCase();
    this.pac_ACTIVIDAD_SEPTIEMBRE = this.pac_ACTIVIDAD_SEPTIEMBRE.toUpperCase();
    this.pac_ACTIVIDAD_OCTUBRE = this.pac_ACTIVIDAD_OCTUBRE.toUpperCase();
    this.pac_ACTIVIDAD_NOVIEMBRE = this.pac_ACTIVIDAD_NOVIEMBRE.toUpperCase();
    this.pac_ACTIVIDAD_DICIEMBRE = this.pac_ACTIVIDAD_DICIEMBRE.toUpperCase();

  }

  onKeyPress1(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_ENERO?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  
  onKeyPress2(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_FEBRERO?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress3(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_MARZO?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress4(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_ABRIL?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress5(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_MAYO?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress6(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_JUNIO?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress7(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_JULIO?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  
  onKeyPress8(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_AGOSTO?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress9(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_SEPTIEMBRE?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress10(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_OCTUBRE?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress11(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_NOVIEMBRE?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress12(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9]*$/.test(charStr) || (this.pac_ACTIVIDAD_DICIEMBRE?.length >= 20 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
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
            this.pac_ACTIVIDAD_ENERO = this.matriz.pac_ACTIVIDAD_ENERO;
            this.pac_ACTIVIDAD_FEBRERO = this.matriz.pac_ACTIVIDAD_FEBRERO;
            this.pac_ACTIVIDAD_MARZO = this.matriz.pac_ACTIVIDAD_MARZO;
            this.pac_ACTIVIDAD_ABRIL = this.matriz.pac_ACTIVIDAD_ABRIL;
            this.pac_ACTIVIDAD_MAYO = this.matriz.pac_ACTIVIDAD_MAYO;
            this.pac_ACTIVIDAD_JUNIO = this.matriz.pac_ACTIVIDAD_JUNIO;
            this.pac_ACTIVIDAD_JULIO = this.matriz.pac_ACTIVIDAD_JULIO;
            this.pac_ACTIVIDAD_AGOSTO = this.matriz.pac_ACTIVIDAD_AGOSTO;
            this.pac_ACTIVIDAD_SEPTIEMBRE = this.matriz.pac_ACTIVIDAD_SEPTIEMBRE;
            this.pac_ACTIVIDAD_OCTUBRE = this.matriz.pac_ACTIVIDAD_OCTUBRE;
            this.pac_ACTIVIDAD_NOVIEMBRE = this.matriz.pac_ACTIVIDAD_NOVIEMBRE;
            this.pac_ACTIVIDAD_DICIEMBRE = this.matriz.pac_ACTIVIDAD_DICIEMBRE;




          }
        });
    }
  }

  ActualizarFisico(matriz: Matriz) {

    const dialogRef = this.dialog.open(VentanaEmergenteComponent, {
      data: {
        title: 'Confirmación',
        message: '¿Estás seguro que quieres actualizar este registro?'
      }
    });

    dialogRef.afterClosed().subscribe((result: any) => {
      if (this.pac_ACTIVIDAD_ENERO === null) {
          this.pac_ACTIVIDAD_ENERO = '';


      } else if (result) {

        matriz.pac_ACTIVIDAD_ENERO = this.pac_ACTIVIDAD_ENERO;
        matriz.pac_ACTIVIDAD_FEBRERO = this.pac_ACTIVIDAD_FEBRERO;
        matriz.pac_ACTIVIDAD_MARZO = this.pac_ACTIVIDAD_MARZO;
        matriz.pac_ACTIVIDAD_ABRIL = this.pac_ACTIVIDAD_ABRIL;
        matriz.pac_ACTIVIDAD_MAYO = this.pac_ACTIVIDAD_MAYO;
        matriz.pac_ACTIVIDAD_JUNIO = this.pac_ACTIVIDAD_JUNIO;
        matriz.pac_ACTIVIDAD_JULIO = this.pac_ACTIVIDAD_JULIO;
        matriz.pac_ACTIVIDAD_AGOSTO = this.pac_ACTIVIDAD_AGOSTO;
        matriz.pac_ACTIVIDAD_SEPTIEMBRE = this.pac_ACTIVIDAD_SEPTIEMBRE;
        matriz.pac_ACTIVIDAD_OCTUBRE = this.pac_ACTIVIDAD_OCTUBRE;
        matriz.pac_ACTIVIDAD_NOVIEMBRE = this.pac_ACTIVIDAD_NOVIEMBRE;
        matriz.pac_ACTIVIDAD_DICIEMBRE = this.pac_ACTIVIDAD_DICIEMBRE;
        this.service.updateMatrizFisico(matriz)
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
              this.router.navigate(["edit2"]);
            }
          )
      }
    });
  }
}
