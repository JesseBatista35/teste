Aqui está uma nota objetiva para repassar:

Assunto: Falha na esteira CodeQL — Erro de sintaxe Java (não é problema de infraestrutura/pipeline)

Diagnóstico:
A falha não está relacionada à esteira, ao Maven ou ao acesso a dependências. É um erro de sintaxe no código-fonte da aplicação.

Causa raiz:
O nome do pacote Java contém hífen, o que é inválido na linguagem:

src/main/java/br/gov/caixa/siaci/api-administracao-contratual/

O compilador (javac) rejeita a declaração package nesse formato, gerando erro ';' expected nos seguintes arquivos:

api-administracao-contratualApplication.java
config/OpfConfig.java
config/secutrity/SecurityConfig.java
config/swagger/SwaggerConfig.java

Ação necessária pelo time de desenvolvimento:

Renomear o diretório api-administracao-contratual para um nome válido em Java (sem hífen) — ex: apiadministracaocontratual ou api_administracao_contratual.
Atualizar a declaração package no topo dos 4 arquivos citados para refletir o novo caminho.
Corrigir quaisquer import em outros arquivos do projeto que referenciem esse pacote.
Validar build local (mvn clean package) antes de novo push, para confirmar que compila.

Referência: PR #4, branch chore/STRY00000000-atualiza..., run #11 do workflow "Call CodeQL workflow Segurança".
