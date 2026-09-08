Foi definida pela Infraestrutura e Segurança a utilização de certificados exclusivamente nos VIPs dos ambientes DES, TQS, HMP e PRD do SIARG.

Anteriormente, os certificados eram disponibilizados pela esteira e copiados para a VM, sendo consumidos pelo Apache através do vhost.conf.

Com a nova diretriz, os certificados não ficam mais:
- no Azure DevOps;
- na VM;
- nem no repositório de configuração.

Foi realizada a alteração do vhost.conf removendo as diretivas SSL locais:

SSLEngine on
SSLCACertificatePath
SSLCertificateFile
SSLCertificateKeyFile

Entretanto, a URL oficial do ambiente DES continua indisponível após a mudança do DNS para o VIP 10.116.180.5.

Solicitamos apoio da CESTI para validar e adequar a configuração da esteira e da publicação da aplicação para funcionamento através do VIP, considerando o novo modelo arquitetural com SSL exclusivamente no balanceador.


Release: https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-pipeline-progress&releaseId=525490 


URL: "https://siarg-interno.esteiras.des.caixa/siarg/login" 

URL direto pelo servidor: "https://caddeapllx2577.agil.nprd.caixa.gov.br:8443/siarg/login"


Validar a configuração necessária para que a URL:
siarg-interno.esteiras.des.caixa seja atendida corretamente após a alteração do DNS para o VIP.


REQ's para referencia da criação do certificado e DNS. 

REQ000145741048- CRIAÇÃO DO VIP
REQ000145749435 - DNS APONTAR PRO VIP
REQ000145748985 - Certificado SSL instalado no VIP
