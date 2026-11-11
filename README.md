Para fazer o deploy pelo CLI da 471, você já está conectado ([domain@localhost:9999 /]):

/server-group=sifec-intranet/deployment=SICCR-HUB-BACKEND2:add(enabled=true)

Antes de rodar, deixe o log aberto na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|hub"

Depois, confira o status no CLI:

/server-group=sifec-intranet/deployment=SICCR-HUB-BACKEND2:read-resource

E teste na sua estação:

curl -k -s -o /dev/null -w "%{http_code}\n" https://migracaosifec.des.caixa/hub-api/

Se der erro e precisar desfazer:

/server-group=sifec-intranet/deployment=SICCR-HUB-BACKEND2:remove






We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for p585600:
14:45:08,378 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 236) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#SIEMP-PU'
14:45:08,379 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 229) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#HUB-PU'
14:45:08,383 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 237) WFLYJPA0011: Interrompendo unidade de persistência (fase 2 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#fecDS'
14:45:08,386 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 237) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#SiempEjbDB2'
14:45:08,386 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 232) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#fecDS'
14:45:08,386 INFO  [org.jboss.as.jpa] (ServerService Thread Pool -- 236) WFLYJPA0011: Interrompendo unidade de persistência (fase 1 de 2) Serviço 'hub-api-2.2.0-b809.ear/hub-api.war#SIEMP-PU'
14:45:08,429 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0208: Interrompendo a subimplantação (runtime-name: hub-api.war) em 62ms
14:45:08,430 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-3) WFLYSRV0028: Implantação interrompida SICCR-HUB-BACKEND2 (runtime-name: hub-api-2.2.0-b809.ear) em 64ms



[domain@localhost:9999 /] /server-group=sifec-intranet/deployment=SICCR-HUB-BACKEND2:add(enabled=true)
{
    "outcome" => "failed",
    "result" => undefined,
    "failure-description" => {"WFLYDC0074: Operation failed or was rolled back on all servers. Server failures:" => {"server-group" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-i
ntranet_node1_lx473" => {"WFLYCTL0080: Falha de serviços" => {"jboss.persistenceunit.\"hub-api-2.2.0-b809.ear/hub-api.war#HUB-PU\"" => "javax.persistence.PersistenceException: [PersistenceUnit: HUB-P
U] Unable to build Hibernate SessionFactory
    Caused by: javax.persistence.PersistenceException: [PersistenceUnit: HUB-PU] Unable to build Hibernate SessionFactory
    Caused by: org.hibernate.HibernateException: Errors in named queries:
ProcessoEnvioContrato.buscar failed because of: org.hibernate.QueryException: Legacy-style query parameters (`?`) are no longer supported; use JPA-style ordinal parameters (e.g., `?1`) instead : sele
ct p from br.gov.caixa.siccr.dominio.pf.ProcessoEnvioContratoEntidade p where p.processo = ? [select p from br.gov.caixa.siccr.dominio.pf.ProcessoEnvioContratoEntidade p where p.processo = ?]"}}}}}}}
},
    "rolled-back" => true,
    "server-groups" => {"sifec-intranet" => {"host" => {"hc_cbrdeapllx473" => {"sifec-intranet_node1_lx473" => {"response" => {
        "outcome" => "failed",
        "result" => undefined,
        "failure-description" => {"WFLYCTL0080: Falha de serviços" => {"jboss.persistenceunit.\"hub-api-2.2.0-b809.ear/hub-api.war#HUB-PU\"" => "javax.persistence.PersistenceException: [PersistenceUn
it: HUB-PU] Unable to build Hibernate SessionFactory
    Caused by: javax.persistence.PersistenceException: [PersistenceUnit: HUB-PU] Unable to build Hibernate SessionFactory
    Caused by: org.hibernate.HibernateException: Errors in named queries:
ProcessoEnvioContrato.buscar failed because of: org.hibernate.QueryException: Legacy-style query parameters (`?`) are no longer supported; use JPA-style ordinal parameters (e.g., `?1`) instead : sele
ct p from br.gov.caixa.siccr.dominio.pf.ProcessoEnvioContratoEntidade p where p.processo = ? [select p from br.gov.caixa.siccr.dominio.pf.ProcessoEnvioContratoEntidade p where p.processo = ?]"}},
        "rolled-back" => true
    }}}}}}
}

[domain@localhost:9999 /]



