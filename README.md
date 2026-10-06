 
-sh-4.2$
-sh-4.2$  oc get projects | grep -i siepr
siepr-des                                                               Active
siepr-hmp                                                               Active
siepr-tqs                                                               Active
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get routes -n <namespace-siepr> -o custom-columns=NAME:.metadata.name,HOST:.spec.host,TLS:.spec.tls.termination
-sh: namespace-siepr: Arquivo ou diretório não encontrado
-sh-4.2$


ELE MANDOU ISSO AQUI

<img width="1912" height="1078" alt="image" src="https://github.com/user-attachments/assets/131c8568-ac4e-4017-bb69-b942bedd4333" />


<img width="1917" height="1078" alt="image" src="https://github.com/user-attachments/assets/04ec39f8-ec25-4e36-8955-c13bb44eac43" />



TEVE ESSA ANALISE DE UM MOUTRA ANALISA ONTEM

Realizadas validações na aplicação SIEPR Backend Intranet DES. Foi constatado que a rota https://siepr-backend-intranet-des.apps.nprd.caixa encontra-se acessível e operacional, com retorno positivo nos health checks (/q/health e /q/health/live), bem como resposta da aplicação nos endpoints protegidos (HTTP 401), evidenciando o funcionamento normal do backend.Não foram identificados indícios de indisponibilidade da aplicação, falha de rota, problema de conectividade ou necessidade de abertura de regras de firewall para acesso dos usuários.
Os testes realizados demonstraram que a aplicação está acessível e respondendo adequadamente no ambiente.A evidência apresentada no navegador indica o erro ERR_CERT_AUTHORITY_INVALID, que aponta especificamente para uma falha de validação da cadeia de certificados na máquina do usuário ou no navegador utilizado.
Considerando que o certificado apresentado pela rota encontra-se válido e que o problema não foi reproduzido nos testes realizados diretamente contra o ambiente OpenShift, a análise indica que a causa mais provável está relacionada à estação do usuário, seja por ausência da cadeia de certificação corporativa, inconsistência na configuração do navegador ou problema local de confiança dos certificados.Dessa forma, recomenda-se a validação da configuração de certificados na estação do usuário antes de qualquer atuação em infraestrutura ou abertura de regras de acesso.
