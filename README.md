
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/
cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1)
total 24
-rw-r--r-- 1 root root 9953 out  6 14:29 customer_log_1bmb9_00002.xml
-rw-r--r-- 1 root root 9459 out  6 15:10 customer_log_1bmv4_00001.xml
<CustomerLog>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.182</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.4616799630636427</stepId>
        <type/>
        <step>Execute (Proxy)</step>
        <operation>Retrieve Execute Command template to execute</operation>
        <details>Command template:
export no_proxy="$no_proxy,sicsn.caixa,sicsn.gerencia.caixa"
echo $no_proxy</details>
        <success/>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.195</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.4616799630636427</stepId>
        <type/>
        <step>Execute (Proxy)</step>
        <operation>Preparing Execute Command (setting parameter values)</operation>
        <details>Command template:
export no_proxy="$no_proxy,sicsn.caixa,sicsn.gerencia.caixa"
echo $no_proxy</details>
        <success/>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.714</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.4616799630636427</stepId>
        <type/>
        <step>Execute (Proxy)</step>
        <operation>No matching return code found</operation>
        <details>Current job status is: OK</details>
        <success>true</success>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.737</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.39131487698335854</stepId>
        <type/>
        <step>Execute (Gerar token)</step>
        <operation>Retrieve REST request template to execute</operation>
        <details>REST request template:
 URL:https://sicsn.caixa , URLPath:/BeyondTrust/api/public/v3/auth/connect/token , method:POST, URLParams:
headers:Content-Type=application/x-www-form-urlencoded   Accept=application/json
body:grant_type=client_credentials&amp;client_id=098c4f49%2Defa5%2D4042%2Db19f%2D8a8b5afc79d2&amp;client_secret=yn3If1WnHGX3XipvtEeweePXBtNh6A04e5S%2BBk84Al4%3D</details>
        <success/>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.758</time>
        <source>AI IIFX Application</source>
        <stepId>0.39131487698335854</stepId>
        <type/>
        <step>Execute (Gerar token)</step>
        <operation>REST request failed</operation>
        <details>Error Executing REST request to https://sicsn.caixa : (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target</details>
        <success>false</success>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.772</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.4393816074657785</stepId>
        <type/>
        <step>Execute (Login no Beyond Trust)</step>
        <operation>Retrieve REST request template to execute</operation>
        <details>REST request template:
 URL:https://sicsn.caixa , URLPath:/BeyondTrust/api/public/v3/Auth/SignAppin , method:POST, URLParams:
headers:Authorization=Bearer    Content-Type=application/json   Accept=application/json
body:-d ""</details>
        <success/>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.798</time>
        <source>AI IIFX Application</source>
        <stepId>0.4393816074657785</stepId>
        <type/>
        <step>Execute (Login no Beyond Trust)</step>
        <operation>REST request failed</operation>
        <details>Error Executing REST request to https://sicsn.caixa : (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target</details>
        <success>false</success>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.822</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.3784918108022056</stepId>
        <type/>
        <step>Execute (Obter credencial)</step>
        <operation>Retrieve REST request template to execute</operation>
        <details>REST request template:
 URL:https://sicsn.caixa , URLPath:/BeyondTrust/api/public/v3/Secrets-Safe/Secrets?FolderPath=SIIFX_BATCH_DES , method:GET, URLParams:
headers:Content-Type=application/json   Accept=application/json
body:</details>
        <success/>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.843</time>
        <source>AI IIFX Application</source>
        <stepId>0.3784918108022056</stepId>
        <type/>
        <step>Execute (Obter credencial)</step>
        <operation>REST request failed</operation>
        <details>Error Executing REST request to https://sicsn.caixa : java.lang.Exception: javax.net.ssl.SSLHandshakeException: (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target</details>
        <success>false</success>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.860</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.12951880946460592</stepId>
        <type/>
        <step>Execute (Logout no Beyond Trust)</step>
        <operation>Retrieve REST request template to execute</operation>
        <details>REST request template:
 URL:https://sicsn.caixa , URLPath:/BeyondTrust/api/public/v3/Auth/Signout , method:POST, URLParams:
