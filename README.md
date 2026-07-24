Prezados,

Em análise à falha de build reportada no pipeline do projeto SIACC-pixautomatico-mq-suporte (buildId 779620), identificou-se que a causa raiz está relacionada à resolução de dependência via range de versão SNAPSHOT (br.gov.caixa.siacc.pix.suporte:SIACC-pixautomatico-api-suporte), declarada no pom.xml como [1.0.169-SNAPSHOT,1.1.0-SNAPSHOT).

Constatou-se que, embora o artefato mais recente estivesse devidamente publicado e disponível no repositório Nexus (binario.caixa), a resolução por range não estava localizando a versão vigente durante o build, resultando em falha por inexistência aparente do artefato.

Como ajuste de contorno, a dependência foi fixada em uma versão exata (1.0.179-SNAPSHOT) em substituição ao range de versão, alteração validada com sucesso na branch CESTI-teste, restabelecendo o build do projeto.

Diante disso, solicita-se que o time de desenvolvimento responsável pela aplicação avalie a alteração realizada e, caso concorde com a abordagem, aplique o ajuste também na branch principal do repositório, de forma a manter a build estável de forma definitiva.

Ressalta-se que a alteração foi restrita à declaração de versão da dependência no pom.xml, sem impacto em regras de negócio ou funcionalidades da aplicação.

Considerando que a fixação de versão exata resolve o problema de forma direta e sem necessidade de intervenção estrutural em repositório compartilhado por múltiplos projetos, não há necessidade de escalonamento ao time gestor do Nexus neste momento.

Encerra-se o atendimento com o ajuste aplicado e validado no ambiente de teste, ficando sob responsabilidade do time de desenvolvimento a aplicação definitiva na branch principal.
