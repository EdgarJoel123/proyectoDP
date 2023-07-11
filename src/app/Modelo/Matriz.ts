export class Matriz {
    //aqui va todos los id y tipo de datos de todos los datos de matriz qu quiero 
    // id:number, -> ejem
    //pproJECTDP_pproYECTOS
    [key: string]: any;
    pk_PPRO_CODIGO_UNICO: number;
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
    ppro_ANIO: string;
    ppro_CODIGO_RAPIDO: string;
    ppro_PRESUPUESTO_INICIAL: number;
    ppro_PRESUPUESTO_CODIFICADO: number;
    petapre_ETAPA_PRESUPUESTO: string;

    //pproJECTDP_ACTIVIDADES fisico
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
    //pproJECTDP_DEPARTAMENTO
    pde_DEPARTAMENTO: string;
    pk_PDE_DMEOR_CODIGO: string;
    //pproJECTDP_PARTIDA_PRESUPUESTARIA
    ppapre_PARTIDA_PRESUPUESTARIA: string;
    //pproJECTDP_PORCENTAJE_AVANCE_FI
    ppoavfide_PORCENTAJE_AVANCE_FI: Number;
    ppoavfide_FECHA_PA: Date;
    ppoavfide_OBSERVACIONES_PA: string;
    //pproJECTDP_pproCEDIMIENTO_SERCOP
    pprse_PROCEDIMIENTO_SERCOP: string;
    pk_PPRSE_ID: number;
    /*pproJECTDP_RESPONSABLE_TECNICO
        PRETE_NOMBRE:string;
        PRETE_APELLIDO:string;
        PRETE_ROL:string;
        PRETE_USUARIO:string;*/
    //pproJECTDP_TIPO_COMPRA
    ptico_TIPO_COMPRA: string;
    pk_PTICO_ID: number;

    //pproJECTDP_TIPO_PRESUPUESTO
    ptipre_TIPO_PRESUPUESTO: string;
    pk_PTIPRE_ID:number;
    //pproJECTDP_TIPO_pproDUCTO
    ptipo_TIPO_PRODUCTO: string;
    pk_PTIPO_ID: number;
    //pproJECTDP_TIPO_pproYECTO
    ptipro_TIPO_PROYECTO: string;
    pk_PTIPRO_ID:number;
    //pproJECTDP_TIPO_REGIMEN
    ptire_TIPO_REGIMEN: string;
    pk_PTIRE_ID: number;
    //pproJECTDP_UNIDAD
    puni_UNIDAD: string;
    pk_PUNI_ID: number;
    
    //pproJECTDP_VALOR_DEVENGADO
    pvade_VALOR_DEVENGADO: number;
    pvade_FECHA_VA: Date;
    pvade_OBSERVACIONES_VA: string;
    estado: String;

    prete_NOMBRE: string;
    prete_APELLIDO: string;
    prete_ROL: string;
    prete_DMEOR_CODIGO: string;
    FK_DMPER_CODIGO: string;

    pk_PETAPRE_ID: string;

    //actividades_presupuestario

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



}