headers:Content-Type=application/json
body:-d ""</details>
        <success/>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.884</time>
        <source>AI IIFX Application</source>
        <stepId>0.12951880946460592</stepId>
        <type/>
        <step>Execute (Logout no Beyond Trust)</step>
        <operation>REST request failed</operation>
        <details>Error Executing REST request to https://sicsn.caixa : (certificate_unknown) PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target</details>
        <success>false</success>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.896</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.2562230604289679</stepId>
        <type/>
        <step>Execute (Executar job)</step>
        <operation>Retrieve Execute Command template to execute</operation>
        <details>Command template:
#!/bin/bash -x

# Gera um id aleatorio para compor o filename no output do script
export ID=$(mktemp -u XXXXX)
#export ARQ_OUTPUT=/tmp/{{Sistema}}_${ID}.txt

export VARIAVEL_DO_SISTEMA="$(echo '{{CREDENCIAL}}' | base64 | tr -d '\n')"

{{File_Path}}/{{File_Name}}</details>
        <success/>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:27.906</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.2562230604289679</stepId>
        <type/>
        <step>Execute (Executar job)</step>
        <operation>Preparing Execute Command (setting parameter values)</operation>
        <details>Command template:
#!/bin/bash -x

# Gera um id aleatorio para compor o filename no output do script
export ID=$(mktemp -u XXXXX)
#export ARQ_OUTPUT=/tmp/IIFX_${ID}.txt

export VARIAVEL_DO_SISTEMA="$(echo '' | base64 | tr -d '\n')"

/tmp/validacao</details>
        <success/>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:28.436</time>
        <source>AI IIFX Application</source>
        <stepId>0.2562230604289679</stepId>
        <type/>
        <step>Execute (Executar job)</step>
        <operation>Command completed. RC = 127</operation>
        <details>Displaying first 2 lines of output out of 2 (any remaining lines can be found in debug logs):
/opt/ctmage/ctm/cm/AI/temp/script_12943262948772934752.tmp: linha 14: /tmp/validacao: Arquivo ou diretório inexistente

</details>
        <success>true</success>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:28.442</time>
        <source>Application Integrator Plugin</source>
        <stepId>0.2562230604289679</stepId>
        <type/>
        <step>Execute (Executar job)</step>
        <operation>No matching return code found</operation>
        <details>Current job status is: OK</details>
        <success>false</success>
    </CustomerLogEntry>
    <CustomerLogEntry>
        <runno>00001</runno>
        <time>06-10-2026 15:10:28.446</time>
        <source>AI IIFX Application</source>
        <stepId>0.2562230604289679</stepId>
        <type/>
        <step>Execute (Executar job)</step>
        <operation>Job failed.</operation>
        <details>Encountered the following error: /opt/ctmage/ctm/cm/AI/temp/script_12943262948772934752.tmp: linha 14: /tmp/validacao: Arquivo ou diretório inexistente</details>
        <success>false</success>
    </CustomerLogEntry>
</CustomerLog>
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -lrt /opt/ctmage/ctm/proclog/ | grep -i "AI_" | tail -5
-rw-r--r-- 1 root     root          0 out  6 14:27 AI_VaultConnector.log
-rw-r--r-- 1 root     root          0 out  6 14:27 AI_saas_collector.log
-rw-r--r-- 1 root     root        279 out  6 14:27 AI_UnhandledRequestsRecovery_20261006142752594.log
-rw-r--r-- 1 root     root        218 out  6 14:27 AI_Ctmcm_get_accounts_request_20261006142755142_88873.log
-rw-r--r-- 1 root     root       2606 out  6 15:10 AI_CommonServerActions_20261006_88873.log
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# grep -ih "IIFX\|Back End\|Failed" /opt/ctmage/ctm/proclog/AI_*.log 2>/dev/null | tail -30
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -laR /opt/ctmage/ctm/cm/AI/apps-repo/
/opt/ctmage/ctm/cm/AI/apps-repo/:
total 4
drwxr-xr-x  3 ctmagelx ctmagelx  48 out  6 14:28 .
drwxrwxr-x 12 ctmagelx ctmagelx 178 out  6 14:27 ..
-rw-r--r--  1 ctmagelx ctmagelx   8 out  6 14:28 deployed_job_types.dat
drwxr-xr-x  2 ctmagelx ctmagelx  22 out  6 14:28 IIFX

