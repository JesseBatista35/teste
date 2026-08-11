
[sadscp01@cadsvaprlx015 ~]$ cd /opt/temp/habitacao/app-5.12.0.512762
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ ls -lh habitacao-5.12.0-Dev.512762.apk
-rw-r--r-- 1 sadscp01 sadscp01 59M Ago 11 12:37 habitacao-5.12.0-Dev.512762.apk
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ file habitacao-5.12.0-Dev.512762.apk
habitacao-5.12.0-Dev.512762.apk: Zip archive data
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ aapt dump badging habitacao-5.12.0-Dev.512762.apk | grep package
-bash: aapt: comando não encontrado
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ unzip -t habitacao-5.12.0-Dev.512762.apk | tail -5
    testing: vision-interfaces.properties   OK
    testing: META-INF/CAIXA_KE.SF     OK
    testing: META-INF/CAIXA_KE.RSA    OK
    testing: META-INF/MANIFEST.MF     OK
No errors detected in compressed data of habitacao-5.12.0-Dev.512762.apk.
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ unzip -l habitacao-5.12.0-Dev.512762.apk | grep -E "AndroidManifest.xml|classes.dex"
 14238920  01-01-1981 01:01   classes.dex
    51056  01-01-1981 01:01   AndroidManifest.xml
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ unzip -p habitacao-5.12.0-Dev.512762.apk AndroidManifest.xml | strings | grep -i "br.gov.caixa\|package" | grep head -20
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$


[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$ wich yum && sudo yum install -y android-tools 2>&1 | tail -5
-bash: wich: comando não encontrado
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$
[sadscp01@cadsvaprlx015 app-5.12.0.512762]$

