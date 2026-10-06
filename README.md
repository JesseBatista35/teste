
[root@caddeapllx2695 p585600]# cd /tmp
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# cp -p /opt/ctmage/JRE/lib/security/cacerts /opt/ctmage/JRE/lib/security/cacerts.bkp.$(date +%Y%m%d%H%M)
[root@caddeapllx2695 tmp]# echo | openssl s_client -connect sicsn.caixa:443 -showcerts 2>/dev/null \
 | awk '/BEGIN CERT/{n++} n==2{print} /END CERT/&&n==2{exit}' > ac_interna_apl.pem
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# openssl x509 -in ac_interna_apl.pem -noout -subject -issuer
subject=C = BR, O = Caixa Economica Federal, CN = AC Interna APL
issuer=C = BR, O = Caixa Economica Federal, CN = AC Interna Caixa
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# for f in /etc/pki/ca-trust/source/anchors/*; do echo "$f: $(openssl x509 -in $f -noout -subject 2>/dev/null)"; done | grep -i interna
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# KS=/opt/ctmage/JRE/lib/security/cacerts
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# /opt/ctmage/JRE/bin/keytool -importcert -noprompt -alias ac-interna-apl -file /tmp/ac_interna_apl.pem -keystore $KS -storepass changeit
Advertência: use a opção -cacerts para acessar a área de armazenamento de chaves cacerts
O certificado foi adicionado à área de armazenamento de chaves
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# ^C
[root@caddeapllx2695 tmp]# /opt/ctmage/JRE/bin/keytool -list -keystore $KS -storepass changeit 2>/dev/null | grep -i "ac-interna"
ac-interna-apl, 6 de out. de 2026, trustedCertEntry,
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# /opt/ctmage/ctm/scripts/shut-ag -u ctmagelx -p ALL
Killing Control-M/Agent Listener pid:82515
1 seconds - 82515 is still alive
2 seconds - 82515 is still alive
3 seconds - 82515 is still alive
4 seconds - 82515 is still alive
5 seconds - 82515 is still alive
6 seconds - 82515 is still alive
7 seconds - 82515 is still alive
8 seconds - 82515 is still alive
9 seconds - 82515 is still alive
2026-10-06 16:24:50 Listener process stopped
Killing Control-M/Agent Tracker pid:82579
2026-10-06 16:24:51 Tracker process stopped
Killing Control-M/Agent Java Process pid:82362
1 seconds - 82362 is still alive
2 seconds - 82362 is still alive
2026-10-06 16:24:54 Java Process process stopped
Control-M/Agent Remote Host is not running
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# /opt/ctmage/ctm/scripts/start-ag -u ctmagelx -p ALL
Warning: coredumpsize limit required more than 8192 found 0. Please contact your System Administrator.


Starting the agent as 'root' user

Skipping Java validation due to missing files: check_java_ready.sh and/or supported_java.dat
Waiting for pid file of process agj to be created...
Control-M/Agent Agent Java Process started. pid: 90894

Control-M/Agent Listener started. pid: 91029

Control-M/Agent Tracker started. pid: 91094


Control-M/Agent started successfully.
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# su - ctmagelx -c "ag_diag_comm" | grep -E "ping"
 Java services                         :["housekeeping","ssh-courier"] on port 16839
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<step>|<operation>|<success>"
        <step>Execute (Proxy)</step>
        <operation>Retrieve Execute Command template to execute</operation>
        <step>Execute (Proxy)</step>
        <operation>Preparing Execute Command (setting parameter values)</operation>
        <step>Execute (Proxy)</step>
        <operation>No matching return code found</operation>
        <success>true</success>
        <step>Execute (Gerar token)</step>
        <operation>Retrieve REST request template to execute</operation>
        <step>Execute (Gerar token)</step>
        <operation>REST request failed</operation>
        <success>false</success>
        <step>Execute (Login no Beyond Trust)</step>
        <operation>Retrieve REST request template to execute</operation>
        <step>Execute (Login no Beyond Trust)</step>
        <operation>REST request failed</operation>
        <success>false</success>
        <step>Execute (Obter credencial)</step>
        <operation>Retrieve REST request template to execute</operation>
        <step>Execute (Obter credencial)</step>
        <operation>REST request failed</operation>
        <success>false</success>
        <step>Execute (Logout no Beyond Trust)</step>
        <operation>Retrieve REST request template to execute</operation>
        <step>Execute (Logout no Beyond Trust)</step>
        <operation>REST request failed</operation>
        <success>false</success>
        <step>Execute (Executar job)</step>
        <operation>Retrieve Execute Command template to execute</operation>
        <step>Execute (Executar job)</step>
        <operation>Preparing Execute Command (setting parameter values)</operation>
        <step>Execute (Executar job)</step>
        <operation>Command completed. RC = 127</operation>
        <success>true</success>
        <step>Execute (Executar job)</step>
        <operation>No matching return code found</operation>
        <success>false</success>
        <step>Execute (Executar job)</step>
        <operation>Job failed.</operation>
        <success>false</success>
[root@caddeapllx2695 tmp]#
