Opção 1: puxar direto da 2854 (mais simples)
Na 2854, com o seu usuário:

bash
scp p585600@10.116.88.96:/tmp/libSenhasSIIBC.so /tmp/
md5sum /tmp/libSenhasSIIBC.so      # 9f4b9758ac4f4c75cd9e7cf6826eed38

Opção 2: se a 2854 não alcançar o 0039 (timeout ou conexão recusada)
No cadsvitrlx100, com -3: o arquivo passa pelo jump em trânsito, sem ser gravado nele:

bash
scp -3 p585600@10.116.88.96:/tmp/libSenhasSIIBC.so p585600@10.116.202.45:/tmp/

Opção 3: se as duas falharem, copiar como texto (base64)
No 0039:

bash
base64 /tmp/libSenhasSIIBC.so > /tmp/libSenhasSIIBC.b64
wc -l /tmp/libSenhasSIIBC.b64
cat /tmp/libSenhasSIIBC.b64

Copia todo o texto. Na 2854:

bash
cat > /tmp/libSenhasSIIBC.b64 <<'EOF'
<cola aqui o conteúdo>
EOF
base64 -d /tmp/libSenhasSIIBC.b64 > /tmp/libSenhasSIIBC.so
md5sum /tmp/libSenhasSIIBC.so      # tem que bater 9f4b9758ac4f4c75cd9e7cf6826eed38

Se o md5 bater, o arquivo está íntegro.

Depois tenta limpar a cópia no jump com rm -f ~/libSenhasSIIBC.so. Se der erro, deixa como está.

Com o arquivo na 2854 e o md5 batendo, segue o passo 3 da mensagem anterior (mover para /apl/sigsj/lib e os comandos de verificação) e me manda a saída antes de reiniciar.
