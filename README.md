[p585600@scttqapllx0032 opt]$ sed -n '31,80p' /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml
    <system-properties>
        <property name="sismh.numero.unidade.cehma" value="7013"/>
        <property name="sismh.numero.natural.cehma" value="6678"/>
        <property name="sismh.total.dias.adicionar.vencimento.demanda.nulo" value="7"/>
        <property name="sismh.manutencao.demanda.vencimento.abertura.nulo" value="10"/>
        <property name="sismh.manutencao.demanda.vencimento.reabertura.nulo" value="2"/>
        <property name="sismh.manutencao.demanda.agencia.reabertura.dias" value="5"/>
        <property name="sismh.manutencao.demanda.agencia.reabertura.quantidade" value="2"/>
        <property name="org.apache.el.parser.COERCE_TO_ZERO" value="false"/>
        <property name="sismh.pool.maximo.demandas.execucao.macro" value="1000"/>
        <property name="sismh.modelo.rejeicao.demanda" value="Demanda Rejeitada"/>
        <property name="sismh.arquivos.demanda.diretorio" value="/sistemas/sismh/arquivos/"/>
        <property name="sismh.arquivos.demanda.manutencao.diretorio" value="/sistemas/sismh/manutencao/arquivos/"/>
        <property name="sismh.manutencao.demanda.arquivos.diretorio" value="/sistemas/sismh/manutencao/arquivos/"/>
        <property name="sismh.encoding.file.reader" value="ISO-8859-1"/>
        <property name="sismh.peso.demandas.rejeitadas" value="5"/>
        <property name="sismh.peso.demandas.transferidas" value="10"/>
        <property name="sismh.portal.juridico.user" value="sismhCeinj"/>
        <property name="sismh.portal.juridico.password" value="sFn0FFdwqh"/>
        <property name="sismh.portal.juridico.url.post" value="http://www.portal2.dijur.caixa/modulos/subsidios/xml/AcessoRemoto/XmlTratamentoResposta.asp"/>
        <property name="sismh.portal.juridico.status.acao" value="Unisys"/>
        <property name="sismh.dir.file.retorno.poj" value="/sistemas/sismh/xml_retorno_poj/retornoPortalJuridico.xml"/>
        <property name="sismh.modelo.padrao.parecer" value="Resposta Padrao: Demanda sem parecer Cadastrado"/>
        <property name="sismh.nome.supervisor.subsidios" value="RENATO TAVARES"/>
        <property name="sismh.nome.supervisor.implantacao" value="THIAGO MELLO"/>
        <property name="sismh.email.remetente.modelo.parecer" value="gitecbh09@caixa.gov.br"/>
        <property name="sismh.ambiente.gitec" value="false"/>
        <property name="sismh.link.portal.juridico" value="https%3A%2F%2Fwww.portal.dijur.caixa%2Fmodulos%2Fsubsidios%2F%3Fpg%3DsubsidiosManter%26acao%3Dconsultar%26sequencial%3D"/>
        <property name="sismh.relatorios.rodape.left" value="SISMH+-+Sistema+de+Manuten%c3%a7%c3%a3o+de+Cr%c3%a9ditos+Habitacionais"/>
        <property name="sismh.relatorios.cabecalho" value="CEHMA"/>
        <property name="sismh.relatorios.area.responsavel.quadro.resumo" value="CN%20Manuten%C3%A7%C3%A3o%20de%20Cr%C3%A9ditos%20Habitacionais"/>
        <property name="sismh.link.portal.siga" value="http%3A%2F%2Fsiga.caixa%2Fsistema%2Fsiga%2Fdemandas_siga_detalhes.asp%3Fdemanda_id%3D"/>
        <property name="sismh.link.portal.sac" value="https%3A%2F%2Fatender.caixa%2Fsiouv%2Fjsp%2Flogin%2FDetalharOcorrencia.do%3Fmethod%3DconsultarDetalharOcorrencia%26tipoOcorrencia%3D3%26fase%3D2%26ocorrencia%3D"/>
        <property name="sismh.link.portal.siarq" value="https%3A%2F%2Fatender.caixa%2Fsiouv%2F"/>
        <property name="sismh.manual.usuario.diretorio" value="/sistemas/sismh/manual_usuario/SISMH_manual_usuario.pdf"/>
        <property name="sismh.codigo.sequencial.postgres.demanda.atraso.obra" value="25"/>
        <property name="sismh.enviar.conteudo.comcopia.demanda.atrasodeobra.para.portal.juridico" value="true"/>
        <property name="sismh.matricula.rejeicao.automatica" value="C212163"/>
        <property name="sismh.solicitacao.integracao.diretorio" value="/sistemas/sismh/integracao/"/>
        <property name="sismh.email.envio" value="gitecbh09@caixa.gov.br"/>
        <property name="sismh.ambiente.producao" value="false"/>
        <property name="sismh.ambiente.teste" value="tqs"/>
        <property name="java.io.tmpdir" value="/sistemas/sismh/arquivos/tmp/"/>
        <property name="sismh.confidencialidade.nivel" value="#INTERNO.CAIXA"/>
        <property name="sismh.solicitacao.relatorio.demanda.finalizada.diretorio" value="/sistemas/sismh/arquivos/relatorio/solicitaOffline/"/>
        <property name="java.net.preferIPv4Stack" value="true"/>
        <property name="http.proxyHost" value="proxy.caixa"/>
        <property name="http.proxyPort" value="8443"/>
        <property name="https.nonProxyHosts" value="localhost|127.0.0.1|*.caixa"/>
    </system-properties>
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ grep -n "sismh" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml | head -20
32:        <property name="sismh.numero.unidade.cehma" value="7013"/>
33:        <property name="sismh.numero.natural.cehma" value="6678"/>
34:        <property name="sismh.total.dias.adicionar.vencimento.demanda.nulo" value="7"/>
35:        <property name="sismh.manutencao.demanda.vencimento.abertura.nulo" value="10"/>
36:        <property name="sismh.manutencao.demanda.vencimento.reabertura.nulo" value="2"/>
37:        <property name="sismh.manutencao.demanda.agencia.reabertura.dias" value="5"/>
38:        <property name="sismh.manutencao.demanda.agencia.reabertura.quantidade" value="2"/>
40:        <property name="sismh.pool.maximo.demandas.execucao.macro" value="1000"/>
41:        <property name="sismh.modelo.rejeicao.demanda" value="Demanda Rejeitada"/>
42:        <property name="sismh.arquivos.demanda.diretorio" value="/sistemas/sismh/arquivos/"/>
43:        <property name="sismh.arquivos.demanda.manutencao.diretorio" value="/sistemas/sismh/manutencao/arquivos/"/>
44:        <property name="sismh.manutencao.demanda.arquivos.diretorio" value="/sistemas/sismh/manutencao/arquivos/"/>
45:        <property name="sismh.encoding.file.reader" value="ISO-8859-1"/>
46:        <property name="sismh.peso.demandas.rejeitadas" value="5"/>
47:        <property name="sismh.peso.demandas.transferidas" value="10"/>
48:        <property name="sismh.portal.juridico.user" value="sismhCeinj"/>
49:        <property name="sismh.portal.juridico.password" value="sFn0FFdwqh"/>
50:        <property name="sismh.portal.juridico.url.post" value="http://www.portal2.dijur.caixa/modulos/subsidios/xml/AcessoRemoto/XmlTratamentoResposta.asp"/>
51:        <property name="sismh.portal.juridico.status.acao" value="Unisys"/>
52:        <property name="sismh.dir.file.retorno.poj" value="/sistemas/sismh/xml_retorno_poj/retornoPortalJuridico.xml"/>
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ sudo cp /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml.bkp.$(date +%Y%m%d_%H%M)
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ sudo vi /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ xmllint --noout /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml && echo "XML válido"
XML válido
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$
[p585600@scttqapllx0032 opt]$ history
    1  ps -ef | grep sismh
    2  sudo su
    3  sudo -i
    4  cd /opt/etc/init.d/jboss-master
    5  ps -ef | grep jboss
    6  Favor alterar os parâmetros da etapa Publica no Nexus na esteira do projeto sisag-documento-digital-lib, seguindo a configuração do projeto sisag-spring-util.
    7
    8  EXEMPLO:
    9  mvn deploy:deploy-file
   10  -Dversion.app=1.12.0.0
   11  -DgroupId=br.gov.caixa.sisag
   12  -DartifactId=sisag-spring-util
   13  -Dversion=1.12.0.0
   14  -Dpackaging=jar
   15  -Dfile=./target/sisag-spring-util-1.12.0.0.jar
   16  -DrepositoryId=NEXUS_INTERNO
   17  -DgeneratePom=true
   18  -Durl=http://binario.caixa:8081/repository/releases
   19
   20  ------------------------------------------------------
   21
   22  COMO ESTÁ:
   23  mvn deploy:deploy-file
   24  -DgroupId=br.gov.caixa.sisag
   25  -DartifactId=documento-digital-lib
   26  -Dversion=1.0.0.0
   27  -Dpackaging=zip
   28  -Dfile=documento-digital-lib-1-0-0-0.zip
   29  -DrepositoryId=NEXUS_INTERNO
   30  -DgeneratePom=true
   31  -Durl=http://binario.caixa:8081/repository/releases
   32
   33  systctl -a | grep -i jboss
   34  systemctl -a | grep -i jboss
   35  ps -ef | grep log
   36  cd /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone
   37  ls -ltrh
   38  cd log/
   39  ls -ltrh
   40  tail -100f server.log
   41  pwd
   42  cd /logs
   43  pwd
   44  cd /opt/
   45  ls -la
   46  sudo su
   47  sudo
   48  sudo su
   49  cd ..
   50  sudo su
   51  history
   52  systemctl -a | grep -i jboss
   53  ps -ef | grep -i jboss
   54  ps -ef | grep log
   55  tail -100f server.log
   56  systemctl restart jboss
   57  systemctl -a | grep -i jboss
   58  sudo systemctl -a | grep jboss
   59  hystory | grep start
   60  history | grep start
   61  ps -ef | grep jboss
   62  tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log
   63  ps -ef | grep -i jboss cat /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
   64  ls -l /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log
   65  cat /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
   66   sudo -u jboss /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/jboss-cli.sh --connect controller=127.0.0.1:9991 command=":shutdown"
   67  ps -p 99496 && echo "ainda rodando" || echo "parou"
   68  sudo -l
   69  sudo -i
   70  ls -la /opt/etc/init.d/jboss-master sudo -u jboss /opt/etc/init.d/jboss-master status
   71  sudo -u jboss kill -15 99496 sleep 15 ps -p 99496 && echo "ainda vivo" || echo "morreu"
   72  sudo -u jboss kill -15 99496 sleep 15 ps -p 99496
   73  sudo -u jboss kill -15 99496
   74  ps -p 99496
   75  sudo -l
   76  sudo -u jboss /opt/etc/init.d/jboss-master status
   77  cat /opt/etc/init.d/jboss-master
   78  ps -p 99496
   79  sudo -u jboss kill -9 99496
   80  ps -p 99496
   81  cat /etc/init.d/jboss-slave
   82  ps -ef | grep -i jboss]
   83  ps -ef | grep -i jboss
   84  sudo -u jboss rm -f /usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file
   85  sudo -u jboss bash -c 'LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &'
   86  tail -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log
   87  sudo -u jboss env LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/usr/local/EAP-6.0.1/jboss-eap-6.0/lock/lock.file /usr/local/EAP-6.0.1/jboss-eap-6.0/bin/standalone.sh -Djboss.bind.address.management=0.0.0.0 -Djboss.socket.binding.port-offset=1 &
   88  tail -n 0 -f /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/log/server.log
   89  ps -ef | grep -i jboss
   90  ps -ef | grep java
   91  ps -ef | grep sismh
   92  -c standalone.xml
   93  ls -la
   94  pwd
   95  cd /opt/
   96  ls -la
   97  cat /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml | grep -A2 "sismh.api"
   98  sudo su
   99  head -5 /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml
  100  grep -n "system-properties" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml
  101  sed -n '31,80p' /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml
  102  grep -n "sismh" /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml | head -20
  103  sudo cp /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml.bkp.$(date +%Y%m%d_%H%M)
  104  sudo vi /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml
  105  xmllint --noout /usr/local/EAP-6.0.1/jboss-eap-6.0/standalone/configuration/standalone.xml && echo "XML válido"
  106  history
[p585600@scttqapllx0032 opt]$
