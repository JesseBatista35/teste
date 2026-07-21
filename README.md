[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]# find / -iname "*.jar" -path "*wildfly*" 2>/dev/null
[root@caddeapllx1369 p585600]# find / -iname "jboss-modules.jar" 2>/dev/null
[root@caddeapllx1369 p585600]# find / -maxdepth 3 -type d 2>/dev/null | grep -iE "wildfly|eap|sirsa"
/SIRSA
/SIRSA/processado
/SIRSA/siapc
/SIRSA/relatorios
/SIRSA/MDR
/SIRSA_DES
/SIRSA_DES/relatorios
/SIRSA_DES/relatorios/37
/SIRSA_DES/relatorios/35
/SIRSA_DES/relatorios/6
/SIRSA_DES/relatorios/34
/SIRSA_DES/relatorios/2
/SIRSA_DES/relatorios/21
/SIRSA_DES/relatorios/20
/SIRSA_DES/relatorios/14
/SIRSA_DES/relatorios/3
/SIRSA_DES/relatorios/27
/SIRSA_DES/relatorios/11
/SIRSA_DES/relatorios/7
/SIRSA_DES/relatorios/28
/SIRSA_DES/relatorios/30
/SIRSA_DES/relatorios/12
/SIRSA_DES/relatorios/16
/SIRSA_DES/relatorios/26
/SIRSA_DES/relatorios/32
/SIRSA_DES/relatorios/36
/SIRSA_DES/relatorios/4
/SIRSA_DES/relatorios/38
/SIRSA_DES/relatorios/33
/SIRSA_DES/relatorios/31
/SIRSA_DES/processado
/SIRSA_DES/backup
/SIRSA_DES/ArquivosRemessas
/SIRSA_DES/ArquivosRemessas/17
/SIRSA_DES/ArquivosRemessas/25
/SIRSA_DES/ArquivosRemessas/24
/SIRSA_DES/ArquivosRemessas/2
/SIRSA_DES/ArquivosRemessas/21
/SIRSA_DES/ArquivosRemessas/23
/SIRSA_DES/ArquivosRemessas/14
/SIRSA_DES/ArquivosRemessas/3
/SIRSA_DES/ArquivosRemessas/27
/SIRSA_DES/ArquivosRemessas/5
/SIRSA_DES/ArquivosRemessas/7
/SIRSA_DES/ArquivosRemessas/9
/SIRSA_DES/ArquivosRemessas/29
/SIRSA_DES/ArquivosRemessas/1
/SIRSA_DES/ArquivosTVMs
/SIRSA_DES/ArquivosTVMs/402
/SIRSA_DES/ArquivosTVMs/622
/SIRSA_DES/ArquivosTVMs/401
/SIRSA_DES/ArquivosTVMs/582
/SIRSA_DES/ArquivosTVMs/661
/SIRSA_DES/ArquivosTVMs/408
/SIRSA_DES/ArquivosTVMs/403
/SIRSA_DES/ArquivosTVMs/341
/SIRSA_DES/ArquivosTVMs/623
/SIRSA_DES/ArquivosTVMs/361
/SIRSA_DES/ArquivosTVMs/645
/SIRSA_DES/ArquivosTVMs/621
/SIRSA_DES/ArquivosTVMs/GuiaPratico
/SIRSA_DES/ArquivosTVMs/701
/SIRSA_DES/ArquivosTVMs/PadraoImportacao
/SIRSA_DES/ArquivosTVMs/407
/SIRSA_DES/ArquivosTVMs/741
/SIRSA_DES/ArquivosTVMs/602
/SIRSA_DES/ArquivosTVMs/381
/NFS/PARCEIROS/SIRSA
[root@caddeapllx1369 p585600]# netstat -tlnp 2>/dev/null | grep -E "8080|9990|8443"
[root@caddeapllx1369 p585600]# cat /etc/hostname
caddeapllx1369
[root@caddeapllx1369 p585600]#
