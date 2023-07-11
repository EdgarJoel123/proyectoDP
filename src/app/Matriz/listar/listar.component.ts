import { AfterViewInit, Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { FormControl, NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Matriz } from 'src/app/Modelo/Matriz';
import { ServiceService } from 'src/app/Service/service.service';
import { DatePipe } from '@angular/common';
import { MatPaginator } from '@angular/material/paginator';
import { catchError, map, startWith, switchMap } from 'rxjs';
import { of } from 'rxjs';
import { MatSort } from '@angular/material/sort';

import { VentanaEmergenteComponent } from '../ventana-emergente/ventana-emergente.component';
import { MatDialog } from '@angular/material/dialog';




@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css'],
  providers: [DatePipe]
})
export class ListarComponent implements OnInit, AfterViewInit {


  matrises: Matriz[];
  selectedOption: any;
  //numContrato: string;

  @ViewChild('formulario') formulario!: NgForm;


  @ViewChild('departamento') departamentoB: ElementRef;
  @ViewChild('nombre') nombre: ElementRef;
  @ViewChild('apellido') apellido: ElementRef;
  @ViewChild('fecha_inicial') fecha_inicial: ElementRef;
  @ViewChild('fecha_final') fecha_final: ElementRef;
  @ViewChild('numContrato') numContrato: ElementRef;
  @ViewChild('detalle') detalle: ElementRef;
  @ViewChild('estado') estado: ElementRef;



  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  resultadosBusqueda: Matriz[];
  palabraBusqueda: string; // Agregar esta línea
  contadorResultados: number = 0;



  constructor(private service: ServiceService, private router: Router, private datePipe: DatePipe, private dialog: MatDialog) { }

  openMenu(): void {
    const dialogRef = this.dialog.open(VentanaEmergenteComponent, {
      width: '300px'
    });
  }

  ngOnInit() {
    this.service.getMatriz()
      .subscribe(data => {
        this.matrises = data;
      })

  }

  ngAfterViewInit() {
    this.paginator.page
      .pipe(
        startWith({}),
        switchMap(() => {
          return this.service.getMatriz();
        }),
        map(data => {
          const startIndex = this.paginator.pageIndex * this.paginator.pageSize;
          return data.slice(startIndex, startIndex + this.paginator.pageSize);
        }),
        catchError(() => {
          return of([]);
        })
      )
      .subscribe(data => {
        this.resultadosBusqueda = data;
        this.paginator.length = this.resultadosBusqueda.length;
      });
  }


  ordenar(columna: string, orden: string) {
    this.resultadosBusqueda.sort((a, b) => {
      if (orden === 'asc') {
        return a[columna] > b[columna] ? 1 : -1;
      } else {
        return a[columna] < b[columna] ? 1 : -1;
      }
    });
  }

  listarTodos(): void {
    this.service.getMatriz()
      .subscribe(data => {
        this.resultadosBusqueda = data;
        this.contadorResultados = this.resultadosBusqueda.length;
      })

  }

  limpiar(formulario: NgForm, inputPalabraBusqueda: HTMLInputElement) {
    inputPalabraBusqueda.value = '';
    formulario.resetForm();
  }


  convertirMayuscula(): void {
    this.palabraBusqueda = this.palabraBusqueda.toUpperCase();
  }

