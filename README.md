Prezados,

Informamos que os problemas reportados nesta demanda no SIGEC-CSC foram corrigidos.

1) Exportação de Base – HTTP 504 Gateway Timeout após ~120 segundos
Causa: o backend é publicado via Apache com balanceamento mod_cluster para o JBoss. O JBoss não possuía o parâmetro node-timeout configurado, fazendo com que o Apache aplicasse o timeout padrão global de 120 segundos e encerrasse a espera pela resposta enquanto a aplicação ainda processava a exportação (evidenciado nos logs do Apache: AH00878 – timeout specified has expired).
Correção: configurado node-timeout="600" (10 minutos) no subsystem modcluster do JBoss.

2) Carregar Base – falha no upload de arquivos acima de 10 MB (erro "código: 0 [object ProgressEvent]")
Causa: o tráfego entre o Apache e o JBoss utiliza o conector AJP (porta 8009). O parâmetro max-post-size de 200 MB estava configurado apenas nos listeners HTTP e HTTPS, enquanto o ajp-listener permanecia com o limite padrão de 10 MB.
Correção: configurado max-post-size="209715200" (200 MB) no ajp-listener.

Ações realizadas:
- Ajustes aplicados nos servidores JBoss de DES (caddeapllx756 e caddeapllx763) e TQS (caddeapllx765).
- Ajustes incorporados pela equipe de desenvolvimento no arquivo standalone-full-ha.xml do repositório SIGEC-CSC-config, garantindo que a configuração seja mantida nas próximas releases.

Validação: testes realizados com sucesso, incluindo exportações com processamento superior a 2 minutos e upload de arquivos acima de 10 MB.

Recomendação: avaliar a performance das consultas envolvidas na exportação e, se possível, adotar processamento assíncrono, evitando requisições de longa duração.

Diante do exposto, a demanda está sendo encerrada.

Atenciosamente,
Jessé Batista
Analista CTIS / CESTI – Esteira DevOps DES TQS NPRD
