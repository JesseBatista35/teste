
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
[p585600@scttqapllx0032 opt]$
