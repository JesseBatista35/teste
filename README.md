<img width="886" height="218" alt="image" src="https://github.com/user-attachments/assets/e9970048-6892-4b7c-b98a-9cda13eecb6a" />


Histórico de Informações de Trabalho
ID da Tarefa	 TAS000050643611
Criado em	 08/10/2026 20:24:54
Criado por	 P627628
Origem	 
Exibir Acesso	 Interno
Sumário	 Validação
Notas	 A

CETEL,

Segue validação de regra permitindo o fluxo.

========================VALIDACÃO========================
>>CAZINTFW001-1
packet-tracer input INSIDE TCP 10.204.0.0 65001 10.249.79.0 443 | in Action
Action: allow
packet-tracer input INSIDE TCP 10.139.107.0 65001 10.249.79.0 443 | in Action
Action: allow

Att,
Altemar Novaes
Analista de Rede Datacenter
Printed by P585600 on Sábado, 10/10/2026 14:53:06



ID da Tarefa	 TAS000050643610
Criado em	 08/10/2026 20:23:56
Criado por	 P627628
Origem	 
Exibir Acesso	 Interno
Sumário	 Regra aplicada
Notas	 A

CETEL,

Regra aplicada conforme planejamento.

Att,
Altemar Novaes
Analista de Rede Datacenter
Printed by P585600 on Sábado, 10/10/2026 14:53:20


Histórico de Informações de Trabalho
ID da Tarefa	 TAS000050643609
Criado em	 08/10/2026 15:18:39
Criado por	 P642589
Origem	 
Exibir Acesso	 Interno
Sumário	 Script planejado
Notas	 À

CETEL/REDES

======================EXECUÇÃO=========================
Prezados,

Regras planejadas a partir do AlgoSec via Fireflow #33279 Pedido: 98140 - CRQ000001513603

Fluxo Origem -> Destino: CAZINTFW001-1

***OBS: Favor, aplicar deploy no firewall***

========================VALIDACÃO========================
>>CAZINTFW001-1
packet-tracer input INSIDE TCP 10.204.0.0 65001 10.249.79.0 443
packet-tracer input INSIDE TCP 10.139.107.0 65001 10.249.79.0 443


ping tcp 10.249.79.0 443 source 10.204.0.0 65001
ping tcp 10.249.79.0 443 source 10.139.107.0 65001

Att,
Lucas Johnson Vieira Costa
Analista de Datacenter - Redes
TELEDATA/CETEL/REDES
Printed by P585600 on Sábado, 10/10/2026 14:53:33

