Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\WINDOWS\system32> cd $env:USERPROFILE\Downloads
PS C:\Users\p585600\Downloads> Get-ChildItem SIFEC-CCR.ear, sifec-ccr-parametros.ear | Select-Object Name, Length

Name                       Length
----                       ------
SIFEC-CCR.ear            71435273
sifec-ccr-parametros.ear 71401159


PS C:\Users\p585600\Downloads> Get-FileHash SIFEC-CCR.ear, sifec-ccr-parametros.ear -Algorithm SHA256 | Select-Object Hash, Path

Hash                                                             Path
----                                                             ----
AC7C54D101BC92F26716F7B18949804EFE1011C2D19606D65D496C9749D1F956 C:\Users\p585600\Downloads\SIFEC-CCR.ear
F5D1DE25EFC9249A2895C2BFAEB11F4F92EC8C316A0B7935599010CEA25AB509 C:\Users\p585600\Downloads\sifec-ccr-parametros.ear


PS C:\Users\p585600\Downloads>


<img width="1876" height="905" alt="image" src="https://github.com/user-attachments/assets/5fef2e1c-b689-4b34-8cd7-4d0853750ff6" />