/opt/ctmage/ctm/cm/AI/apps-repo/IIFX:
total 68
drwxr-xr-x 2 ctmagelx ctmagelx    22 out  6 14:28 .
drwxr-xr-x 3 ctmagelx ctmagelx    48 out  6 14:28 ..
-rw-r--r-- 1 ctmagelx ctmagelx 69011 out  6 14:28 IIFX.xml
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]#
[root@caddeapllx2695 p585600]# ls -la /opt/ctmage/ctm/cm/AI/data/
total 28
drwxrwxr-x  5 ctmagelx ctmagelx  189 out  6 14:27 .
drwxrwxr-x 12 ctmagelx ctmagelx  178 out  6 14:27 ..
-rw-r--r--  1 ctmagelx ctmagelx   78 jun 24  2024 cm_accounts.xml
-rw-r--r--  1 ctmagelx ctmagelx 1164 jun 24  2024 cm_container_conf.xml
-rw-r--r--  1 root     root       46 out  6 15:10 genId.dat
-rw-r--r--  1 ctmagelx ctmagelx 4512 jun 24  2024 log4j2.xml
-rw-r--r--  1 ctmagelx ctmagelx  600 mai  6 19:12 one_params.properties
drwxr-xr-x  2 ctmagelx ctmagelx  122 mai  6 19:12 saas
drwxr-xr-x  2 ctmagelx ctmagelx   33 mai  6 19:12 security
-rw-r--r--  1 ctmagelx ctmagelx   99 jun 24  2024 vault.properties
drwxr-xr-x  2 ctmagelx ctmagelx   21 mai  6 19:12 WEB-INF
[root@caddeapllx2695 p585600]# head -40 /opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<ApplicationDefinitions>
  <active type="boolean">true</active>
  <annotation class="object">
    <annotationDescription type="string">SAVE</annotationDescription>
    <annotationNote type="string">SAVE</annotationNote>
  </annotation>
  <appGrpName type="string">CESTI111</appGrpName>
  <cpDependencyConditions class="array"/>
  <defaultType type="string">REST</defaultType>
  <deploymentVersion type="number">33</deploymentVersion>
  <desc type="string">Faz integração com SIIFX</desc>
  <displayName type="string">AI IIFX</displayName>
  <executionTypes class="array">
    <executionTypesElement class="object">
      <executionTypeName type="string">default</executionTypeName>
      <ops class="array">
        <opsElement class="object">
          <cmds class="array">
            <cmdsElement class="object">
              <ConditionSteps class="array"/>
              <URLParams type="string"/>
              <WScontentType type="string"/>
              <WSheaders type="string"/>
              <WStimeout type="string"/>
              <WsAuthenticationParameter type="string"/>
              <WsURLParameter type="string"/>
              <appendRequestToOutput type="boolean">false</appendRequestToOutput>
              <appendResponseToOutput type="boolean">false</appendResponseToOutput>
              <appendToOutputFilterOperator type="string">start</appendToOutputFilterOperator>
              <appendToOutputFilterValue type="string"/>
              <body type="string"/>
              <bodyMultiPart class="array"/>
              <bodyType type="string">Text</bodyType>
              <cmdType type="string">Exec</cmdType>
              <contentType type="string"/>
              <cookies type="string"/>
              <extractInfo class="array"/>
              <headers type="string"/>
              <headersPairs class="array"/>
[root@caddeapllx2695 p585600]#
