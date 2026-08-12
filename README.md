-sh-4.2$ cd /tmp
-sh-4.2$ cp /opt/jboss-eap/modules/system/layers/base/br/gov/caixa/psc/jconnector/main/jconnector-2.10.jar .
-sh-4.2$ unzip -o jconnector-2.10.jar -d jconnector_extraido
Archive:  jconnector-2.10.jar
   creating: jconnector_extraido/META-INF/
  inflating: jconnector_extraido/META-INF/MANIFEST.MF
   creating: jconnector_extraido/br/
   creating: jconnector_extraido/br/gov/
   creating: jconnector_extraido/br/gov/caixa/
   creating: jconnector_extraido/br/gov/caixa/psc/
   creating: jconnector_extraido/br/gov/caixa/psc/connector/
   creating: jconnector_extraido/br/gov/caixa/psc/connector/client/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ClientFactory$ClientFactoryBuilder.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ClientFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ClientFactory.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/DinamicNamedFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/DinamicNamedFactory.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/Genesis4JConnector.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/Genesis4JConnector.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/IWayFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/IWayFactory.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/IWayJConnectorClient.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/IWayJConnectorClient.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/JConnector.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/JConnector.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/JConnectorClient.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/JConnectorClient.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/JConnectorException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/JConnectorException.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/client/base/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/base/BaseClient.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/base/BaseClient.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/client/jcicsdirect/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jcicsdirect/JCICSDirectClient.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jcicsdirect/JCICSDirectClient.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jcicsdirect/JCICSDirectFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jcicsdirect/JCICSDirectFactory.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jcicsdirect/MensagemCicsJC.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jcicsdirect/MensagemCicsJC.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/JConnectorMQException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/JConnectorMQException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/JMSClient.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/JMSClient.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/JMSClientFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/JMSClientFactory.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/MQClient.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/MQClient.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/MQClientFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/MQClientFactory.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/MQConnectionFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/jms/MQConnectionFactory.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/JBossClient.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/JBossClient.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/WSClientFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/WSClientFactory.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWS.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWS.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWSI.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWSI.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWSIBindingStub.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWSIBindingStub.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWSIProxy.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWSIProxy.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWSLocator.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/client/ws/jboss/JConnectorWSLocator.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/config/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/Config$1.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/Config$ConfigBuilder.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/Config.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/Config.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/ConfigFile.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/ConfigFile.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/ConfigKey.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/ConfigKey.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/ConfigLDAP.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/ConfigLDAP.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/ConfigMBean.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/ConfigMBean.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/IWayConfig.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/IWayConfig.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/LDAPLocator.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/LDAPLocator.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/Target.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/Target.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/TargetKey.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/config/TargetKey.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/dao/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/CicsDAO.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/CicsDAO.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/CicsDAOException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/CicsDAOException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/CicsDAOFactory.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/CicsDAOFactory.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/IwayCicsDAO$CompleteStatus.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/IwayCicsDAO.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/dao/IwayCicsDAO.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/AreaError.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/AreaError.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/CicsCommunicationException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/CicsCommunicationException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/ConnectorBeanCommunicationException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/ConnectorBeanCommunicationException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/CoreError.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/CoreError.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/ErrorDetail.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/ErrorDetail.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorBaseException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorBaseException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorConfigException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorConfigException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorError.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorError.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorParserException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorParserException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorTargetNotFoundException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/JConnectorTargetNotFoundException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/ParametersError.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/ParametersError.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/TransactionException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/exceptions/TransactionException.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/iway/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayConnectionSpec.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayConnectionSpec.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayIVP.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayIVP.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayInteractionSpec.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayInteractionSpec.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayLogLevelEnum.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayLogLevelEnum.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayTransactionException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/iway/IwayTransactionException.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/model/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeComunicacao.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeComunicacao.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeControle.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeControle.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeDados.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeDados.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeEntrada.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeEntrada.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeSaida.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/AreaDeSaida.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/BussinessRuleException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/BussinessRuleException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/CicsArea.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/CicsArea.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/CollectionElement.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/CollectionElement.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/Filler.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/Filler.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/OutputFillerType.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/OutputFillerType.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ParametroCicsArea.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ParametroCicsArea.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ParametroCicsAreaCollection.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ParametroCicsAreaCollection.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ParametroCollection.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ParametroCollection.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ParametroInvalidoException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ParametroInvalidoException.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ProgramaCICS.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/ProgramaCICS.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/TamanhoParametroInvalidoException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/TamanhoParametroInvalidoException.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/EncapsuladorPSCPSLNK.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/EncapsuladorPSCPSLNK.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeComunicacao.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeComunicacao.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeControle.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeControle.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeDados.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeDados.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeEntrada.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeEntrada.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeSaida.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCAreaDeSaida.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCFiller.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCFiller.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCFillerEntrada.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCFillerEntrada.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCFillerSaida.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/PSCFillerSaida.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/ParametroEncapsuladorPSC$Constants.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/ParametroEncapsuladorPSC.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/pscpslnk/ParametroEncapsuladorPSC.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/Ambiente.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/Ambiente.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/AreaPassarPrograma.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/AreaPassarPrograma.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/CodigoTipoEmpresa.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/CodigoTipoEmpresa.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/FormaChamarPrograma.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/FormaChamarPrograma.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/IndicadorChamadaSeguranca.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/IndicadorChamadaSeguranca.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/IndicadorDisplay.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/IndicadorDisplay.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/NivelAutenticacao.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/NivelAutenticacao.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/TipoUsuario.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/model/types/TipoUsuario.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/parser/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/parser/JConnectorStAXParser.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/parser/JConnectorStAXParser.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/server/
   creating: jconnector_extraido/br/gov/caixa/psc/connector/server/ws/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/server/ws/JConnectorImpl.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/server/ws/JConnectorImpl.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/server/ws/JConnectorWSI.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/server/ws/JConnectorWSI.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/servicelocator/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/servicelocator/ServiceLocator.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/servicelocator/ServiceLocator.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/servicelocator/ServiceLocatorException.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/servicelocator/ServiceLocatorException.java
   creating: jconnector_extraido/br/gov/caixa/psc/connector/util/
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/CicsConnectorAdapter.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/CicsConnectorAdapter.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/Config.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/Config.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/Constants.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/Constants.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/DeprecatedLog.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/DeprecatedLog.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/Fuse.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/Fuse.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/JNDINames.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/JNDINames.java
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/TimeBomb.class
  inflating: jconnector_extraido/br/gov/caixa/psc/connector/util/TimeBomb.java
