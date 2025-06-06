import java.util.*;
import java.net.*;
import java.io.*;
import org.json.JSONObject;

public class ConversorMonedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversor de Monedas (Tasa en tiempo real) ===");

        System.out.print("Ingrese la cantidad en dólares (USD): ");
        double cantidadUSD = scanner.nextDouble();
        scanner.nextLine(); // limpiar el buffer

        // Lista de monedas
        List<String> monedas = Arrays.asList("EUR", "MXN", "JPY", "GBP", "CAD", "ARS", "BRL", "CLP", "CRC", "COP");

        System.out.println("\nSeleccione la moneda destino:");
        for (int i = 0; i < monedas.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, monedas.get(i));
        }

        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        if (opcion < 1 || opcion > monedas.size()) {
            System.out.println("Opción inválida");
            return;
        }

        String monedaDestino = monedas.get(opcion - 1);

        try {
            String apiKey = "ed571c04dccf6321dd86f680"; // <-- Reemplaza esto con tu clave real
            String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder respuesta = new StringBuilder();
            String linea;
            while ((linea = reader.readLine()) != null) {
                respuesta.append(linea);
            }
            reader.close();

            JSONObject json = new JSONObject(respuesta.toString());
            double tasa = json.getJSONObject("conversion_rates").getDouble(monedaDestino);

            double resultado = cantidadUSD * tasa;
            System.out.printf("%.2f USD equivale a %.2f %s%n", cantidadUSD, resultado, monedaDestino);

        } catch (Exception e) {
            System.out.println("Error al obtener tasas: " + e.getMessage());
        }

        scanner.close();
    }
}
