Na 2854 (10.116.202.45), confirma que a lib não está lá:

bash
find / -name "*SenhasSIIBC*" 2>/dev/null
ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"

No servidor legado, os devs precisam localizar a lib:

bash
find / -name "*SenhasSIIBC*" 2>/dev/null
ps -ef | grep -v grep | grep -o "java.library.path=[^ ]*"
file /caminho/libSenhasSIIBC.so

O file é importante. Se a .so for 32-bit, ela não carrega no Java 64-bit da VM, e aí o problema é do dev, não de configuração.

A correção, depois de ter a .so (64-bit):

Copiar a lib para a VM:
bash
mkdir -p /apl/sigsj/lib
cp libSenhasSIIBC.so /apl/sigsj/lib/
chown -R jboss:jboss /apl/sigsj/lib
chmod 755 /apl/sigsj/lib/libSenhasSIIBC.so
No standalone.conf do SIGSJ-internet-config, adicionar:
JAVA_OPTS="$JAVA_OPTS -Djava.library.path=/apl/sigsj/lib"
Reiniciar o JBoss.

A .so tem a mesma limitação do custom.sh: a esteira não copia esse arquivo, então por enquanto ele entra manualmente na VM. Isso deve afetar o intranet também, porque ele usa o mesmo SIROT embarcado. Vale já colocar a lib na 955.

A tela desconfigurada (sem CSS, imagens quebradas e “Depï¿½sitos”) é outro ponto, de recursos estáticos e encoding. No F12 do navegador, aba Rede, dá para ver para qual URL o CSS e as imagens estão apontando. Provavelmente é o URL_STATICS que já estava pendente com os devs.

Intranet: 503 “caddeapllx135 - eap_71_esteiraagil” (suspeita no VIP)

Esse erro não veio da nossa VM. “caddeapllx135 / eap_71_esteiraagil” é a página de erro da esteira ágil antiga (JBoss 7.1). A URL continuou sigsj-intranet.des.caixa, então algo no caminho mandou a requisição para o 135. Lembra que o VIP 10.116.180.8 veio com o comentário de “siccp-intra”? A suspeita é que ele foi reaproveitado do SICCP e ainda tem alguma configuração antiga apontando para a esteira ágil.

Teste para confirmar (de qualquer VM de DES):

bash
# direto na VM 955, sem passar pelo VIP
curl -s -o /dev/null -w "VM:  %{http_code}\n" http://10.116.194.179/sigsj_intranet/default.jsp
# pelo VIP, 5 vezes
for i in 1 2 3 4 5; do curl -sk https://sigsj-intranet.des.caixa/sigsj_intranet/default.jsp | grep -o "caddeapllx[0-9]*[^<]*" || echo "ok (sem 135)"; done
# e no servidor 955: se o 135 está em alguma config
grep -rn "caddeapllx135" /opt/jboss-eap/standalone/configuration/ /apl/sigsj 2>/dev/null

Como interpretar:

Se pelo VIP aparecer o 135 e direto na VM não, o problema é do VIP. Aí pedimos à Rede, na WO do VIP intranet, o show ns runningConfig | grep 10.116.180.8 e a remoção de qualquer bind que não seja o 10.116.194.179:80, junto com a correção do comentário.
Se o grep na 955 achar o 135, é configuração da aplicação, e passamos para os devs.
Boleto

O boleto só expõe serviço, não tem tela. O teste integrado que o Vitor propôs (SIADT/SIADC) é o caminho certo.

(Os erros de MODCLUSTER ... 127.0.0.1:6666 no log são ruído do mod_cluster do perfil HA e não têm relação com os erros acima.)
