Hash na 471

Você já está como root ([root@...]#), e o sudo do root está bloqueado. Rode sem sudo:

grep -H -A2 'deployment name="SICCR-PARAMETROS"' $(find /opt/jboss -name domain.xml)
