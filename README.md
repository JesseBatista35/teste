Oi, Figueira! Respondendo:

Tipos de NFS: na esteira existem ISILON e VM. O script também prevê HUAWEI, mas ainda não está implementado: hoje ele só monta ISILON e VM.

Como a esteira decide o tipo: não olha o endpoint, olha o nome da variável cadastrada (NFS_ENDPOINT_ISILON* ou NFS_ENDPOINT_VM*). Por isso a classificação importa:

ISILON: a esteira consulta a API do Isilon e inclui os IPs de backup na lista de clientes do export.
VM: a esteira só monta. A liberação de acesso no storage é manual.

Se um NFS que não é Isilon for cadastrado como ISILON, a esteira quebra (IndexError).

Sua suposição está correta: nfsctcnprd.ctc.caixa:/ifs é Isilon, e IP puro com :/export é VM.

Seus casos:

10.252.168.196:/export/ → VM
nfsdcp.ctc.caixa:/ifs/ → ISILON
hyperprd12.ad.caixa:/fs_siexc → VM na esteira
hyperprd56.ad.caixa:/fs_sicql/sigdb/financeiros → VM na esteira

Os hyperprd não estão no catálogo Isilon do script, então não podem ser ISILON. Se fisicamente são outro tipo de storage, só o Armazenamento confirma. Vale perguntar a eles o tipo físico e quem libera os IPs, já que no tipo VM a liberação é manual.

Obs.: essa análise é baseada no nfs.py que temos em NPRD. Se o de PRD for diferente, pode haver variação.
