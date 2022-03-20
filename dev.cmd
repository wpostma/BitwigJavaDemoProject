set JAVA_HOME=%JAVA_HOME17%
call mvn clean install package -Dbitwig.extension.directory=target
copy target\bitwigstarter.bwextension "C:\Users\warren\Documents\Bitwig Studio\Extensions\Warren"