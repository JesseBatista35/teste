Time, temos algumas dúvidas sobre a migração Angular 16 → 19 no SIRTA-frontend:

**1. Migração conforme manual do Angular?**
A migração foi feita versão por versão seguindo o guia oficial do Angular, ou foi um jump direto de 16 para 19?

**2. Dependências do repositório:**
A build está quebrando porque o repositório npm corporativo (binario.caixa) não tem as versões novas de dependências sincronizadas, especificamente:
- @jsonjoy.com/fs-snapshot@4.57.7
- @jsonjoy.com/fs-node@4.57.7

Estas dependências são necessárias para Angular 19 e não existem no repositório.

**Próximos passos:**
Precisamos confirmar se a migração foi feita corretamente e coordenar com o admin do repositório npm para sincronizar as dependências necessárias.

Alguém pode dar um feedback?
