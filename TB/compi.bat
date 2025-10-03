@echo off
cls

REM Link: https://www.antlr.org/download/antlr-4.13.2-complete.jar

set MYDEPS=C:\Users\dserr\OneDrive\Escritorio\ct
set CLASSPATH=.;%MYDEPS%\antlr-4.13.2-complete.jar;%CLASSPATH%

REM Definimos accesos cortos
doskey antlr4=java -cp %MYDEPS%\antlr-4.13.2-complete.jar;. org.antlr.v4.Tool $*
doskey grun=java -cp %MYDEPS%\antlr-4.13.2-complete.jar;. org.antlr.v4.gui.TestRig $*

echo "Welcome to the Compiler jungle!"
