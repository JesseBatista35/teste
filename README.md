Analisamos o erro do SIEPR em DES e encontramos a causa. O problema não está na aplicação: frontend, backend e rotas estão funcionando normalmente.

O que está acontecendo

O ambiente DES (OpenShift NPRD, endereços *.apps.nprd.caixa) usa certificados emitidos pela cadeia de teste da Caixa (AC Icptestes). Essa cadeia não vem instalada por padrão nas estações, então o seu navegador não reconhece o certificado como confiável.

Por isso o endereço do frontend aparece como "Não seguro" na barra do navegador. A tela abriu porque o aviso foi aceito manualmente.
As chamadas que o frontend faz para o backend acontecem em segundo plano e não exibem esse aviso para aceitar. O navegador simplesmente bloqueia a chamada (ERR_CERT_AUTHORITY_INVALID), e a aplicação recebe o "erro 0 / Unknown Error".

Nos nossos testes isso não aparece porque as estações da nossa equipe já têm essa cadeia instalada.

O que você precisa fazer

Estou enviando dois arquivos: AC_Icptestes_Raiz.cer e AC_Icptestes_Sub.cer. Instale os dois na sua máquina:

Duplo clique em AC_Icptestes_Raiz.cer → Instalar Certificado → Usuário Atual → marque "Colocar todos os certificados no repositório a seguir" → Procurar → Autoridades de Certificação Raiz Confiáveis → OK → Avançar → Concluir → confirme com Sim no aviso de segurança.
Duplo clique em AC_Icptestes_Sub.cer → mesmo caminho, mas escolha Autoridades de Certificação Intermediárias.
Feche todas as janelas do navegador (Edge/Chrome), abra novamente e acesse o SIEPR.

Depois disso, o "Não seguro" deve sumir e as telas devem carregar normalmente.

Se não conseguir instalar

Se a sua estação bloquear a instalação de certificados, abra um chamado no suporte à estação solicitando a instalação da cadeia AC Icptestes (Raiz e Sub), informando que é necessária para acesso aos sistemas no ambiente DES.

Contorno temporário

Enquanto isso, se precisar usar o sistema: abra https://siepr-backend-intranet-des.apps.nprd.caixa/q/health, clique em Avançado → Continuar, volte na aba do SIEPR e aperte F5. Isso vale só até fechar o navegador.
