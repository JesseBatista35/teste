
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/
total 28
-rw-r--r-- 1 root root 9953 out  6 14:29 customer_log_1bmb9_00002.xml
-rw-r--r-- 1 root root 9459 out  6 15:10 customer_log_1bmv4_00001.xml
-rw-r--r-- 1 root root 1015 out  6 16:37 customer_log_1bnjd_00001.xml
[root@caddeapllx2695 tmp]# ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/
total 36
-rw-r--r-- 1 root root  9953 out  6 14:29 customer_log_1bmb9_00002.xml
-rw-r--r-- 1 root root  9459 out  6 15:10 customer_log_1bmv4_00001.xml
-rw-r--r-- 1 root root 10842 out  6 16:37 customer_log_1bnjd_00001.xml
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<operation>|<success>"
        <time>06-10-2026 16:37:44.015</time>
        <step>Execute (Proxy)</step>
        <operation>Retrieve Execute Command template to execute</operation>
        <time>06-10-2026 16:37:44.147</time>
        <step>Execute (Proxy)</step>
        <operation>Preparing Execute Command (setting parameter values)</operation>
        <time>06-10-2026 16:37:44.668</time>
        <step>Execute (Proxy)</step>
        <operation>No matching return code found</operation>
        <success>true</success>
        <time>06-10-2026 16:37:44.701</time>
        <step>Execute (Gerar token)</step>
        <operation>Retrieve REST request template to execute</operation>
        <time>06-10-2026 16:37:44.986</time>
        <step>Execute (Gerar token)</step>
        <operation>REST request failed</operation>
        <success>false</success>
        <time>06-10-2026 16:37:45.028</time>
        <step>Execute (Login no Beyond Trust)</step>
        <operation>Retrieve REST request template to execute</operation>
        <time>06-10-2026 16:37:45.065</time>
        <step>Execute (Login no Beyond Trust)</step>
        <operation>REST request failed</operation>
        <success>false</success>
        <time>06-10-2026 16:37:45.104</time>
        <step>Execute (Obter credencial)</step>
        <operation>Retrieve REST request template to execute</operation>
        <time>06-10-2026 16:37:45.121</time>
        <step>Execute (Obter credencial)</step>
        <operation>REST request failed</operation>
        <success>false</success>
        <time>06-10-2026 16:37:45.149</time>
        <step>Execute (Logout no Beyond Trust)</step>
        <operation>Retrieve REST request template to execute</operation>
        <time>06-10-2026 16:37:45.175</time>
        <step>Execute (Logout no Beyond Trust)</step>
        <operation>REST request failed</operation>
        <success>false</success>
        <time>06-10-2026 16:37:45.198</time>
        <step>Execute (Executar job)</step>
        <operation>Retrieve Execute Command template to execute</operation>
        <time>06-10-2026 16:37:45.212</time>
        <step>Execute (Executar job)</step>
        <operation>Preparing Execute Command (setting parameter values)</operation>
        <time>06-10-2026 16:37:45.755</time>
        <step>Execute (Executar job)</step>
        <operation>Command completed. RC = 1</operation>
        <success>true</success>
        <time>06-10-2026 16:37:45.765</time>
        <step>Execute (Executar job)</step>
        <operation>No matching return code found</operation>
        <success>false</success>
        <time>06-10-2026 16:37:45.771</time>
        <step>Execute (Executar job)</step>
        <operation>Job failed.</operation>
        <success>false</success>
[root@caddeapllx2695 tmp]#