-sh-4.2$ find jconnector_extraido -name "*.class" | xargs -I{} sh -c 'strings {} | grep -i "jconnector.properties"' 2>/dev/null
+/infra_app/config/sit/jconnector.properties
o:/infra_app/config/sit/jconnector.properties
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -i "jconnector" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
2026-08-11 16:02:35,817 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) WFLYSRV0018: A implantação "deployment.SICMU-ear.ear.SICMU-ejb.jar" está usando um módulo privado ("br.gov.caixa.psc.jconnector") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
2026-08-11 16:02:36,062 WARN  [org.jboss.as.dependency.private] (MSC service thread 1-1) WFLYSRV0018: A implantação "deployment.SICMU-ear.ear.SICMU-web.war" está usando um módulo privado ("br.gov.caixa.psc.jconnector") que pode ser alterado ou removido em versões futuras sem nenhum aviso.
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ grep -i "jconnector" /logs/jboss/jboss-eap/standalone/sicmu-intranet-update/server.log | grep -i "error\|exception\|not found\|filenotfound"
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
Caused by: java.lang.NoClassDefFoundError: br/gov/caixa/psc/connector/client/JConnectorException
Caused by: java.lang.ClassNotFoundException: br.gov.caixa.psc.connector.client.JConnectorException from [Module "br.gov.caixa.sisgr" from local module loader @22fcf7ab (finder: local module finder @2de23121 (roots: /opt/jboss-eap/modules,/opt/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.4.8.CP,/opt/jboss-eap/modules/system/layers/base,/opt/jboss-eap/modules/system/add-ons/keycloak))]
-sh-4.2$
