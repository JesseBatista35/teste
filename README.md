no pod
curl: (7) Failed to connect to 2603:1056:2000:30::1: A rede está fora de alcance
-sh-4.2$ curls -m 5 https://ifconfig.me
-sh: curls: comando não encontrado
-sh-4.2$ curl -m 5 https://ifconfig.me
curl: (7) Failed to connect to 2600:1901:0:b2bd::: A rede está fora de alcance
-sh-4.2$ curl -m 5 https://api.ipify.org
curl: (7) Failed connect to api.ipify.org:443; Operação agora em progresso
-sh-4.2$




no cmd

Microsoft Windows [versão 10.0.26200.9106]
(c) Microsoft Corporation. Todos os direitos reservados.

C:\Users\p585600>curl -m 5 https://inconfig.me
curl: (6) Could not resolve host: inconfig.me

C:\Users\p585600>curl -m 5 https://api.ipify.org
45.176.161.71
C:\Users\p585600>
