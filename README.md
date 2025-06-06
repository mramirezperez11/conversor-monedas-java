# Conversor de Monedas en Java con API / Currency Converter in Java with API

## 📌 Español

Este proyecto es un **conversor de monedas** en **Java** que obtiene tasas de cambio **en tiempo real** desde [ExchangeRate-API](https://www.exchangerate-api.com/). Se ejecuta por consola y permite convertir de dólares estadounidenses (USD) a otras monedas.

### 🚀 ¿Cómo ejecutar?

1. Asegúrate de tener Java (JDK 17+) instalado.
2. Descarga la librería [json-20240303.jar](https://repo1.maven.org/maven2/org/json/json/20240303/json-20240303.jar) y colócala en la misma carpeta del archivo `.java`.
3. Guarda tu clave desde ExchangeRate-API en el código fuente (`apiKey`).
4. Ejecuta el archivo `run_api.bat` para compilar y ejecutar automáticamente.

### ▶️ Scripts incluidos
- `run_api.bat`: compila y ejecuta el programa con conexión a la API.
- `limpiar.bat`: elimina archivos `.class` generados.
- `ejecutar.bat`: ejecuta versión local sin conexión a API (opcional).

### 💱 Monedas soportadas
- EUR, MXN, JPY, GBP, CAD, ARS, BRL, CLP, CRC, COP (puedes ampliar más)

### 🛠 Tecnologías
- Java 17+
- Librería org.json (json-20240303.jar)
- API externa ExchangeRate-API

### 👤 Autor
Creado por [mramirezperez11](https://github.com/mramirezperez11)

---

## 📌 English

This project is a **currency converter** in **Java** that retrieves **real-time exchange rates** from [ExchangeRate-API](https://www.exchangerate-api.com/). It runs in the terminal and converts USD to other currencies.

### 🚀 How to run

1. Make sure Java (JDK 17+) is installed.
2. Download [json-20240303.jar](https://repo1.maven.org/maven2/org/json/json/20240303/json-20240303.jar) and place it in the same folder as the `.java` file.
3. Insert your API key from ExchangeRate-API into the source code.
4. Run `run_api.bat` to compile and execute automatically.

### ▶️ Included scripts
- `run_api.bat`: compiles and runs the program with live exchange data.
- `limpiar.bat`: removes generated `.class` files.
- `ejecutar.bat`: runs the offline (simulated rate) version (optional).

### 💱 Supported currencies
- EUR, MXN, JPY, GBP, CAD, ARS, BRL, CLP, CRC, COP (you can expand this list)

### 🛠 Technologies
- Java 17+
- org.json library (json-20240303.jar)
- External API: ExchangeRate-API

### 👤 Author
Created by [mramirezperez11](https://github.com/mramirezperez11)
