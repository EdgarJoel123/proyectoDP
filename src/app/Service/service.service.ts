import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from "@angular/common/http";
//import { Unidad } from '../Modelo/Unidad';
import { Matriz } from '../Modelo/Matriz';
import { Observable } from 'rxjs/internal/Observable';
//import { token } from './path/to/token';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  


  constructor(private http: HttpClient) { }

  

  Url = 'https://app.eeasa.com.ec/WSProyectosdp/api/v1/unidad';

  UrlMatriz = "https://app.eeasa.com.ec/WSProyectosdp/listar/matriz";
  UrlMatrizN = "https://app.eeasa.com.ec/WSProyectosdp/listar/matrizN";
  UrlMatrizID = "https://app.eeasa.com.ec/WSProyectosdp/listar";

  UrlETPresupuestaria = "https://app.eeasa.com.ec/WSProyectosdp/listar/presupuestaria";
  UrlTCompra = "https://app.eeasa.com.ec/WSProyectosdp/listar/tcompra";
  UrlProcedimiento = "https://app.eeasa.com.ec/WSProyectosdp/listar/procedimiento";
  UrlTProducto = "https://app.eeasa.com.ec/WSProyectosdp/listar/tproducto";
  UrlTRegimen = "https://app.eeasa.com.ec/WSProyectosdp/listar/tregimen";
  UrlTPrespuesto = "https://app.eeasa.com.ec/WSProyectosdp/listar/tpresupuesto";
  UrlTProyecto  = "https://app.eeasa.com.ec/WSProyectosdp/listar/tproyecto";
  UrlDepartamentos = "https://app.eeasa.com.ec/WSProyectosdp/listar/departamento";
  UrlUnidad = "https://app.eeasa.com.ec/WSProyectosdp/listar/unidad";

  apiUrl = 'https://app.eeasa.com.ec/WSSisgerhServices/rest/security';
 /* public static readonly httpOptions = {

    'Authorization': `Bearer ${token}`
    
  };*/


 /* getPrueba() {
    return this.http.get<Unidad[]>(this.Url)
  }*/

  login(username: string, password: string): Observable<any> {
    const url = `${this.apiUrl}/validarUsuario`;
    const params = new HttpParams()
      .set('inDsgus_cuenta', username)
      .set('inDsgus_clave', password);
      
    return this.http.get<any>(url, { params });
  }
    
  getUnidad(): Observable<any> {
    return this.http.get<Matriz>(this.UrlUnidad);
  }

  getDepartamento(): Observable<any> {
    return this.http.get<Matriz>(this.UrlDepartamentos);
  }
  
  getTProyecto(): Observable<any> {
    return this.http.get<Matriz>(this.UrlTProyecto);
  }

  getTPresupuesto(): Observable<any> {
    return this.http.get<Matriz>(this.UrlTPrespuesto);
  }


  getTRegimen(): Observable<any> {
    return this.http.get<Matriz>(this.UrlTRegimen);
  }

  getETProdcuto(): Observable<any> {
    return this.http.get<Matriz>(this.UrlTProducto);
  }

  getETProsedimiento(): Observable<any> {
    return this.http.get<Matriz>(this.UrlProcedimiento);
  }

  getETPresupuestaria(): Observable<any> {
    return this.http.get<Matriz>(this.UrlETPresupuestaria);
  }

  getTCompra(): Observable<any> {
    return this.http.get<Matriz>(this.UrlTCompra);
  }

  getMatriz(): Observable<any> {
    return this.http.get<Matriz>(this.UrlMatriz);
  }

  getMatrizNuevos(): Observable<any> {
    return this.http.get<Matriz>(this.UrlMatrizN);
  }

  getMatrizID(id: number): Observable<any> {
    const params = { PK_PPRO_CODIGO_UNICO: id.toString() };
    return this.http.get<Matriz>(`${this.UrlMatrizID}/buscar/id/`, { params });
  }
  

  updateMatrizPrincipal(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/listar/editar/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('PPRO_ANIO', matriz.ppro_ANIO)
      .set('PPRO_CANTIDAD_ANUAL', matriz.ppro_CANTIDAD_ANUAL)
      .set('PPRO_CATALOGO_ELECTRONICO', matriz.ppro_CATALOGO_ELECTRONICO)
      .set('PPRO_CODIGO_CATEGORIA_CPC', matriz.ppro_CODIGO_CATEGORIA_CPC.toString())
      .set('PPRO_CODIGO_SERCOP', matriz.ppro_CODIGO_SERCOP)
      .set('PPRO_COSTO_UNITARIO', matriz.ppro_COSTO_UNITARIO.toString())
      .set('PPRO_CUATRIMESTRE_N1', matriz.ppro_CUATRIMESTRE_N1)
      .set('PPRO_CUATRIMESTRE_N2', matriz.ppro_CUATRIMESTRE_N2)
      .set('PPRO_CUATRIMESTRE_N3', matriz.ppro_CUATRIMESTRE_N3)
      .set('PPRO_DETALLE_PRODUCTO', matriz.ppro_DETALLE_PRODUCTO)
      .set('PPRO_FECHA_FINAL', matriz.ppro_FECHA_FINAL.toString())
      .set('PPRO_FECHA_INICIAL', matriz.ppro_FECHA_INICIAL.toString())
      .set('PPRO_FONDOS_BID', matriz.ppro_FONDOS_BID)
      .set('PPRO_NUMERO_CODIGO_OPERACION_P', matriz.ppro_NUMERO_CODIGO_OPERACION_P)
      .set('PPRO_NUMERO_CODIGO_PROYECTO_BI',matriz.ppro_NUMERO_CODIGO_PROYECTO_BI)
      .set('PPRO_NUMERO_CONTRATO', matriz.ppro_NUMERO_CONTRATO)
      .set('PPRO_OBSERVACIONES', matriz.ppro_OBSERVACIONES)
      .set('PPRO_PLAZO', matriz.ppro_PLAZO)
      .set('PPRO_CODIGO_RAPIDO', matriz.ppro_CODIGO_RAPIDO)
      .set('PPRO_PRESUPUESTO_INICIAL', matriz.ppro_PRESUPUESTO_INICIAL.toString())
      .set('PPRO_PRESUPUESTO_CODIFICADO', matriz.ppro_PRESUPUESTO_CODIFICADO.toString())
      .set('FK_PETAPRE_ID', matriz.pk_PETAPRE_ID)
      .set('FK_PDE_DMEOR_CODIGO', matriz.pk_PDE_DMEOR_CODIGO)
      .set('FK_PPRSE_ID_PER', matriz.pk_PPRSE_ID.toString())
      .set('FK_PTICO_ID_PER', matriz.pk_PTICO_ID.toString())
      .set('FK_PTIPRE_ID_PER', matriz.pk_PTIPRE_ID.toString())
      .set('FK_PTIPO_ID_PER', matriz.pk_PTIPO_ID.toString())
      .set('FK_PTIPRO_ID_PER', matriz.pk_PTIPRO_ID.toString())
      .set('FK_PTIRE_ID_PER', matriz.pk_PTIPRE_ID.toString())
      .set('FK_PUNI_ID_PER', matriz.pk_PUNI_ID.toString())



    return this.http.put<Matriz>(url, {}, { params });
  }
  updateMatrizDevengado(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/editar/devengado/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('PVADE_VALOR_DEVENGADO', matriz.pvade_VALOR_DEVENGADO.toString())
      .set('PVADE_OBSERVACIONES_VD', matriz.pvade_OBSERVACIONES_VA);
    return this.http.put<Matriz>(url, {}, { params });
  }

  updateMatrizPorcentaje(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/editar/porcentaje/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('PPOAVFIDE_PORCENTAJE_AVANCE_FI', matriz.ppoavfide_PORCENTAJE_AVANCE_FI.toString())
      .set('PPOAVFIDE_OBSERVACIONES_PA', matriz.ppoavfide_OBSERVACIONES_PA);
    return this.http.put<Matriz>(url, {}, { params });
  }

  updateMatrizPartida(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/editar/partida/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('PPAPRE_PARTIDA_PRESUPUESTARIA', matriz.ppapre_PARTIDA_PRESUPUESTARIA)
    return this.http.put<Matriz>(url, {}, { params });
  }

  updateMatrizResponsable(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/editar/responsable/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('FK_DMPER_CODIGO', matriz.FK_DMPER_CODIGO)
    return this.http.put<Matriz>(url, {}, { params });
  }
  
  
  updateMatrizFisico(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/editar/fisico/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('PAC_ACTIVIDAD_ENERO', matriz.pac_ACTIVIDAD_ENERO)
      .set('PAC_ACTIVIDAD_FEBRERO', matriz.pac_ACTIVIDAD_FEBRERO)
      .set('PAC_ACTIVIDAD_MARZO', matriz.pac_ACTIVIDAD_MARZO)
      .set('PAC_ACTIVIDAD_ABRIL', matriz.pac_ACTIVIDAD_ABRIL)
      .set('PAC_ACTIVIDAD_MAYO', matriz.pac_ACTIVIDAD_MAYO)
      .set('PAC_ACTIVIDAD_JUNIO',matriz.pac_ACTIVIDAD_JUNIO)
      .set('PAC_ACTIVIDAD_JULIO', matriz.pac_ACTIVIDAD_JULIO)
      .set('PAC_ACTIVIDAD_AGOSTO', matriz.pac_ACTIVIDAD_AGOSTO)
      .set('PAC_ACTIVIDAD_SEPTIEMBRE', matriz.pac_ACTIVIDAD_SEPTIEMBRE)
      .set('PAC_ACTIVIDAD_OCTUBRE', matriz.pac_ACTIVIDAD_OCTUBRE)
      .set('PAC_ACTIVIDAD_NOVIEMBRE', matriz.pac_ACTIVIDAD_NOVIEMBRE)
      .set('PAC_ACTIVIDAD_DICIEMBRE', matriz.pac_ACTIVIDAD_DICIEMBRE)
    return this.http.put<Matriz>(url, {}, { params });
  }

  updateMatrizPresupuesto(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/editar/presupuesto/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('PPRES_ACTIVIDAD_ENERO', matriz.ppres_ACTIVIDAD_ENERO)
      .set('PPRES_ACTIVIDAD_FEBRERO', matriz.ppres_ACTIVIDAD_FEBRERO)
      .set('PPRES_ACTIVIDAD_MARZO', matriz.ppres_ACTIVIDAD_MARZO)
      .set('PPRES_ACTIVIDAD_ABRIL', matriz.ppres_ACTIVIDAD_ABRIL)
      .set('PPRES_ACTIVIDAD_MAYO', matriz.ppres_ACTIVIDAD_MAYO)
      .set('PPRES_ACTIVIDAD_JUNIO',matriz.ppres_ACTIVIDAD_JUNIO)
      .set('PPRES_ACTIVIDAD_JULIO', matriz.ppres_ACTIVIDAD_JULIO)
      .set('PPRES_ACTIVIDAD_AGOSTO', matriz.ppres_ACTIVIDAD_AGOSTO)
      .set('PPRES_ACTIVIDAD_SEPTIEMBRE', matriz.ppres_ACTIVIDAD_SEPTIEMBRE)
      .set('PPRES_ACTIVIDAD_OCTUBRE', matriz.ppres_ACTIVIDAD_OCTUBRE)
      .set('PPRES_ACTIVIDAD_NOVIEMBRE', matriz.ppres_ACTIVIDAD_NOVIEMBRE)
      .set('PPRES_ACTIVIDAD_DICIEMBRE', matriz.ppres_ACTIVIDAD_DICIEMBRE)
    return this.http.put<Matriz>(url, {}, { params });
  }

  updateMatrizCertificado(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/editar/certificado/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('PCER_ACTIVIDAD_ENERO', matriz.pcer_ACTIVIDAD_ENERO)
      .set('PCER_ACTIVIDAD_FEBRERO', matriz.pcer_ACTIVIDAD_FEBRERO)
      .set('PCER_ACTIVIDAD_MARZO', matriz.pcer_ACTIVIDAD_MARZO)
      .set('PCER_ACTIVIDAD_ABRIL', matriz.pcer_ACTIVIDAD_ABRIL)
      .set('PCER_ACTIVIDAD_MAYO', matriz.pcer_ACTIVIDAD_MAYO)
      .set('PCER_ACTIVIDAD_JUNIO',matriz.pcer_ACTIVIDAD_JUNIO)
      .set('PCER_ACTIVIDAD_JULIO', matriz.pcer_ACTIVIDAD_JULIO)
      .set('PCER_ACTIVIDAD_AGOSTO', matriz.pcer_ACTIVIDAD_AGOSTO)
      .set('PCER_ACTIVIDAD_SEPTIEMBRE', matriz.pcer_ACTIVIDAD_SEPTIEMBRE)
      .set('PCER_ACTIVIDAD_OCTUBRE', matriz.pcer_ACTIVIDAD_OCTUBRE)
      .set('PCER_ACTIVIDAD_NOVIEMBRE', matriz.pcer_ACTIVIDAD_NOVIEMBRE)
      .set('PCER_ACTIVIDAD_DICIEMBRE', matriz.pcer_ACTIVIDAD_DICIEMBRE)
    return this.http.put<Matriz>(url, {}, { params });
  }

  updateMatrizPagado(matriz: Matriz) {
    const url = `https://app.eeasa.com.ec/WSProyectosdp/editar/pagado/${matriz.pk_PPRO_CODIGO_UNICO}`;
    const params = new HttpParams()
      .set('PPAG_ACTIVIDAD_ENERO', matriz.ppag_ACTIVIDAD_ENERO)
      .set('PPAG_ACTIVIDAD_FEBRERO', matriz.ppag_ACTIVIDAD_FEBRERO)
      .set('PPAG_ACTIVIDAD_MARZO', matriz.ppag_ACTIVIDAD_MARZO)
      .set('PPAG_ACTIVIDAD_ABRIL', matriz.ppag_ACTIVIDAD_ABRIL)
      .set('PPAG_ACTIVIDAD_MAYO', matriz.ppag_ACTIVIDAD_MAYO)
      .set('PPAG_ACTIVIDAD_JUNIO',matriz.ppag_ACTIVIDAD_JUNIO)
      .set('PPAG_ACTIVIDAD_JULIO', matriz.ppag_ACTIVIDAD_JULIO)
      .set('PPAG_ACTIVIDAD_AGOSTO', matriz.ppag_ACTIVIDAD_AGOSTO)
      .set('PPAG_ACTIVIDAD_SEPTIEMBRE', matriz.ppag_ACTIVIDAD_SEPTIEMBRE)
      .set('PPAG_ACTIVIDAD_OCTUBRE', matriz.ppag_ACTIVIDAD_OCTUBRE)
      .set('PPAG_ACTIVIDAD_NOVIEMBRE', matriz.ppag_ACTIVIDAD_NOVIEMBRE)
      .set('PPAG_ACTIVIDAD_DICIEMBRE', matriz.ppag_ACTIVIDAD_DICIEMBRE)
    return this.http.put<Matriz>(url, {}, { params });
  }

}
