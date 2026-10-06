
[root@caddeapllx2695 tmp]# ^C
[root@caddeapllx2695 tmp]# ls -la /producao/env_config.sh /producao/executa-job.sh
-rwxr-xr-x 1 ctmagelx controlm  720 out  6 16:53 /producao/env_config.sh
-rwxr-xr-x 1 ctmagelx controlm 3504 out  6 16:53 /producao/executa-job.sh
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
