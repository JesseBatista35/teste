
C:\Users\p585600>curl -k -I https://10.116.78.13/sicem/Principal.jsp -H "Host: sicem-legado.des.caixa"
curl: (7) Failed to connect to 10.116.78.13:443 after 2053 ms: Could not connect to server

C:\Users\p585600>curl -I http://10.116.78.13/sicem/Principal.jsp -H "Host: sicem-legado.des.caixa"
curl: (28) Failed to connect to 10.116.78.13:80 after 21038 ms: Could not connect to server

C:\Users\p585600>telnet 10.116.78.13 80
'telnet' não é reconhecido como um comando interno
ou externo, um programa operável ou um arquivo em lotes.

C:\Users\p585600>
