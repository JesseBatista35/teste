ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/ | tail -2
cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<success>"


  grep -o "<details>[^<]*RC[^<]*\|Encountered the following error[^<]*" $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1)




[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# ls -lrt /opt/ctmage/ctm/cm/AI/CustomerLogs/ | tail -2
-rw-r--r-- 1 root root  9459 out  6 15:10 customer_log_1bmv4_00001.xml
-rw-r--r-- 1 root root 10842 out  6 16:37 customer_log_1bnjd_00001.xml
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# cat $(ls -t /opt/ctmage/ctm/cm/AI/CustomerLogs/*.xml | head -1) | grep -E "<time>|<step>|<success>"
        <time>06-10-2026 16:37:44.015</time>
        <step>Execute (Proxy)</step>
        <time>06-10-2026 16:37:44.147</time>
        <step>Execute (Proxy)</step>
        <time>06-10-2026 16:37:44.668</time>
        <step>Execute (Proxy)</step>
        <success>true</success>
        <time>06-10-2026 16:37:44.701</time>
        <step>Execute (Gerar token)</step>
        <time>06-10-2026 16:37:44.986</time>
        <step>Execute (Gerar token)</step>
        <success>false</success>
        <time>06-10-2026 16:37:45.028</time>
        <step>Execute (Login no Beyond Trust)</step>
        <time>06-10-2026 16:37:45.065</time>
        <step>Execute (Login no Beyond Trust)</step>
        <success>false</success>
        <time>06-10-2026 16:37:45.104</time>
        <step>Execute (Obter credencial)</step>
        <time>06-10-2026 16:37:45.121</time>
        <step>Execute (Obter credencial)</step>
        <success>false</success>
        <time>06-10-2026 16:37:45.149</time>
        <step>Execute (Logout no Beyond Trust)</step>
        <time>06-10-2026 16:37:45.175</time>
        <step>Execute (Logout no Beyond Trust)</step>
        <success>false</success>
        <time>06-10-2026 16:37:45.198</time>
        <step>Execute (Executar job)</step>
        <time>06-10-2026 16:37:45.212</time>
        <step>Execute (Executar job)</step>
        <time>06-10-2026 16:37:45.755</time>
        <step>Execute (Executar job)</step>
        <success>true</success>
        <time>06-10-2026 16:37:45.765</time>
        <step>Execute (Executar job)</step>
        <success>false</success>
        <time>06-10-2026 16:37:45.771</time>
        <step>Execute (Executar job)</step>
        <success>false</success>
[root@caddeapllx2695 tmp]#





<img width="1625" height="897" alt="image" src="https://github.com/user-attachments/assets/3e607d4d-f706-4a36-9f24-73b4414ffa45" />

<img width="1890" height="931" alt="image" src="https://github.com/user-attachments/assets/9ab3826b-cedc-4b97-a04c-4d57ca3b133a" />




