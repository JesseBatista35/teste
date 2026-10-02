sobre a dúvida de quem cria as pastas no servidor após o Armazenamento provisionar o NFS:

A divisão de responsabilidade é:

Armazenamento (storage): cria o export no Isilon — ou seja, o compartilhamento NFS em si (path, capacidade, zona, liberação de IPs/ACL). Isso é feito do lado do storage, não dentro do servidor.

Esteiras (nós): depois que o export existe e está montável, somos nós quem realizamos, dentro do servidor:

Criação da estrutura de diretórios/subpastas específica da aplicação
Ajuste de ownership (chown) para o usuário de serviço da aplicação, geralmente jboss
Ajuste de permissões (chmod)
Configuração do /etc/fstab para persistir o mount
Validação do mount (mount -a)

Multi-Suporte SO: entra em situações diferentes dessa, relacionadas à infraestrutura do próprio sistema operacional da VM, como: instalação de pacotes de sistema, patches e atualizações de SO, configuração de kernel, problemas de rede/interface da VM, criação ou configuração inicial do servidor (quando a VM é provisionada), e troubleshooting de falhas do próprio SO. Ou seja, SO cuida da "máquina" em si, não da configuração funcional específica de uma aplicação.

Criar pastas, ajustar ownership e permissões vinculadas à estrutura que o time de desenvolvimento/negócio definiu para a aplicação é configuração funcional do ambiente — não é infraestrutura de SO, e sim algo que fazemos regularmente nas esteiras.