  buscarPalabra(palabra: string) {
    console.log('Palabra buscada:', palabra);

    this.resultadosBusqueda = this.matrises.filter(matriz => {
      return (matriz.pde_DEPARTAMENTO && matriz.pde_DEPARTAMENTO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.estado && matriz.estado.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_CODIGO_RAPIDO && matriz.ppro_CODIGO_RAPIDO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_PRESUPUESTO_INICIAL && matriz.ppro_PRESUPUESTO_INICIAL.toString().toLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_PRESUPUESTO_CODIFICADO && matriz.ppro_PRESUPUESTO_CODIFICADO.toString().toLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.petapre_ETAPA_PRESUPUESTO && matriz.petapre_ETAPA_PRESUPUESTO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.prete_NOMBRE && matriz.prete_NOMBRE.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.prete_APELLIDO && matriz.prete_APELLIDO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_FECHA_INICIAL && matriz.ppro_FECHA_INICIAL.toString().toLowerCase().includes(palabra.toLowerCase())) ||
        (matriz.ppro_FECHA_FINAL && matriz.ppro_FECHA_FINAL.toString().toLowerCase().includes(palabra.toLowerCase())) ||
        (matriz.ppro_NUMERO_CONTRATO && matriz.ppro_NUMERO_CONTRATO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_DETALLE_PRODUCTO && matriz.ppro_DETALLE_PRODUCTO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.pk_PPRO_CODIGO_UNICO && matriz.pk_PPRO_CODIGO_UNICO.toLocaleString().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_ANIO && matriz.ppro_ANIO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppapre_PARTIDA_PRESUPUESTARIA && matriz.ppapre_PARTIDA_PRESUPUESTARIA.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_CODIGO_CATEGORIA_CPC && matriz.ppro_CODIGO_CATEGORIA_CPC.toString().toLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ptico_TIPO_COMPRA && matriz.ptico_TIPO_COMPRA.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.pprse_PROCEDIMIENTO_SERCOP && matriz.pprse_PROCEDIMIENTO_SERCOP.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_CANTIDAD_ANUAL && matriz.ppro_CANTIDAD_ANUAL.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.puni_UNIDAD && matriz.puni_UNIDAD.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_COSTO_UNITARIO && matriz.ppro_COSTO_UNITARIO.toString().toLowerCase().includes(palabra.toLowerCase())) ||
        (matriz.ptipo_TIPO_PRODUCTO && matriz.ptipo_TIPO_PRODUCTO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_NUMERO_CODIGO_OPERACION_P && matriz.ppro_NUMERO_CODIGO_OPERACION_P.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_NUMERO_CODIGO_PROYECTO_BI && matriz.ppro_NUMERO_CODIGO_PROYECTO_BI.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ptire_TIPO_REGIMEN && matriz.ptire_TIPO_REGIMEN.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ptipre_TIPO_PRESUPUESTO && matriz.ptipre_TIPO_PRESUPUESTO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ptipro_TIPO_PROYECTO && matriz.ptipro_TIPO_PROYECTO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_PLAZO && matriz.ppro_PLAZO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.pvade_VALOR_DEVENGADO && matriz.pvade_VALOR_DEVENGADO.toString().toLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppoavfide_PORCENTAJE_AVANCE_FI && matriz.ppoavfide_PORCENTAJE_AVANCE_FI.toString().toLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.pac_ACTIVIDAD_ENERO && matriz.pac_ACTIVIDAD_ENERO.toLocaleLowerCase().includes(palabra.toLocaleLowerCase())) ||
        (matriz.ppro_OBSERVACIONES && matriz.ppro_OBSERVACIONES.toLocaleLowerCase().includes(palabra.toLocaleLowerCase()));
    });

    console.log('Resultados de búsqueda:', this.resultadosBusqueda);
    this.contadorResultados = this.resultadosBusqueda.length;

    if (this.resultadosBusqueda.length === 0) {
      // No se encontraron resultados, no se muestra nada
      return;
    }
  }

  EditarMatriz(matriz: Matriz): void {
    localStorage.setItem("id", matriz.pk_PPRO_CODIGO_UNICO.toString());
    this.router.navigate(["edit1"])
  }

  EditarMatrizFisico(matriz: Matriz): void {
    localStorage.setItem("id", matriz.pk_PPRO_CODIGO_UNICO.toString());
    this.router.navigate(["edit2"])
  }

  EditarMatrizPresupuestario(matriz: Matriz): void {
    localStorage.setItem("id", matriz.pk_PPRO_CODIGO_UNICO.toString());
    this.router.navigate(["edit3"])
  }

  EditarMatrizCertificado(matriz: Matriz): void {
    localStorage.setItem("id", matriz.pk_PPRO_CODIGO_UNICO.toString());
    this.router.navigate(["edit4"])
  }

  EditarMatrizPagado(matriz: Matriz): void {
    localStorage.setItem("id", matriz.pk_PPRO_CODIGO_UNICO.toString());
    this.router.navigate(["edit5"])
  }


}
