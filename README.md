cd $env:USERPROFILE\Downloads
tar -tf sifec-ccr-parametros.ear
mkdir C:\temp\siccr -Force; tar -xf sifec-ccr-parametros.ear -C C:\temp\siccr
Get-Content C:\temp\siccr\META-INF\application.xml
Get-ChildItem C:\temp\siccr -Recurse -Include *.jar,*.war | Select-Object Name, Length


cd C:\temp\siccr; tar -xf <modulo>.jar -C x
$c = Get-ChildItem x -Recurse -Filter *.class | Select-Object -First 1
$b = [IO.File]::ReadAllBytes($c.FullName); $b[6]*256 + $b[7]
