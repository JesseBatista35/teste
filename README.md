
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# for f in /producao/env_config.sh /producao/executa-job.sh /producao/configuration/custom.sh; do echo "$f: $(head -c3 $f | xxd -p) | $(file -b $f)"; done
/producao/env_config.sh: efbbbf | Bourne-Again shell script, UTF-8 Unicode (with BOM) text executable
/producao/executa-job.sh: efbbbf | Bourne-Again shell script, UTF-8 Unicode (with BOM) text executable
/producao/configuration/custom.sh: 236368 | ASCII text
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# for f in /producao/env_config.sh /producao/executa-job.sh /producao/configuration/custom.sh; do cp -p $f $f.bkp.$(date +%Y%m%d%H%M); sed -i '1s/^\xEF\xBB\xBF//; s/\r$//' $f; done
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# head -c3 /producao/executa-job.sh | xxd -p     # não pode mais começar com efbbbf
23212f
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# dnf install -y jq && jq --version
Atualizando repositórios do Subscription Management.
Red Hat Enterprise Linux 9 for x86_64 - BaseOS (RPMs)                                                                                                               146 kB/s | 4.1 kB     00:00
Red Hat Satellite Client 6 for RHEL 9 x86_64 (RPMs)                                                                                                                 127 kB/s | 3.8 kB     00:00
Zabbix 6 REDHAT 9                                                                                                                                                    87 kB/s | 1.5 kB     00:00
Zabbix 6.4 REDHAT 9                                                                                                                                                  87 kB/s | 1.5 kB     00:00
Red Hat Enterprise Linux 9 for x86_64 - Supplementary (RPMs)                                                                                                        138 kB/s | 3.8 kB     00:00
Red Hat Enterprise Linux 9 for x86_64 - Extensions (RPMs)                                                                                                           127 kB/s | 3.8 kB     00:00
Red Hat Satellite Utils 6.18 for RHEL 9 x86_64 (RPMs)                                                                                                               138 kB/s | 3.8 kB     00:00
Red Hat Enterprise Linux 9 for x86_64 - AppStream (RPMs)                                                                                                            145 kB/s | 4.5 kB     00:00
EPEL REDHAT 9 - Everything                                                                                                                                          130 kB/s | 2.3 kB     00:00
OCS - Instaladores Redhat 9                                                                                                                                          85 kB/s | 1.5 kB     00:00
Puppet REDHAT 9                                                                                                                                                      86 kB/s | 1.5 kB     00:00
Dependências resolvidas.
====================================================================================================================================================================================================
 Pacote                                   Arquitetura                           Versão                                           Repositório                                                   Tam.
====================================================================================================================================================================================================
Instalando:
 jq                                       x86_64                                1.6-19.el9_8.2                                   rhel-9-for-x86_64-baseos-rpms                                193 k
Instalando dependências:
 oniguruma                                x86_64                                6.9.6-1.el9.6                                    rhel-9-for-x86_64-baseos-rpms                                221 k

Resumo da transação
====================================================================================================================================================================================================
Instalar  2 pacotes

Tamanho total do download: 414 k
Tamanho depois de instalado: 1.1 M
Baixando pacotes:
(1/2): oniguruma-6.9.6-1.el9.6.x86_64.rpm                                                                                                                           3.7 MB/s | 221 kB     00:00
(2/2): jq-1.6-19.el9_8.2.x86_64.rpm                                                                                                                                 3.1 MB/s | 193 kB     00:00
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Total                                                                                                                                                               6.5 MB/s | 414 kB     00:00
Executando verificação da transação
Verificação de transação concluída.
Executando teste de transação
Teste de transação concluído.
Executando a transação
  Preparando          :                                                                                                                                                                         1/1
  Instalando          : oniguruma-6.9.6-1.el9.6.x86_64                                                                                                                                          1/2
  Instalando          : jq-1.6-19.el9_8.2.x86_64                                                                                                                                                2/2
  Executando scriptlet: jq-1.6-19.el9_8.2.x86_64                                                                                                                                                2/2
  Verificando         : oniguruma-6.9.6-1.el9.6.x86_64                                                                                                                                          1/2
  Verificando         : jq-1.6-19.el9_8.2.x86_64                                                                                                                                                2/2
Produtos instalados atualizados.

Instalados:
  jq-1.6-19.el9_8.2.x86_64                                                                      oniguruma-6.9.6-1.el9.6.x86_64

Concluído!
jq-1.6
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
