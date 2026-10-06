Abra https://siepr-backend-intranet-des.apps.nprd.caixa/q/health, clique em Avançado → Continuar, depois volte na aba do SIEPR e aperte F5.


<img width="1918" height="587" alt="image" src="https://github.com/user-attachments/assets/54183885-9830-4993-9bf4-d5dbb694ba99" />





-sh-4.2$
-sh-4.2$ openssl x509 -in /tmp/AC_Icptestes_Sub.cer -inform DER -out /tmp/AC_Icptestes_Sub.pem -outform PEM 2>/dev/null \
>  || cp /tmp/AC_Icptestes_Sub.cer /tmp/AC_Icptestes_Sub.pem
-sh-4.2$ openssl x509 -in /tmp/AC_Icptestes_Sub.pem -noout -subject
subject= /C=BR/O=Caixa Economica Federal/CN=AC Icptestes Sub
-sh-4.2$ cat /tmp/AC_Icptestes_Sub.pem
-----BEGIN CERTIFICATE-----
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
37Qdxg==
-----END CERTIFICATE-----
-sh-4.2$
-sh-4.2$
-sh-4.2$
