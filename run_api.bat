@echo off
echo Compilando ConversorMonedas.java con soporte JSON...

javac -cp ".;json-20240303.jar" ConversorMonedas.java
if exist ConversorMonedas.class (
    echo Compilación exitosa.
    echo Ejecutando el programa...
    java -cp ".;json-20240303.jar" ConversorMonedas
) else (
    echo Error: la compilación falló.
)

pause
