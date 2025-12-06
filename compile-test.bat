@echo off
REM Purpose of this batch script is to ease compilation of single test files

@echo on
java -cp lib\j--.jar jminusminus.Main -d "tests/pass/compiled" "tests/pass/%~1"