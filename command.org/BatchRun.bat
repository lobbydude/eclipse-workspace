set projectLocation=C:\Users\shivarajkumar\eclipse-workspace\command.org
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml


pause