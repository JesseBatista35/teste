
C:\Users\p585600>curl -sk --noproxy "*" https://7E48322A0761B3CA4EC5B83EC023BD28.gr7.sa-east-1.eks.amazonaws.com/version
{
  "kind": "Status",
  "apiVersion": "v1",
  "metadata": {},
  "status": "Failure",
  "message": "Unauthorized",
  "reason": "Unauthorized",
  "code": 401
}
C:\Users\p585600>
C:\Users\p585600>
C:\Users\p585600>netsh winhttp show proxy

Configurações do proxy WinHTTP atuais:

    Servidor(es) Proxy:  http://prd-internet365.caixa:80
    Ignorar Lista     :  *.caixa;*.caixa.gov.br;10.*


C:\Users\p585600>reg query "HKCU\Software\Microsoft\Windows\CurrentVersion\Internet Settings" /v AutoConfigURL

HKEY_CURRENT_USER\Software\Microsoft\Windows\CurrentVersion\Internet Settings
    AutoConfigURL    REG_SZ    http://siprx.caixa:4713/files/siprx-pacv4.pac


C:\Users\p585600>
