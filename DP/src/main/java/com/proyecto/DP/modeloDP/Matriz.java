package com.proyecto.DP.modeloDP;



import sun.util.calendar.BaseCalendar;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_PROYECTOS")
public class Matriz implements Serializable {
    //PROJECTDP_PROYECTOS

    /*Atributos de todos los campos que se van a listar para trabajar en
    * un entorno de de JDBC*/
    @Id
    private int PK_PPRO_CODIGO_UNICO;

    private Float PPRO_CODIGO_CATEGORIA_CPC;
    private String PPRO_DETALLE_PRODUCTO;
    private String PPRO_CUATRIMESTRE_N1;
    private String PPRO_CUATRIMESTRE_N2;
    private String PPRO_CUATRIMESTRE_N3;
    private String PPRO_CATALOGO_ELECTRONICO;
    private String PPRO_FONDOS_BID;
    private String PPRO_NUMERO_CODIGO_OPERACION_P;
    private String PPRO_NUMERO_CODIGO_PROYECTO_BI;
    private String PPRO_PLAZO;
    private String PPRO_CODIGO_RAPIDO;
    private Float  PPRO_PRESUPUESTO_INICIAL;
    private Float  PPRO_PRESUPUESTO_CODIFICADO;



    private String PK_PETAPRE_ID;

    private java.sql.Date PPRO_FECHA_INICIAL;
    private java.sql.Date PPRO_FECHA_FINAL;

    private String PPRO_OBSERVACIONES;
    private String PPRO_NUMERO_CONTRATO;
    private String PPRO_CODIGO_SERCOP;
    private String PPRO_CANTIDAD_ANUAL;
    private float PPRO_COSTO_UNITARIO;
    private String PPRO_ANIO;

    private String PAC_ACTIVIDAD_ENERO;
    private String PAC_ACTIVIDAD_NOVIEMBRE;
    private String PAC_ACTIVIDAD_DICIEMBRE;
    private String PAC_ACTIVIDAD_OCTUBRE;
    private String PAC_ACTIVIDAD_SEPTIEMBRE;
    private String PAC_ACTIVIDAD_AGOSTO;
    private String PAC_ACTIVIDAD_JULIO;
    private String PAC_ACTIVIDAD_JUNIO;
    private String PAC_ACTIVIDAD_MAYO;
    private String PAC_ACTIVIDAD_ABRIL;
    private String PAC_ACTIVIDAD_MARZO;
    private String PAC_ACTIVIDAD_FEBRERO;

    private float PPRES_ACTIVIDAD_ENERO;
    private float PPRES_ACTIVIDAD_FEBRERO;
    private float PPRES_ACTIVIDAD_MARZO;
    private float PPRES_ACTIVIDAD_ABRIL;
    private float PPRES_ACTIVIDAD_MAYO;
    private float PPRES_ACTIVIDAD_JUNIO;
    private float PPRES_ACTIVIDAD_JULIO;
    private float PPRES_ACTIVIDAD_AGOSTO;
    private float PPRES_ACTIVIDAD_SEPTIEMBRE;
    private float PPRES_ACTIVIDAD_OCTUBRE;
    private float PPRES_ACTIVIDAD_NOVIEMBRE;
    private float PPRES_ACTIVIDAD_DICIEMBRE;


    private float PCER_ACTIVIDAD_ENERO;
    private float PCER_ACTIVIDAD_FEBRERO;
    private float PCER_ACTIVIDAD_MARZO;
    private float PCER_ACTIVIDAD_ABRIL;
    private float PCER_ACTIVIDAD_MAYO;
    private float PCER_ACTIVIDAD_JUNIO;
    private float PCER_ACTIVIDAD_JULIO;
    private float PCER_ACTIVIDAD_AGOSTO;
    private float PCER_ACTIVIDAD_SEPTIEMBRE;
    private float PCER_ACTIVIDAD_OCTUBRE;
    private float PCER_ACTIVIDAD_NOVIEMBRE;
    private float PCER_ACTIVIDAD_DICIEMBRE;

    private float PPAG_ACTIVIDAD_ENERO;
    private float PPAG_ACTIVIDAD_FEBRERO;
    private float PPAG_ACTIVIDAD_MARZO;
    private float PPAG_ACTIVIDAD_ABRIL;
    private float PPAG_ACTIVIDAD_MAYO;
    private float PPAG_ACTIVIDAD_JUNIO;
    private float PPAG_ACTIVIDAD_JULIO;
    private float PPAG_ACTIVIDAD_AGOSTO;
    private float PPAG_ACTIVIDAD_SEPTIEMBRE;
    private float PPAG_ACTIVIDAD_OCTUBRE;
    private float PPAG_ACTIVIDAD_NOVIEMBRE;
    private float PPAG_ACTIVIDAD_DICIEMBRE;

    private String PDE_DEPARTAMENTO;
    private String PK_PDE_DMEOR_CODIGO;

    private String PPAPRE_PARTIDA_PRESUPUESTARIA;

    private float PPOAVFIDE_PORCENTAJE_AVANCE_FI;
    private java.sql.Date PPOAVFIDE_FECHA_PA;
    private String PPOAVFIDE_OBSERVACIONES_PA;

    private String PPRSE_PROCEDIMIENTO_SERCOP;
    private int PK_PPRSE_ID;

    private String PTICO_TIPO_COMPRA;
    private int PK_PTICO_ID;

    private  String PTIPRE_TIPO_PRESUPUESTO;
    private int PK_PTIPRE_ID;

    private String PTIPO_TIPO_PRODUCTO;
    private int PK_PTIPO_ID;

    private String PTIPRO_TIPO_PROYECTO;
    private int PK_PTIPRO_ID;

    private String PTIRE_TIPO_REGIMEN;
    private int PK_PTIRE_ID;

    private  String PUNI_UNIDAD;
    private int PK_PUNI_ID;

    private float PVADE_VALOR_DEVENGADO;
    private java.sql.Date PVADE_FECHA_VA;
    private String PVADE_OBSERVACIONES_VA;

    private String PRETE_NOMBRE;
    private String PRETE_APELLIDO;
    private String PRETE_ROL;
    private String PRETE_DMEOR_CODIGO;

    private String ESTADO;

    private String  PETAPRE_ETAPA_PRESUPUESTO;


    /*Configuracion para trabjar en un entorno de JPA*/
   /* //PROJECTDP_ACTIVIDADES
    /*@OneToMany(mappedBy = "PROJECTDP_ACTIVIDADES")
    private List<Actividades> actividadesList;
     */
   /* @OneToMany(mappedBy = "PROJECTDP_PROYECTOS")
    private List<Actividades> actividadesList;
    */
    @ManyToOne
    @JoinColumn(name = "FK_PAC_ID_PER")
    private Actividades actividades;

