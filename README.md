
Solicitação atendida.

Alterada a ordem dos blocos nos 5 arquivos de configuração do Apache DES do SIAVL (siavl.conf, siavl02.conf, siavl03.conf, siavl04.conf, siavl05.conf), conforme especificado no checklist versão 62: o bloco

<Location /siavl-web>
    SetEnvIf Origin "^(https?://.*)$" CORS_ORIGIN=$1
    Header always set Access-Control-Allow-Origin "%{CORS_ORIGIN}e" env=CORS_ORIGIN
    Header always set Access-Control-Allow-Credentials "true"
    Header always set Vary "Origin"
    Header always set Access-Control-Allow-Methods "GET, POST, PUT, DELETE, OPTIONS"
    Header always set Access-Control-Allow-Headers "Accept, Content-Type, Authorization, Origin, X-Requested-With"
</Location>

foi reposicionado para vir antes do bloco:

RewriteCond %{REQUEST_METHOD} =OPTIONS
RewriteRule ^/(siavl-web)(/.*)?$ - [R=204,L]

Backup dos arquivos originais realizado antes da alteração. Configuração validada com sucesso (apachectl configtest) e aplicada nos 5 sites via reload (graceful), sem indisponibilidade. Teste funcional de requisição OPTIONS confirmou retorno HTTP 204 com os headers CORS esperados.

Solicitação concluída conforme ordem especificada no checklist v62.
