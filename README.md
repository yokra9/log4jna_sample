# log4jna_sample

Sample project for [log4jna](https://github.com/dblock/log4jna).
Log4JNA is a library of native appenders to write into Windows™ Event Viewer for [Log4j 2™](http://logging.apache.org/log4j/).

To update registry, You must run PowerShell as Administrator.

```powershell
# build
mvn clean install

# run
mvn exec:java
mvn exec:java "-Dexec.args=message"
```
