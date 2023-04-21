
public class meteotower {

}

{
public static void main(String[] args) {
	
	try {
	/* Crear objeto de tipo URL con el endPoint de la API a consultar con sus parámetros. */
	import java.net.URL;
	URL url = new URL (
	"https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&daily=temperature_2m_max,temperature_2m_min&forecast_days=1&start_date=2023-04-26&end_date=2023-04-27&timezone=Europe%2FBerlin");
	
	/* crear un objeto de conexión que permita la conexión con el url configurado */
	import java.net.HttpURLConnection;
	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	
	/* seleccionar el método de request a realizar (GET para obtener información)*/
	conn.setRequestMethod("GET");
	conn.connect();

	/* b. Verificar que la petición es correcta (200) */
	int responseCode = conn.getResponseCode();
	if (responseCode !=200) {
	//
	}else //
	
	/* c. Leer el flujo de datos con un Scanner */
	import java.util.Scanner;
	Scanner scan = new Scanner(url.openStream());
	String info=" ";
	while(scan.hasNext()) {
	info=scan.nextLine();
	}
	scan.close();
	
	/* d. Pintar la información obtenida por consola */
	System.out.println(info);
	
	}
	
	catch (Exception c) {
		c.printStackTrace();
	}

	
	
}

)