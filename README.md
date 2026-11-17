Gustavo, segue a atualização da lista:

Módulo / pacote	Semáforo	Situação
SIFEC 2.161.2.0	🟢	Implantado e no ar (WFLYSRV0010). Núcleo SIFEC operacional no 7.4.
SICCR-PARÂMETROS	🟡 (atualizado)	A 3.3.1.1 tinha sido validada. Depois, a pedido do Rodrigo, subimos a versão spr3 pela console. Falta o Rodrigo confirmar o teste nessa versão.
SICDT-FEC 3.24.3.004	🟢	Implantado e testado, com download de PDF/CSV OK. Build indicada como estável.
SICCR-PJ 8.40.1	🟢	No ar e funcionando: perfil e lista de clientes.
HUB-WEB 1.10.0.1-b418	🟡	/hub-web/ responde e redireciona para o login. As funcionalidades dependem do HUB-API, que ainda não sobe.
SIBAN-MCM 1.0.1.23-b47	🟡	Implantado e datasource Sybase corrigido (teste de conexão OK). Aguardando teste funcional.
SICCR-BDCAIXA 2.0.1-b39	🟡	Implantado. Aguardando teste funcional.
SIFEC-FBN 1.0.1.0-b84	🟡 (atualizado)	Está implantado no ambiente; na lista anterior constava como ⚪. Aguardando teste funcional.
MINUTA GARANTIAS (SIFEC-MINUTAS-FRONT 1.0.0-b14)	🟡	Implantado. Aguardando teste funcional.
SIFEC-CCR 6.3.0-b4587	🟡 (atualizado)	Implantado. Causa do 401 do ccr-api identificada: no 7.4 o container passou a validar o token só no realm internet, e no 6.4 isso não acontece. A correção é de ambiente, sem novo pacote, e aguarda o de acordo do Alessandro e o seu para aplicar no DES. Também achamos um erro de banco separado (ORA-25156, dialeto Oracle do Hibernate), que é correção do dev. Obs.: o inventário cita 6.4.0, mas a versão no ambiente é 6.3.0-b4587.
SIRUR	🔴 (atualizado)	Avançou: senha do datasource corrigida (ORA-01017 resolvido) e o erro do @PersistenceContext foi superado. A 3.55.51.03 parou num novo erro de CDI: SiricXMLIntegracaoNegocioImpl precisa expor a interface (@Local/implements). Aguardando nova build do Michael.
LCR 1.117.1	🔴	Deploy revertido: erros de CDI em 9 DAOs e SecurityInterceptor incompatível com o RESTEasy do 7.4. Aguardando nova build. Correção da fábrica.
HUB-API 2.2.0	🔴	Named query com parâmetro legado ?, incompatível com o Hibernate do 7.4. Aguardando nova build.
SIFEC-EMP 3.96.2.0	🔴	CDI (WELD-001408). Aguardando nova build.
SIFEC-EMPRESAS	🔴	CDI (WELD-001408). Aguardando nova build.
SIFEC-RURAL 2.115.1.0	🔴	Precisa de build compatível com o 7.4 (Jackson/RESTEasy como provided). Aguardando nova build.
APX, ARC, BAN, BNDES, CONSTRUCARD, GARANTIAS, MANTER DOCUMENTO, ORIGINAÇÃO	⚪	Ainda não começamos. Ficam na fila depois de LCR → SIRUR → CCR, como Paulo e Rodrigo definiram.

Resumo:

🟢 3: SIFEC, SICDT e PJ.
🟡 7: implantados aguardando teste dos devs, mais o CCR esperando o de acordo.
🔴 6: todos aguardando build corrigida da fábrica; do lado do ambiente não há pendência nossa neles.
⚪ 8: ainda na fila.

Fora da lista, no SIEMP, o DNS duplicado já foi corrigido e o erro de JSTL está com o dev.

Duas observações antes de mandar:

PARÂMETROS: coloquei 🟡 porque não lembro de confirmação de teste da spr3. Se o Rodrigo já validou, pode voltar para 🟢.
Testes dos amarelos: se algum dev confirmou teste de MCM, BDCAIXA, FBN ou Minutas e eu não vi, é só passar para 🟢.
