@echo off
echo Compilando...
javac ConversorMonedas.java

if exist ConversorMonedas.class (
    echo Ejecutando programa...
    java ConversorMonedas
) else (
    echo Error: no se pudo compilar.
)

pause
