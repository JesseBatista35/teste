Leandro, respondendo direto às suas duas perguntas:

Essa correção afeta outros sistemas que usam SISGR?

Sim, potencialmente afeta. O módulo br.gov.caixa.sisgr é compartilhado no mesmo servidor (não é exclusivo do SICMU), então qualquer aplicação nesse servidor que também dependa do SISGR e use esse mesmo caminho de código (AutorizacaoFactory/JConnector) pode ter o mesmo erro hoje - e se beneficiaria da mesma correção. Por isso reforçamos que essa mudança não deveria ficar restrita ao escopo do SICMU, e sim ser avaliada/aplicada por quem administra os módulos compartilhados desse servidor.

Qual componente do SISGR estamos usando?

O módulo instalado nesse servidor é:

sisgr-1.2.jar

Localizado em: /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/sisgr/main/

Versão do JBoss: EAP 7.4.8
