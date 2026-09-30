cd $env:USERPROFILE\Downloads
Get-ChildItem SIFEC-CCR.ear, sifec-ccr-parametros.ear | Select-Object Name, Length
Get-FileHash SIFEC-CCR.ear, sifec-ccr-parametros.ear -Algorithm SHA256 | Select-Object Hash, Path
