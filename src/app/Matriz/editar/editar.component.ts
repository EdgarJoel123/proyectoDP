import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { Router } from '@angular/router';
//import { Unidad } from 'src/app/Modelo/Unidad';
import { ServiceService } from "../../Service/service.service";
import { Matriz } from 'src/app/Modelo/Matriz';

import { VentanaEmergenteComponent } from '../ventana-emergente/ventana-emergente.component';
import { MatDialog } from '@angular/material/dialog';


@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit {

  opciones = [
    { texto: 'SeleccionEtapaPresuestoa una opción', valor: null },
    { texto: '01 GENERACION', valor: 1 },
    { texto: '02 SUBTRANSMISION', valor: 2 },
    { texto: '03 DISTRIBUCION', valor: 3 },
    { texto: '03 DISTRIBUCION - CREDITO EXTERNO', valor: 4 },
    { texto: '04 ALUMBRADO PUBLICO', valor: 5 },
    { texto: '05 ACOMETIDAS Y MEDIDORES', valor: 6 },
    { texto: '06 INVERSIONES GENERALES', valor: 7 }
  ];


  matriz: Matriz = new Matriz();
  matrices1: Matriz[];
  matrices2: Matriz[];
  matrices3: Matriz[];
  matrices4: Matriz[];
  matrices5: Matriz[];
  matrices6: Matriz[];
  matrices7: Matriz[];
  matrices8: Matriz[];
  matrices9: Matriz[];
  codigoUnico: number;
  ppro_CODIGO_CATEGORIA_CPC: number;
  ppro_DETALLE_PRODUCTO: string;
  ppro_CUATRIMESTRE_N1: string;
  ppro_CUATRIMESTRE_N2: string;
  ppro_CUATRIMESTRE_N3: string;
  ppro_CATALOGO_ELECTRONICO: string;
  ppro_FONDOS_BID: string;
  ppro_NUMERO_CODIGO_OPERACION_P: string;
  ppro_NUMERO_CODIGO_PROYECTO_BI: string;
  ppro_PLAZO: string;
  ppro_FECHA_INICIAL: Date;
  ppro_FECHA_FINAL: Date;
  ppro_OBSERVACIONES: string;
  ppro_NUMERO_CONTRATO: string;
  ppro_CODIGO_SERCOP: string;
  ppro_CANTIDAD_ANUAL: string;
  ppro_COSTO_UNITARIO: number;
  anio: string;
  ppro_CODIGO_RAPIDO: string;
  ppro_PRESUPUESTO_INICIAL: number;
  ppro_PRESUPUESTO_CODIFICADO: number;
  petapre_ETAPA_PRESUPUESTO: string;
  //pproJECTDP_DEPARTAMENTO
  pde_DEPARTAMENTO: string;
  //pproJECTDP_PARTIDA_PRESUPUESTARIA
  ppapre_PARTIDA_PRESUPUESTARIA: string;
  //pproJECTDP_PORCENTAJE_AVANCE_FI
  ppoavfide_PORCENTAJE_AVANCE_FI: Number;
  ppavfide_FECHA_PA: Date;
  ppavfide_OBSERVACIONES_PA: string;
  //pproJECTDP_pproCEDIMIENTO_SERCOP
  pprse_PROCEDIMIENTO_SERCOP: number;
  /*pproJECTDP_RESPONSABLE_TECNICO
      PRETE_NOMBRE:string;
      PRETE_APELLIDO:string;
      PRETE_ROL:string;
      PRETE_USUARIO:string;*/
  //pproJECTDP_TIPO_COMPRA
  ptico_TIPO_COMPRA: number;
  //pproJECTDP_TIPO_PRESUPUESTO
  ptipre_TIPO_PRESUPUESTO: number;
  //pproJECTDP_TIPO_pproDUCTO
  ptipo_TIPO_PRODUCTO: number;

  //pproJECTDP_TIPO_pproYECTO
  ptipro_TIPO_PROYECTO: number;
  //pproJECTDP_TIPO_REGIMEN
  ptire_TIPO_REGIMEN: number;
  //pproJECTDP_UNIDAD
  puni_UNIDAD: number;
  //pproJECTDP_VALOR_DEVENGADO
  pvade_VALOR_DEVENGADO: number;
  pvade_FECHA_VD: Date;
  pvade_OBSERVACIONES_VD: string;
  estado: String;

  prete_NOMBRE_APELLIDO: string;

  porcentaje: number;

  FK_DMPER_CODIGO: string;

  pk_PETAPRE_ID: string;

  //unidades: Unidad[];
  palabraBusqueda: string; // Agregar esta línea

  inputWidthObservacion: string = '100px';
  inputWidthDetalle: string = '100px';


  seleccionEtapaPresuesto: string = '';


  currentYear: number; // Definir propiedad en la clase


  constructor(private dialog: MatDialog, private service: ServiceService, private router: Router) {

    this.currentYear = new Date().getFullYear(); // Asignar valor en el constructor
  }


  ngOnInit() {
    this.Editar();
    this.selectETprespuestaria();
    this.selectTCompra();
    this.selectProcedimiento();
    this.selectTProducto();
    this.selectTRegimen();
    this.selectTPresupuesto();
    this.selectTProyecto();
    this.selectDepartamentos();
    this.selectUnidad();
  }


  selectETprespuestaria() {
    this.service.getETPresupuestaria()
      .subscribe(datos => {
        this.matrices1 = datos;
      })
  }

  selectTCompra() {
    this.service.getTCompra()
      .subscribe(datos => {
        this.matrices2 = datos;
      })
  }

  selectProcedimiento() {
    this.service.getETProsedimiento()
      .subscribe(datos => {
        this.matrices3 = datos;
      })
  }

  selectTProducto() {
    this.service.getETProdcuto()
      .subscribe(datos => {
        this.matrices4 = datos;
      })
  }

  selectTRegimen() {
    this.service.getTRegimen()
      .subscribe(datos => {
        this.matrices5 = datos;
      })
  }

  selectTPresupuesto() {
    this.service.getTPresupuesto()
      .subscribe(datos => {
        this.matrices6 = datos;
      })
  }

  selectTProyecto() {
    this.service.getTProyecto()
      .subscribe(datos => {
        this.matrices7 = datos;
      })
  }

  selectDepartamentos() {
    this.service.getDepartamento()
      .subscribe(datos => {
        this.matrices8 = datos;
      })
  }

  selectUnidad() {
    this.service.getUnidad()
      .subscribe(datos => {
        this.matrices9 = datos;
      })
  }

  onInput() {

    this.ppro_CODIGO_RAPIDO = this.ppro_CODIGO_RAPIDO.toUpperCase();
    this.ppapre_PARTIDA_PRESUPUESTARIA = this.ppapre_PARTIDA_PRESUPUESTARIA.toUpperCase();
    this.ppro_DETALLE_PRODUCTO = this.ppro_DETALLE_PRODUCTO.toUpperCase();
    this.ppro_CANTIDAD_ANUAL = this.ppro_CANTIDAD_ANUAL.toUpperCase();
    this.ppro_CUATRIMESTRE_N1 = this.ppro_CUATRIMESTRE_N1.toUpperCase();
    this.ppro_CUATRIMESTRE_N2 = this.ppro_CUATRIMESTRE_N2.toUpperCase();
    this.ppro_CUATRIMESTRE_N3 = this.ppro_CUATRIMESTRE_N3.toUpperCase();

  }

  onInput1() {
    this.ppro_NUMERO_CODIGO_OPERACION_P = this.ppro_NUMERO_CODIGO_OPERACION_P.toUpperCase();
    this.ppro_NUMERO_CODIGO_PROYECTO_BI = this.ppro_NUMERO_CODIGO_PROYECTO_BI.toUpperCase();
    this.ppro_OBSERVACIONES = this.ppro_OBSERVACIONES.toUpperCase();
    this.ppro_NUMERO_CONTRATO = this.ppro_NUMERO_CONTRATO.toUpperCase();
    this.ppro_CODIGO_SERCOP = this.ppro_CODIGO_SERCOP.toUpperCase();


  }


  onYearChange() {
    const year = parseInt(this.anio);
    if (year > this.currentYear) {
      alert('El año no puede ser mayor al actual');
      this.anio = '';
    }
  }


  onKeyPress(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^\d+$/.test(charStr) || this.anio?.length >= 4) {
      event.preventDefault();
    }
  }
  onKeyPress1(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (charStr.toUpperCase() !== 'S') {
      event.preventDefault();
    }
  }

  onKeyPress2(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppro_CANTIDAD_ANUAL?.length >= 10 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  onKeyPress3(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppro_NUMERO_CODIGO_OPERACION_P?.length >= 25 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  
  onKeyPress4(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppro_NUMERO_CODIGO_PROYECTO_BI?.length >= 25 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  onKeyPress5(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.pvade_OBSERVACIONES_VD?.length >= 500 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  onKeyPress6(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppavfide_OBSERVACIONES_PA?.length >= 500 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  onKeyPress7(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppro_OBSERVACIONES?.length >= 500 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  onKeyPress8(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppro_DETALLE_PRODUCTO?.length >= 500 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  onKeyPress9(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppro_NUMERO_CONTRATO?.length >= 38 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  onKeyPress10(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppro_CODIGO_RAPIDO?.length >= 10 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }

  onKeyPress11(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppapre_PARTIDA_PRESUPUESTARIA?.length >= 200 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }
  

  onKeyPress12(event: KeyboardEvent) {
    const charCode = event.which ? event.which : event.keyCode;
    const charStr = String.fromCharCode(charCode);
    if (!/^[a-zA-Z0-9\s]*$/.test(charStr) || (this.ppro_CODIGO_SERCOP?.length >= 30 && !event.ctrlKey && !event.metaKey)) {
      event.preventDefault();
    }
  }






  mostrarSeleccionEtapaPresuesto() {
    console.log(this.petapre_ETAPA_PRESUPUESTO);
    const opcionSeleccionEtapaPresuestoada = this.opciones.find(opcion => opcion.valor === parseInt(this.ppapre_PARTIDA_PRESUPUESTARIA));
    if (opcionSeleccionEtapaPresuestoada) {
      const valorNumerico = opcionSeleccionEtapaPresuestoada.valor;
      console.log(valorNumerico);
    }
  }

  convertToUpperCase(event: any) {
    const charCode = event.which ? event.which : event.keyCode;
    const char = String.fromCharCode(charCode);
    if (/^[a-z]+$/.test(char)) {
      event.preventDefault();
      event.target.value = event.target.value.toUpperCase() + char.toUpperCase();
    }
  }
  


  convertirMayuscula(): void {
    this.palabraBusqueda = this.palabraBusqueda.toUpperCase();
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

            this.ppro_CODIGO_RAPIDO = this.matriz.ppro_CODIGO_RAPIDO;
            this.ppro_PRESUPUESTO_INICIAL = this.matriz.ppro_PRESUPUESTO_INICIAL;
            this.ppro_PRESUPUESTO_CODIFICADO = this.matriz.ppro_PRESUPUESTO_CODIFICADO;
            this.petapre_ETAPA_PRESUPUESTO = this.matriz.pk_PETAPRE_ID;
            console.log(this.petapre_ETAPA_PRESUPUESTO);
            this.anio = this.matriz.ppro_ANIO;
            this.ppapre_PARTIDA_PRESUPUESTARIA = this.matriz.ppapre_PARTIDA_PRESUPUESTARIA;
            this.ppro_CODIGO_CATEGORIA_CPC = this.matriz.ppro_CODIGO_CATEGORIA_CPC;
            this.ptico_TIPO_COMPRA = this.matriz.pk_PTICO_ID;
            console.log(this.ptico_TIPO_COMPRA);
            this.pprse_PROCEDIMIENTO_SERCOP = this.matriz.pk_PPRSE_ID;
            console.log(this.pprse_PROCEDIMIENTO_SERCOP);
            this.ppro_DETALLE_PRODUCTO = this.matriz.ppro_DETALLE_PRODUCTO;
            //this.inputWidthDetalle = (this.ppro_DETALLE_PRODUCTO.length * 20) + 'px';
            this.ppro_CANTIDAD_ANUAL = this.matriz.ppro_CANTIDAD_ANUAL;
            this.ppro_COSTO_UNITARIO = this.matriz.ppro_COSTO_UNITARIO;
            this.ppro_CUATRIMESTRE_N1 = this.matriz.ppro_CUATRIMESTRE_N1;
            this.ppro_CUATRIMESTRE_N2 = this.matriz.ppro_CUATRIMESTRE_N2;
            this.ppro_CUATRIMESTRE_N3 = this.matriz.ppro_CUATRIMESTRE_N3;
            this.ptipo_TIPO_PRODUCTO = this.matriz.pk_PTIPO_ID;
            console.log(this.ptipo_TIPO_PRODUCTO);
            this.ppro_CATALOGO_ELECTRONICO = this.matriz.ppro_CATALOGO_ELECTRONICO;
            this.ppro_FONDOS_BID = this.matriz.ppro_FONDOS_BID;
            this.ppro_NUMERO_CODIGO_OPERACION_P = this.matriz.ppro_NUMERO_CODIGO_OPERACION_P;
            this.ppro_NUMERO_CODIGO_PROYECTO_BI = this.matriz.ppro_NUMERO_CODIGO_PROYECTO_BI;
            this.ptire_TIPO_REGIMEN = this.matriz.pk_PTIRE_ID;
            console.log(this.ptire_TIPO_REGIMEN);
            this.ptipre_TIPO_PRESUPUESTO = this.matriz.pk_PTIPRE_ID;
            console.log(this.ptipre_TIPO_PRESUPUESTO);
            this.ptipro_TIPO_PROYECTO = this.matriz.pk_PTIPRO_ID;
            console.log(this.ptipro_TIPO_PROYECTO);
            this.pde_DEPARTAMENTO = this.matriz.pk_PDE_DMEOR_CODIGO;
            console.log(this.pde_DEPARTAMENTO);
            this.puni_UNIDAD = this.matriz.pk_PUNI_ID;
            console.log(this.puni_UNIDAD);
            this.prete_NOMBRE_APELLIDO = this.matriz.prete_NOMBRE + " " + this.matriz.prete_APELLIDO;
            this.ppro_PLAZO = this.matriz.ppro_PLAZO;
            this.pvade_VALOR_DEVENGADO = this.matriz.pvade_VALOR_DEVENGADO;
            this.pvade_FECHA_VD = this.matriz.pvade_FECHA_VA;
            this.pvade_OBSERVACIONES_VD = this.matriz.pvade_OBSERVACIONES_VA;
            this.ppoavfide_PORCENTAJE_AVANCE_FI = this.matriz.ppoavfide_PORCENTAJE_AVANCE_FI;
            this.porcentaje = Number(this.ppoavfide_PORCENTAJE_AVANCE_FI) * 100;
            this.ppavfide_FECHA_PA = this.matriz.ppoavfide_FECHA_PA;
            this.ppavfide_OBSERVACIONES_PA = this.matriz.ppoavfide_OBSERVACIONES_PA;
            this.ppro_OBSERVACIONES = this.matriz.ppro_OBSERVACIONES;
            //this.inputWidthObservacion = (this.ppro_OBSERVACIONES.length * 20) + 'px';
            
            this.ppro_FECHA_INICIAL = this.matriz.ppro_FECHA_INICIAL;
            console.log(this.ppro_FECHA_INICIAL);
            this.ppro_FECHA_FINAL = this.matriz.ppro_FECHA_FINAL;
            this.ppro_NUMERO_CONTRATO = this.matriz.ppro_NUMERO_CONTRATO;
            this.ppro_CODIGO_SERCOP = this.matriz.ppro_CODIGO_SERCOP;
            this.estado = this.matriz.estado;











          }
        });
    }
  }



  ActualizarPrincipal(matriz: Matriz) {

    matriz.ppro_ANIO = this.anio;
    matriz.ppro_CANTIDAD_ANUAL = this.ppro_CANTIDAD_ANUAL;
    matriz.ppro_CATALOGO_ELECTRONICO = this.ppro_CATALOGO_ELECTRONICO;
    matriz.ppro_CODIGO_CATEGORIA_CPC = this.ppro_CODIGO_CATEGORIA_CPC;
    matriz.ppro_CODIGO_SERCOP = this.ppro_CODIGO_SERCOP;
    matriz.ppro_COSTO_UNITARIO = this.ppro_COSTO_UNITARIO;
    matriz.ppro_CUATRIMESTRE_N1 = this.ppro_CUATRIMESTRE_N1;
    matriz.ppro_CUATRIMESTRE_N2 = this.ppro_CUATRIMESTRE_N2;
    matriz.ppro_CUATRIMESTRE_N3 = this.ppro_CUATRIMESTRE_N3;
    matriz.ppro_DETALLE_PRODUCTO = this.ppro_DETALLE_PRODUCTO;
    matriz.ppro_FECHA_FINAL = this.ppro_FECHA_FINAL;
    matriz.ppro_FECHA_INICIAL = this.ppro_FECHA_INICIAL;
    matriz.ppro_FONDOS_BID = this.ppro_FONDOS_BID;
    matriz.ppro_NUMERO_CODIGO_OPERACION_P = this.ppro_NUMERO_CODIGO_OPERACION_P;
    matriz.ppro_NUMERO_CODIGO_PROYECTO_BI = this.ppro_NUMERO_CODIGO_PROYECTO_BI;
    matriz.ppro_NUMERO_CONTRATO = this.ppro_NUMERO_CONTRATO;
    matriz.ppro_OBSERVACIONES = this.ppro_OBSERVACIONES;
    matriz.ppro_PLAZO = this.ppro_PLAZO;
    matriz.ppro_CODIGO_RAPIDO = this.ppro_CODIGO_RAPIDO;
    matriz.ppro_PRESUPUESTO_INICIAL = this.ppro_PRESUPUESTO_INICIAL;
    matriz.ppro_PRESUPUESTO_CODIFICADO = this.ppro_PRESUPUESTO_CODIFICADO;

    matriz.pk_PETAPRE_ID = this.petapre_ETAPA_PRESUPUESTO;
    matriz.pk_PDE_DMEOR_CODIGO = this.pde_DEPARTAMENTO;
    matriz.pk_PPRSE_ID = this.pprse_PROCEDIMIENTO_SERCOP;
    matriz.pk_PTICO_ID = this.ptico_TIPO_COMPRA;
    matriz.pk_PTIPRE_ID = this.ptipre_TIPO_PRESUPUESTO;
    matriz.pk_PTIPO_ID = this.ptipo_TIPO_PRODUCTO;
    matriz.pk_PTIPRO_ID = this.ptipro_TIPO_PROYECTO;
    matriz.pk_PTIRE_ID = this.ptire_TIPO_REGIMEN;
    matriz.pk_PUNI_ID = this.puni_UNIDAD;


    this.service.updateMatrizPrincipal(matriz)
      .subscribe(
        data => {
          this.matriz = data;
          alert("Se actualizó correctamente.");
          this.router.navigate(["listar"]);
        },
        error => {
          alert("Hubo un error en la actualizacion intentelo de nuevo ");
          console.log(error);
          this.router.navigate(["edit1"]);
          // Opcional: puedes imprimir el error en la consola del navegador.
        }
      );

  }

  ActualizarDevengado(matriz: Matriz) {

    matriz.pvade_VALOR_DEVENGADO = this.pvade_VALOR_DEVENGADO;
    matriz.pvade_OBSERVACIONES_VA = this.pvade_OBSERVACIONES_VD;
    this.service.updateMatrizDevengado(matriz)
      .subscribe(data => {
        this.matriz = data;
        //alert("se actualizo");
        this.router.navigate(["listar"]);

      })

  }


  ActualizarPorcentaje(matriz: Matriz) {

    matriz.ppoavfide_PORCENTAJE_AVANCE_FI = Number(this.ppoavfide_PORCENTAJE_AVANCE_FI) / 100;
    matriz.ppoavfide_OBSERVACIONES_PA = this.ppavfide_OBSERVACIONES_PA;

    this.service.updateMatrizPorcentaje(matriz)
      .subscribe(data => {
        this.matriz = data;
        //alert("se actualizo");
        this.router.navigate(["listar"]);

      })

  }

  ActualizarPartida(matriz: Matriz) {

    matriz.ppapre_PARTIDA_PRESUPUESTARIA = this.ppapre_PARTIDA_PRESUPUESTARIA;

    this.service.updateMatrizPartida(matriz)
      .subscribe(data => {
        this.matriz = data;
        //alert("se actualizo");
        this.router.navigate(["listar"]);

      })

  }

  ActualizarResponsable(matriz: Matriz) {

    matriz.FK_DMPER_CODIGO = this.FK_DMPER_CODIGO;

    this.service.updateMatrizResponsable(matriz)
      .subscribe(data => {
        this.matriz = data;
        alert("se actualizo");
        this.router.navigate(["listar"]);

      })

  }


  ActualizadorCompleto(matriz: Matriz) {

    const dialogRef = this.dialog.open(VentanaEmergenteComponent, {
      data: {
        title: 'Confirmación',
        message: '¿Estás seguro que quieres actualizar este registro?'
      }
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {

        this.ActualizarDevengado(matriz);        
        this.ActualizarPorcentaje(matriz);
        this.ActualizarPartida(matriz);
        this.ActualizarPrincipal(matriz);

      }
    });

  }


}
