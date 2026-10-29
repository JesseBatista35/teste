Prezados,

Atendida a solicitação de separação do NFS do ambiente DES do SIBEC-arquivos.

Ações realizadas:

O módulo SIBEC-arquivos (namespace sibec-des) passou a utilizar o export dedicado nprdnfs01.ad.caixa:/fs_sibec_des_nprd, montado em /sibec3 (PVC sibec-arquivos-data-des). A aplicação foi configurada para utilizar esse ponto (filestore.path.servidor=/sibec3).
Os arquivos do export compartilhado fs_sibec_nprd foram copiados para o novo export, cerca de 7,3 GB. Origem e destino foram conferidos por nome e tamanho de arquivo.
Os ambientes TQS e HMP permanecem no export fs_sibec_nprd, sem alteração.

Exceções:

59 arquivos não foram copiados por restrição de permissão na origem (sem leitura para o usuário da aplicação). São arquivos da pasta Folha (competência C2505) e dois arquivos na raiz. Caso sejam necessários no DES, a cópia deve ser solicitada ao Armazenamento, para ser feita diretamente no storage. Lista em anexo.
A cópia dos dados do NFS antigo srjtqapllx028:/sistemas/sibec não é possível a partir do cluster OKD. Caso ainda seja necessária, deve ser tratada em demanda própria.

Solicitamos à equipe do sistema a validação dos arquivos no ambiente DES.

Encerramos a demanda.
