package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.*;
import com.proyecto.DP.prueba.DatabaseConfig;
import com.proyecto.DP.respositorioDP.MatrizR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class MatrizS implements MatrizR {
    @Autowired
    private final JdbcTemplate jdbcTemplate;


    public MatrizS(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void crearTablaTemporal() {
        String tableName = "PROJECTDP_PRUEBADOS";
        String sql = "SELECT * FROM " + tableName + " LIMIT 1";

        try {

            jdbcTemplate.queryForObject(sql, Object.class);

        } catch (Exception ex) {

            String createTableSql = "CREATE GLOBAL TEMPORARY TABLE " + tableName +
                    "(\n" +
                    "PK_PDE_DMEOR_CODIGO VARCHAR(20) PRIMARY KEY,\n" +
                    "PDE_DEPARTAMENTO VARCHAR2(50)\n" +
                    ")\n" +
                    "ON COMMIT PRESERVE ROWS";


            jdbcTemplate.execute(createTableSql);

           /*String insertSql = "INSERT INTO " + tableName + " (PK_PDE_DMEOR_CODIGO, PDE_DEPARTAMENTO) VALUES (?, ?)";
            jdbcTemplate.update(insertSql, "DMEOR1", "PRESIDENCIA EJECUTIVA");
            jdbcTemplate.update(insertSql, "DMEOR2", "UNIDAD DE AUDITORIA INTERNA");
            jdbcTemplate.update(insertSql, "DMEOR4", "DEPARTAMENTO DE PLANIFICACION");
            jdbcTemplate.update(insertSql, "DMEOR5", "DPTO. DE RELACIONES INDUSTRIALES");
            jdbcTemplate.update(insertSql, "DMEOR6", "DEPARTAMENTO FINANCIERO");
            jdbcTemplate.update(insertSql, "DMEOR7", "DPTO.COMERCIAL");
            jdbcTemplate.update(insertSql, "DMEOR162", "DEPARTAMENTO DE DISTRIBUCION");
            jdbcTemplate.update(insertSql, "DMEOR163", "DEPARTAMENTO DE SUBTRANSMISION");
            jdbcTemplate.update(insertSql, "DMEOR10", "DZO PASTAZA");
            jdbcTemplate.update(insertSql, "DMEOR113", "AREA PALORA");
            jdbcTemplate.update(insertSql, "DMEOR11", "DZO NAPO");



            */

            //Poblar la tabla con datos

        }

    }

    @Override
    public void populateDepartamento() {
        String countSql = "SELECT COUNT(*) FROM PROJECTDP_DEPARTAMENTO";
        int count = jdbcTemplate.queryForObject(countSql, Integer.class);

        if (count == 0) {
            String insertDataSql = "INSERT INTO PROJECTDP_DEPARTAMENTO(PK_PDE_DMEOR_CODIGO, PDE_DEPARTAMENTO) VALUES (?, ?)";
            jdbcTemplate.update(insertDataSql, "DMEOR1", "PRESIDENCIA EJECUTIVA");
            jdbcTemplate.update(insertDataSql, "DMEOR2", "UNIDAD DE AUDITORIA INTERNA");
            jdbcTemplate.update(insertDataSql, "DMEOR4", "DEPARTAMENTO DE PLANIFICACION");
            jdbcTemplate.update(insertDataSql, "DMEOR5", "DPTO. DE RELACIONES INDUSTRIALES");
            jdbcTemplate.update(insertDataSql, "DMEOR6", "DEPARTAMENTO FINANCIERO");
            jdbcTemplate.update(insertDataSql, "DMEOR7", "DPTO.COMERCIAL");
            jdbcTemplate.update(insertDataSql, "DMEOR162", "DEPARTAMENTO DE DISTRIBUCION");
            jdbcTemplate.update(insertDataSql, "DMEOR163", "DEPARTAMENTO DE SUBTRANSMISION");
            jdbcTemplate.update(insertDataSql, "DMEOR10", "DZO PASTAZA");
            jdbcTemplate.update(insertDataSql, "DMEOR113", "AREA PALORA");
            jdbcTemplate.update(insertDataSql, "DMEOR11", "DZO NAPO");
        }
    }

    @Override
    public void populateResponsable() {

        String countSql = "SELECT COUNT(*) FROM PROYECTDP_RESPONSABLE_TECNICO";
        int count = jdbcTemplate.queryForObject(countSql, Integer.class);

        if (count == 0) {
            String insertDataSql = "INSERT INTO PROYECTDP_RESPONSABLE_TECNICO(PK_PRETE_DMPER_CODIGO, PRETE_NOMBRE, PRETE_APELLIDO, PRETE_ROL, PRETE_DMEOR_CODIGO) VALUES (?, ?, ?, ?, ?)";
            jdbcTemplate.update(insertDataSql, "DMPER1147", "EDUARDO ALEJANDRO", "CARRILLO NAVAS", "100853", "DMEOR1");
            jdbcTemplate.update(insertDataSql, "DMPER1356", "DIEGO ANDRES", "COBO COBO", "100991", "DMEOR1");
            jdbcTemplate.update(insertDataSql, "DMPER1284", "ANA VERONICA", "GAVILIMA VELASTEGUI", "100937", "DMEOR1");
            jdbcTemplate.update(insertDataSql, "MDMPE373", "MANUEL RIGOBERTO", "OTORONGO CORNEJO", "100456", "DMEOR1");
            jdbcTemplate.update(insertDataSql, "DMPER1050", "CARLOS GEOVANNY", "PAZ VARGAS", "100781", "DMEOR1");
            jdbcTemplate.update(insertDataSql, "DMPER739", "CARMINIA SOLEDAD", "PORRAS LEON", "100632", "DMEOR1");
            jdbcTemplate.update(insertDataSql, "DMPER881", "ANA GUILLERMINA", "SISA LEMA", "100652", "DMEOR1");
            jdbcTemplate.update(insertDataSql, "DMPER1363", "JHON RAFAEL", "ALAVA MARTINEZ", "100994", "DMEOR3");
            jdbcTemplate.update(insertDataSql, "DMPER1196", "MARIA BELEN", "MORALES ZUÑIGA", "100879", "DMEOR3");
            jdbcTemplate.update(insertDataSql, "MDMPE264", "RUTH REBECA", "TERAN RODRIGUEZ", "100371", "DMEOR12");
            jdbcTemplate.update(insertDataSql, "MDMPE356", "ENMA ISABEL", "JACOME LOPEZ", "100581", "DMEOR13");
            jdbcTemplate.update(insertDataSql, "DMPER1315", "JORDAN ALEXANDER", "CARREÑO HERAS", "400029", "DMEOR113");
            jdbcTemplate.update(insertDataSql, "DMPER1357", "YANKUAM JESUS", "ARANDA VARGAS", "400031", "DMEOR123");
            jdbcTemplate.update(insertDataSql, "DMPER733", "JOEL ISRAEL", "GARCIA RODRIGUEZ", "400014", "DMEOR123");
            jdbcTemplate.update(insertDataSql, "DMPER745", "JUAN PABLO", "GUZMAN LASSO", "400015", "DMEOR123");
            jdbcTemplate.update(insertDataSql, "MDMPE654", "JUAN CELIO", "TIERRA MAROTO", "400012", "DMEOR123");
            jdbcTemplate.update(insertDataSql, "MDMPE648", "WALTER EDMUNDO", "TRAVEZ GARCIA", "400005", "DMEOR123");
            jdbcTemplate.update(insertDataSql, "MDMPE651", "JYNA OMAIRA", "CAMBIZACA ROBALINO", "400009", "DMEOR115");
            jdbcTemplate.update(insertDataSql, "DMPER1350", "JENIFER YAJAIRA", "VELIN SANDOVAL", "400030", "DMEOR115");
            jdbcTemplate.update(insertDataSql, "DMPER1165", "ALEXANDRA MARISELA", "QUEZADA MERCHAN", "400023", "DMEOR210");
            jdbcTemplate.update(insertDataSql, "DMPER933", "JUAN ISAIAS", "HUEBLA YUMI", "400017", "DMEOR151");
            jdbcTemplate.update(insertDataSql, "DMPER934", "DANIEL RIGOBERTO", "NARANJO JARAMILLO", "400018", "DMEOR151");
            jdbcTemplate.update(insertDataSql, "MDMPE384", "MARIA ELENA", "GUEVARA UVIDIA", "100469", "DMEOR2");
            jdbcTemplate.update(insertDataSql, "MDMPE388", "ROSA ELENA", "MERINO SALAZAR", "100473", "DMEOR2");
            jdbcTemplate.update(insertDataSql, "MDMPE430", "MARICELA JEANNETHE", "PEREZ LASCANO", "100515", "DMEOR2");
            jdbcTemplate.update(insertDataSql, "MDMPE158", "LOURDES EUGENIA", "CACERES VARGAS", "100388", "DMEOR14");
            jdbcTemplate.update(insertDataSql, "MDMPE416", "XIMENA DEL ROCIO", "CRESPO ARAUJO", "100501", "DMEOR14");
            jdbcTemplate.update(insertDataSql, "DMPER1345", "MARIA CRISTINA", "CUELLO GARCIA", "100982", "DMEOR14");
            jdbcTemplate.update(insertDataSql, "MDMPE326", "CRISTIAN PATRICIO", "MARIN CAJAS", "100551", "DMEOR15");
            jdbcTemplate.update(insertDataSql, "DMPER741", "PEDRO ADRIAN", "TORRES BERMEO", "100693", "DMEOR15");
            jdbcTemplate.update(insertDataSql, "MDMPE438", "LUIS ALBERTO", "MARCIAL DOMINGUEZ", "100523", "DMEOR16");
            jdbcTemplate.update(insertDataSql, "DMPER1108", "CESAR GABRIEL", "MORA CASTRO", "100830", "DMEOR16");
            jdbcTemplate.update(insertDataSql, "MDMPE545", "WILMER DARIO", "MUYULEMA MASAQUIZA", "100672", "DMEOR16");
            jdbcTemplate.update(insertDataSql, "DMPER1042", "CARLOS ALFREDO", "CASTILLO GAVILANES", "100774", "DMEOR132");
            jdbcTemplate.update(insertDataSql, "DMPER1203", "IRMA MONSERRATH", "PATARON ANDINO", "100883", "DMEOR132");
            jdbcTemplate.update(insertDataSql, "DMPER1312", "CAROLINA ALEXANDRA", "SARANGO OSORIO", "100956", "DMEOR132");
            jdbcTemplate.update(insertDataSql, "DMPER991", "FRANCISCO SANTIAGO", "DIAZ GAMBOA", "100736", "DMEOR224");
            jdbcTemplate.update(insertDataSql, "MDMPE401", "RENE FRANCISCO", "TERAN RODRIGUEZ", "100486", "DMEOR224");
            jdbcTemplate.update(insertDataSql, "MDMPE441", "IVAN GEOVANNY", "VARGAS PROAÑO", "100526", "DMEOR224");
            jdbcTemplate.update(insertDataSql, "DMPER1059", "STEFANNY JOHANA", "CELI PORTERO", "100790", "DMEOR18");
            jdbcTemplate.update(insertDataSql, "MDMPE443", "ALEXANDRA GUADALUPE", "RODRIGUEZ BETANCOURT", "100528", "DMEOR18");
            jdbcTemplate.update(insertDataSql, "DMPER1278", "JENNY KATHERINE", "MOLINA CAMPAÑA", "100932", "DMEOR21");
            jdbcTemplate.update(insertDataSql, "MDMPE176", "MARGOT YOCONDA", "POVEDA ROMERO", "100411", "DMEOR21");
            jdbcTemplate.update(insertDataSql, "DMPER961", "DIEGO ARTURO", "CADME VALLEJO", "100709", "DMEOR22");
            jdbcTemplate.update(insertDataSql, "MDMPE387", "MERCEDES ISABEL", "YANEZ BAYAS", "100472", "DMEOR22");
            jdbcTemplate.update(insertDataSql, "MDMPE629", "DIANA PAULINA", "AMORES PAREDES", "100604", "DMEOR23");
            jdbcTemplate.update(insertDataSql, "DMPER998", "GLENDA PATRICIA", "BARRIONUEVO JIMBO", "100741", "DMEOR23");
            jdbcTemplate.update(insertDataSql, "DMPER1075", "MISCHEL ANDREA", "NOBOA QUINTANA", "100803", "DMEOR23");
            jdbcTemplate.update(insertDataSql, "DMPER1211", "MORAYMA LISSETTE", "PAZMIÑO MORALES", "100886", "DMEOR24");
            jdbcTemplate.update(insertDataSql, "MDMPE171", "IVAN MARCELO", "ALTAMIRANO CORREA", "100404", "DMEOR25");
            jdbcTemplate.update(insertDataSql, "MDMPE619", "JAIME MARCELO", "GONZALEZ GONZALEZ", "100594", "DMEOR25");
            jdbcTemplate.update(insertDataSql, "DMPER831", "NESTOR RODOLFO", "BASANTES ROMERO", "100648", "DMEOR19");
            jdbcTemplate.update(insertDataSql, "DMPER1041", "EDGAR ALBERTO", "CHIMBORAZO CHIMBORAZO", "100773", "DMEOR19");
            jdbcTemplate.update(insertDataSql, "DMPER1286", "MISHELL NATIVIDAD", "CORDOVA PIONCE", "100938", "DMEOR19");
            jdbcTemplate.update(insertDataSql, "DMPER1279", "DANIEL MARCELO", "PATIN SANCHEZ", "100933", "DMEOR19");
            jdbcTemplate.update(insertDataSql, "DMPER1046", "SEGUNDO MISAEL", "TIXILEMA TIXILEMA", "100777", "DMEOR19");
            jdbcTemplate.update(insertDataSql, "DMPER899", "VICENTE LENIN", "IZA LUCERO", "100664", "DMEOR20");
            jdbcTemplate.update(insertDataSql, "DMPER1308", "MARCO ANTONIO", "VILLACRES NUÑEZ", "100954", "DMEOR20");
            jdbcTemplate.update(insertDataSql, "MDMPE542", "LUCIA CRISTINA", "GUEVARA BARREROS", "100673", "DMEOR27");
            jdbcTemplate.update(insertDataSql, "MDMPE423", "JORGE WELINGTON", "ROSERO CASTRO", "100508", "DMEOR27");
            jdbcTemplate.update(insertDataSql, "MDMPE403", "SILVIA MARLENE", "GARCES VILLACRES", "100488", "DMEOR29");
            jdbcTemplate.update(insertDataSql, "DMPER1084", "DIANA CAROLINA", "SANCHEZ SALINAS", "100811", "DMEOR29");
            jdbcTemplate.update(insertDataSql, "MDMPE440", "JUAN CARLOS", "CALDERON PEREZ", "100525", "DMEOR34");
            jdbcTemplate.update(insertDataSql, "DMPER997", "ALEXANDRA JACQUELINE", "TORRES PADILLA", "100740", "DMEOR34");
            jdbcTemplate.update(insertDataSql, "MDMPE413", "MARIA PAULINA", "LLERENA POVEDA", "100498", "DMEOR35");
            jdbcTemplate.update(insertDataSql, "DMPER1272", "KERLY PATRICIA", "LOPEZ GOMEZ", "100928", "DMEOR35");
            jdbcTemplate.update(insertDataSql, "DMPER1195", "DIANA ALEXANDRA", "ALMENDARIS BUENAÑO", "100878", "DMEOR36");
            jdbcTemplate.update(insertDataSql, "DMPER1369", "JEANETTE LORENA", "MOSCOSO CORDOVA", "100998", "DMEOR36");
            jdbcTemplate.update(insertDataSql, "DMPER1026", "MARIA JOSE", "OJEDA NUÑEZ", "100763", "DMEOR36");
            jdbcTemplate.update(insertDataSql, "MDMPE628", "NORMA PATRICIA", "RAMON SUAREZ", "100603", "DMEOR36");
            jdbcTemplate.update(insertDataSql, "DMPER924", "PAMELA YOLANDA", "VALLE CORDOVA", "100686", "DMEOR148");
            jdbcTemplate.update(insertDataSql, "MDMPE334", "CARLOS MARTIN", "CRESPO ARAUJO", "100559", "DMEOR30");
            jdbcTemplate.update(insertDataSql, "MDMPE449", "RITA MAGALI", "MEDINA TORRES", "100534", "DMEOR30");
            jdbcTemplate.update(insertDataSql, "DMPER727", "MARIO KLEBER", "FIALLOS CONDO", "100623", "DMEOR38");
            jdbcTemplate.update(insertDataSql, "DMPER1191", "LUIS ALFONSO", "LIMA ARIAS", "100875", "DMEOR38");
            jdbcTemplate.update(insertDataSql, "DMPER964", "BYRON GUSTAVO", "CASTRO ORTIZ", "100711", "DMEOR39");
            jdbcTemplate.update(insertDataSql, "DMPER1192", "LEONARDO ISRAEL", "ESPIN NUÑEZ", "100876", "DMEOR39");
            jdbcTemplate.update(insertDataSql, "MDMPE431", "PATRICIA JANNETH", "CONDO CARRANZA", "100516", "DMEOR32");
            jdbcTemplate.update(insertDataSql, "MDMPE338", "SONIA GUADALUPE", "TENECOTA YUCAILLA", "100563", "DMEOR32");
            jdbcTemplate.update(insertDataSql, "MDMPE417", "PEDRO EDWIN", "CABEZAS NUÑEZ", "100502", "DMEOR33");
            jdbcTemplate.update(insertDataSql, "DMPER1368", "GABRIELA ELIZABETH", "JACOME FREIRE", "100997", "DMEOR33");
            jdbcTemplate.update(insertDataSql, "DMPER1306", "GABRIEL ALEJANDRO", "LOPEZ GUFFANTI", "100953", "DMEOR33");
            jdbcTemplate.update(insertDataSql, "DMPER1366", "DIANA PAOLA", "NARANJO VARGAS", "100995", "DMEOR33");
            jdbcTemplate.update(insertDataSql, "DMPER1097", "GERMANIA CUMANDA", "SANCHEZ SANCHEZ", "100821", "DMEOR33");
            jdbcTemplate.update(insertDataSql, "DMPER1354", "KARINA DEL ROCIO", "VELASTEGUI SUAREZ", "100989", "DMEOR33");
            jdbcTemplate.update(insertDataSql, "DMPER1153", "JORGE ENRIQUE", "FREIRE SILVA", "100857", "DMEOR37");
            jdbcTemplate.update(insertDataSql, "MDMPE339", "MARIA MAGDALENA", "ANDRADE GUERRA", "100564", "DMEOR40");
            jdbcTemplate.update(insertDataSql, "MDMPE381", "OSCAR OMMAR", "ARMAS CABEZAS", "100466", "DMEOR40");
            jdbcTemplate.update(insertDataSql, "MDMPE433", "HENRRY ROGELIO", "CORDOVA BASANTES", "100518", "DMEOR41");
            jdbcTemplate.update(insertDataSql, "DMPER1240", "LUIS ANDRES", "HERRERA ALBAN", "100908", "DMEOR41");
            jdbcTemplate.update(insertDataSql, "DMPER1336", "JENNY PAOLA", "LLAMUCA LLANGA", "100974", "DMEOR41");
            jdbcTemplate.update(insertDataSql, "DMPER1349", "FRANKLIN JOEL", "LOPEZ PEÑA", "100985", "DMEOR41");
            jdbcTemplate.update(insertDataSql, "DMPER1152", "WILFRIDO DAVID", "MONTACHANA MONTACHANA", "100856", "DMEOR41");
            jdbcTemplate.update(insertDataSql, "DMPER1002", "JORGE LUIS", "SALAS MONTEROS", "100745", "DMEOR41");
            jdbcTemplate.update(insertDataSql, "DMPER1361", "IVAN MARCELO", "VELASTEGUI MOYA", "100992", "DMEOR41");
            jdbcTemplate.update(insertDataSql, "DMPER1126", "ERICK SANTIAGO", "ARTEAGA TIXE", "100841", "DMEOR42");
            jdbcTemplate.update(insertDataSql, "DMPER1283", "EDWIN GABRIEL", "NAVAS LOVATO", "100936", "DMEOR42");
            jdbcTemplate.update(insertDataSql, "MDMPE616", "MONICA ELIZABETH", "ROLDAN TOAPANTA", "100591", "DMEOR42");
            jdbcTemplate.update(insertDataSql, "MDMPE617", "EDWIN FABIAN", "ABRIL CARVAJAL", "100592", "DMEOR44");
            jdbcTemplate.update(insertDataSql, "MDMPE623", "WILLIAM ROBERTO", "ACHACHI PIMBO", "100598", "DMEOR44");
            jdbcTemplate.update(insertDataSql, "MDMPE368", "JANETH ALICIA", "VILLACRES PAREDES", "100451", "DMEOR44");
            jdbcTemplate.update(insertDataSql, "DMPER954", "JOSE GONZALO", "ZURITA LOPEZ", "100704", "DMEOR44");
            jdbcTemplate.update(insertDataSql, "MDMPE164", "BYRON EDUARDO", "BONILLA CORDOVA", "100394", "DMEOR45");
            jdbcTemplate.update(insertDataSql, "DMPER738", "VICTOR HUGO", "GARCIA IZA", "100630", "DMEOR45");
            jdbcTemplate.update(insertDataSql, "MDMPE170", "LUCAS AGUSTIN", "IPIALES MONTESDEOCA", "100403", "DMEOR45");
            jdbcTemplate.update(insertDataSql, "MDMPE620", "ILIANA ", "AVEIGA YEPEZ", "100595", "DMEOR54");
            jdbcTemplate.update(insertDataSql, "DMPER1096", "LUIS GABRIEL", "CERON CORDOVA", "100820", "DMEOR54");
            jdbcTemplate.update(insertDataSql, "DMPER1355", "DANIELA ALEJANDRA", "CHICAIZA SUNTA", "100990", "DMEOR54");
            jdbcTemplate.update(insertDataSql, "DMPER1282", "HEIDY XIOMARA", "MONTERO CALDERON", "100935", "DMEOR54");
            jdbcTemplate.update(insertDataSql, "DMPER1226", "TATIANA JACKELINE", "ORTIZ GONZALEZ", "100900", "DMEOR54");
            jdbcTemplate.update(insertDataSql, "DMPER1330", "JONATHAN STALIN", "POMAQUERO SAEZ", "100970", "DMEOR54");
            jdbcTemplate.update(insertDataSql, "DMPER957", "JUAN CARLOS", "AZOGUE UQUILLAS", "100706", "DMEOR56");
            jdbcTemplate.update(insertDataSql, "DMPER1161", "MAYRA STEPHANIE", "BARAHONA SANCHEZ", "100863", "DMEOR56");
            jdbcTemplate.update(insertDataSql, "DMPER1362", "GLORIA ANGELICA", "CALVOPIÑA CRUZ", "100993", "DMEOR56");
            jdbcTemplate.update(insertDataSql, "DMPER1014", "VICTOR HUGO", "CHOLOTA HURTADO", "100753", "DMEOR56");
            jdbcTemplate.update(insertDataSql, "DMPER1225", "MARIA PAULINA", "NARANJO MORA", "100899", "DMEOR56");
            jdbcTemplate.update(insertDataSql, "DMPER829", "PAOLO CESAR", "PAREDES GUAYGUA", "100647", "DMEOR56");
            jdbcTemplate.update(insertDataSql, "DMPER1173", "CARMEN ALEXANDRA", "JACOME JACOME", "100867", "DMEOR46");
            jdbcTemplate.update(insertDataSql, "MDMPE163", "OSWALDO EFRAIN", "MAYORGA PEREZ", "100393", "DMEOR46");
            jdbcTemplate.update(insertDataSql, "MDMPE174", "CARLOS ROMULO", "MORALES SANCHEZ", "100409", "DMEOR47");
            jdbcTemplate.update(insertDataSql, "DMPER999", "STALIN MAURICIO", "NOBOA FIALLOS", "100742", "DMEOR47");
            jdbcTemplate.update(insertDataSql, "MDMPE429", "PATRICIO NAPOLEON", "MAYORGA ALMEIDA", "100514", "DMEOR48");
            jdbcTemplate.update(insertDataSql, "DMPER1159", "LUIS ROBERTO", "PINDUISACA TIXI", "100861", "DMEOR48");
            jdbcTemplate.update(insertDataSql, "DMPER979", "CARLOS VINICIO", "PAZMIÑO LOZADA", "100724", "DMEOR58");
            jdbcTemplate.update(insertDataSql, "DMPER1060", "RICARDO GERMAN", "VACA CEVALLOS", "100791", "DMEOR58");
            jdbcTemplate.update(insertDataSql, "MDMPE168", "WASHINGTON RODRIGO", "LOPEZ LALALEO", "100398", "DMEOR49");
            jdbcTemplate.update(insertDataSql, "DMPER981", "EDISON MAURICIO", "NARANJO ACURIO", "100726", "DMEOR49");
            jdbcTemplate.update(insertDataSql, "DMPER1177", "MAURICIO RICARDO", "CHUQUITARCO LOZADA", "100870", "DMEOR50");
            jdbcTemplate.update(insertDataSql, "MDMPE422", "OSCAR ARNALDO", "SANTAMARIA MORALES", "100507", "DMEOR50");
            jdbcTemplate.update(insertDataSql, "MDMPE411", "EDWIN ALBERTO", "AMAGUAYO BASANTES", "100496", "DMEOR51");
            jdbcTemplate.update(insertDataSql, "DMPER826", "CHRISTIAN FERNANDO", "CHAMBA RODRIGUEZ", "100644", "DMEOR51");
            jdbcTemplate.update(insertDataSql, "MDMPE150", "NESTOR LEOPOLDO", "ANDRADE BAYAS", "100379", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "MDMPE385", "MARCO VINICIO", "CAIZA CHICAIZA", "100470", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "MDMPE330", "CARLOS ALBERTO", "CHAVEZ GOMEZ", "100555", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "MDMPE456", "EDISSON FABRICIO", "HURTADO RAMOS", "100541", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "MDMPE319", "ALEXANDER MAURICIO", "MARIN VELASTEGUI", "100544", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "DMPER718", "DIANA CAROLINA", "MORALES VIZUETE", "100614", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "DMPER1056", "MILTON XAVIER", "ROBALINO COPO", "100787", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "DMPER950", "CECILIA ELIZABETH", "ROSERO NUÑEZ", "100700", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "MDMPE267", "EDGAR RENAN", "SANTAMARIA PEREZ", "100376", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "DMPER1241", "JORGE PATRICIO", "TIXI ASITIMBAY", "100909", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "DMPER1215", "JOHN JAVIER", "YUGCHA ALOMALIZA", "100890", "DMEOR52");
            jdbcTemplate.update(insertDataSql, "MDMPE262", "SYLVIA DE LOURDES", "AGUILAR ", "100366", "DMEOR53");
            jdbcTemplate.update(insertDataSql, "MDMPE399", "SANDRA LORENA", "ALDAZ SANCHEZ", "100484", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "MDMPE160", "NEYLE MAGDALI", "ANDRADE MEDINA", "100390", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "DMPER1266", "SORAYA GUADALUPE", "ARCOS PEREZ", "100923", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "DMPER1341", "SHALOM CHRISTIN", "ARMAS MOLINA", "100979", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "MDMPE412", "ADRIANA CARMINIA", "BAYAS BENITEZ", "100497", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "DMPER1348", "TERESA ALEXANDRA", "CUEVA FLORES", "100984", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "MDMPE405", "JENNY ALEXANDRA", "GONZALEZ MONTESDEOCA", "100490", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "DMPER1339", "DAYANA KATIHUSCA", "MEDIAVILLA RAMOS", "100977", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "DMPER1338", "KATHERINE NICOLE", "MUÑOZ DEFAZ", "100976", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "MDMPE447", "MARIANITA DE JESUS", "ORTIZ PEREZ", "100532", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "DMPER1337", "BLANCA DE LOURDES", "POMA TOGLLA", "100975", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "MDMPE457", "SILVANA PATRICIA", "POVEDA NARANJO", "100542", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "MDMPE402", "LADYS ROCIO", "ROMERO NOBOA", "100487", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "DMPER1347", "CRISTINA ELIZABETH", "SANDOVAL MEDINA", "100983", "DMEOR124");
            jdbcTemplate.update(insertDataSql, "DMPER1205", "LUIS ARMANDO", "CUJILAN SOSA", "100884", "DMEOR125");
            jdbcTemplate.update(insertDataSql, "MDMPE321", "BYRON IVAN", "FLORES SOTO", "100546", "DMEOR125");
            jdbcTemplate.update(insertDataSql, "DMPER1053", "NICOLAI BLADIMIR", "SANCHEZ LOZADA", "100784", "DMEOR125");
            jdbcTemplate.update(insertDataSql, "MDMPE631", "CHRISTIAN LUIS", "ERAZO GAVILANES", "100606", "DMEOR59");
            jdbcTemplate.update(insertDataSql, "DMPER1049", "BETTY JANETH", "SANCHEZ COBO", "100780", "DMEOR59");
            jdbcTemplate.update(insertDataSql, "MDMPE333", "JENNY CECILIA", "LESCANO LEON", "100558", "DMEOR60");
            jdbcTemplate.update(insertDataSql, "MDMPE275", "SANDRA ELIZABETH", "RON LARA", "100177", "DMEOR60");
            jdbcTemplate.update(insertDataSql, "MDMPE152", "JORGE RAFAEL", "BAUTISTA SALAZAR", "100381", "DMEOR61");
            jdbcTemplate.update(insertDataSql, "MDMPE608", "MILTON XAVIER", "CAJAS CAMPAÑA", "100583", "DMEOR61");
            jdbcTemplate.update(insertDataSql, "DMPER1057", "ANDRES GABRIEL", "LEON YUPANGUI", "100788", "DMEOR61");
            jdbcTemplate.update(insertDataSql, "MDMPE131", "JORGE WILLIAN", "VELASTEGUI IBARRA", "100257", "DMEOR61");
            jdbcTemplate.update(insertDataSql, "MDMPE332", "PAULINA ALEXANDRA", "LUNA MOROCHO", "100557", "DMEOR62");
            jdbcTemplate.update(insertDataSql, "MDMPE394", "LIBIA XIMENA", "ORTIZ JARA", "100479", "DMEOR62");
            jdbcTemplate.update(insertDataSql, "DMPER1267", "GRACE PAMELA", "SORIA VASCO", "100924", "DMEOR62");
            jdbcTemplate.update(insertDataSql, "MDMPE424", "WALTER HERNAN", "CAIZA CURIPALLO", "100509", "DMEOR64");
            jdbcTemplate.update(insertDataSql, "MDMPE183", "LUIS GUILLERMO", "CARRASCO SOBERON", "100421", "DMEOR64");
            jdbcTemplate.update(insertDataSql, "MDMPE335", "JAVIER PATRICIO", "CAZA MORALES", "100560", "DMEOR64");
            jdbcTemplate.update(insertDataSql, "MDMPE414", "JUAN CARLOS", "HERNANDEZ PONLUISA", "100499", "DMEOR64");
            jdbcTemplate.update(insertDataSql, "DMPER722", "HENRY HOMERO", "LLERENA SANCHEZ", "100618", "DMEOR64");
            jdbcTemplate.update(insertDataSql, "MDMPE432", "LUIS FERNANDO", "ULLOA MALUSIN", "100517", "DMEOR64");
            jdbcTemplate.update(insertDataSql, "DMPER719", "LUIS ALBERTO", "VALENCIA MELO", "100619", "DMEOR64");
            jdbcTemplate.update(insertDataSql, "DMPER1351", "KARLA FERNANDA", "GARCIA CARDENAS", "100986", "DMEOR63");
            jdbcTemplate.update(insertDataSql, "DMPER896", "JOSE VLADIMIR", "MEDINA VILLARROEL", "100662", "DMEOR63");
            jdbcTemplate.update(insertDataSql, "MDMPE175", "WILMA PILAR", "ESPIN LOPEZ", "100410", "DMEOR65");
            jdbcTemplate.update(insertDataSql, "DMPER967", "ANDRES FABRICIO", "ACUÑA ANDRADE", "100714", "DMEOR66");
            jdbcTemplate.update(insertDataSql, "DMPER1094", "RONALD FELIPE", "FREIRE MONTIEL", "100818", "DMEOR66");
            jdbcTemplate.update(insertDataSql, "MDMPE180", "MARCO VINICIO", "REYES BONILLA", "100418", "DMEOR66");
            jdbcTemplate.update(insertDataSql, "MDMPE612", "PAUL ALEJANDRO", "SANCHEZ MANTILLA", "100587", "DMEOR66");
            jdbcTemplate.update(insertDataSql, "DMPER1119", "MARCO XAVIER", "PEREZ MORALES", "100837", "DMEOR209");
            jdbcTemplate.update(insertDataSql, "DMPER1064", "DARWIN GUSTAVO", "VELOZ GUEVARA", "100795", "DMEOR209");
            jdbcTemplate.update(insertDataSql, "DMPER820", "GUADALUPE NARCIZA", "YUCSIN SANCHEZ", "100638", "DMEOR209");
            jdbcTemplate.update(insertDataSql, "DMPER1257", "WILLIAM TARQUINO", "ORTIZ TINTA", "100918", "DMEOR222");
            jdbcTemplate.update(insertDataSql, "DMPER1261", "EDISON MAURICIO", "SALINAS VILLACIS", "100922", "DMEOR222");
            jdbcTemplate.update(insertDataSql, "DMPER1262", "MARCO SANTIAGO", "SANCHEZ RUIZ", "100919", "DMEOR222");
            jdbcTemplate.update(insertDataSql, "MDMPE391", "MIGUEL ANGEL", "CUESTA PAREDES", "100476", "DMEOR164");
            jdbcTemplate.update(insertDataSql, "MDMPE410", "VERONICA PAULINA", "SANTAMARIA GUERRA", "100495", "DMEOR164");
            jdbcTemplate.update(insertDataSql, "MDMPE436", "CARLOS ALBERTO", "SOLIS INTRIAGO", "100521", "DMEOR164");
            jdbcTemplate.update(insertDataSql, "MDMPE23", "MARY GUADALUPE", "SANCHEZ BONILLA", "100026", "DMEOR169");
            jdbcTemplate.update(insertDataSql, "MDMPE353", "JOHNNY ALEXANDER", "AGUILAR CANSECO", "100578", "DMEOR178");
            jdbcTemplate.update(insertDataSql, "MDMPE325", "SARA MARIA", "ESPINOZA PARRA", "100550", "DMEOR178");
            jdbcTemplate.update(insertDataSql, "MDMPE329", "SILVANA CAROLA", "GONZALEZ DIAZ", "100554", "DMEOR178");
            jdbcTemplate.update(insertDataSql, "DMPER1217", "EDWIN JAVIER", "LOPEZ LAHUA", "100892", "DMEOR178");
            jdbcTemplate.update(insertDataSql, "DMPER715", "MARIO IVAN", "MORALES PAZMINO", "100616", "DMEOR178");
            jdbcTemplate.update(insertDataSql, "DMPER1198", "MIGUEL ANGEL", "NUÑEZ NUÑEZ", "100880", "DMEOR178");
            jdbcTemplate.update(insertDataSql, "MDMPE149", "KLEBER JESUS", "RAMIREZ MANTILLA", "100378", "DMEOR185");
            jdbcTemplate.update(insertDataSql, "DMPER827", "JOSE EDUARDO", "CUJI RUIZ", "100645", "DMEOR186");
            jdbcTemplate.update(insertDataSql, "DMPER983", "DANIEL IVAN", "DIAZ PASMAY", "100728", "DMEOR186");
            jdbcTemplate.update(insertDataSql, "MDMPE398", "JORGE XAVIER", "ERAZO ARMENDARIZ", "100483", "DMEOR186");
            jdbcTemplate.update(insertDataSql, "DMPER735", "MANUEL ANTONIO", "LOPEZ AGUILAR", "100627", "DMEOR186");
            jdbcTemplate.update(insertDataSql, "DMPER1076", "CARLOS ANDRES", "VARELA RAMIREZ", "100804", "DMEOR186");
            jdbcTemplate.update(insertDataSql, "DMPER737", "JHONNY DAVID", "VILLACIS TOASA", "100629", "DMEOR190");
            jdbcTemplate.update(insertDataSql, "DMPER1367", "HECTOR MAURICIO", "ALARCON CALAPIÑA", "100996", "DMEOR191");
            jdbcTemplate.update(insertDataSql, "MDMPE186", "MARCO ANTONIO", "ALOMOTO MOPOSITA", "100425", "DMEOR191");
            jdbcTemplate.update(insertDataSql, "DMPER1151", "EDISSON ROBERTO", "CHUQUIRIMA JUMBO", "100855", "DMEOR191");
            jdbcTemplate.update(insertDataSql, "DMPER1216", "BRYAN STEVEN", "FLORES OCAÑA", "100891", "DMEOR191");
            jdbcTemplate.update(insertDataSql, "DMPER968", "JORGE LUIS", "SANCHEZ ASQUE", "100718", "DMEOR191");
            jdbcTemplate.update(insertDataSql, "DMPER1098", "MARCOS ANDRES", "SOLIS FREIRE", "100822", "DMEOR191");
            jdbcTemplate.update(insertDataSql, "DMPER1238", "LUIS DANIEL", "MARTINEZ GARCES", "100906", "DMEOR188");
            jdbcTemplate.update(insertDataSql, "DMPER953", "PAUL VLADIMIR", "MORETA RUIZ", "100703", "DMEOR188");
            jdbcTemplate.update(insertDataSql, "MDMPE427", "FREDY OSWALDO", "SUPE SAILEMA", "100512", "DMEOR188");
            jdbcTemplate.update(insertDataSql, "DMPER1144", "TANIA ELIZABETH", "VILLAFUERTE TORRES", "100851", "DMEOR188");
            jdbcTemplate.update(insertDataSql, "MDMPE425", "MARCO VINICIO", "ESPINOZA FLORES", "100510", "DMEOR180");
            jdbcTemplate.update(insertDataSql, "DMPER714", "FRANKLIN ANIBAL", "FLORES JURADO", "100611", "DMEOR181");
            jdbcTemplate.update(insertDataSql, "MDMPE273", "EDUARDO ABSALON", "LOPEZ VASQUEZ", "100175", "DMEOR181");
            jdbcTemplate.update(insertDataSql, "MDMPE320", "FANNY MAYRA", "ALVAREZ CHILIQUINGA", "100545", "DMEOR173");
            jdbcTemplate.update(insertDataSql, "DMPER1101", "ANDRES SEBASTIAN", "MORALES FIALLOS", "100825", "DMEOR173");
            jdbcTemplate.update(insertDataSql, "MDMPE613", "JIMMY PAUL", "MUYULEMA MASAQUIZA", "100588", "DMEOR173");
            jdbcTemplate.update(insertDataSql, "DMPER1027", "RAMIRO ROGELIO", "ROBALINO SANCHEZ", "100764", "DMEOR173");
            jdbcTemplate.update(insertDataSql, "DMPER716", "KLEBER FABIAN", "SAILEMA MORALES", "100615", "DMEOR173");
            jdbcTemplate.update(insertDataSql, "MDMPE166", "ANGEL GONZALO", "SILVA GALARZA", "100396", "DMEOR173");
            jdbcTemplate.update(insertDataSql, "DMPER824", "CHRISTIAN ROLANDO", "NARANJO PICO", "100642", "DMEOR174");
            jdbcTemplate.update(insertDataSql, "MDMPE323", "CESAR DANIEL", "SANTANA CASTAÑEDA", "100548", "DMEOR174");
            jdbcTemplate.update(insertDataSql, "DMPER819", "OSCAR ROGELIO", "LASCANO CRUZ", "100637", "DMEOR177");
            jdbcTemplate.update(insertDataSql, "MDMPE372", "VICTOR FABRICIO", "MUYULEMA GUAITA", "100455", "DMEOR177");
            jdbcTemplate.update(insertDataSql, "MDMPE437", "CARLOS PATRICIO", "CORTEZ BONILLA", "100522", "DMEOR176");
            jdbcTemplate.update(insertDataSql, "DMPER828", "GERMAN GAVINO", "MORENO LOZADA", "100646", "DMEOR176");
            jdbcTemplate.update(insertDataSql, "DMPER996", "STALIN MAURICIO", "GUEVARA LOPEZ", "100739", "DMEOR218");
            jdbcTemplate.update(insertDataSql, "DMPER1054", "LUIS ELIAS", "LLANGARI TAYUPANDA", "100785", "DMEOR218");
            jdbcTemplate.update(insertDataSql, "MDMPE36", "RUTH ELIZABETH", "DIAZ SALTOS", "100107", "DMEOR192");
            jdbcTemplate.update(insertDataSql, "MDMPE327", "SANTIAGO GIOVANNY", "ESPINOSA ANDRANGO", "100552", "DMEOR192");
            jdbcTemplate.update(insertDataSql, "DMPER1214", "DARWIN SEBASTIAN", "GARZON ALMACHI", "100889", "DMEOR192");
            jdbcTemplate.update(insertDataSql, "DMPER728", "EDUARDO VLADIMIR", "CAMACHO TUZA", "100624", "DMEOR196");
            jdbcTemplate.update(insertDataSql, "DMPER823", "ANGEL VINICIO", "FLORES SALAZAR", "100641", "DMEOR196");
            jdbcTemplate.update(insertDataSql, "MDMPE408", "DANILO SEBASTIAN", "MARTINEZ INSUASTI", "100493", "DMEOR196");
            jdbcTemplate.update(insertDataSql, "MDMPE369", "WAGNER GERMAN", "RAMOS PEREZ", "100452", "DMEOR196");
            jdbcTemplate.update(insertDataSql, "DMPER1024", "VICTOR HUGO", "SOLIS CARRASCO", "100761", "DMEOR196");
            jdbcTemplate.update(insertDataSql, "DMPER1231", "MANUEL MECIAS", "TOASA VEGA", "100902", "DMEOR196");
            jdbcTemplate.update(insertDataSql, "DMPER713", "ADRIANO MARCELO", "CAMINO VARGAS", "100613", "DMEOR195");
            jdbcTemplate.update(insertDataSql, "MDMPE336", "MARIO JEOVANNY", "CHIPANTIZA CHAMBA", "100561", "DMEOR195");
            jdbcTemplate.update(insertDataSql, "DMPER729", "EDWIN ENRIQUE", "GUAITARA CASTRO", "100625", "DMEOR195");
            jdbcTemplate.update(insertDataSql, "DMPER822", "JAVIER ROLANDO", "LOPEZ DIAZ", "100640", "DMEOR195");
            jdbcTemplate.update(insertDataSql, "MDMPE379", "JOSE ENRIQUE", "YEPEZ POZO", "100464", "DMEOR195");
            jdbcTemplate.update(insertDataSql, "MDMPE635", "EDGAR FABRICIO", "CHAMBA RODRIGUEZ", "100610", "DMEOR207");
            jdbcTemplate.update(insertDataSql, "MDMPE342", "CHRISTYAN RODRIGO", "CUNALATA GOMEZ", "100567", "DMEOR207");
            jdbcTemplate.update(insertDataSql, "MDMPE426", "MARCOS ALBERTO", "LOPEZ NUÑEZ", "100511", "DMEOR207");
            jdbcTemplate.update(insertDataSql, "DMPER821", "ARMANDO VINICIO", "PLAZA BARRAGAN", "100639", "DMEOR207");
            jdbcTemplate.update(insertDataSql, "DMPER730", "JAIRO MIGUEL", "SANCHEZ SILVA", "100626", "DMEOR207");
            jdbcTemplate.update(insertDataSql, "MDMPE633", "RICARDO ARCENIO", "CARRILLO MEDINA", "100608", "DMEOR200");
            jdbcTemplate.update(insertDataSql, "MDMPE188", "CARLOS FRANCISCO", "SALCEDO ORELLANA", "100427", "DMEOR200");
            jdbcTemplate.update(insertDataSql, "MDMPE185", "JAIME MARCELO", "BARRERA FLORES", "100423", "DMEOR202");
            jdbcTemplate.update(insertDataSql, "DMPER951", "LENIN ARTURO", "MONTAÑO RIVAS", "100701", "DMEOR202");
            jdbcTemplate.update(insertDataSql, "DMPER930", "DAISY VALERIA", "VALLADARES PAZUÑA", "100689", "DMEOR202");
            jdbcTemplate.update(insertDataSql, "DMPER1095", "HAMILTON DIONEL", "GUERRERO CUENCA", "100819", "DMEOR203");
            jdbcTemplate.update(insertDataSql, "MDMPE378", "JAVIER IVAN", "SUNTA MIRANDA", "100463", "DMEOR203");
            jdbcTemplate.update(insertDataSql, "DMPER1239", "EDISON DANILO", "TUBON LAGUA", "100907", "DMEOR203");
            jdbcTemplate.update(insertDataSql, "DMPER1106", "ANDRES FABIAN", "UGSIÑA CAGUANA", "100828", "DMEOR203");
            jdbcTemplate.update(insertDataSql, "MDMPE331", "JOSE ALVARO", "YANZAPANTA ALOMOTO", "100556", "DMEOR203");
            jdbcTemplate.update(insertDataSql, "DMPER1223", "FRANCISCO JAVIER", "ARMENDARIZ VALVERDE", "100897", "DMEOR206");
            jdbcTemplate.update(insertDataSql, "DMPER1212", "ALVARO SEBASTIAN", "GAVILANES TAMAYO", "100887", "DMEOR206");
            jdbcTemplate.update(insertDataSql, "DMPER914", "CESAR PATRICIO", "GUZMAN MAYORGA", "100679", "DMEOR206");
            jdbcTemplate.update(insertDataSql, "MDMPE259", "ARTURO ", "MENESES CARRANCO", "100363", "DMEOR206");
            jdbcTemplate.update(insertDataSql, "DMPER952", "FRANKLIN ROBERTO", "ARROBA POVEDA", "100702", "DMEOR201");
            jdbcTemplate.update(insertDataSql, "DMPER966", "FREDDY DAVID", "LALALEO PARRA", "100713", "DMEOR201");
            jdbcTemplate.update(insertDataSql, "DMPER901", "MIGUEL ANGEL", "LOPEZ GUTIERREZ", "100666", "DMEOR201");
            jdbcTemplate.update(insertDataSql, "DMPER1052", "CARLOS GABRIEL", "TIXE CANTUÑA", "100783", "DMEOR201");
            jdbcTemplate.update(insertDataSql, "DMPER744", "JOSE LUIS", "YANCHAPANTA PAREDES", "100635", "DMEOR201");
            jdbcTemplate.update(insertDataSql, "MDMPE324", "GRICELDA ELIZABETH", "ORTIZ GUAITARA", "100549", "DMEOR197");
            jdbcTemplate.update(insertDataSql, "DMPER1353", "VINICIO SEBASTIAN", "RIBADENEIRA RAMIREZ", "100988", "DMEOR197");
            jdbcTemplate.update(insertDataSql, "MDMPE434", "SILVIA AMPARO", "LOPEZ VACA", "100519", "DMEOR199");
            jdbcTemplate.update(insertDataSql, "DMPER912", "OSCAR PAUL", "RODRIGUEZ SANCHEZ", "100677", "DMEOR205");
            jdbcTemplate.update(insertDataSql, "DMPER1179", "HOLGUER ISAAC", "SANCHEZ SARZOSA", "100871", "DMEOR205");
            jdbcTemplate.update(insertDataSql, "MDMPE444", "JOEL ENRIQUE", "VALLE VELASTEGUI", "100529", "DMEOR205");
            jdbcTemplate.update(insertDataSql, "DMPER1154", "ELIAS SALOMON", "ALVAREZ CONSTANTE", "100858", "DMEOR170");
            jdbcTemplate.update(insertDataSql, "DMPER1370", "CAROLINA RAQUEL", "CAMINO LASCANO", "100999", "DMEOR170");
            jdbcTemplate.update(insertDataSql, "DMPER1128", "DIEGO PAUL", "OCAÑA URBINA", "100842", "DMEOR170");
            jdbcTemplate.update(insertDataSql, "DMPER742", "ANTONIO DE JESUS", "ORTIZ LOPEZ", "100631", "DMEOR170");
            jdbcTemplate.update(insertDataSql, "DMPER736", "JOSE VINICIO", "SANTAMARIA MANZANO", "100628", "DMEOR170");
            jdbcTemplate.update(insertDataSql, "MDMPE439", "HOLGER FABIAN", "VIVANCO CASTILLO", "100524", "DMEOR170");
            jdbcTemplate.update(insertDataSql, "MDMPE63", "GONZALO ", "AGUAYO ", "100154", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1352", "DIEGO SEBASTIAN", "BONILLA SANCHEZ", "100987", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE415", "JESUS GEOVANNY", "CAMACHO TUZA", "100500", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE435", "CARLOS MARCIAL", "CHAMBA RODRIGUEZ", "100520", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE458", "ROBERTO JAVIER", "CHUQUITARCO LOZADA", "100543", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1142", "LEONARDO FABIAN", "CUNACHI MAISANCHE", "100850", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE340", "EDWIN NICANOR", "FREIRE JORDAN", "100565", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1065", "CRISTIAN JESUS", "GUATO GUAMAN", "100796", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1213", "DANIEL ALEJANDRO", "GUTIERREZ RODAS", "100888", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1062", "WASHINGTON EFRAIN", "LLANGARI TAYUPANDA", "100793", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER917", "JORGE LUIS", "LOPEZ LALALEO", "100680", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1104", "BRYAN JONATHAN", "MAYORGA MARQUEZ", "100826", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1055", "MENTOR FABIAN", "MAYORGA PEREZ", "100786", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE622", "FRANKLIN ROBERTO", "MELO LOPEZ", "100597", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE322", "HOLGUER VLADIMIR", "MINIGUANO GUTIERREZ", "100547", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE194", "VICTOR HUGO", "NARANJO AMALUISA", "100436", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1243", "KLEVER DANIEL", "QUIÑALIZA MALDONADO", "100911", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE365", "PATRICIO GEOVANNY", "SALAZAR LOPEZ", "100447", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE155", "MARCO EDUARDO", "SOLIS LLANGANATE", "100384", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE359", "BOLIVAR ROMELIO", "SORIA CHONATA", "100439", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1133", "ANDRES RAMIRO", "TIRADO TRUJILLO", "100845", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE428", "EDISON FABIAN", "TORRES RODRIGUEZ", "100513", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "DMPER1134", "ERICK RICARDO", "ÑAUPARI JEREZ", "100846", "DMEOR172");
            jdbcTemplate.update(insertDataSql, "MDMPE165", "LUIS ALFONSO", "PEREZ ARCOS", "100395", "DMEOR171");
            jdbcTemplate.update(insertDataSql, "DMPER1099", "EDISSON JAVIER", "PEREZ FLORES", "100823", "DMEOR171");
            jdbcTemplate.update(insertDataSql, "DMPER913", "JOSE LUIS", "TIXI ASITIMBAY", "100678", "DMEOR171");
            jdbcTemplate.update(insertDataSql, "DMPER900", "DIEGO FABIAN", "MEDINA PACCHA", "100665", "DMEOR165");
            jdbcTemplate.update(insertDataSql, "DMPER1176", "MAURO ALEJANDRO", "LLAMBO DELGADO", "100869", "DMEOR168");
            jdbcTemplate.update(insertDataSql, "DMPER1138", "JORGE LUIS", "PEREZ VILLACIS", "100849", "DMEOR168");
            jdbcTemplate.update(insertDataSql, "DMPER1218", "SEGUNDO HERNAN", "CHINLLI CHOGLLO", "100893", "DMEOR166");
            jdbcTemplate.update(insertDataSql, "MDMPE682", "ROCIO DEL PILAR", "CHAUCA CHILLOGALLO", "200088", "DMEOR104");
            jdbcTemplate.update(insertDataSql, "MDMPE540", "MERCY BEATRIZ", "MORALES RODRIGUEZ", "200048", "DMEOR104");
            jdbcTemplate.update(insertDataSql, "MDMPE390", "RAUL IVAN", "PARRA GUERRERO", "100475", "DMEOR104");
            jdbcTemplate.update(insertDataSql, "DMPER1280", "NELSON GUSTAVO", "SOLORZANO ALEAGA", "200109", "DMEOR104");
            jdbcTemplate.update(insertDataSql, "DMPER1171", "OSCAR MAURICIO", "ALARCON ORDOÑEZ", "200092", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER734", "DIEGO ARMANDO", "ALVAREZ JACOME", "200062", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER1320", "BRYAN JAIR", "HARO CASTILLO", "200112", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "MDMPE479", "SANDRA PATRICIA", "HARO RODRIGUEZ", "200039", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "MDMPE534", "MARCO IVAN", "LOZAY CARRION", "200042", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER1333", "GABRIELA MERCEDES", "MAFLA MEDINA", "200113", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER963", "JORGE EFRAIN", "MONTES ABARCA", "200074", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER1194", "DIEGO MAURICIO", "MOYA CUEVA", "200096", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER978", "MARIA TERESA", "PAREDES CASCO", "200075", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER1359", "ALAN ANDRES", "VALENCIA QUIROZ", "200115", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER943", "CARLOS GONZALO", "VILLAVICENCIO TAMAYO", "400019", "DMEOR105");
            jdbcTemplate.update(insertDataSql, "DMPER1360", "YASMIN IRENE", "CALDERON VELASTEGUI", "200116", "DMEOR106");
            jdbcTemplate.update(insertDataSql, "DMPER1131", "MARIELA SECIBETH", "VILLAVICENCIO TAMAYO", "200086", "DMEOR106");
            jdbcTemplate.update(insertDataSql, "DMPER939", "FRANKLIN MARCELO", "ESPINOZA SARANGO", "200071", "DMEOR108");
            jdbcTemplate.update(insertDataSql, "MDMPE538", "SIXTO ORLANDO", "PAREDES TORRES", "200046", "DMEOR108");
            jdbcTemplate.update(insertDataSql, "MDMPE544", "ANGEL MARCELO", "MOYA CUEVA", "200052", "DMEOR133");
            jdbcTemplate.update(insertDataSql, "DMPER1164", "BEATRIZ JUDITH", "GREFA CERDA", "200091", "DMEOR211");
            jdbcTemplate.update(insertDataSql, "DMPER1365", "JOSTIN ALEXANDER", "UASUMBA GREFA", "200117", "DMEOR211");
            jdbcTemplate.update(insertDataSql, "MDMPE474", "JOSE EUGENIO", "BARROSO ORELLANA", "200034", "DMEOR109");
            jdbcTemplate.update(insertDataSql, "DMPER941", "VERONICA ALEXANDRA", "MANYA MONTOYA", "200072", "DMEOR109");
            jdbcTemplate.update(insertDataSql, "DMPER1172", "MERWIN GABRIEL", "OCAÑA FRUTOS", "200102", "DMEOR109");
            jdbcTemplate.update(insertDataSql, "DMPER1264", "DIEGO ALEXANDER", "GUANOLUISA HARO", "200106", "DMEOR110");
            jdbcTemplate.update(insertDataSql, "DMPER1235", "JUAN CARLOS", "GUEVARA DUCHE", "200104", "DMEOR110");
            jdbcTemplate.update(insertDataSql, "DMPER1265", "CESAR RODRIGO", "HIDALGO ACUÑA", "200107", "DMEOR110");
            jdbcTemplate.update(insertDataSql, "MDMPE537", "EDWIN HUMBERTO", "VEGA CASTRO", "200045", "DMEOR110");
            jdbcTemplate.update(insertDataSql, "MDMPE549", "LENIN FABRICIO", "CERVANTES RIOS", "200057", "DMEOR111");
            jdbcTemplate.update(insertDataSql, "DMPER723", "DIEGO ARMANDO", "QUISHPI ZISA", "200059", "DMEOR111");
            jdbcTemplate.update(insertDataSql, "MDMPE473", "MARCO VINICIO", "ZAMORA GASITUA", "200033", "DMEOR111");
            jdbcTemplate.update(insertDataSql, "DMPER1123", "FABRICIO ISMAEL", "LOZADA JORDAN", "200097", "DMEOR134");
            jdbcTemplate.update(insertDataSql, "DMPER830", "VICTOR MAURICIO", "MACANCELA SIGUA", "200063", "DMEOR150");
            jdbcTemplate.update(insertDataSql, "MDMPE536", "JUAN CARLOS", "VALENCIA CAMACHO", "200044", "DMEOR150");
            jdbcTemplate.update(insertDataSql, "DMPER1234", "DARIO JAVIER", "CANDO CASTILLO", "200103", "DMEOR219");
            jdbcTemplate.update(insertDataSql, "MDMPE548", "EDISON EDUARDO", "ERAZO CULCAY", "200056", "DMEOR219");
            jdbcTemplate.update(insertDataSql, "DMPER1236", "JUAN CARLOS", "GUERRERO MORALES", "200105", "DMEOR219");
            jdbcTemplate.update(insertDataSql, "DMPER932", "CARLOS RICHARD", "CALAPUCHA COQUINCHE", "200070", "DMEOR220");
            jdbcTemplate.update(insertDataSql, "DMPER1183", "JOEL FABRICIO", "LOPEZ CHIMBO", "200094", "DMEOR220");
            jdbcTemplate.update(insertDataSql, "DMPER731", "ESTEBAN JAVIER", "CONDE RAMIREZ", "200060", "DMEOR129");
            jdbcTemplate.update(insertDataSql, "MDMPE693", "LEYDA LILIAN", "ANDI TORRES", "600033", "DMEOR114");
            jdbcTemplate.update(insertDataSql, "MDMPE684", "MARCO MARCELINO", "CHAGCHA LOPEZ", "600024", "DMEOR114");
            jdbcTemplate.update(insertDataSql, "MDMPE702", "DIEGO FABIAN", "EGAS REVELO", "600042", "DMEOR114");
            jdbcTemplate.update(insertDataSql, "DMPER1358", "ERICA CARINA", "GREFA ANDI", "600100", "DMEOR114");
            jdbcTemplate.update(insertDataSql, "MDMPE697", "EDISON ANTONIO", "MARQUEZ TIPANTASIG", "600037", "DMEOR118");
            jdbcTemplate.update(insertDataSql, "DMPER1346", "MAURICIO XAVIER", "RAMOS ARAUJO", "600099", "DMEOR118");
            jdbcTemplate.update(insertDataSql, "DMPER1156", "MARIBEL XIMENA", "AGUINDA SHIGUANGO", "600079", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "MDMPE694", "OSCAR OMAR", "AVILA PEÑA", "600034", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "MDMPE663", "VERONICA ", "BRITO PAREDES", "600003", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "DMPER1109", "MIRIAN MERCEDES", "CALUÑA LUMISACA", "600072", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "MDMPE701", "NANCY GIOCONDA", "CARVAJAL IBARRA", "600041", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "DMPER1189", "JEFRY FERNANDO", "GOMEZ GOMEZ", "600086", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "DMPER1228", "RUBEN DARIO", "HERNANDEZ GAVILANES", "600088", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "DMPER1015", "LUIS CARLOS", "LANDAZURI VILLACIS", "600064", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "DMPER1317", "KAREN MADELEINE", "LOPEZ ULLOA", "600098", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "MDMPE695", "SILVANA MARIBEL", "MONTOYA TOAPANTA", "600035", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "DMPER1185", "HECTOR XAVIER", "MORENO NUÑEZ", "600083", "DMEOR119");
            jdbcTemplate.update(insertDataSql, "MDMPE665", "VICENTE VINICIO", "CHAVEZ BASTIDAS", "600005", "DMEOR120");
            jdbcTemplate.update(insertDataSql, "MDMPE686", "JUAN CARLOS", "LUNA PANTI", "600026", "DMEOR120");
            jdbcTemplate.update(insertDataSql, "MDMPE683", "DARWIN HUGO", "SALAZAR VARGAS", "600023", "DMEOR120");
            jdbcTemplate.update(insertDataSql, "MDMPE696", "EDEN VLADIMIR", "SHIGUANGO TAPUY", "600036", "DMEOR120");
            jdbcTemplate.update(insertDataSql, "MDMPE688", "KLEBER GUILLERMO", "TANGUILA CERDA", "600028", "DMEOR120");
            jdbcTemplate.update(insertDataSql, "DMPER1178", "GUILLERMO SILVERIO", "ANDI LICUY", "600082", "DMEOR212");
            jdbcTemplate.update(insertDataSql, "MDMPE690", "NELSON PATRICIO", "MUSO DUCHITANGA", "600030", "DMEOR121");
            jdbcTemplate.update(insertDataSql, "DMPER1371", "KEVIN SNAYDER", "RAMIREZ ESPINOZA", "600101", "DMEOR121");
            jdbcTemplate.update(insertDataSql, "MDMPE668", "BETTY MARIELIZA", "RUIZ RIVADENEYRA", "600008", "DMEOR121");
            jdbcTemplate.update(insertDataSql, "MDMPE698", "VICTOR HUGO", "UYAGUARI DIAZ", "600038", "DMEOR121");
            jdbcTemplate.update(insertDataSql, "MDMPE667", "HECTOR EFRAIN", "PAREDES VILLA", "600007", "DMEOR122");
            jdbcTemplate.update(insertDataSql, "DMPER1004", "CESAR JAVIER", "LLANDA FIALLOS", "600062", "DMEOR213");
            jdbcTemplate.update(insertDataSql, "MDMPE704", "LUIS ANTONIO", "MUESES PINDUISACA", "600044", "DMEOR213");
            jdbcTemplate.update(insertDataSql, "MDMPE671", "CARLOS HUGO", "JAPON TORRES", "600011", "DMEOR214");
            jdbcTemplate.update(insertDataSql, "MDMPE689", "DARWIN JESUS", "QUILUMBA CHALACA", "600029", "DMEOR215");
            jdbcTemplate.update(insertDataSql, "MDMPE675", "JAIME MARTIN", "SHIGUANGO TAPUY", "600015", "DMEOR215");
            jdbcTemplate.update(insertDataSql, "DMPER885", "LUIS FREDI", "HUACHI TAPUY", "600050", "DMEOR161");
            jdbcTemplate.update(insertDataSql, "DMPER1022", "EDINSON JAVIER", "ZURITA VISTIN", "600065", "DMEOR161");
            jdbcTemplate.update(insertDataSql, "DMPER1091", "CLEOFE JUAN", "CUEVA YUNGA", "600070", "DMEOR217");
            jdbcTemplate.update(insertDataSql, "DMPER1122", "MIGUEL ANGEL", "LEGUISAMO MARTINEZ", "600077", "DMEOR217");
            jdbcTemplate.update(insertDataSql, "DMPER1248", "MARCO VINICIO", "PULLUQUITIN TONATO", "600092", "DMEOR217");
        }
    }

    @Override
    public void actualizarMatriz(String PPRO_ANIO, String PPRO_CANTIDAD_ANUAL, String PPRO_CATALOGO_ELECTRONICO, Float PPRO_CODIGO_CATEGORIA_CPC, String PPRO_CODIGO_SERCOP, Float PPRO_COSTO_UNITARIO, String PPRO_CUATRIMESTRE_N1, String PPRO_CUATRIMESTRE_N2, String PPRO_CUATRIMESTRE_N3, String PPRO_DETALLE_PRODUCTO, Date PPRO_FECHA_FINAL, Date PPRO_FECHA_INICIAL, String PPRO_FONDOS_BID, String PPRO_NUMERO_CODIGO_OPERACION_P, String PPRO_NUMERO_CODIGO_PROYECTO_BI, String PPRO_NUMERO_CONTRATO, String PPRO_OBSERVACIONES, String PPRO_PLAZO, String PPRO_CODIGO_RAPIDO, Float PPRO_PRESUPUESTO_INICIAL, Float PPRO_PRESUPUESTO_CODIFICADO, String FK_PETAPRE_ID, String FK_PDE_DMEOR_CODIGO, String FK_PPRSE_ID_PER, String FK_PTICO_ID_PER, String FK_PTIPRE_ID_PER, String FK_PTIPO_ID_PER, String FK_PTIPRO_ID_PER, String FK_PTIRE_ID_PER, String FK_PUNI_ID_PER, Integer PK_PPRO_CODIGO_UNICO) {

       /*if ((PPRO_ANIO != null) && (PPRO_CANTIDAD_ANUAL != null) && (PPRO_CATALOGO_ELECTRONICO != null) &&
                (PPRO_CODIGO_CATEGORIA_CPC != null) &&
                (PPRO_CODIGO_SERCOP != null) &&(PPRO_COSTO_UNITARIO != null) &&(PPRO_CUATRIMESTRE_N1 != null) &&
                (PPRO_CUATRIMESTRE_N2 != null) && (PPRO_CUATRIMESTRE_N3 != null) && (PPRO_DETALLE_PRODUCTO != null) &&
                (PPRO_FECHA_FINAL != null )&& (PPRO_FECHA_INICIAL != null) && (PPRO_FONDOS_BID != null) &&
                (PPRO_NUMERO_CODIGO_OPERACION_P != null )&& (PPRO_NUMERO_CODIGO_PROYECTO_BI != null) &&
                (PPRO_NUMERO_CONTRATO != null) &&(PPRO_OBSERVACIONES != null)&& (PPRO_PLAZO != null) &&
                (PPRO_CODIGO_RAPIDO != null) &&(PPRO_PRESUPUESTO_INICIAL != null) &&(PPRO_PRESUPUESTO_CODIFICADO != null) &&
                (FK_PETAPRE_ID != null) &&(FK_PDE_DMEOR_CODIGO != null) &&(FK_PPRSE_ID_PER != null) &&
                (FK_PTICO_ID_PER!= null) && (FK_PTIPRE_ID_PER != null) &&(FK_PTIPO_ID_PER != null) &&
                (FK_PTIPRO_ID_PER != null) && (FK_PTIRE_ID_PER != null) &&(FK_PUNI_ID_PER != null) &&
                (PK_PPRO_CODIGO_UNICO != null)){

        */
            String sql = "UPDATE PROJECTDP_PROYECTOS M\n" +
                    "SET M.PPRO_ANIO=?,\n" +
                    "M.PPRO_CANTIDAD_ANUAL=?,\n" +
                    "M.PPRO_CATALOGO_ELECTRONICO =?,\n" +
                    "M.PPRO_CODIGO_CATEGORIA_CPC=?,\n" +
                    "M.PPRO_CODIGO_SERCOP=?,\n" +
                    "M.PPRO_COSTO_UNITARIO=?,\n" +
                    "M.PPRO_CUATRIMESTRE_N1=?,\n" +
                    "M.PPRO_CUATRIMESTRE_N2=?,\n" +
                    "M.PPRO_CUATRIMESTRE_N3=?,\n" +
                    "M.PPRO_DETALLE_PRODUCTO=?,\n" +
                    "M.PPRO_FECHA_FINAL=TO_DATE(?),\n" +
                    "M.PPRO_FECHA_INICIAL=TO_DATE(?),\n" +
                    "M.PPRO_FONDOS_BID=?,\n" +
                    "M.PPRO_NUMERO_CODIGO_OPERACION_P=?,\n" +
                    "M.PPRO_NUMERO_CODIGO_PROYECTO_BI=?,\n" +
                    "M.PPRO_NUMERO_CONTRATO=?,\n" +
                    "M.PPRO_OBSERVACIONES=?,\n" +
                    "M.PPRO_PLAZO=?,\n" +
                    "M.PPRO_CODIGO_RAPIDO=?,\n" +
                    "M.PPRO_PRESUPUESTO_INICIAL=?,\n" +
                    "M.PPRO_PRESUPUESTO_CODIFICADO=?,\n" +
                    "M.FK_PETAPRE_ID=?,\n" +
                    "M.FK_PDE_DMEOR_CODIGO=?,\n" +
                    "M.FK_PPRSE_ID_PER=?,\n" +
                    "M.FK_PTICO_ID_PER=?,\n" +
                    "M.FK_PTIPRE_ID_PER=?,\n" +
                    "M.FK_PTIPO_ID_PER=?,\n" +
                    "M.FK_PTIPRO_ID_PER=?,\n" +
                    "M.FK_PTIRE_ID_PER =?,\n" +
                    "M.FK_PUNI_ID_PER = ?\n" +
                    "WHERE M.PK_PPRO_CODIGO_UNICO = ?";
            jdbcTemplate.update(sql, PPRO_ANIO,PPRO_CANTIDAD_ANUAL,PPRO_CATALOGO_ELECTRONICO,PPRO_CODIGO_CATEGORIA_CPC,
                    PPRO_CODIGO_SERCOP, PPRO_COSTO_UNITARIO, PPRO_CUATRIMESTRE_N1,PPRO_CUATRIMESTRE_N2,PPRO_CUATRIMESTRE_N3,
                    PPRO_DETALLE_PRODUCTO, PPRO_FECHA_FINAL, PPRO_FECHA_INICIAL, PPRO_FONDOS_BID, PPRO_NUMERO_CODIGO_OPERACION_P,
                    PPRO_NUMERO_CODIGO_PROYECTO_BI, PPRO_NUMERO_CONTRATO, PPRO_OBSERVACIONES, PPRO_PLAZO, PPRO_CODIGO_RAPIDO,
                    PPRO_PRESUPUESTO_INICIAL, PPRO_PRESUPUESTO_CODIFICADO,FK_PETAPRE_ID, FK_PDE_DMEOR_CODIGO,FK_PPRSE_ID_PER,
                    FK_PTICO_ID_PER,FK_PTIPRE_ID_PER,FK_PTIPO_ID_PER, FK_PTIPRO_ID_PER,FK_PTIRE_ID_PER,FK_PUNI_ID_PER,PK_PPRO_CODIGO_UNICO);

    }

    @Override
    public List<Matriz> findID(Integer PK_PPRO_CODIGO_UNICO) {
        String query = "SELECT M.PK_PPRO_CODIGO_UNICO,\n" +
                "      M.PPRO_ANIO,\n" +
                "      M.PPRO_CANTIDAD_ANUAL,\n" +
                "      M.PPRO_CATALOGO_ELECTRONICO,\n" +
                "      M.PPRO_CODIGO_CATEGORIA_CPC,\n" +
                "      M.PPRO_CODIGO_SERCOP,\n" +
                "      M.PPRO_COSTO_UNITARIO,\n" +
                "      M.PPRO_CUATRIMESTRE_N1,\n" +
                "      M.PPRO_CUATRIMESTRE_N2,\n" +
                "      M.PPRO_CUATRIMESTRE_N3,\n" +
                "      M.PPRO_DETALLE_PRODUCTO,\n" +
                "      M.PPRO_FECHA_FINAL,\n" +
                "      M.PPRO_FECHA_INICIAL,\n" +
                "      M.PPRO_FONDOS_BID,\n" +
                "      M.PPRO_NUMERO_CODIGO_OPERACION_P,\n" +
                "      M.PPRO_NUMERO_CODIGO_PROYECTO_BI,\n" +
                "      M.PPRO_NUMERO_CONTRATO,\n" +
                "      M.PPRO_OBSERVACIONES,\n" +
                "      M.PPRO_PLAZO,\n" +
                "      M.PPRO_CODIGO_RAPIDO,\n" +
                "      M.PPRO_PRESUPUESTO_INICIAL,\n" +
                "      M.PPRO_PRESUPUESTO_CODIFICADO,\n" +
                "      EP.PETAPRE_ETAPA_PRESUPUESTO,\n" +
                "      EP.PK_PETAPRE_ID,\n" +
                "      A.PAC_ACTIVIDAD_ENERO,\n" +
                "      A.PAC_ACTIVIDAD_FEBRERO,\n" +
                "      A.PAC_ACTIVIDAD_MARZO,\n" +
                "      A.PAC_ACTIVIDAD_ABRIL,\n" +
                "      A.PAC_ACTIVIDAD_MAYO,\n" +
                "      A.PAC_ACTIVIDAD_JUNIO,\n" +
                "      A.PAC_ACTIVIDAD_JULIO,\n" +
                "      A.PAC_ACTIVIDAD_AGOSTO,\n" +
                "      A.PAC_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_OCTUBRE,\n" +
                "      A.PAC_ACTIVIDAD_NOVIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_DICIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_ENERO,\n" +
                "      AP.PPRES_ACTIVIDAD_FEBRERO,\n" +
                "      AP.PPRES_ACTIVIDAD_MARZO,\n" +
                "      AP.PPRES_ACTIVIDAD_ABRIL,\n" +
                "      AP.PPRES_ACTIVIDAD_MAYO,\n" +
                "      AP.PPRES_ACTIVIDAD_JUNIO,\n" +
                "      AP.PPRES_ACTIVIDAD_JULIO,\n" +
                "      AP.PPRES_ACTIVIDAD_AGOSTO,\n" +
                "      AP.PPRES_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_OCTUBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_DICIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_ENERO,\n" +
                "      AC.PCER_ACTIVIDAD_FEBRERO,\n" +
                "      AC.PCER_ACTIVIDAD_MARZO,\n" +
                "      AC.PCER_ACTIVIDAD_ABRIL,\n" +
                "      AC.PCER_ACTIVIDAD_MAYO,\n" +
                "      AC.PCER_ACTIVIDAD_JUNIO,\n" +
                "      AC.PCER_ACTIVIDAD_JULIO,\n" +
                "      AC.PCER_ACTIVIDAD_AGOSTO,\n" +
                "      AC.PCER_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_OCTUBRE,\n" +
                "      AC.PCER_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_DICIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_ENERO,\n" +
                "      APA.PPAG_ACTIVIDAD_FEBRERO,\n" +
                "      APA.PPAG_ACTIVIDAD_MARZO,\n" +
                "      APA.PPAG_ACTIVIDAD_ABRIL,\n" +
                "      APA.PPAG_ACTIVIDAD_MAYO,\n" +
                "      APA.PPAG_ACTIVIDAD_JUNIO,\n" +
                "      APA.PPAG_ACTIVIDAD_JULIO,\n" +
                "      APA.PPAG_ACTIVIDAD_AGOSTO,\n" +
                "      APA.PPAG_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_OCTUBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_NOVIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_DICIEMBRE,\n" +
                "      D.PDE_DEPARTAMENTO,\n" +
                "      D.PK_PDE_DMEOR_CODIGO,\n" +
                "      PP.PPAPRE_PARTIDA_PRESUPUESTARIA,\n" +
                "      PA.PPOAVFIDE_PORCENTAJE_AVANCE_FI *100 AS PORCENTAJE,\n" +
                "      PA.PPOAVFIDE_OBSERVACIONES_PA,\n" +
                "      PA.PPOAVFIDE_FECHA_PA,\n" +
                "      PS.PPRSE_PROCEDIMIENTO_SERCOP,\n" +
                "      PS.PK_PPRSE_ID,\n" +
                "      TC.PTICO_TIPO_COMPRA,\n" +
                "      TC.PK_PTICO_ID,\n" +
                "      TPRE.PTIPRE_TIPO_PRESUPUESTO,\n" +
                "      TPRE.PK_PTIPRE_ID,\n" +
                "      TPROD.PTIPO_TIPO_PRODUCTO,\n" +
                "      TPROD.PK_PTIPO_ID,\n" +
                "      TPRO.PTIPRO_TIPO_PROYECTO,\n" +
                "      TPRO.PK_PTIPRO_ID,\n" +
                "      TR.PTIRE_TIPO_REGIMEN,\n" +
                "      TR.PK_PTIRE_ID,\n" +
                "      U.PUNI_UNIDAD,\n" +
                "      U.PK_PUNI_ID,\n" +
                "      VA.PVADE_VALOR_DEVENGADO,\n" +
                "      VA.PVADE_OBSERVACIONES_VD,\n" +
                "      VA.PVADE_FECHA_VD,\n" +
                "      RT.PRETE_NOMBRE,\n" +
                "      RT.PRETE_APELLIDO,\n" +
                "      RT.PRETE_ROL,\n" +
                "      RT.PRETE_DMEOR_CODIGO,\n" +
                "      CASE\n" +
                "    WHEN SYSDATE >= M.PPRO_FECHA_FINAL THEN 'RETRASADO'\n" +
                "    ELSE 'VIGENTE'\n" +
                "END AS ESTADO\n" +
                "FROM PROJECTDP_PROYECTOS M  \n" +
                "LEFT OUTER JOIN PROYECTDP_DETALLE_RESPONSABLE DR\n" +
                "ON  M.PK_PPRO_CODIGO_UNICO = DR.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_RESPONSABLE_TECNICO RT\n" +
                "ON DR.FK_DMPER_CODIGO = RT.PK_PRETE_DMPER_CODIGO\n" +
                "LEFT OUTER JOIN PROJECTDP_ACTIVIDADES A \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = A.FK_PER_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PRESUPUESTO AP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AP.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_CERTIFICADO AC \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AC.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PAGADO APA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = APA.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROJECTDP_DEPARTAMENTO D \n" +
                "ON M.FK_PDE_DMEOR_CODIGO = D.PK_PDE_DMEOR_CODIGO\n" +

                "LEFT OUTER JOIN PROJECTDP_PARTIDA_PRESUPUESTAR PP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PP.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PORCENTAJE_AVANCE_FI PA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PA.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PROCEDIMIENTO_SERCOP PS \n" +
                "ON M.FK_PPRSE_ID_PER = PS.PK_PPRSE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_COMPRA TC \n" +
                "ON M.FK_PTICO_ID_PER = TC.PK_PTICO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRESUPUESTO TPRE \n" +
                "ON M.FK_PTIPRE_ID_PER = TPRE.PK_PTIPRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRODUCTO TPROD \n" +
                "ON M.FK_PTIPO_ID_PER = TPROD.PK_PTIPO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PROYECTO TPRO \n" +
                "ON M.FK_PTIPRO_ID_PER = TPRO.PK_PTIPRO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_REGIMEN TR \n" +
                "ON M.FK_PTIRE_ID_PER = TR.PK_PTIRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_UNIDAD U \n" +
                "ON M.FK_PUNI_ID_PER = U.PK_PUNI_ID\n" +
                "LEFT OUTER JOIN PROYECTDP_ETAPA_PRESUPUESTO EP\n" +
                "ON M.FK_PETAPRE_ID = EP.PK_PETAPRE_ID\n"+

                "LEFT OUTER JOIN PROJECTDP_VALOR_DEVENGADO VA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = VA.FK_PPRO_CODIGO_UNICO \n" +

                "WHERE M.PK_PPRO_CODIGO_UNICO = ? \n" +
                "ORDER BY M.PK_PPRO_CODIGO_UNICO";



        return jdbcTemplate.query(query, new Object[]{PK_PPRO_CODIGO_UNICO}, new MatrizMapper());
    }

    @Override
    public List<Matriz> joinTables() {
        String query = "SELECT M.PK_PPRO_CODIGO_UNICO,\n" +
                "      M.PPRO_ANIO,\n" +
                "      M.PPRO_CANTIDAD_ANUAL,\n" +
                "      M.PPRO_CATALOGO_ELECTRONICO,\n" +
                "      M.PPRO_CODIGO_CATEGORIA_CPC,\n" +
                "      M.PPRO_CODIGO_SERCOP,\n" +
                "      M.PPRO_COSTO_UNITARIO,\n" +
                "      M.PPRO_CUATRIMESTRE_N1,\n" +
                "      M.PPRO_CUATRIMESTRE_N2,\n" +
                "      M.PPRO_CUATRIMESTRE_N3,\n" +
                "      M.PPRO_DETALLE_PRODUCTO,\n" +
                "      M.PPRO_FECHA_FINAL,\n" +
                "      M.PPRO_FECHA_INICIAL,\n" +
                "      M.PPRO_FONDOS_BID,\n" +
                "      M.PPRO_NUMERO_CODIGO_OPERACION_P,\n" +
                "      M.PPRO_NUMERO_CODIGO_PROYECTO_BI,\n" +
                "      M.PPRO_NUMERO_CONTRATO,\n" +
                "      M.PPRO_OBSERVACIONES,\n" +
                "      M.PPRO_PLAZO,\n" +
                "      M.PPRO_CODIGO_RAPIDO,\n" +
                "      M.PPRO_PRESUPUESTO_INICIAL,\n" +
                "      M.PPRO_PRESUPUESTO_CODIFICADO,\n" +
                "      EP.PETAPRE_ETAPA_PRESUPUESTO,\n" +
                "      EP.PK_PETAPRE_ID,\n" +
                "      A.PAC_ACTIVIDAD_ENERO,\n" +
                "      A.PAC_ACTIVIDAD_FEBRERO,\n" +
                "      A.PAC_ACTIVIDAD_MARZO,\n" +
                "      A.PAC_ACTIVIDAD_ABRIL,\n" +
                "      A.PAC_ACTIVIDAD_MAYO,\n" +
                "      A.PAC_ACTIVIDAD_JUNIO,\n" +
                "      A.PAC_ACTIVIDAD_JULIO,\n" +
                "      A.PAC_ACTIVIDAD_AGOSTO,\n" +
                "      A.PAC_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_OCTUBRE,\n" +
                "      A.PAC_ACTIVIDAD_NOVIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_DICIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_ENERO,\n" +
                "      AP.PPRES_ACTIVIDAD_FEBRERO,\n" +
                "      AP.PPRES_ACTIVIDAD_MARZO,\n" +
                "      AP.PPRES_ACTIVIDAD_ABRIL,\n" +
                "      AP.PPRES_ACTIVIDAD_MAYO,\n" +
                "      AP.PPRES_ACTIVIDAD_JUNIO,\n" +
                "      AP.PPRES_ACTIVIDAD_JULIO,\n" +
                "      AP.PPRES_ACTIVIDAD_AGOSTO,\n" +
                "      AP.PPRES_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_OCTUBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_DICIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_ENERO,\n" +
                "      AC.PCER_ACTIVIDAD_FEBRERO,\n" +
                "      AC.PCER_ACTIVIDAD_MARZO,\n" +
                "      AC.PCER_ACTIVIDAD_ABRIL,\n" +
                "      AC.PCER_ACTIVIDAD_MAYO,\n" +
                "      AC.PCER_ACTIVIDAD_JUNIO,\n" +
                "      AC.PCER_ACTIVIDAD_JULIO,\n" +
                "      AC.PCER_ACTIVIDAD_AGOSTO,\n" +
                "      AC.PCER_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_OCTUBRE,\n" +
                "      AC.PCER_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_DICIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_ENERO,\n" +
                "      APA.PPAG_ACTIVIDAD_FEBRERO,\n" +
                "      APA.PPAG_ACTIVIDAD_MARZO,\n" +
                "      APA.PPAG_ACTIVIDAD_ABRIL,\n" +
                "      APA.PPAG_ACTIVIDAD_MAYO,\n" +
                "      APA.PPAG_ACTIVIDAD_JUNIO,\n" +
                "      APA.PPAG_ACTIVIDAD_JULIO,\n" +
                "      APA.PPAG_ACTIVIDAD_AGOSTO,\n" +
                "      APA.PPAG_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_OCTUBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_NOVIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_DICIEMBRE,\n" +
                "      D.PDE_DEPARTAMENTO,\n" +
                "      D.PK_PDE_DMEOR_CODIGO,\n" +
                "      PP.PPAPRE_PARTIDA_PRESUPUESTARIA,\n" +
                "      PA.PPOAVFIDE_PORCENTAJE_AVANCE_FI *100 AS PORCENTAJE,\n" +
                "      PA.PPOAVFIDE_OBSERVACIONES_PA,\n" +
                "      PA.PPOAVFIDE_FECHA_PA,\n" +
                "      PS.PPRSE_PROCEDIMIENTO_SERCOP,\n" +
                "      PS.PK_PPRSE_ID,\n" +
                "      TC.PTICO_TIPO_COMPRA,\n" +
                "      TC.PK_PTICO_ID,\n" +
                "      TPRE.PTIPRE_TIPO_PRESUPUESTO,\n" +
                "      TPRE.PK_PTIPRE_ID,\n" +
                "      TPROD.PTIPO_TIPO_PRODUCTO,\n" +
                "      TPROD.PK_PTIPO_ID,\n" +
                "      TPRO.PTIPRO_TIPO_PROYECTO,\n" +
                "      TPRO.PK_PTIPRO_ID,\n" +
                "      TR.PTIRE_TIPO_REGIMEN,\n" +
                "      TR.PK_PTIRE_ID,\n" +
                "      U.PUNI_UNIDAD,\n" +
                "      U.PK_PUNI_ID,\n" +
                "      VA.PVADE_VALOR_DEVENGADO,\n" +
                "      VA.PVADE_OBSERVACIONES_VD,\n" +
                "      VA.PVADE_FECHA_VD,\n" +
                "      RT.PRETE_NOMBRE,\n" +
                "      RT.PRETE_APELLIDO,\n" +
                "      RT.PRETE_ROL,\n" +
                "      RT.PRETE_DMEOR_CODIGO,\n" +
                "      CASE\n" +
                "    WHEN SYSDATE >= M.PPRO_FECHA_FINAL THEN 'RETRASADO'\n" +
                "    ELSE 'VIGENTE'\n" +
                "END AS ESTADO\n" +
                "FROM PROJECTDP_PROYECTOS M  \n" +
                "LEFT OUTER JOIN PROYECTDP_DETALLE_RESPONSABLE DR\n" +
                "ON  M.PK_PPRO_CODIGO_UNICO = DR.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_RESPONSABLE_TECNICO RT\n" +
                "ON DR.FK_DMPER_CODIGO = RT.PK_PRETE_DMPER_CODIGO\n" +
                "LEFT OUTER JOIN PROJECTDP_ACTIVIDADES A \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = A.FK_PER_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PRESUPUESTO AP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AP.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_CERTIFICADO AC \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AC.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PAGADO APA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = APA.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROJECTDP_DEPARTAMENTO D \n" +
                "ON M.FK_PDE_DMEOR_CODIGO = D.PK_PDE_DMEOR_CODIGO\n" +

                "LEFT OUTER JOIN PROJECTDP_PARTIDA_PRESUPUESTAR PP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PP.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PORCENTAJE_AVANCE_FI PA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PA.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PROCEDIMIENTO_SERCOP PS \n" +
                "ON M.FK_PPRSE_ID_PER = PS.PK_PPRSE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_COMPRA TC \n" +
                "ON M.FK_PTICO_ID_PER = TC.PK_PTICO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRESUPUESTO TPRE \n" +
                "ON M.FK_PTIPRE_ID_PER = TPRE.PK_PTIPRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRODUCTO TPROD \n" +
                "ON M.FK_PTIPO_ID_PER = TPROD.PK_PTIPO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PROYECTO TPRO \n" +
                "ON M.FK_PTIPRO_ID_PER = TPRO.PK_PTIPRO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_REGIMEN TR \n" +
                "ON M.FK_PTIRE_ID_PER = TR.PK_PTIRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_UNIDAD U \n" +
                "ON M.FK_PUNI_ID_PER = U.PK_PUNI_ID\n" +
                "LEFT OUTER JOIN PROYECTDP_ETAPA_PRESUPUESTO EP\n" +
                "ON M.FK_PETAPRE_ID = EP.PK_PETAPRE_ID\n"+

                "LEFT OUTER JOIN PROJECTDP_VALOR_DEVENGADO VA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = VA.FK_PPRO_CODIGO_UNICO \n" +
                "WHERE TPRO.PTIPRO_TIPO_PROYECTO = 'ARRASTRE' \n" +
                "ORDER BY M.PK_PPRO_CODIGO_UNICO";
        //List<Matriz> customObjects = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Matriz.class));
        return jdbcTemplate.query(query, new MatrizMapper());
    }

    @Override
    public List<Matriz> joinTablesNuevos() {
        String query = "SELECT M.PK_PPRO_CODIGO_UNICO,\n" +
                "      M.PPRO_ANIO,\n" +
                "      M.PPRO_CANTIDAD_ANUAL,\n" +
                "      M.PPRO_CATALOGO_ELECTRONICO,\n" +
                "      M.PPRO_CODIGO_CATEGORIA_CPC,\n" +
                "      M.PPRO_CODIGO_SERCOP,\n" +
                "      M.PPRO_COSTO_UNITARIO,\n" +
                "      M.PPRO_CUATRIMESTRE_N1,\n" +
                "      M.PPRO_CUATRIMESTRE_N2,\n" +
                "      M.PPRO_CUATRIMESTRE_N3,\n" +
                "      M.PPRO_DETALLE_PRODUCTO,\n" +
                "      M.PPRO_FECHA_FINAL,\n" +
                "      M.PPRO_FECHA_INICIAL,\n" +
                "      M.PPRO_FONDOS_BID,\n" +
                "      M.PPRO_NUMERO_CODIGO_OPERACION_P,\n" +
                "      M.PPRO_NUMERO_CODIGO_PROYECTO_BI,\n" +
                "      M.PPRO_NUMERO_CONTRATO,\n" +
                "      M.PPRO_OBSERVACIONES,\n" +
                "      M.PPRO_PLAZO,\n" +
                "      M.PPRO_CODIGO_RAPIDO,\n" +
                "      M.PPRO_PRESUPUESTO_INICIAL,\n" +
                "      M.PPRO_PRESUPUESTO_CODIFICADO,\n" +
                "      EP.PETAPRE_ETAPA_PRESUPUESTO,\n" +
                "      EP.PK_PETAPRE_ID,\n" +
                "      A.PAC_ACTIVIDAD_ENERO,\n" +
                "      A.PAC_ACTIVIDAD_FEBRERO,\n" +
                "      A.PAC_ACTIVIDAD_MARZO,\n" +
                "      A.PAC_ACTIVIDAD_ABRIL,\n" +
                "      A.PAC_ACTIVIDAD_MAYO,\n" +
                "      A.PAC_ACTIVIDAD_JUNIO,\n" +
                "      A.PAC_ACTIVIDAD_JULIO,\n" +
                "      A.PAC_ACTIVIDAD_AGOSTO,\n" +
                "      A.PAC_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_OCTUBRE,\n" +
                "      A.PAC_ACTIVIDAD_NOVIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_DICIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_ENERO,\n" +
                "      AP.PPRES_ACTIVIDAD_FEBRERO,\n" +
                "      AP.PPRES_ACTIVIDAD_MARZO,\n" +
                "      AP.PPRES_ACTIVIDAD_ABRIL,\n" +
                "      AP.PPRES_ACTIVIDAD_MAYO,\n" +
                "      AP.PPRES_ACTIVIDAD_JUNIO,\n" +
                "      AP.PPRES_ACTIVIDAD_JULIO,\n" +
                "      AP.PPRES_ACTIVIDAD_AGOSTO,\n" +
                "      AP.PPRES_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_OCTUBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_DICIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_ENERO,\n" +
                "      AC.PCER_ACTIVIDAD_FEBRERO,\n" +
                "      AC.PCER_ACTIVIDAD_MARZO,\n" +
                "      AC.PCER_ACTIVIDAD_ABRIL,\n" +
                "      AC.PCER_ACTIVIDAD_MAYO,\n" +
                "      AC.PCER_ACTIVIDAD_JUNIO,\n" +
                "      AC.PCER_ACTIVIDAD_JULIO,\n" +
                "      AC.PCER_ACTIVIDAD_AGOSTO,\n" +
                "      AC.PCER_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_OCTUBRE,\n" +
                "      AC.PCER_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_DICIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_ENERO,\n" +
                "      APA.PPAG_ACTIVIDAD_FEBRERO,\n" +
                "      APA.PPAG_ACTIVIDAD_MARZO,\n" +
                "      APA.PPAG_ACTIVIDAD_ABRIL,\n" +
                "      APA.PPAG_ACTIVIDAD_MAYO,\n" +
                "      APA.PPAG_ACTIVIDAD_JUNIO,\n" +
                "      APA.PPAG_ACTIVIDAD_JULIO,\n" +
                "      APA.PPAG_ACTIVIDAD_AGOSTO,\n" +
                "      APA.PPAG_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_OCTUBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_NOVIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_DICIEMBRE,\n" +
                "      D.PDE_DEPARTAMENTO,\n" +
                "      D.PK_PDE_DMEOR_CODIGO,\n" +
                "      PP.PPAPRE_PARTIDA_PRESUPUESTARIA,\n" +
                "      PA.PPOAVFIDE_PORCENTAJE_AVANCE_FI *100 AS PORCENTAJE,\n" +
                "      PA.PPOAVFIDE_OBSERVACIONES_PA,\n" +
                "      PA.PPOAVFIDE_FECHA_PA,\n" +
                "      PS.PPRSE_PROCEDIMIENTO_SERCOP,\n" +
                "      PS.PK_PPRSE_ID,\n" +
                "      TC.PTICO_TIPO_COMPRA,\n" +
                "      TC.PK_PTICO_ID,\n" +
                "      TPRE.PTIPRE_TIPO_PRESUPUESTO,\n" +
                "      TPRE.PK_PTIPRE_ID,\n" +
                "      TPROD.PTIPO_TIPO_PRODUCTO,\n" +
                "      TPROD.PK_PTIPO_ID,\n" +
                "      TPRO.PTIPRO_TIPO_PROYECTO,\n" +
                "      TPRO.PK_PTIPRO_ID,\n" +
                "      TR.PTIRE_TIPO_REGIMEN,\n" +
                "      TR.PK_PTIRE_ID,\n" +
                "      U.PUNI_UNIDAD,\n" +
                "      U.PK_PUNI_ID,\n" +
                "      VA.PVADE_VALOR_DEVENGADO,\n" +
                "      VA.PVADE_OBSERVACIONES_VD,\n" +
                "      VA.PVADE_FECHA_VD,\n" +
                "      RT.PRETE_NOMBRE,\n" +
                "      RT.PRETE_APELLIDO,\n" +
                "      RT.PRETE_ROL,\n" +
                "      RT.PRETE_DMEOR_CODIGO,\n" +
                "      CASE\n" +
                "    WHEN SYSDATE >= M.PPRO_FECHA_FINAL THEN 'RETRASADO'\n" +
                "    ELSE 'VIGENTE'\n" +
                "END AS ESTADO\n" +
                "FROM PROJECTDP_PROYECTOS M  \n" +
                "LEFT OUTER JOIN PROYECTDP_DETALLE_RESPONSABLE DR\n" +
                "ON  M.PK_PPRO_CODIGO_UNICO = DR.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_RESPONSABLE_TECNICO RT\n" +
                "ON DR.FK_DMPER_CODIGO = RT.PK_PRETE_DMPER_CODIGO\n" +
                "LEFT OUTER JOIN PROJECTDP_ACTIVIDADES A \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = A.FK_PER_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PRESUPUESTO AP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AP.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_CERTIFICADO AC \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AC.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PAGADO APA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = APA.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROJECTDP_DEPARTAMENTO D \n" +
                "ON M.FK_PDE_DMEOR_CODIGO = D.PK_PDE_DMEOR_CODIGO\n" +

                "LEFT OUTER JOIN PROJECTDP_PARTIDA_PRESUPUESTAR PP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PP.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PORCENTAJE_AVANCE_FI PA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PA.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PROCEDIMIENTO_SERCOP PS \n" +
                "ON M.FK_PPRSE_ID_PER = PS.PK_PPRSE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_COMPRA TC \n" +
                "ON M.FK_PTICO_ID_PER = TC.PK_PTICO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRESUPUESTO TPRE \n" +
                "ON M.FK_PTIPRE_ID_PER = TPRE.PK_PTIPRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRODUCTO TPROD \n" +
                "ON M.FK_PTIPO_ID_PER = TPROD.PK_PTIPO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PROYECTO TPRO \n" +
                "ON M.FK_PTIPRO_ID_PER = TPRO.PK_PTIPRO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_REGIMEN TR \n" +
                "ON M.FK_PTIRE_ID_PER = TR.PK_PTIRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_UNIDAD U \n" +
                "ON M.FK_PUNI_ID_PER = U.PK_PUNI_ID\n" +
                "LEFT OUTER JOIN PROYECTDP_ETAPA_PRESUPUESTO EP\n" +
                "ON M.FK_PETAPRE_ID = EP.PK_PETAPRE_ID\n"+

                "LEFT OUTER JOIN PROJECTDP_VALOR_DEVENGADO VA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = VA.FK_PPRO_CODIGO_UNICO \n" +
                "WHERE TPRO.PTIPRO_TIPO_PROYECTO = 'NUEVO' \n" +
                "ORDER BY M.PK_PPRO_CODIGO_UNICO";
        //List<Matriz> customObjects = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Matriz.class));
        return jdbcTemplate.query(query, new MatrizMapper());
    }

    class MatrizMapper implements RowMapper<Matriz> {
        @Override
        public Matriz mapRow(ResultSet rs, int rowNum) throws SQLException {
            Matriz matriz = new Matriz();

            matriz.setPK_PPRO_CODIGO_UNICO(rs.getInt("PK_PPRO_CODIGO_UNICO"));
            matriz.setPPRO_CODIGO_CATEGORIA_CPC(rs.getFloat("PPRO_CODIGO_CATEGORIA_CPC"));
            matriz.setPPRO_DETALLE_PRODUCTO(rs.getString("PPRO_DETALLE_PRODUCTO"));
            matriz.setPPRO_CUATRIMESTRE_N1(rs.getString("PPRO_CUATRIMESTRE_N1"));
            matriz.setPPRO_CUATRIMESTRE_N2(rs.getString("PPRO_CUATRIMESTRE_N2"));
            matriz.setPPRO_CUATRIMESTRE_N3(rs.getString("PPRO_CUATRIMESTRE_N3"));
            matriz.setPPRO_CATALOGO_ELECTRONICO(rs.getString("PPRO_CATALOGO_ELECTRONICO"));
            matriz.setPPRO_FONDOS_BID(rs.getString("PPRO_FONDOS_BID"));
            matriz.setPPRO_NUMERO_CODIGO_OPERACION_P(rs.getString("PPRO_NUMERO_CODIGO_OPERACION_P"));
            matriz.setPPRO_NUMERO_CODIGO_PROYECTO_BI(rs.getString("PPRO_NUMERO_CODIGO_PROYECTO_BI"));
            matriz.setPPRO_PLAZO(rs.getString("PPRO_PLAZO"));
            matriz.setPPRO_FECHA_INICIAL(rs.getDate("PPRO_FECHA_INICIAL"));
            matriz.setPPRO_FECHA_FINAL(rs.getDate("PPRO_FECHA_FINAL"));
            matriz.setPPRO_OBSERVACIONES(rs.getString("PPRO_OBSERVACIONES"));
            matriz.setPPRO_NUMERO_CONTRATO(rs.getString("PPRO_NUMERO_CONTRATO"));
            matriz.setPPRO_CODIGO_SERCOP(rs.getString("PPRO_CODIGO_SERCOP"));
            matriz.setPPRO_CANTIDAD_ANUAL(rs.getString("PPRO_CANTIDAD_ANUAL"));
            matriz.setPPRO_COSTO_UNITARIO(rs.getInt("PPRO_COSTO_UNITARIO"));
            matriz.setPPRO_ANIO(rs.getString("PPRO_ANIO"));

            matriz.setPPRO_CODIGO_RAPIDO(rs.getString("PPRO_CODIGO_RAPIDO"));
            matriz.setPPRO_PRESUPUESTO_INICIAL(rs.getFloat("PPRO_PRESUPUESTO_INICIAL"));
            matriz.setPPRO_PRESUPUESTO_CODIFICADO(rs.getFloat("PPRO_PRESUPUESTO_CODIFICADO"));
            matriz.setPETAPRE_ETAPA_PRESUPUESTO(rs.getString("PETAPRE_ETAPA_PRESUPUESTO"));

            matriz.setPK_PETAPRE_ID(rs.getString("PK_PETAPRE_ID"));



            matriz.setPAC_ACTIVIDAD_ENERO(rs.getString("PAC_ACTIVIDAD_ENERO"));
            matriz.setPAC_ACTIVIDAD_FEBRERO(rs.getString("PAC_ACTIVIDAD_FEBRERO"));
            matriz.setPAC_ACTIVIDAD_MARZO(rs.getString("PAC_ACTIVIDAD_MARZO"));
            matriz.setPAC_ACTIVIDAD_ABRIL(rs.getString("PAC_ACTIVIDAD_ABRIL"));
            matriz.setPAC_ACTIVIDAD_MAYO(rs.getString("PAC_ACTIVIDAD_MAYO"));
            matriz.setPAC_ACTIVIDAD_JUNIO(rs.getString("PAC_ACTIVIDAD_JUNIO"));
            matriz.setPAC_ACTIVIDAD_JULIO(rs.getString("PAC_ACTIVIDAD_JULIO"));
            matriz.setPAC_ACTIVIDAD_AGOSTO(rs.getString("PAC_ACTIVIDAD_AGOSTO"));
            matriz.setPAC_ACTIVIDAD_SEPTIEMBRE(rs.getString("PAC_ACTIVIDAD_SEPTIEMBRE"));
            matriz.setPAC_ACTIVIDAD_OCTUBRE(rs.getString("PAC_ACTIVIDAD_OCTUBRE"));
            matriz.setPAC_ACTIVIDAD_NOVIEMBRE(rs.getString("PAC_ACTIVIDAD_NOVIEMBRE"));
            matriz.setPAC_ACTIVIDAD_DICIEMBRE(rs.getString("PAC_ACTIVIDAD_DICIEMBRE"));

            matriz.setPPRES_ACTIVIDAD_ENERO(rs.getFloat("PPRES_ACTIVIDAD_ENERO"));
            matriz.setPPRES_ACTIVIDAD_FEBRERO(rs.getFloat("PPRES_ACTIVIDAD_FEBRERO"));
            matriz.setPPRES_ACTIVIDAD_MARZO(rs.getFloat("PPRES_ACTIVIDAD_MARZO"));
            matriz.setPPRES_ACTIVIDAD_ABRIL(rs.getFloat("PPRES_ACTIVIDAD_ABRIL"));
            matriz.setPPRES_ACTIVIDAD_MAYO(rs.getFloat("PPRES_ACTIVIDAD_MAYO"));
            matriz.setPPRES_ACTIVIDAD_JUNIO(rs.getFloat("PPRES_ACTIVIDAD_JUNIO"));
            matriz.setPPRES_ACTIVIDAD_JULIO(rs.getFloat("PPRES_ACTIVIDAD_JULIO"));
            matriz.setPPRES_ACTIVIDAD_AGOSTO(rs.getFloat("PPRES_ACTIVIDAD_AGOSTO"));
            matriz.setPPRES_ACTIVIDAD_SEPTIEMBRE(rs.getFloat("PPRES_ACTIVIDAD_SEPTIEMBRE"));
            matriz.setPPRES_ACTIVIDAD_OCTUBRE(rs.getFloat("PPRES_ACTIVIDAD_OCTUBRE"));
            matriz.setPPRES_ACTIVIDAD_NOVIEMBRE(rs.getFloat("PPRES_ACTIVIDAD_NOVIEMBRE"));
            matriz.setPPRES_ACTIVIDAD_DICIEMBRE(rs.getFloat("PPRES_ACTIVIDAD_DICIEMBRE"));

            matriz.setPCER_ACTIVIDAD_ENERO(rs.getFloat("PCER_ACTIVIDAD_ENERO"));
            matriz.setPCER_ACTIVIDAD_FEBRERO(rs.getFloat("PCER_ACTIVIDAD_FEBRERO"));
            matriz.setPCER_ACTIVIDAD_MARZO(rs.getFloat("PCER_ACTIVIDAD_MARZO"));
            matriz.setPCER_ACTIVIDAD_ABRIL(rs.getFloat("PCER_ACTIVIDAD_ABRIL"));
            matriz.setPCER_ACTIVIDAD_MAYO(rs.getFloat("PCER_ACTIVIDAD_MAYO"));
            matriz.setPCER_ACTIVIDAD_JUNIO(rs.getFloat("PCER_ACTIVIDAD_JUNIO"));
            matriz.setPCER_ACTIVIDAD_JULIO(rs.getFloat("PCER_ACTIVIDAD_JULIO"));
            matriz.setPCER_ACTIVIDAD_AGOSTO(rs.getFloat("PCER_ACTIVIDAD_AGOSTO"));
            matriz.setPCER_ACTIVIDAD_SEPTIEMBRE(rs.getFloat("PCER_ACTIVIDAD_SEPTIEMBRE"));
            matriz.setPCER_ACTIVIDAD_OCTUBRE(rs.getFloat("PCER_ACTIVIDAD_OCTUBRE"));
            matriz.setPCER_ACTIVIDAD_NOVIEMBRE(rs.getFloat("PCER_ACTIVIDAD_NOVIEMBRE"));
            matriz.setPCER_ACTIVIDAD_DICIEMBRE(rs.getFloat("PCER_ACTIVIDAD_DICIEMBRE"));

            matriz.setPPAG_ACTIVIDAD_ENERO(rs.getFloat("PPAG_ACTIVIDAD_ENERO"));
            matriz.setPPAG_ACTIVIDAD_FEBRERO(rs.getFloat("PPAG_ACTIVIDAD_FEBRERO"));
            matriz.setPPAG_ACTIVIDAD_MARZO(rs.getFloat("PPAG_ACTIVIDAD_MARZO"));
            matriz.setPPAG_ACTIVIDAD_ABRIL(rs.getFloat("PPAG_ACTIVIDAD_ABRIL"));
            matriz.setPPAG_ACTIVIDAD_MAYO(rs.getFloat("PPAG_ACTIVIDAD_MAYO"));
            matriz.setPPAG_ACTIVIDAD_JUNIO(rs.getFloat("PPAG_ACTIVIDAD_JUNIO"));
            matriz.setPPAG_ACTIVIDAD_JULIO(rs.getFloat("PPAG_ACTIVIDAD_JULIO"));
            matriz.setPPAG_ACTIVIDAD_AGOSTO(rs.getFloat("PPAG_ACTIVIDAD_AGOSTO"));
            matriz.setPPAG_ACTIVIDAD_SEPTIEMBRE(rs.getFloat("PPAG_ACTIVIDAD_SEPTIEMBRE"));
            matriz.setPPAG_ACTIVIDAD_OCTUBRE(rs.getFloat("PPAG_ACTIVIDAD_OCTUBRE"));
            matriz.setPPAG_ACTIVIDAD_NOVIEMBRE(rs.getFloat("PPAG_ACTIVIDAD_NOVIEMBRE"));
            matriz.setPPAG_ACTIVIDAD_DICIEMBRE(rs.getFloat("PPAG_ACTIVIDAD_DICIEMBRE"));







            matriz.setPDE_DEPARTAMENTO(rs.getString("PDE_DEPARTAMENTO"));
            matriz.setPK_PDE_DMEOR_CODIGO(rs.getString("PK_PDE_DMEOR_CODIGO"));

            matriz.setPRETE_NOMBRE(rs.getString("PRETE_NOMBRE"));
            matriz.setPRETE_APELLIDO(rs.getString("PRETE_APELLIDO"));

            matriz.setPPAPRE_PARTIDA_PRESUPUESTARIA(rs.getString("PPAPRE_PARTIDA_PRESUPUESTARIA"));

            matriz.setPPOAVFIDE_PORCENTAJE_AVANCE_FI(rs.getFloat("PORCENTAJE"));

            matriz.setPPOAVFIDE_OBSERVACIONES_PA(rs.getString("PPOAVFIDE_OBSERVACIONES_PA"));
            matriz.setPPOAVFIDE_FECHA_PA(rs.getDate("PPOAVFIDE_FECHA_PA"));

            matriz.setPPRSE_PROCEDIMIENTO_SERCOP(rs.getString("PPRSE_PROCEDIMIENTO_SERCOP"));
            matriz.setPK_PPRSE_ID(rs.getInt("PK_PPRSE_ID"));

            matriz.setPTICO_TIPO_COMPRA(rs.getString("PTICO_TIPO_COMPRA"));
            matriz.setPK_PTICO_ID(rs.getInt("PK_PTICO_ID"));

            matriz.setPTIPRE_TIPO_PRESUPUESTO(rs.getString("PTIPRE_TIPO_PRESUPUESTO"));
            matriz.setPK_PTIPRE_ID(rs.getInt("PK_PTIPRE_ID"));

            matriz.setPTIPO_TIPO_PRODUCTO(rs.getString("PTIPO_TIPO_PRODUCTO"));
            matriz.setPK_PTIPO_ID(rs.getInt("PK_PTIPO_ID"));

            matriz.setPTIPRO_TIPO_PROYECTO(rs.getString("PTIPRO_TIPO_PROYECTO"));
            matriz.setPK_PTIPRO_ID(rs.getInt("PK_PTIPRO_ID"));

            matriz.setPTIRE_TIPO_REGIMEN(rs.getString("PTIRE_TIPO_REGIMEN"));
            matriz.setPK_PTIRE_ID(rs.getInt("PK_PTIRE_ID"));

            matriz.setPUNI_UNIDAD(rs.getString("PUNI_UNIDAD"));
            matriz.setPK_PUNI_ID(rs.getInt("PK_PUNI_ID"));

            matriz.setPVADE_VALOR_DEVENGADO(rs.getFloat("PVADE_VALOR_DEVENGADO"));
            matriz.setPVADE_FECHA_VA(rs.getDate("PVADE_FECHA_VD"));
            matriz.setPVADE_OBSERVACIONES_VA(rs.getString("PVADE_OBSERVACIONES_VD"));
            matriz.setESTADO(rs.getString("ESTADO"));
            return matriz;
        }
    }

}