    //PROJECTDP_DEPARTAMENTO
    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PK_PDE_DMEOR_CODIGO",
            referencedColumnName = "FK_PPRO_CODIGO_UNICO_PER")
    private Departamento departamento;
     */
    /*@ManyToMany(mappedBy = "PROJECTDP_PROYECTOS")
    private List<Departamento> departamentoList;
     */
    @ManyToOne
    @JoinColumn(name = "FK_PDE_ID_PER")
    private Departamento departamento;

    //PROJECTDP_PARTIDA_PRESUPUESTARIA
    /*@OneToMany(mappedBy = "PROJECTDP_PARTIDA_PRESUPUESTARIA")
    private List<Partida_Presupuestaria> partidaPresupuestariaList;
     */
    /*@ManyToMany(mappedBy = "PROJECTDP_PROYECTOS")
    private List<Partida_Presupuestaria> partidaPresupuestariaList;
     */
    @ManyToOne
    @JoinColumn(name = "FK_PPAPRE_ID_PER")
    private Partida_Presupuestaria partida_presupuestaria;

    //PROJECTDP_PORCENTAJE_AVANCE_FI
    /*@OneToMany(mappedBy = "PROJECTDP_PORCENTAJE_AVANCE_FI")
    private List<Porcentaje> porcentajeList;
     */
    /*@ManyToMany(mappedBy = "PROJECTDP_PROYECTOS")
    private List<Porcentaje> porcentajeList;*/
    @ManyToOne
    @JoinColumn(name = "FK_PPOAVFIDE_ID_PER")
    private Porcentaje porcentaje;

    //PROJECTDP_PROCEDIMIENTO_SERCOP
    /*@OneToMany(mappedBy = "PROJECTDP_PROCEDIMIENTO_SERCOP")
    private  List<Procedimiento_Sercop> procedimiento_sercopList;
     */
    @ManyToOne
    @JoinColumn(name = "FK_PPRSE_ID_PER")
    private Procedimiento_Sercop procedimiento_sercop;


    //PROJECTDP_RESPONSABLE_TECNICO
   /*@ManyToMany(mappedBy = "PROJECTDP_PROYECTOS")
   private List<Responsable> responsableList;
    */
    @OneToMany(mappedBy = "matriz")
    private List<Responsable> responsableList;


    //PROJECTDP_TIPO_COMPRA
    /*@ManyToMany(mappedBy = "PROJECTDP_TIPO_COMPRA")
    private List<TCompra> tCompraList;
     */
    @ManyToOne
    @JoinColumn(name = "FK_PTICO_ID_PER")
    private TCompra tCompra;


    //PROJECTDP_TIPO_PRESUPUESTO
    /*@ManyToMany(mappedBy = "PROJECTDP_TIPO_PRESUPUESTO")
    private List<TPresupuesto> tPresupuestoList;
     */
    @ManyToOne
    @JoinColumn(name = "FK_PTIPRE_ID_PER")
    private TPresupuesto tPresupuesto;

    //PROJECTDP_TIPO_PRODUCTO
   /* @ManyToMany(mappedBy = "PROJECTDP_TIPO_PRODUCTO")
    private List<TProducto> tProductoList;
    */
    @ManyToOne
    @JoinColumn(name = "FK_PTIPO_ID_PER")
    private TProducto tProducto;

    //PROJECTDP_TIPO_PROYECTO
    /*@ManyToMany(mappedBy = "PROJECTDP_TIPO_PROYECTO")
    private List<TProyecto> tProyectoList
     */
    @ManyToOne
    @JoinColumn(name = "FK_PTIPRO_ID_PER")
    private TProyecto tProyecto;

    //PROJECTDP_TIPO_REGIMEN
    /*@ManyToMany(mappedBy = "PROJECTDP_TIPO_REGIMEN")
    private List<TRegimen> tRegimenList;
     */
    @ManyToOne
    @JoinColumn(name = "FK_PTIRE_ID_PER")
    private TRegimen tRegimen;

    //PROJECTDP_UNIDAD
    /*@ManyToMany(mappedBy = "PROJECTDP_UNIDAD")
    private List<Unidad> unidadList;
     */
    @ManyToOne
    @JoinColumn(name = "FK_PUNI_ID_PER")
    private Unidad unidad;

    //PROJECTDP_VALOR_DEVENGADO
    /*@ManyToMany(mappedBy = "PROJECTDP_VALOR_DEVENGADO")
    private List<Valor_Devengado> valor_devengadoList;
     */
    @ManyToOne
    @JoinColumn(name = "FK_PVADE_ID_PER")
    private Valor_Devengado valor_devengado;

    /*Constructor con parametros de la entidad principal*/
    public Matriz(int PK_PPRO_CODIGO_UNICO, Float PPRO_CODIGO_CATEGORIA_CPC, String PPRO_DETALLE_PRODUCTO, String PPRO_CUATRIMESTRE_N1, String PPRO_CUATRIMESTRE_N2, String PPRO_CUATRIMESTRE_N3, String PPRO_CATALOGO_ELECTRONICO, String PPRO_FONDOS_BID, String PPRO_NUMERO_CODIGO_OPERACION_P, String PPRO_NUMERO_CODIGO_PROYECTO_BI, String PPRO_PLAZO, String PPRO_CODIGO_RAPIDO, Float PPRO_PRESUPUESTO_INICIAL, Float PPRO_PRESUPUESTO_CODIFICADO, String PK_PETAPRE_ID, Date PPRO_FECHA_INICIAL, Date PPRO_FECHA_FINAL, String PPRO_OBSERVACIONES, String PPRO_NUMERO_CONTRATO, String PPRO_CODIGO_SERCOP, String PPRO_CANTIDAD_ANUAL, float PPRO_COSTO_UNITARIO, String PPRO_ANIO, String PAC_ACTIVIDAD_ENERO, String PAC_ACTIVIDAD_NOVIEMBRE, String PAC_ACTIVIDAD_DICIEMBRE, String PAC_ACTIVIDAD_OCTUBRE, String PAC_ACTIVIDAD_SEPTIEMBRE, String PAC_ACTIVIDAD_AGOSTO, String PAC_ACTIVIDAD_JULIO, String PAC_ACTIVIDAD_JUNIO, String PAC_ACTIVIDAD_MAYO, String PAC_ACTIVIDAD_ABRIL, String PAC_ACTIVIDAD_MARZO, String PAC_ACTIVIDAD_FEBRERO, float PPRES_ACTIVIDAD_ENERO, float PPRES_ACTIVIDAD_FEBRERO, float PPRES_ACTIVIDAD_MARZO, float PPRES_ACTIVIDAD_ABRIL, float PPRES_ACTIVIDAD_MAYO, float PPRES_ACTIVIDAD_JUNIO, float PPRES_ACTIVIDAD_JULIO, float PPRES_ACTIVIDAD_AGOSTO, float PPRES_ACTIVIDAD_SEPTIEMBRE, float PPRES_ACTIVIDAD_OCTUBRE, float PPRES_ACTIVIDAD_NOVIEMBRE, float PPRES_ACTIVIDAD_DICIEMBRE, float PCER_ACTIVIDAD_ENERO, float PCER_ACTIVIDAD_FEBRERO, float PCER_ACTIVIDAD_MARZO, float PCER_ACTIVIDAD_ABRIL, float PCER_ACTIVIDAD_MAYO, float PCER_ACTIVIDAD_JUNIO, float PCER_ACTIVIDAD_JULIO, float PCER_ACTIVIDAD_AGOSTO, float PCER_ACTIVIDAD_SEPTIEMBRE, float PCER_ACTIVIDAD_OCTUBRE, float PCER_ACTIVIDAD_NOVIEMBRE, float PCER_ACTIVIDAD_DICIEMBRE, float PPAG_ACTIVIDAD_ENERO, float PPAG_ACTIVIDAD_FEBRERO, float PPAG_ACTIVIDAD_MARZO, float PPAG_ACTIVIDAD_ABRIL, float PPAG_ACTIVIDAD_MAYO, float PPAG_ACTIVIDAD_JUNIO, float PPAG_ACTIVIDAD_JULIO, float PPAG_ACTIVIDAD_AGOSTO, float PPAG_ACTIVIDAD_SEPTIEMBRE, float PPAG_ACTIVIDAD_OCTUBRE, float PPAG_ACTIVIDAD_NOVIEMBRE, float PPAG_ACTIVIDAD_DICIEMBRE, String PDE_DEPARTAMENTO, String PK_PDE_DMEOR_CODIGO, String PPAPRE_PARTIDA_PRESUPUESTARIA, float PPOAVFIDE_PORCENTAJE_AVANCE_FI, Date PPOAVFIDE_FECHA_PA, String PPOAVFIDE_OBSERVACIONES_PA, String PPRSE_PROCEDIMIENTO_SERCOP, int PK_PPRSE_ID, String PTICO_TIPO_COMPRA, int PK_PTICO_ID, String PTIPRE_TIPO_PRESUPUESTO, int PK_PTIPRE_ID, String PTIPO_TIPO_PRODUCTO, int PK_PTIPO_ID, String PTIPRO_TIPO_PROYECTO, int PK_PTIPRO_ID, String PTIRE_TIPO_REGIMEN, int PK_PTIRE_ID, String PUNI_UNIDAD, int PK_PUNI_ID, float PVADE_VALOR_DEVENGADO, Date PVADE_FECHA_VA, String PVADE_OBSERVACIONES_VA, String PRETE_NOMBRE, String PRETE_APELLIDO, String PRETE_ROL, String PRETE_DMEOR_CODIGO, String ESTADO, String PETAPRE_ETAPA_PRESUPUESTO, Actividades actividades, Departamento departamento, Partida_Presupuestaria partida_presupuestaria, Porcentaje porcentaje, Procedimiento_Sercop procedimiento_sercop, List<Responsable> responsableList, TCompra tCompra, TPresupuesto tPresupuesto, TProducto tProducto, TProyecto tProyecto, TRegimen tRegimen, Unidad unidad, Valor_Devengado valor_devengado) {
        this.PK_PPRO_CODIGO_UNICO = PK_PPRO_CODIGO_UNICO;
        this.PPRO_CODIGO_CATEGORIA_CPC = PPRO_CODIGO_CATEGORIA_CPC;
        this.PPRO_DETALLE_PRODUCTO = PPRO_DETALLE_PRODUCTO;
        this.PPRO_CUATRIMESTRE_N1 = PPRO_CUATRIMESTRE_N1;
        this.PPRO_CUATRIMESTRE_N2 = PPRO_CUATRIMESTRE_N2;
        this.PPRO_CUATRIMESTRE_N3 = PPRO_CUATRIMESTRE_N3;
        this.PPRO_CATALOGO_ELECTRONICO = PPRO_CATALOGO_ELECTRONICO;
        this.PPRO_FONDOS_BID = PPRO_FONDOS_BID;
        this.PPRO_NUMERO_CODIGO_OPERACION_P = PPRO_NUMERO_CODIGO_OPERACION_P;
        this.PPRO_NUMERO_CODIGO_PROYECTO_BI = PPRO_NUMERO_CODIGO_PROYECTO_BI;
        this.PPRO_PLAZO = PPRO_PLAZO;
        this.PPRO_CODIGO_RAPIDO = PPRO_CODIGO_RAPIDO;
        this.PPRO_PRESUPUESTO_INICIAL = PPRO_PRESUPUESTO_INICIAL;
        this.PPRO_PRESUPUESTO_CODIFICADO = PPRO_PRESUPUESTO_CODIFICADO;
        this.PK_PETAPRE_ID = PK_PETAPRE_ID;
        this.PPRO_FECHA_INICIAL = PPRO_FECHA_INICIAL;
        this.PPRO_FECHA_FINAL = PPRO_FECHA_FINAL;
        this.PPRO_OBSERVACIONES = PPRO_OBSERVACIONES;
        this.PPRO_NUMERO_CONTRATO = PPRO_NUMERO_CONTRATO;
        this.PPRO_CODIGO_SERCOP = PPRO_CODIGO_SERCOP;
        this.PPRO_CANTIDAD_ANUAL = PPRO_CANTIDAD_ANUAL;
        this.PPRO_COSTO_UNITARIO = PPRO_COSTO_UNITARIO;
        this.PPRO_ANIO = PPRO_ANIO;
        this.PAC_ACTIVIDAD_ENERO = PAC_ACTIVIDAD_ENERO;
        this.PAC_ACTIVIDAD_NOVIEMBRE = PAC_ACTIVIDAD_NOVIEMBRE;
        this.PAC_ACTIVIDAD_DICIEMBRE = PAC_ACTIVIDAD_DICIEMBRE;
        this.PAC_ACTIVIDAD_OCTUBRE = PAC_ACTIVIDAD_OCTUBRE;
        this.PAC_ACTIVIDAD_SEPTIEMBRE = PAC_ACTIVIDAD_SEPTIEMBRE;
        this.PAC_ACTIVIDAD_AGOSTO = PAC_ACTIVIDAD_AGOSTO;
        this.PAC_ACTIVIDAD_JULIO = PAC_ACTIVIDAD_JULIO;
        this.PAC_ACTIVIDAD_JUNIO = PAC_ACTIVIDAD_JUNIO;
        this.PAC_ACTIVIDAD_MAYO = PAC_ACTIVIDAD_MAYO;
        this.PAC_ACTIVIDAD_ABRIL = PAC_ACTIVIDAD_ABRIL;
        this.PAC_ACTIVIDAD_MARZO = PAC_ACTIVIDAD_MARZO;
        this.PAC_ACTIVIDAD_FEBRERO = PAC_ACTIVIDAD_FEBRERO;
        this.PPRES_ACTIVIDAD_ENERO = PPRES_ACTIVIDAD_ENERO;
        this.PPRES_ACTIVIDAD_FEBRERO = PPRES_ACTIVIDAD_FEBRERO;
        this.PPRES_ACTIVIDAD_MARZO = PPRES_ACTIVIDAD_MARZO;
        this.PPRES_ACTIVIDAD_ABRIL = PPRES_ACTIVIDAD_ABRIL;
        this.PPRES_ACTIVIDAD_MAYO = PPRES_ACTIVIDAD_MAYO;
        this.PPRES_ACTIVIDAD_JUNIO = PPRES_ACTIVIDAD_JUNIO;
        this.PPRES_ACTIVIDAD_JULIO = PPRES_ACTIVIDAD_JULIO;
        this.PPRES_ACTIVIDAD_AGOSTO = PPRES_ACTIVIDAD_AGOSTO;
        this.PPRES_ACTIVIDAD_SEPTIEMBRE = PPRES_ACTIVIDAD_SEPTIEMBRE;
        this.PPRES_ACTIVIDAD_OCTUBRE = PPRES_ACTIVIDAD_OCTUBRE;
        this.PPRES_ACTIVIDAD_NOVIEMBRE = PPRES_ACTIVIDAD_NOVIEMBRE;
        this.PPRES_ACTIVIDAD_DICIEMBRE = PPRES_ACTIVIDAD_DICIEMBRE;
        this.PCER_ACTIVIDAD_ENERO = PCER_ACTIVIDAD_ENERO;
        this.PCER_ACTIVIDAD_FEBRERO = PCER_ACTIVIDAD_FEBRERO;
        this.PCER_ACTIVIDAD_MARZO = PCER_ACTIVIDAD_MARZO;
        this.PCER_ACTIVIDAD_ABRIL = PCER_ACTIVIDAD_ABRIL;
        this.PCER_ACTIVIDAD_MAYO = PCER_ACTIVIDAD_MAYO;
        this.PCER_ACTIVIDAD_JUNIO = PCER_ACTIVIDAD_JUNIO;
        this.PCER_ACTIVIDAD_JULIO = PCER_ACTIVIDAD_JULIO;
        this.PCER_ACTIVIDAD_AGOSTO = PCER_ACTIVIDAD_AGOSTO;
        this.PCER_ACTIVIDAD_SEPTIEMBRE = PCER_ACTIVIDAD_SEPTIEMBRE;
        this.PCER_ACTIVIDAD_OCTUBRE = PCER_ACTIVIDAD_OCTUBRE;
        this.PCER_ACTIVIDAD_NOVIEMBRE = PCER_ACTIVIDAD_NOVIEMBRE;
        this.PCER_ACTIVIDAD_DICIEMBRE = PCER_ACTIVIDAD_DICIEMBRE;
        this.PPAG_ACTIVIDAD_ENERO = PPAG_ACTIVIDAD_ENERO;
        this.PPAG_ACTIVIDAD_FEBRERO = PPAG_ACTIVIDAD_FEBRERO;
        this.PPAG_ACTIVIDAD_MARZO = PPAG_ACTIVIDAD_MARZO;
        this.PPAG_ACTIVIDAD_ABRIL = PPAG_ACTIVIDAD_ABRIL;
        this.PPAG_ACTIVIDAD_MAYO = PPAG_ACTIVIDAD_MAYO;
        this.PPAG_ACTIVIDAD_JUNIO = PPAG_ACTIVIDAD_JUNIO;
        this.PPAG_ACTIVIDAD_JULIO = PPAG_ACTIVIDAD_JULIO;
        this.PPAG_ACTIVIDAD_AGOSTO = PPAG_ACTIVIDAD_AGOSTO;
        this.PPAG_ACTIVIDAD_SEPTIEMBRE = PPAG_ACTIVIDAD_SEPTIEMBRE;
        this.PPAG_ACTIVIDAD_OCTUBRE = PPAG_ACTIVIDAD_OCTUBRE;
        this.PPAG_ACTIVIDAD_NOVIEMBRE = PPAG_ACTIVIDAD_NOVIEMBRE;
        this.PPAG_ACTIVIDAD_DICIEMBRE = PPAG_ACTIVIDAD_DICIEMBRE;
        this.PDE_DEPARTAMENTO = PDE_DEPARTAMENTO;
        this.PK_PDE_DMEOR_CODIGO = PK_PDE_DMEOR_CODIGO;
        this.PPAPRE_PARTIDA_PRESUPUESTARIA = PPAPRE_PARTIDA_PRESUPUESTARIA;
        this.PPOAVFIDE_PORCENTAJE_AVANCE_FI = PPOAVFIDE_PORCENTAJE_AVANCE_FI;
        this.PPOAVFIDE_FECHA_PA = PPOAVFIDE_FECHA_PA;
        this.PPOAVFIDE_OBSERVACIONES_PA = PPOAVFIDE_OBSERVACIONES_PA;
        this.PPRSE_PROCEDIMIENTO_SERCOP = PPRSE_PROCEDIMIENTO_SERCOP;
        this.PK_PPRSE_ID = PK_PPRSE_ID;
        this.PTICO_TIPO_COMPRA = PTICO_TIPO_COMPRA;
        this.PK_PTICO_ID = PK_PTICO_ID;
        this.PTIPRE_TIPO_PRESUPUESTO = PTIPRE_TIPO_PRESUPUESTO;
        this.PK_PTIPRE_ID = PK_PTIPRE_ID;
        this.PTIPO_TIPO_PRODUCTO = PTIPO_TIPO_PRODUCTO;
        this.PK_PTIPO_ID = PK_PTIPO_ID;
        this.PTIPRO_TIPO_PROYECTO = PTIPRO_TIPO_PROYECTO;
        this.PK_PTIPRO_ID = PK_PTIPRO_ID;
        this.PTIRE_TIPO_REGIMEN = PTIRE_TIPO_REGIMEN;
        this.PK_PTIRE_ID = PK_PTIRE_ID;
        this.PUNI_UNIDAD = PUNI_UNIDAD;
        this.PK_PUNI_ID = PK_PUNI_ID;
        this.PVADE_VALOR_DEVENGADO = PVADE_VALOR_DEVENGADO;
        this.PVADE_FECHA_VA = PVADE_FECHA_VA;
        this.PVADE_OBSERVACIONES_VA = PVADE_OBSERVACIONES_VA;
        this.PRETE_NOMBRE = PRETE_NOMBRE;
        this.PRETE_APELLIDO = PRETE_APELLIDO;
        this.PRETE_ROL = PRETE_ROL;
        this.PRETE_DMEOR_CODIGO = PRETE_DMEOR_CODIGO;
        this.ESTADO = ESTADO;
        this.PETAPRE_ETAPA_PRESUPUESTO = PETAPRE_ETAPA_PRESUPUESTO;
        this.actividades = actividades;
        this.departamento = departamento;
        this.partida_presupuestaria = partida_presupuestaria;
        this.porcentaje = porcentaje;
        this.procedimiento_sercop = procedimiento_sercop;
        this.responsableList = responsableList;
        this.tCompra = tCompra;
        this.tPresupuesto = tPresupuesto;
        this.tProducto = tProducto;
        this.tProyecto = tProyecto;
        this.tRegimen = tRegimen;
        this.unidad = unidad;
        this.valor_devengado = valor_devengado;
    }

    /*Consructor vacio de la entidad principal*/
    public Matriz() {
    }

    /*GET and SET de la entidad principal*/

    public int getPK_PPRO_CODIGO_UNICO() {
        return PK_PPRO_CODIGO_UNICO;
    }

    public void setPK_PPRO_CODIGO_UNICO(int PK_PPRO_CODIGO_UNICO) {
        this.PK_PPRO_CODIGO_UNICO = PK_PPRO_CODIGO_UNICO;
    }

    public Float getPPRO_CODIGO_CATEGORIA_CPC() {
        return PPRO_CODIGO_CATEGORIA_CPC;
    }

    public void setPPRO_CODIGO_CATEGORIA_CPC(Float PPRO_CODIGO_CATEGORIA_CPC) {
        this.PPRO_CODIGO_CATEGORIA_CPC = PPRO_CODIGO_CATEGORIA_CPC;
    }

    public String getPPRO_DETALLE_PRODUCTO() {
        return PPRO_DETALLE_PRODUCTO;
    }

    public void setPPRO_DETALLE_PRODUCTO(String PPRO_DETALLE_PRODUCTO) {
        this.PPRO_DETALLE_PRODUCTO = PPRO_DETALLE_PRODUCTO;
    }

    public String getPPRO_CUATRIMESTRE_N1() {
        return PPRO_CUATRIMESTRE_N1;
    }

    public void setPPRO_CUATRIMESTRE_N1(String PPRO_CUATRIMESTRE_N1) {
        this.PPRO_CUATRIMESTRE_N1 = PPRO_CUATRIMESTRE_N1;
    }

    public String getPPRO_CUATRIMESTRE_N2() {
        return PPRO_CUATRIMESTRE_N2;
    }

    public void setPPRO_CUATRIMESTRE_N2(String PPRO_CUATRIMESTRE_N2) {
        this.PPRO_CUATRIMESTRE_N2 = PPRO_CUATRIMESTRE_N2;
    }

    public String getPPRO_CUATRIMESTRE_N3() {
        return PPRO_CUATRIMESTRE_N3;
    }

    public void setPPRO_CUATRIMESTRE_N3(String PPRO_CUATRIMESTRE_N3) {
        this.PPRO_CUATRIMESTRE_N3 = PPRO_CUATRIMESTRE_N3;
    }

    public String getPPRO_CATALOGO_ELECTRONICO() {
        return PPRO_CATALOGO_ELECTRONICO;
    }

    public void setPPRO_CATALOGO_ELECTRONICO(String PPRO_CATALOGO_ELECTRONICO) {
        this.PPRO_CATALOGO_ELECTRONICO = PPRO_CATALOGO_ELECTRONICO;
    }

    public String getPPRO_FONDOS_BID() {
        return PPRO_FONDOS_BID;
    }

    public void setPPRO_FONDOS_BID(String PPRO_FONDOS_BID) {
        this.PPRO_FONDOS_BID = PPRO_FONDOS_BID;
    }

    public String getPPRO_NUMERO_CODIGO_OPERACION_P() {
        return PPRO_NUMERO_CODIGO_OPERACION_P;
    }

    public void setPPRO_NUMERO_CODIGO_OPERACION_P(String PPRO_NUMERO_CODIGO_OPERACION_P) {
        this.PPRO_NUMERO_CODIGO_OPERACION_P = PPRO_NUMERO_CODIGO_OPERACION_P;
    }

    public String getPPRO_NUMERO_CODIGO_PROYECTO_BI() {
        return PPRO_NUMERO_CODIGO_PROYECTO_BI;
    }

    public void setPPRO_NUMERO_CODIGO_PROYECTO_BI(String PPRO_NUMERO_CODIGO_PROYECTO_BI) {
        this.PPRO_NUMERO_CODIGO_PROYECTO_BI = PPRO_NUMERO_CODIGO_PROYECTO_BI;
    }

    public String getPPRO_PLAZO() {
        return PPRO_PLAZO;
    }

    public void setPPRO_PLAZO(String PPRO_PLAZO) {
        this.PPRO_PLAZO = PPRO_PLAZO;
    }

    public String getPPRO_CODIGO_RAPIDO() {
        return PPRO_CODIGO_RAPIDO;
    }

    public void setPPRO_CODIGO_RAPIDO(String PPRO_CODIGO_RAPIDO) {
        this.PPRO_CODIGO_RAPIDO = PPRO_CODIGO_RAPIDO;
    }

    public Float getPPRO_PRESUPUESTO_INICIAL() {
        return PPRO_PRESUPUESTO_INICIAL;
    }

    public void setPPRO_PRESUPUESTO_INICIAL(Float PPRO_PRESUPUESTO_INICIAL) {
        this.PPRO_PRESUPUESTO_INICIAL = PPRO_PRESUPUESTO_INICIAL;
    }

    public Float getPPRO_PRESUPUESTO_CODIFICADO() {
        return PPRO_PRESUPUESTO_CODIFICADO;
    }

    public void setPPRO_PRESUPUESTO_CODIFICADO(Float PPRO_PRESUPUESTO_CODIFICADO) {
        this.PPRO_PRESUPUESTO_CODIFICADO = PPRO_PRESUPUESTO_CODIFICADO;
    }

    public String getPK_PETAPRE_ID() {
        return PK_PETAPRE_ID;
    }

    public void setPK_PETAPRE_ID(String PK_PETAPRE_ID) {
        this.PK_PETAPRE_ID = PK_PETAPRE_ID;
    }

    public Date getPPRO_FECHA_INICIAL() {
        return PPRO_FECHA_INICIAL;
    }

    public void setPPRO_FECHA_INICIAL(Date PPRO_FECHA_INICIAL) {
        this.PPRO_FECHA_INICIAL = PPRO_FECHA_INICIAL;
    }

    public Date getPPRO_FECHA_FINAL() {
        return PPRO_FECHA_FINAL;
    }

    public void setPPRO_FECHA_FINAL(Date PPRO_FECHA_FINAL) {
        this.PPRO_FECHA_FINAL = PPRO_FECHA_FINAL;
    }

    public String getPPRO_OBSERVACIONES() {
        return PPRO_OBSERVACIONES;
    }

    public void setPPRO_OBSERVACIONES(String PPRO_OBSERVACIONES) {
        this.PPRO_OBSERVACIONES = PPRO_OBSERVACIONES;
    }

    public String getPPRO_NUMERO_CONTRATO() {
        return PPRO_NUMERO_CONTRATO;
    }

    public void setPPRO_NUMERO_CONTRATO(String PPRO_NUMERO_CONTRATO) {
        this.PPRO_NUMERO_CONTRATO = PPRO_NUMERO_CONTRATO;
    }

    public String getPPRO_CODIGO_SERCOP() {
        return PPRO_CODIGO_SERCOP;
    }

    public void setPPRO_CODIGO_SERCOP(String PPRO_CODIGO_SERCOP) {
        this.PPRO_CODIGO_SERCOP = PPRO_CODIGO_SERCOP;
    }

    public String getPPRO_CANTIDAD_ANUAL() {
        return PPRO_CANTIDAD_ANUAL;
    }

    public void setPPRO_CANTIDAD_ANUAL(String PPRO_CANTIDAD_ANUAL) {
        this.PPRO_CANTIDAD_ANUAL = PPRO_CANTIDAD_ANUAL;
    }

    public float getPPRO_COSTO_UNITARIO() {
        return PPRO_COSTO_UNITARIO;
    }

    public void setPPRO_COSTO_UNITARIO(float PPRO_COSTO_UNITARIO) {
        this.PPRO_COSTO_UNITARIO = PPRO_COSTO_UNITARIO;
    }

    public String getPPRO_ANIO() {
        return PPRO_ANIO;
    }

    public void setPPRO_ANIO(String PPRO_ANIO) {
        this.PPRO_ANIO = PPRO_ANIO;
    }

    public String getPAC_ACTIVIDAD_ENERO() {
        return PAC_ACTIVIDAD_ENERO;
    }

    public void setPAC_ACTIVIDAD_ENERO(String PAC_ACTIVIDAD_ENERO) {
        this.PAC_ACTIVIDAD_ENERO = PAC_ACTIVIDAD_ENERO;
    }

    public String getPAC_ACTIVIDAD_NOVIEMBRE() {
        return PAC_ACTIVIDAD_NOVIEMBRE;
    }

    public void setPAC_ACTIVIDAD_NOVIEMBRE(String PAC_ACTIVIDAD_NOVIEMBRE) {
        this.PAC_ACTIVIDAD_NOVIEMBRE = PAC_ACTIVIDAD_NOVIEMBRE;
    }

    public String getPAC_ACTIVIDAD_DICIEMBRE() {
        return PAC_ACTIVIDAD_DICIEMBRE;
    }

    public void setPAC_ACTIVIDAD_DICIEMBRE(String PAC_ACTIVIDAD_DICIEMBRE) {
        this.PAC_ACTIVIDAD_DICIEMBRE = PAC_ACTIVIDAD_DICIEMBRE;
    }

    public String getPAC_ACTIVIDAD_OCTUBRE() {
        return PAC_ACTIVIDAD_OCTUBRE;
    }

    public void setPAC_ACTIVIDAD_OCTUBRE(String PAC_ACTIVIDAD_OCTUBRE) {
        this.PAC_ACTIVIDAD_OCTUBRE = PAC_ACTIVIDAD_OCTUBRE;
    }

    public String getPAC_ACTIVIDAD_SEPTIEMBRE() {
        return PAC_ACTIVIDAD_SEPTIEMBRE;
    }

    public void setPAC_ACTIVIDAD_SEPTIEMBRE(String PAC_ACTIVIDAD_SEPTIEMBRE) {
        this.PAC_ACTIVIDAD_SEPTIEMBRE = PAC_ACTIVIDAD_SEPTIEMBRE;
    }

    public String getPAC_ACTIVIDAD_AGOSTO() {
        return PAC_ACTIVIDAD_AGOSTO;
    }

    public void setPAC_ACTIVIDAD_AGOSTO(String PAC_ACTIVIDAD_AGOSTO) {
        this.PAC_ACTIVIDAD_AGOSTO = PAC_ACTIVIDAD_AGOSTO;
    }

    public String getPAC_ACTIVIDAD_JULIO() {
        return PAC_ACTIVIDAD_JULIO;
    }

    public void setPAC_ACTIVIDAD_JULIO(String PAC_ACTIVIDAD_JULIO) {
        this.PAC_ACTIVIDAD_JULIO = PAC_ACTIVIDAD_JULIO;
    }

    public String getPAC_ACTIVIDAD_JUNIO() {
        return PAC_ACTIVIDAD_JUNIO;
    }

    public void setPAC_ACTIVIDAD_JUNIO(String PAC_ACTIVIDAD_JUNIO) {
        this.PAC_ACTIVIDAD_JUNIO = PAC_ACTIVIDAD_JUNIO;
    }

    public String getPAC_ACTIVIDAD_MAYO() {
        return PAC_ACTIVIDAD_MAYO;
    }

    public void setPAC_ACTIVIDAD_MAYO(String PAC_ACTIVIDAD_MAYO) {
        this.PAC_ACTIVIDAD_MAYO = PAC_ACTIVIDAD_MAYO;
    }

    public String getPAC_ACTIVIDAD_ABRIL() {
        return PAC_ACTIVIDAD_ABRIL;
    }

    public void setPAC_ACTIVIDAD_ABRIL(String PAC_ACTIVIDAD_ABRIL) {
        this.PAC_ACTIVIDAD_ABRIL = PAC_ACTIVIDAD_ABRIL;
    }

    public String getPAC_ACTIVIDAD_MARZO() {
        return PAC_ACTIVIDAD_MARZO;
    }

    public void setPAC_ACTIVIDAD_MARZO(String PAC_ACTIVIDAD_MARZO) {
        this.PAC_ACTIVIDAD_MARZO = PAC_ACTIVIDAD_MARZO;
    }

    public String getPAC_ACTIVIDAD_FEBRERO() {
        return PAC_ACTIVIDAD_FEBRERO;
    }

    public void setPAC_ACTIVIDAD_FEBRERO(String PAC_ACTIVIDAD_FEBRERO) {
        this.PAC_ACTIVIDAD_FEBRERO = PAC_ACTIVIDAD_FEBRERO;
    }

    public float getPPRES_ACTIVIDAD_ENERO() {
        return PPRES_ACTIVIDAD_ENERO;
    }

    public void setPPRES_ACTIVIDAD_ENERO(float PPRES_ACTIVIDAD_ENERO) {
        this.PPRES_ACTIVIDAD_ENERO = PPRES_ACTIVIDAD_ENERO;
    }

    public float getPPRES_ACTIVIDAD_FEBRERO() {
        return PPRES_ACTIVIDAD_FEBRERO;
    }

    public void setPPRES_ACTIVIDAD_FEBRERO(float PPRES_ACTIVIDAD_FEBRERO) {
        this.PPRES_ACTIVIDAD_FEBRERO = PPRES_ACTIVIDAD_FEBRERO;
    }

    public float getPPRES_ACTIVIDAD_MARZO() {
        return PPRES_ACTIVIDAD_MARZO;
    }

    public void setPPRES_ACTIVIDAD_MARZO(float PPRES_ACTIVIDAD_MARZO) {
        this.PPRES_ACTIVIDAD_MARZO = PPRES_ACTIVIDAD_MARZO;
    }

    public float getPPRES_ACTIVIDAD_ABRIL() {
        return PPRES_ACTIVIDAD_ABRIL;
    }

    public void setPPRES_ACTIVIDAD_ABRIL(float PPRES_ACTIVIDAD_ABRIL) {
        this.PPRES_ACTIVIDAD_ABRIL = PPRES_ACTIVIDAD_ABRIL;
    }

    public float getPPRES_ACTIVIDAD_MAYO() {
        return PPRES_ACTIVIDAD_MAYO;
    }

    public void setPPRES_ACTIVIDAD_MAYO(float PPRES_ACTIVIDAD_MAYO) {
        this.PPRES_ACTIVIDAD_MAYO = PPRES_ACTIVIDAD_MAYO;
    }

    public float getPPRES_ACTIVIDAD_JUNIO() {
        return PPRES_ACTIVIDAD_JUNIO;
    }

    public void setPPRES_ACTIVIDAD_JUNIO(float PPRES_ACTIVIDAD_JUNIO) {
        this.PPRES_ACTIVIDAD_JUNIO = PPRES_ACTIVIDAD_JUNIO;
    }

    public float getPPRES_ACTIVIDAD_JULIO() {
        return PPRES_ACTIVIDAD_JULIO;
    }

    public void setPPRES_ACTIVIDAD_JULIO(float PPRES_ACTIVIDAD_JULIO) {
        this.PPRES_ACTIVIDAD_JULIO = PPRES_ACTIVIDAD_JULIO;
    }

    public float getPPRES_ACTIVIDAD_AGOSTO() {
        return PPRES_ACTIVIDAD_AGOSTO;
    }

    public void setPPRES_ACTIVIDAD_AGOSTO(float PPRES_ACTIVIDAD_AGOSTO) {
        this.PPRES_ACTIVIDAD_AGOSTO = PPRES_ACTIVIDAD_AGOSTO;
    }

    public float getPPRES_ACTIVIDAD_SEPTIEMBRE() {
        return PPRES_ACTIVIDAD_SEPTIEMBRE;
    }

    public void setPPRES_ACTIVIDAD_SEPTIEMBRE(float PPRES_ACTIVIDAD_SEPTIEMBRE) {
        this.PPRES_ACTIVIDAD_SEPTIEMBRE = PPRES_ACTIVIDAD_SEPTIEMBRE;
    }

    public float getPPRES_ACTIVIDAD_OCTUBRE() {
        return PPRES_ACTIVIDAD_OCTUBRE;
    }

    public void setPPRES_ACTIVIDAD_OCTUBRE(float PPRES_ACTIVIDAD_OCTUBRE) {
        this.PPRES_ACTIVIDAD_OCTUBRE = PPRES_ACTIVIDAD_OCTUBRE;
    }

    public float getPPRES_ACTIVIDAD_NOVIEMBRE() {
        return PPRES_ACTIVIDAD_NOVIEMBRE;
    }

    public void setPPRES_ACTIVIDAD_NOVIEMBRE(float PPRES_ACTIVIDAD_NOVIEMBRE) {
        this.PPRES_ACTIVIDAD_NOVIEMBRE = PPRES_ACTIVIDAD_NOVIEMBRE;
    }

    public float getPPRES_ACTIVIDAD_DICIEMBRE() {
        return PPRES_ACTIVIDAD_DICIEMBRE;
    }

    public void setPPRES_ACTIVIDAD_DICIEMBRE(float PPRES_ACTIVIDAD_DICIEMBRE) {
        this.PPRES_ACTIVIDAD_DICIEMBRE = PPRES_ACTIVIDAD_DICIEMBRE;
    }

    public float getPCER_ACTIVIDAD_ENERO() {
        return PCER_ACTIVIDAD_ENERO;
    }

    public void setPCER_ACTIVIDAD_ENERO(float PCER_ACTIVIDAD_ENERO) {
        this.PCER_ACTIVIDAD_ENERO = PCER_ACTIVIDAD_ENERO;
    }

    public float getPCER_ACTIVIDAD_FEBRERO() {
        return PCER_ACTIVIDAD_FEBRERO;
    }

    public void setPCER_ACTIVIDAD_FEBRERO(float PCER_ACTIVIDAD_FEBRERO) {
        this.PCER_ACTIVIDAD_FEBRERO = PCER_ACTIVIDAD_FEBRERO;
    }

    public float getPCER_ACTIVIDAD_MARZO() {
        return PCER_ACTIVIDAD_MARZO;
    }

    public void setPCER_ACTIVIDAD_MARZO(float PCER_ACTIVIDAD_MARZO) {
        this.PCER_ACTIVIDAD_MARZO = PCER_ACTIVIDAD_MARZO;
    }

    public float getPCER_ACTIVIDAD_ABRIL() {
        return PCER_ACTIVIDAD_ABRIL;
    }

    public void setPCER_ACTIVIDAD_ABRIL(float PCER_ACTIVIDAD_ABRIL) {
        this.PCER_ACTIVIDAD_ABRIL = PCER_ACTIVIDAD_ABRIL;
    }

    public float getPCER_ACTIVIDAD_MAYO() {
        return PCER_ACTIVIDAD_MAYO;
    }

    public void setPCER_ACTIVIDAD_MAYO(float PCER_ACTIVIDAD_MAYO) {
        this.PCER_ACTIVIDAD_MAYO = PCER_ACTIVIDAD_MAYO;
    }

    public float getPCER_ACTIVIDAD_JUNIO() {
        return PCER_ACTIVIDAD_JUNIO;
    }

    public void setPCER_ACTIVIDAD_JUNIO(float PCER_ACTIVIDAD_JUNIO) {
        this.PCER_ACTIVIDAD_JUNIO = PCER_ACTIVIDAD_JUNIO;
    }

    public float getPCER_ACTIVIDAD_JULIO() {
        return PCER_ACTIVIDAD_JULIO;
    }

    public void setPCER_ACTIVIDAD_JULIO(float PCER_ACTIVIDAD_JULIO) {
        this.PCER_ACTIVIDAD_JULIO = PCER_ACTIVIDAD_JULIO;
    }

    public float getPCER_ACTIVIDAD_AGOSTO() {
        return PCER_ACTIVIDAD_AGOSTO;
    }

    public void setPCER_ACTIVIDAD_AGOSTO(float PCER_ACTIVIDAD_AGOSTO) {
        this.PCER_ACTIVIDAD_AGOSTO = PCER_ACTIVIDAD_AGOSTO;
    }

    public float getPCER_ACTIVIDAD_SEPTIEMBRE() {
        return PCER_ACTIVIDAD_SEPTIEMBRE;
    }

    public void setPCER_ACTIVIDAD_SEPTIEMBRE(float PCER_ACTIVIDAD_SEPTIEMBRE) {
        this.PCER_ACTIVIDAD_SEPTIEMBRE = PCER_ACTIVIDAD_SEPTIEMBRE;
    }

    public float getPCER_ACTIVIDAD_OCTUBRE() {
        return PCER_ACTIVIDAD_OCTUBRE;
    }

    public void setPCER_ACTIVIDAD_OCTUBRE(float PCER_ACTIVIDAD_OCTUBRE) {
        this.PCER_ACTIVIDAD_OCTUBRE = PCER_ACTIVIDAD_OCTUBRE;
    }

    public float getPCER_ACTIVIDAD_NOVIEMBRE() {
        return PCER_ACTIVIDAD_NOVIEMBRE;
    }

    public void setPCER_ACTIVIDAD_NOVIEMBRE(float PCER_ACTIVIDAD_NOVIEMBRE) {
        this.PCER_ACTIVIDAD_NOVIEMBRE = PCER_ACTIVIDAD_NOVIEMBRE;
    }

    public float getPCER_ACTIVIDAD_DICIEMBRE() {
        return PCER_ACTIVIDAD_DICIEMBRE;
    }

    public void setPCER_ACTIVIDAD_DICIEMBRE(float PCER_ACTIVIDAD_DICIEMBRE) {
        this.PCER_ACTIVIDAD_DICIEMBRE = PCER_ACTIVIDAD_DICIEMBRE;
    }

    public float getPPAG_ACTIVIDAD_ENERO() {
        return PPAG_ACTIVIDAD_ENERO;
    }

    public void setPPAG_ACTIVIDAD_ENERO(float PPAG_ACTIVIDAD_ENERO) {
        this.PPAG_ACTIVIDAD_ENERO = PPAG_ACTIVIDAD_ENERO;
    }

    public float getPPAG_ACTIVIDAD_FEBRERO() {
        return PPAG_ACTIVIDAD_FEBRERO;
    }

    public void setPPAG_ACTIVIDAD_FEBRERO(float PPAG_ACTIVIDAD_FEBRERO) {
        this.PPAG_ACTIVIDAD_FEBRERO = PPAG_ACTIVIDAD_FEBRERO;
    }

    public float getPPAG_ACTIVIDAD_MARZO() {
        return PPAG_ACTIVIDAD_MARZO;
    }

    public void setPPAG_ACTIVIDAD_MARZO(float PPAG_ACTIVIDAD_MARZO) {
        this.PPAG_ACTIVIDAD_MARZO = PPAG_ACTIVIDAD_MARZO;
    }

    public float getPPAG_ACTIVIDAD_ABRIL() {
        return PPAG_ACTIVIDAD_ABRIL;
    }

    public void setPPAG_ACTIVIDAD_ABRIL(float PPAG_ACTIVIDAD_ABRIL) {
        this.PPAG_ACTIVIDAD_ABRIL = PPAG_ACTIVIDAD_ABRIL;
    }

    public float getPPAG_ACTIVIDAD_MAYO() {
        return PPAG_ACTIVIDAD_MAYO;
    }

    public void setPPAG_ACTIVIDAD_MAYO(float PPAG_ACTIVIDAD_MAYO) {
        this.PPAG_ACTIVIDAD_MAYO = PPAG_ACTIVIDAD_MAYO;
    }

    public float getPPAG_ACTIVIDAD_JUNIO() {
        return PPAG_ACTIVIDAD_JUNIO;
    }

    public void setPPAG_ACTIVIDAD_JUNIO(float PPAG_ACTIVIDAD_JUNIO) {
        this.PPAG_ACTIVIDAD_JUNIO = PPAG_ACTIVIDAD_JUNIO;
    }

    public float getPPAG_ACTIVIDAD_JULIO() {
        return PPAG_ACTIVIDAD_JULIO;
    }

    public void setPPAG_ACTIVIDAD_JULIO(float PPAG_ACTIVIDAD_JULIO) {
        this.PPAG_ACTIVIDAD_JULIO = PPAG_ACTIVIDAD_JULIO;
    }

    public float getPPAG_ACTIVIDAD_AGOSTO() {
        return PPAG_ACTIVIDAD_AGOSTO;
    }

    public void setPPAG_ACTIVIDAD_AGOSTO(float PPAG_ACTIVIDAD_AGOSTO) {
        this.PPAG_ACTIVIDAD_AGOSTO = PPAG_ACTIVIDAD_AGOSTO;
    }

    public float getPPAG_ACTIVIDAD_SEPTIEMBRE() {
        return PPAG_ACTIVIDAD_SEPTIEMBRE;
    }

    public void setPPAG_ACTIVIDAD_SEPTIEMBRE(float PPAG_ACTIVIDAD_SEPTIEMBRE) {
        this.PPAG_ACTIVIDAD_SEPTIEMBRE = PPAG_ACTIVIDAD_SEPTIEMBRE;
    }

    public float getPPAG_ACTIVIDAD_OCTUBRE() {
        return PPAG_ACTIVIDAD_OCTUBRE;
    }

    public void setPPAG_ACTIVIDAD_OCTUBRE(float PPAG_ACTIVIDAD_OCTUBRE) {
        this.PPAG_ACTIVIDAD_OCTUBRE = PPAG_ACTIVIDAD_OCTUBRE;
    }

    public float getPPAG_ACTIVIDAD_NOVIEMBRE() {
        return PPAG_ACTIVIDAD_NOVIEMBRE;
    }

    public void setPPAG_ACTIVIDAD_NOVIEMBRE(float PPAG_ACTIVIDAD_NOVIEMBRE) {
        this.PPAG_ACTIVIDAD_NOVIEMBRE = PPAG_ACTIVIDAD_NOVIEMBRE;
    }

    public float getPPAG_ACTIVIDAD_DICIEMBRE() {
        return PPAG_ACTIVIDAD_DICIEMBRE;
    }

    public void setPPAG_ACTIVIDAD_DICIEMBRE(float PPAG_ACTIVIDAD_DICIEMBRE) {
        this.PPAG_ACTIVIDAD_DICIEMBRE = PPAG_ACTIVIDAD_DICIEMBRE;
    }

    public String getPDE_DEPARTAMENTO() {
        return PDE_DEPARTAMENTO;
    }

    public void setPDE_DEPARTAMENTO(String PDE_DEPARTAMENTO) {
        this.PDE_DEPARTAMENTO = PDE_DEPARTAMENTO;
    }

    public String getPK_PDE_DMEOR_CODIGO() {
        return PK_PDE_DMEOR_CODIGO;
    }

    public void setPK_PDE_DMEOR_CODIGO(String PK_PDE_DMEOR_CODIGO) {
        this.PK_PDE_DMEOR_CODIGO = PK_PDE_DMEOR_CODIGO;
    }

    public String getPPAPRE_PARTIDA_PRESUPUESTARIA() {
        return PPAPRE_PARTIDA_PRESUPUESTARIA;
    }

    public void setPPAPRE_PARTIDA_PRESUPUESTARIA(String PPAPRE_PARTIDA_PRESUPUESTARIA) {
        this.PPAPRE_PARTIDA_PRESUPUESTARIA = PPAPRE_PARTIDA_PRESUPUESTARIA;
    }

    public float getPPOAVFIDE_PORCENTAJE_AVANCE_FI() {
        return PPOAVFIDE_PORCENTAJE_AVANCE_FI;
    }

    public void setPPOAVFIDE_PORCENTAJE_AVANCE_FI(float PPOAVFIDE_PORCENTAJE_AVANCE_FI) {
        this.PPOAVFIDE_PORCENTAJE_AVANCE_FI = PPOAVFIDE_PORCENTAJE_AVANCE_FI;
    }

    public Date getPPOAVFIDE_FECHA_PA() {
        return PPOAVFIDE_FECHA_PA;
    }

    public void setPPOAVFIDE_FECHA_PA(Date PPOAVFIDE_FECHA_PA) {
        this.PPOAVFIDE_FECHA_PA = PPOAVFIDE_FECHA_PA;
    }

    public String getPPOAVFIDE_OBSERVACIONES_PA() {
        return PPOAVFIDE_OBSERVACIONES_PA;
    }

    public void setPPOAVFIDE_OBSERVACIONES_PA(String PPOAVFIDE_OBSERVACIONES_PA) {
        this.PPOAVFIDE_OBSERVACIONES_PA = PPOAVFIDE_OBSERVACIONES_PA;
    }

    public String getPPRSE_PROCEDIMIENTO_SERCOP() {
        return PPRSE_PROCEDIMIENTO_SERCOP;
    }

    public void setPPRSE_PROCEDIMIENTO_SERCOP(String PPRSE_PROCEDIMIENTO_SERCOP) {
        this.PPRSE_PROCEDIMIENTO_SERCOP = PPRSE_PROCEDIMIENTO_SERCOP;
    }

    public int getPK_PPRSE_ID() {
        return PK_PPRSE_ID;
    }

    public void setPK_PPRSE_ID(int PK_PPRSE_ID) {
        this.PK_PPRSE_ID = PK_PPRSE_ID;
    }

    public String getPTICO_TIPO_COMPRA() {
        return PTICO_TIPO_COMPRA;
    }

    public void setPTICO_TIPO_COMPRA(String PTICO_TIPO_COMPRA) {
        this.PTICO_TIPO_COMPRA = PTICO_TIPO_COMPRA;
    }

    public int getPK_PTICO_ID() {
        return PK_PTICO_ID;
    }

    public void setPK_PTICO_ID(int PK_PTICO_ID) {
        this.PK_PTICO_ID = PK_PTICO_ID;
    }

    public String getPTIPRE_TIPO_PRESUPUESTO() {
        return PTIPRE_TIPO_PRESUPUESTO;
    }

    public void setPTIPRE_TIPO_PRESUPUESTO(String PTIPRE_TIPO_PRESUPUESTO) {
        this.PTIPRE_TIPO_PRESUPUESTO = PTIPRE_TIPO_PRESUPUESTO;
    }

    public int getPK_PTIPRE_ID() {
        return PK_PTIPRE_ID;
    }

    public void setPK_PTIPRE_ID(int PK_PTIPRE_ID) {
        this.PK_PTIPRE_ID = PK_PTIPRE_ID;
    }

    public String getPTIPO_TIPO_PRODUCTO() {
        return PTIPO_TIPO_PRODUCTO;
    }

    public void setPTIPO_TIPO_PRODUCTO(String PTIPO_TIPO_PRODUCTO) {
        this.PTIPO_TIPO_PRODUCTO = PTIPO_TIPO_PRODUCTO;
    }

    public int getPK_PTIPO_ID() {
        return PK_PTIPO_ID;
    }

    public void setPK_PTIPO_ID(int PK_PTIPO_ID) {
        this.PK_PTIPO_ID = PK_PTIPO_ID;
    }

    public String getPTIPRO_TIPO_PROYECTO() {
        return PTIPRO_TIPO_PROYECTO;
    }

    public void setPTIPRO_TIPO_PROYECTO(String PTIPRO_TIPO_PROYECTO) {
        this.PTIPRO_TIPO_PROYECTO = PTIPRO_TIPO_PROYECTO;
    }

    public int getPK_PTIPRO_ID() {
        return PK_PTIPRO_ID;
    }

    public void setPK_PTIPRO_ID(int PK_PTIPRO_ID) {
        this.PK_PTIPRO_ID = PK_PTIPRO_ID;
    }

    public String getPTIRE_TIPO_REGIMEN() {
        return PTIRE_TIPO_REGIMEN;
    }

    public void setPTIRE_TIPO_REGIMEN(String PTIRE_TIPO_REGIMEN) {
        this.PTIRE_TIPO_REGIMEN = PTIRE_TIPO_REGIMEN;
    }

    public int getPK_PTIRE_ID() {
        return PK_PTIRE_ID;
    }

    public void setPK_PTIRE_ID(int PK_PTIRE_ID) {
        this.PK_PTIRE_ID = PK_PTIRE_ID;
    }

    public String getPUNI_UNIDAD() {
        return PUNI_UNIDAD;
    }

    public void setPUNI_UNIDAD(String PUNI_UNIDAD) {
        this.PUNI_UNIDAD = PUNI_UNIDAD;
    }

    public int getPK_PUNI_ID() {
        return PK_PUNI_ID;
    }

    public void setPK_PUNI_ID(int PK_PUNI_ID) {
        this.PK_PUNI_ID = PK_PUNI_ID;
    }

    public float getPVADE_VALOR_DEVENGADO() {
        return PVADE_VALOR_DEVENGADO;
    }

    public void setPVADE_VALOR_DEVENGADO(float PVADE_VALOR_DEVENGADO) {
        this.PVADE_VALOR_DEVENGADO = PVADE_VALOR_DEVENGADO;
    }

    public Date getPVADE_FECHA_VA() {
        return PVADE_FECHA_VA;
    }

    public void setPVADE_FECHA_VA(Date PVADE_FECHA_VA) {
        this.PVADE_FECHA_VA = PVADE_FECHA_VA;
    }

    public String getPVADE_OBSERVACIONES_VA() {
        return PVADE_OBSERVACIONES_VA;
    }

    public void setPVADE_OBSERVACIONES_VA(String PVADE_OBSERVACIONES_VA) {
        this.PVADE_OBSERVACIONES_VA = PVADE_OBSERVACIONES_VA;
    }

    public String getPRETE_NOMBRE() {
        return PRETE_NOMBRE;
    }

    public void setPRETE_NOMBRE(String PRETE_NOMBRE) {
        this.PRETE_NOMBRE = PRETE_NOMBRE;
    }

    public String getPRETE_APELLIDO() {
        return PRETE_APELLIDO;
    }

    public void setPRETE_APELLIDO(String PRETE_APELLIDO) {
        this.PRETE_APELLIDO = PRETE_APELLIDO;
    }

    public String getPRETE_ROL() {
        return PRETE_ROL;
    }

    public void setPRETE_ROL(String PRETE_ROL) {
        this.PRETE_ROL = PRETE_ROL;
    }

    public String getPRETE_DMEOR_CODIGO() {
        return PRETE_DMEOR_CODIGO;
    }

    public void setPRETE_DMEOR_CODIGO(String PRETE_DMEOR_CODIGO) {
        this.PRETE_DMEOR_CODIGO = PRETE_DMEOR_CODIGO;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }

    public String getPETAPRE_ETAPA_PRESUPUESTO() {
        return PETAPRE_ETAPA_PRESUPUESTO;
    }

    public void setPETAPRE_ETAPA_PRESUPUESTO(String PETAPRE_ETAPA_PRESUPUESTO) {
        this.PETAPRE_ETAPA_PRESUPUESTO = PETAPRE_ETAPA_PRESUPUESTO;
    }

    public Actividades getActividades() {
        return actividades;
    }

    public void setActividades(Actividades actividades) {
        this.actividades = actividades;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Partida_Presupuestaria getPartida_presupuestaria() {
        return partida_presupuestaria;
    }

    public void setPartida_presupuestaria(Partida_Presupuestaria partida_presupuestaria) {
        this.partida_presupuestaria = partida_presupuestaria;
    }

    public Porcentaje getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Porcentaje porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Procedimiento_Sercop getProcedimiento_sercop() {
        return procedimiento_sercop;
    }

    public void setProcedimiento_sercop(Procedimiento_Sercop procedimiento_sercop) {
        this.procedimiento_sercop = procedimiento_sercop;
    }

    public List<Responsable> getResponsableList() {
        return responsableList;
    }

    public void setResponsableList(List<Responsable> responsableList) {
        this.responsableList = responsableList;
    }

    public TCompra gettCompra() {
        return tCompra;
    }

    public void settCompra(TCompra tCompra) {
        this.tCompra = tCompra;
    }

    public TPresupuesto gettPresupuesto() {
        return tPresupuesto;
    }

    public void settPresupuesto(TPresupuesto tPresupuesto) {
        this.tPresupuesto = tPresupuesto;
    }

    public TProducto gettProducto() {
        return tProducto;
    }

    public void settProducto(TProducto tProducto) {
        this.tProducto = tProducto;
    }

    public TProyecto gettProyecto() {
        return tProyecto;
    }

    public void settProyecto(TProyecto tProyecto) {
        this.tProyecto = tProyecto;
    }

    public TRegimen gettRegimen() {
        return tRegimen;
    }

    public void settRegimen(TRegimen tRegimen) {
        this.tRegimen = tRegimen;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public Valor_Devengado getValor_devengado() {
        return valor_devengado;
    }

    public void setValor_devengado(Valor_Devengado valor_devengado) {
        this.valor_devengado = valor_devengado;
    }
}

