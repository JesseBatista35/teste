ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/ | tail -1
cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<success>"


<img width="1630" height="896" alt="image" src="https://github.com/user-attachments/assets/f5a6507a-fa99-457d-a84f-7bb44e54ae7e" />



        <success>false</success>
[root@caddeapllx2695 tmp]# ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/ | tail -1
-rw-r--r-- 1 root root  9597 out  6 16:55 customer_log_1bofh_00001.xml
[root@caddeapllx2695 tmp]# cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<success>"
        <time>06-10-2026 16:55:46.159</time>
        <step>Execute (Proxy)</step>
        <time>06-10-2026 16:55:46.315</time>
        <step>Execute (Proxy)</step>
        <time>06-10-2026 16:55:46.856</time>
        <step>Execute (Proxy)</step>
        <success>true</success>
        <time>06-10-2026 16:55:46.899</time>
        <step>Execute (Gerar token)</step>
        <time>06-10-2026 16:55:47.161</time>
        <step>Execute (Gerar token)</step>
        <success>true</success>
        <time>06-10-2026 16:55:47.214</time>
        <step>Execute (Login no Beyond Trust)</step>
        <time>06-10-2026 16:55:47.290</time>
        <step>Execute (Login no Beyond Trust)</step>
        <success>true</success>
        <time>06-10-2026 16:55:47.310</time>
        <step>Execute (Obter credencial)</step>
        <time>06-10-2026 16:55:47.353</time>
        <step>Execute (Obter credencial)</step>
        <success>true</success>
        <time>06-10-2026 16:55:47.368</time>
        <step>Execute (Obter credencial)</step>
        <success>false</success>
        <time>06-10-2026 16:55:47.393</time>
        <step>Execute (Logout no Beyond Trust)</step>
        <time>06-10-2026 16:55:47.425</time>
        <step>Execute (Logout no Beyond Trust)</step>
        <success>true</success>
        <time>06-10-2026 16:55:47.435</time>
        <step>Execute (Executar job)</step>
        <time>06-10-2026 16:55:47.442</time>
        <step>Execute (Executar job)</step>
        <time>06-10-2026 16:55:47.968</time>
        <step>Execute (Executar job)</step>
        <success>true</success>
        <time>06-10-2026 16:55:47.979</time>
        <step>Execute (Executar job)</step>
        <success>false</success>
        <time>06-10-2026 16:55:47.986</time>
        <step>Execute (Executar job)</step>
        <success>false</success>
[root@caddeapllx2695 tmp]#



16:55:48 06/10/2026	Message from Agent: Application Integrator plugin: UCM0001 = Application Integrator plugin: UCM0001 = REST request failed. status code: 401 response is: Unauthorized message:  User not authenticated	5169
