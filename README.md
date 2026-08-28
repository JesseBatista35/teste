Marcelo, bom dia!

Após análise dos logs do servidor de aplicação do dia 27/08 entre 16h00 e 16h20, identificamos a causa raiz do problema relatado.

**Erro identificado:**
O JBoss está apresentando deadlock no gerenciamento de sessões HTTP pelo Infinispan:

```
ISPN000299: Unable to acquire lock after 15 seconds for key SessionCreationMetaDataKey
Lock is held by GlobalTransaction{id=802}
```

A transação id=802 trava um lock de sessão e nunca libera, bloqueando todas as requisições subsequentes dos usuários em cascata.

**Causa raiz:**
O arquivo `web.xml` da aplicação SICMU (SICMU-web/src/main/webapp/WEB-INF/web.xml, linha 11) contém a tag:

```xml
<distributable />
```

Essa tag força o JBoss a usar o gerenciador de sessões distribuídas (Infinispan), que não é compatível com o modo standalone em que o servidor está rodando, gerando o deadlock.

**Solução:**
Remover a tag `<distributable />` do `web.xml`. Essa correção é simples e deve ser feita pelo time de desenvolvimento no repositório SICMU, branch `01.05.05.005`.

Aguardamos a correção para validação nos ambientes DES e TQS.
