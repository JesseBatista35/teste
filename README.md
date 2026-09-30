cd C:\temp\siccr
Get-Content META-INF\MANIFEST.MF
Get-Content META-INF\maven\br.gov.caixa.ccr.parametros\sifec-ccr-parametros\pom.xml
mkdir x -Force; tar -xf ccr-parametros-ejb.jar -C x
$c = Get-ChildItem x -Recurse -Filter *.class | Select-Object -First 1
$b = [IO.File]::ReadAllBytes($c.FullName); $b[6]*256 + $b[7]
Get-ChildItem x -Recurse -Filter persistence.xml | Get-Content
tar -tf ccr-parametros-api.war | Select-String "WEB-INF/lib"
