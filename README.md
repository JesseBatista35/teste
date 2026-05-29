Qual o tipo de serviço?*:	Levantar Informações do Ambiente
Informar o ambiente:*:	DES
Nome do serviço ou sistema:*:	SICPU
Descrição da solicitação:*:	Solicitação de ajuste – Hardening Nginx / TLS


Atualização do Nginx

Atualizar versão 1.18.0 (EOL, sem suporte de segurança) para versão suportada
Atualizar dependências associadas (OpenSSL, libs do sistema)



Hardening do Nginx

Revisar e desabilitar módulos não utilizados
Avaliar uso de recursos como HTTP/2 e regras de rewrite
Ajustar configurações de segurança (headers, exposição de versão, etc.)



Correção da cadeia SSL/TLS

Corrigir erro: "Chain of trust NOT ok (self-signed CA in chain)"
Remover certificados autoassinados da cadeia
Configurar certificado emitido por CA confiável (ou CA corporativa válida, se interno)
Garantir envio da cadeia completa apenas com certificados válidos



�� Aplicação (validação)

Validar funcionamento após atualização
Testar endpoints HTTPS e integrações
Contextualização da necessidade::	  Prezados,
Foram identificadas vulnerabilidades relacionadas ao Nginx e à configuração SSL/TLS do ambiente, sendo necessário executar ações de correção em nível de infraestrutura.
�� Ajustes necessários (Infra / Esteira)
Informar formas de contato:*:	TEams -- c083072


À CAIXA, 

Prezados,
Para prosseguir com a análise e execução da demanda de hardening do Nginx, por gentileza informar:

IP ou hostname do servidor Nginx
Qual ambiente onde está implantado? (OKD, Legado ou Esteiras)
Identificação da máquina/namespace (se houver)

Essas informações são necessárias para localizar o serviço e aplicar os ajustes corretamente.


Thiago Silva
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

  É do App Service, conforme informado pelo analista a CESTI tem as informações



  SICPU-painel-okd4


  


  
