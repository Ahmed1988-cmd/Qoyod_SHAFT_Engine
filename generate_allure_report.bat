@echo off
set path=C:\Users\ZaZa\.m2\repository\allure\allure-2.16.1\bin;C:\Users\ZaZa\.jdks\openjdk-17.0.1\bin;%path%
allure serve allure-results
pause
exit