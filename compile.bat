@echo off
REM ELijah made these commands:
REM javac -d bin src/jminusminus/**.java
REM java -cp bin jminusminus/Main {{ARGS}}

REM this might be useful:
REM java -cp lib\j--.jar jminusminus.Main

@echo on
java -cp lib\j--.jar jminusminus.Main %~1