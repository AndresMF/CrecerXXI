import static org.junit.Assert.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import Funcionalidad.AutomatizaciondeSucursales;
import Funcionalidad.Busquedadecuentas;
import Funcionalidad.ChequesRechazados;
import Funcionalidad.Operaciones;
import au.com.bytecode.opencsv.CSVReader;

// GIT
// GIT 2
public class CasosPrueba {
	
	/*
	@Test
	public void OperacionesDepositoVentanilla() throws IOException{
		
		
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\jfernandez\\Pictures\\Automation_T24WEB\\DepositoVentanilla.csv"));
	    List<String[]> li= reader.readAll();
	    Iterator<String[]>i1= li.iterator();
	    while(i1.hasNext()){
		
	    	
	    String[] str=i1.next();	

	    System.out.println("- TestOperaciones Deposito en ventanilla -");
	    
		Funcionalidad.Operaciones caso = new Funcionalidad.Operaciones();
		caso.DepostioenVentanilla(str[0],str[1],str[2],str[3]);
		System.out.println("Se deposita"+str[3]+" en la cuenta "+str[2]);
		
	
		reader.close();
		
		}
		
	}
	
	
	*/
	
	
	
	
	
	
	
	
	/*
	@Test
	public void CobrodeMultaCSV() throws IOException{
	
	CSVReader reader = new CSVReader(new FileReader("C:\\Users\\jfernandez\\Pictures\\Automation_T24WEB\\archivo.csv"));
    List<String[]> li= reader.readAll();
    Iterator<String[]>i1= li.iterator();
    while(i1.hasNext()){
	
    	
    String[] str=i1.next();	
		
	ChequesRechazados caso2 = new ChequesRechazados();
		
	System.out.println("Cobro de Multa. Búsqueda. Filtro por número de cheque. Deben coincidir los campos");
	
	String[] mensaje = caso2.CobroMultas(str[0],str[1],str[2],str[3]);
	 
	String[] comparo = {"FECHA RECHAZO.1","FECHA DE CANCELACION","NUMERO CUENTA","MONTO CHEQUE","MONEDA","ESTADO MULTA.1","MULTA CALCULADA.1","MULTA COBRADA.1","MULTA A COBRAR.1","FECHA COBRO MULTA.1","FORMA IMPUTACION.1"};
	int i = 0;
	boolean bandera = true ; 
	
	for (i = 0 ; i<=11; i++){
		if (mensaje[i].compareTo(comparo[i]) != 0)
        {
    	bandera = false;
    	}
       
        i++;
    }	
    
	if (bandera == true){
		System.out.println("Caso OK Los campos coinciden");
		}
	else {
		fail("Caso Falla. Los campos no coinciden");
		
	     }
	
	reader.close();
	
	}
    
		
}
	
	
	
	
	
	
	
	
	

	@Test
	public void Busquedadecuentas() {
		Busquedadecuentas caso1 = new Busquedadecuentas();
		System.out.println("Búsqueda de cuentas para cierre con saldo. Búsqueda por Id de persona inexistente. No devuelve resultados");
		String mensaje = caso1.cierrecuenta("1564564654");
		String mensajeEsperado = "NO HAY REGISTROS DE ESTA SELECCION";
		if (mensaje.equals(mensajeEsperado)){
			System.out.println(mensaje);
			
		}
		else {
		fail("Falla el caso de prueba. Devuelve resultados");
		}
	}
	
	
	

	
	@Test
	public void CobrodeMulta() {
	
		ChequesRechazados caso2 = new ChequesRechazados();
	
	//COMPARA ARRAY QUE DEVUELVE COBRO MULTA CON EL ARRAY COMPARO PARA VALIDAR EL CASO
		
    //Es necesario cargar User Ambiente NroCuenta Numerodecheque que este rechazado		
	System.out.println("Cobro de Multa. Búsqueda. Filtro por número de cheque. Deben coincidir los campos");	
	String[] mensaje = caso2.CobroMultas("JOFERNANDEZ", "t24ts707", "00470129070", "6031709");
	 
	String[] comparo = {"FECHA RECHAZO.1","FECHA DE CANCELACION","NUMERO CUENTA","MONTO CHEQUE","MONEDA","ESTADO MULTA.1","MULTA CALCULADA.1","MULTA COBRADA.1","MULTA A COBRAR.1","FECHA COBRO MULTA.1","FORMA IMPUTACION.1"};
	int i = 0;
	boolean bandera = true ; 
	
	for (i = 0 ; i<=11; i++){
		if (mensaje[i].compareTo(comparo[i]) != 0)
       {
    	bandera = false;
    	}
       
    i++;
    }	
    
	if (bandera == true){
		System.out.println("Caso OK Los campos coinciden");
		}
	else {
		fail("Caso Falla. Los campos no coinciden");
		
	     }
	}
	
	
	

	
	@Test
	public void Operaciones(){

	    System.out.println("- TestOperaciones Deposito en ventanilla -");
	    
		Funcionalidad.Operaciones caso = new Funcionalidad.Operaciones();
		caso.DepostioenVentanilla("SOSUC001CAJD","t24ts704", "00010000164", "1");
		System.out.println("Se deposita $5 en la cuenta 00010000164");
		
		
		
		
	}
	
	
	
	@Test 
	public void TestDepostioenVentanillaCompletitud(){
		
		System.out.println("-Test Deposito en Ventanilla Completitud -");
		Funcionalidad.Operaciones caso = new Funcionalidad.Operaciones(); 
		System.out.println("Opcione de Pop Up:");
		caso.DepostioenVentanillaCompletitud("SOSUC001CAJD", "t24ts704", "" , "");
		
		
	}
	
	
	


	*/

@Test	
public void TestSolicitudRemesas(){
	
	
	System.out.println("-Test Solicitud de Remesas-");
	AutomatizaciondeSucursales caso = new AutomatizaciondeSucursales();
	caso.SolicituRemesas("SUC119TESA", "t24ts704", "9239", "100");
	
	
	
}
	





/*	
	
@Test
public void Operaciones() throws IOException{

    System.out.println("Operaciones -Deposito en ventanilla");
    
	Funcionalidad.Operaciones caso = new Funcionalidad.Operaciones();
	caso.DepostioenVentanillaCSV("SOSUC001CAJD", "t24ts704", "1");
	
	
}



	
@Test
	
	public void MantenimientodeSobregiros(){
		
		Funcionalidad.MantenimientodeSobregiros caso = new Funcionalidad.MantenimientodeSobregiros();
		caso.AltadeSobregiros("SOSUC063AUXC", "t24ts704", "00630190391");
		caso.InputAltaSobregiros("ADSCH", "1,500", "90", "Comun", "C03", "", "N", "1002163126", "", "1000973625");
		
		//caso.AutorizaciondeAcuerdos("JOFERNANDEZ", "t24ts704", "00630190391");
		//caso.VerificoBCCLACACUERDO("JOFERNANDEZ", "t24ts704", "transaccionid");
		
		
		
	}

		
*/	

}
