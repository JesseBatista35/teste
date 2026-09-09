[root@sbrdeapllx104 servers]# ls -la /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/
total 8
drwxrwxr-x 19 jboss jboss 4096 Mar  3  2026 .
drwxrwxr-x 11 jboss jboss  111 Fev 24  2026 ..
drwxr-xr-x  5 root  root    41 Fev  4  2026 layer-base-jboss-eap-6.4.10.CP
drwxr-xr-x  5 root  root    41 Fev  4  2026 layer-base-jboss-eap-6.4.11.CP
drwxr-xr-x  5 root  root    41 Fev  4  2026 layer-base-jboss-eap-6.4.12.CP
drwxr-xr-x  6 root  root    52 Fev  4  2026 layer-base-jboss-eap-6.4.13.CP
drwxrwxr-x  6 jboss jboss   52 Fev  6  2026 layer-base-jboss-eap-6.4.15.CP
drwxrwxr-x  6 jboss jboss   52 Fev  6  2026 layer-base-jboss-eap-6.4.17.CP
drwxr-xr-x  6 root  root    52 Fev  6  2026 layer-base-jboss-eap-6.4.19.CP
drwxrwxr-x  6 jboss jboss   52 Dez 14  2018 layer-base-jboss-eap-6.4.20.CP
drwxrwxr-x  6 jboss jboss   52 Dez 14  2018 layer-base-jboss-eap-6.4.21.CP
drwxr-xr-x  7 root  root    63 Set 12  2025 layer-base-jboss-eap-6.4.22.CP
drwxr-xr-x  7 root  root    63 Set 12  2025 layer-base-jboss-eap-6.4.23.CP
drwxr-xr-x  7 root  root    63 Set 12  2025 layer-base-jboss-eap-6.4.24.CP
drwxrwxr-x  4 jboss jboss   28 Jun 21  2016 layer-base-jboss-eap-6.4.2.CP
drwxrwxr-x  5 jboss jboss   41 Jun 21  2016 layer-base-jboss-eap-6.4.4.CP
drwxrwxr-x  5 jboss jboss   41 Jun 21  2016 layer-base-jboss-eap-6.4.6.CP
drwxrwxr-x  5 jboss jboss   41 Jun 21  2016 layer-base-jboss-eap-6.4.7.CP
drwxrwxr-x  5 jboss jboss   41 Fev  4  2026 layer-base-jboss-eap-6.4.9.CP
-rwxrwxr-x  1 jboss jboss   30 Mar 16 14:36 .overlays
[root@sbrdeapllx104 servers]# ls -la /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/ 2>&1
ls: não é possível acessar /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/: Arquivo ou diretório não encontrado
[root@sbrdeapllx104 servers]# cat /opt/jboss/jboss-eap/modules/system/layers/base/.overlays/.overlays.txt 2>/dev/null
[root@sbrdeapllx104 servers]# cat /opt/jboss/jboss-eap/modules/layers.conf 2>/dev/null
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]#
[root@sbrdeapllx104 servers]# unzip -t /opt/jboss/jboss-eap/modules_bkp/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/logmanager/main/jboss-logmanager-2.0.11.Final-redhat-00001.jar
Archive:  /opt/jboss/jboss-eap/modules_bkp/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/logmanager/main/jboss-logmanager-2.0.11.Final-redhat-00001.jar
    testing: META-INF/MANIFEST.MF     OK
    testing: META-INF/                OK
    testing: org/                     OK
    testing: org/jboss/               OK
    testing: org/jboss/logmanager/    OK
    testing: org/jboss/logmanager/errormanager/   OK
    testing: org/jboss/logmanager/handlers/   OK
    testing: org/jboss/logmanager/config/   OK
    testing: org/jboss/logmanager/filters/   OK
    testing: org/jboss/logmanager/formatters/   OK
    testing: META-INF/services/       OK
    testing: META-INF/maven/          OK
    testing: META-INF/maven/org.jboss.logmanager/   OK
    testing: META-INF/maven/org.jboss.logmanager/jboss-logmanager/   OK
    testing: org/jboss/logmanager/CallerClassLoaderLogContextSelector$1.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$EntrySet.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$SoftKeyReference.class   OK
    testing: org/jboss/logmanager/handlers/TcpOutputStream$RetryConnector.class   OK
    testing: org/jboss/logmanager/handlers/WriterHandler.class   OK
    testing: org/jboss/logmanager/handlers/SyslogHandler$Severity.class   OK
    testing: org/jboss/logmanager/handlers/ConsoleHandler$Target.class   OK
    testing: org/jboss/logmanager/LogContext$1.class   OK
    testing: org/jboss/logmanager/LogManager$2.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$8.class   OK
    testing: org/jboss/logmanager/filters/LevelRangeFilter.class   OK
    testing: org/jboss/logmanager/LogManager$ReadOnlyArrayList.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$24.class   OK
    testing: org/jboss/logmanager/formatters/ColorMap.class   OK
    testing: META-INF/services/java.util.logging.LogManager   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$EntryIterator.class   OK
    testing: org/jboss/logmanager/CopyOnWriteMap.class   OK
    testing: org/jboss/logmanager/handlers/UncloseableWriter.class   OK
    testing: org/jboss/logmanager/handlers/Handlers$1.class   OK
    testing: org/jboss/logmanager/handlers/SslTcpOutputStream.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$Entry.class   OK
    testing: org/jboss/logmanager/LoggerNode$1.class   OK
    testing: org/jboss/logmanager/LogContext$LazyHolder.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl$5.class   OK
    testing: org/jboss/logmanager/config/ValueExpression$1.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$2.class   OK
    testing: org/jboss/logmanager/config/AbstractPropertyConfiguration$ModuleFinder.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl.class   OK
    testing: org/jboss/logmanager/config/LogContextConfigurationImpl$3.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$SoftValueReference.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$6.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$18.class   OK
    testing: org/jboss/logmanager/formatters/StringBuilderWriter.class   OK
    testing: org/jboss/logmanager/NDC$1.class   OK
    testing: META-INF/build.metadata   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$Option.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$EntryIterator.class   OK
    testing: org/jboss/logmanager/handlers/TcpOutputStream.class   OK
    testing: org/jboss/logmanager/handlers/SyslogHandler.class   OK
    testing: org/jboss/logmanager/handlers/SizeRotatingFileHandler.class   OK
    testing: org/jboss/logmanager/LogContext$WeakLevelRef.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$KeySet.class   OK
    testing: org/jboss/logmanager/LogContext$LevelRef.class   OK
    testing: org/jboss/logmanager/config/ValueExpression.class   OK
    testing: org/jboss/logmanager/config/NamedConfigurable.class   OK
    testing: org/jboss/logmanager/config/AbstractBasicConfiguration.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$5.class   OK
    testing: org/jboss/logmanager/filters/InvertFilter.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$16.class   OK
    testing: org/jboss/logmanager/Logger$AttachmentKey.class   OK
    testing: org/jboss/logmanager/ExtFormatter.class   OK
    testing: org/jboss/logmanager/LogManager$ReadOnlyHashMap.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$ValueIterator.class   OK
    testing: org/jboss/logmanager/CallerClassLoaderLogContextSelector$2.class   OK
    testing: org/jboss/logmanager/handlers/PeriodicRotatingFileHandler$1.class   OK
    testing: org/jboss/logmanager/handlers/UncloseableOutputStream.class   OK
    testing: org/jboss/logmanager/ConfigurationLocator.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap.class   OK
    testing: org/jboss/logmanager/WrappedExtLogRecord.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl$7.class   OK
    testing: org/jboss/logmanager/config/ErrorManagerConfigurationImpl.class   OK
    testing: org/jboss/logmanager/config/PojoConfiguration.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl$3.class   OK
    testing: org/jboss/logmanager/config/HandlerConfiguration.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$1.class   OK
    testing: org/jboss/logmanager/filters/LevelChangingFilter.class   OK
    testing: org/jboss/logmanager/LogContext.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$21.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$Segment.class   OK
    testing: org/jboss/logmanager/ExtLogRecord$FormatStyle.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$KeyIterator.class   OK
    testing: META-INF/maven/org.jboss.logmanager/jboss-logmanager/pom.properties   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$KeyReference.class   OK
    testing: org/jboss/logmanager/LogManager$1.class   OK
    testing: org/jboss/logmanager/LogContext$StrongLevelRef.class   OK
    testing: org/jboss/logmanager/handlers/ConsoleHandler$1.class   OK
    testing: org/jboss/logmanager/handlers/ConsoleHandler.class   OK
    testing: org/jboss/logmanager/handlers/SyslogHandler$Facility.class   OK
    testing: org/jboss/logmanager/ClassLoaderLogContextSelector$2.class   OK
    testing: org/jboss/logmanager/Logger.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$HashIterator.class   OK
    testing: org/jboss/logmanager/config/ValueExpression$Resolver.class   OK
    testing: org/jboss/logmanager/config/AbstractPropertyConfiguration$3.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$9.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$3.class   OK
    testing: org/jboss/logmanager/config/ErrorManagerConfiguration.class   OK
    testing: org/jboss/logmanager/config/LogContextConfigurationImpl$2.class   OK
    testing: org/jboss/logmanager/filters/RegexFilter.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$17.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$25.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$8.class   OK
    testing: org/jboss/logmanager/Configurator.class   OK
    testing: org/jboss/logmanager/NDC$Holder.class   OK
    testing: org/jboss/logmanager/AtomicArray.class   OK
    testing: org/jboss/logmanager/ExtLogRecord.class   OK
    testing: org/jboss/logmanager/LogManager$KnownLevelBuilder.class   OK
    testing: org/jboss/logmanager/handlers/AsyncHandler$AsyncTask.class   OK
    testing: org/jboss/logmanager/handlers/Handlers.class   OK
    testing: org/jboss/logmanager/LogService.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$WeakValueReference.class   OK
    testing: org/jboss/logmanager/config/FormatterConfigurationImpl.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl$1.class   OK
    testing: org/jboss/logmanager/config/AbstractPropertyConfiguration$1.class   OK
    testing: org/jboss/logmanager/config/ValueExpressionImpl.class   OK
    testing: org/jboss/logmanager/config/AbstractPropertyConfiguration$5.class   OK
    testing: org/jboss/logmanager/config/HandlerContainingConfigurable.class   OK
    testing: org/jboss/logmanager/config/ObjectProducer.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$4.class   OK
    testing: org/jboss/logmanager/filters/LevelFilter.class   OK
    testing: org/jboss/logmanager/filters/AllFilter.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$7.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$2.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$JustifyingFormatStep.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$3.class   OK
    testing: org/jboss/logmanager/formatters/PatternFormatter.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$12.class   OK
    testing: org/jboss/logmanager/LogManager$ReadOnlyMapEntry.class   OK
    testing: org/jboss/logmanager/Level.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap.class   OK
    testing: org/jboss/logmanager/NDC$Stack.class   OK
    testing: org/jboss/logmanager/ExtHandler.class   OK
    testing: org/jboss/logmanager/LoggingMXBeanImpl.class   OK
    testing: org/jboss/logmanager/ClassLoaderLogContextSelector.class   OK
    testing: org/jboss/logmanager/handlers/UninterruptibleOutputStream.class   OK
    testing: org/jboss/logmanager/handlers/SyslogHandler$SyslogType.class   OK
    testing: org/jboss/logmanager/CopyOnWriteWeakMap.class   OK
    testing: org/jboss/logmanager/LogManager$ReadOnlyArrayList$2.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$Values.class   OK
    testing: org/jboss/logmanager/LogContextSelector.class   OK
    testing: org/jboss/logmanager/config/PojoConfigurationImpl.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$7.class   OK
    testing: org/jboss/logmanager/config/RefProducer.class   OK
    testing: org/jboss/logmanager/config/PropertyConfigurable.class   OK
    testing: org/jboss/logmanager/config/FilterConfigurationImpl.class   OK
    testing: org/jboss/logmanager/config/AbstractBasicConfiguration$1.class   OK
    testing: org/jboss/logmanager/filters/AnyFilter.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$20.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$22.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$1.class   OK
    testing: org/jboss/logmanager/formatters/FormatStringParser.class   OK
    testing: org/jboss/logmanager/formatters/Formatters.class   OK
    testing: org/jboss/logmanager/LogManager$LocalFilterHolder.class   OK
    testing: org/jboss/logmanager/NDC.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$WeakKeyReference.class   OK
    testing: org/jboss/logmanager/errormanager/OnlyOnceErrorManager.class   OK
    testing: org/jboss/logmanager/LogContext$2.class   OK
    testing: org/jboss/logmanager/handlers/Handlers$2.class   OK
    testing: org/jboss/logmanager/handlers/NullHandler.class   OK
    testing: org/jboss/logmanager/handlers/OutputStreamHandler.class   OK
    testing: org/jboss/logmanager/handlers/ByteStringBuilder.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$1.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$KeyIterator.class   OK
    testing: org/jboss/logmanager/CopyOnWriteWeakMap$1.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$ReferenceType.class   OK
    testing: org/jboss/logmanager/LoggingUncaughtExceptionHandler.class   OK
    testing: org/jboss/logmanager/ThreadLocalLogContextSelector.class   OK
    testing: org/jboss/logmanager/Protectable.class   OK
    testing: org/jboss/logmanager/config/LogContextConfigurationImpl$1.class   OK
    testing: org/jboss/logmanager/config/LogContextConfiguration$Factory.class   OK
    testing: org/jboss/logmanager/config/LogContextConfiguration.class   OK
    testing: org/jboss/logmanager/config/AbstractPropertyConfiguration.class   OK
    testing: org/jboss/logmanager/config/AbstractPropertyConfiguration$4.class   OK
    testing: org/jboss/logmanager/config/SimpleObjectProducer.class   OK
    testing: org/jboss/logmanager/LogManager.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$SegmentedFormatStep.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$26.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$13.class   OK
    testing: org/jboss/logmanager/formatters/StackTraceFormatter$2.class   OK
    testing: org/jboss/logmanager/SerializedLogger.class   OK
    testing: org/jboss/logmanager/CallerClassLoaderLogContextSelector.class   OK
    testing: META-INF/INDEX.LIST      OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$Values.class   OK
    testing: org/jboss/logmanager/ClassLoaderLogContextSelector$1.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$SimpleEntry.class   OK
    testing: org/jboss/logmanager/handlers/CountingOutputStream.class   OK
    testing: org/jboss/logmanager/handlers/PeriodicRotatingFileHandler$Period.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$Segment.class   OK
    testing: org/jboss/logmanager/LogContextSelectorService.class   OK
    testing: org/jboss/logmanager/LoggerNode.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl$2.class   OK
    testing: org/jboss/logmanager/config/FormatterConfiguration.class   OK
    testing: org/jboss/logmanager/config/ValueExpression$3.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl$4.class   OK
    testing: org/jboss/logmanager/config/LoggerConfiguration.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$5.class   OK
    testing: org/jboss/logmanager/formatters/StackTraceFormatter$1.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$14$1.class   OK
    testing: org/jboss/logmanager/formatters/FormatStep.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$KeySet.class   OK
    testing: org/jboss/logmanager/CallerClassLoaderLogContextSelector$Gateway.class   OK
    testing: org/jboss/logmanager/LogManager$ReadOnlyArrayList$1.class   OK
    testing: org/jboss/logmanager/ContextClassLoaderLogContextSelector$1.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$SimpleEntry.class   OK
    testing: org/jboss/logmanager/handlers/AsyncHandler$1.class   OK
    testing: org/jboss/logmanager/handlers/PeriodicRotatingFileHandler.class   OK
    testing: org/jboss/logmanager/handlers/PeriodicSizeRotatingFileHandler.class   OK
    testing: org/jboss/logmanager/handlers/AsyncHandler.class   OK
    testing: org/jboss/logmanager/MDC.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$FastCopyHashMapIterator.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl.class   OK
    testing: org/jboss/logmanager/config/ConfigAction.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl$8.class   OK
    testing: org/jboss/logmanager/config/ValueExpression$2.class   OK
    testing: org/jboss/logmanager/filters/DenyAllFilter.class   OK
    testing: org/jboss/logmanager/filters/SubstituteFilter.class   OK
    testing: org/jboss/logmanager/ExtLogRecord$1.class   OK
    testing: org/jboss/logmanager/formatters/StackTraceFormatter.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$9.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$5$1.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$23.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$11.class   OK
    testing: org/jboss/logmanager/MDC$Holder.class   OK
    testing: META-INF/maven/org.jboss.logmanager/jboss-logmanager/pom.xml   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$ValueIterator.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$HashEntry.class   OK
    testing: org/jboss/logmanager/MDC$1.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$EntrySet.class   OK
    testing: org/jboss/logmanager/handlers/AsyncHandler$OverflowAction.class   OK
    testing: org/jboss/logmanager/handlers/SyslogHandler$Protocol.class   OK
    testing: org/jboss/logmanager/handlers/FileHandler.class   OK
    testing: org/jboss/logmanager/FastCopyHashMap$EntryIterator$WriteThroughEntry.class   OK
    testing: org/jboss/logmanager/config/LogContextConfigurationImpl$4.class   OK
    testing: org/jboss/logmanager/config/ObjectConfigurable.class   OK
    testing: org/jboss/logmanager/config/FilterConfiguration.class   OK
    testing: org/jboss/logmanager/config/AbstractPropertyConfiguration$ConstructAction.class   OK
    testing: org/jboss/logmanager/config/LoggerConfigurationImpl$6.class   OK
    testing: org/jboss/logmanager/config/LogContextConfigurationImpl.class   OK
    testing: org/jboss/logmanager/filters/AcceptAllFilter.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$10.class   OK
    testing: org/jboss/logmanager/ContextClassLoaderLogContextSelector.class   OK
    testing: org/jboss/logmanager/PropertyConfigurator.class   OK
    testing: org/jboss/logmanager/ConcurrentReferenceHashMap$WriteThroughEntry.class   OK
    testing: org/jboss/logmanager/handlers/FlushableCloseable.class   OK
    testing: org/jboss/logmanager/handlers/UdpOutputStream.class   OK
    testing: org/jboss/logmanager/handlers/TcpOutputStream$1.class   OK
    testing: org/jboss/logmanager/handlers/QueueHandler.class   OK
    testing: org/jboss/logmanager/DefaultConfigurationLocator.class   OK
    testing: org/jboss/logmanager/CopyOnWriteWeakMap$Node.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$10.class   OK
    testing: org/jboss/logmanager/config/HandlerConfigurationImpl$6.class   OK
    testing: org/jboss/logmanager/config/ValueExpression$4.class   OK
    testing: org/jboss/logmanager/config/AbstractPropertyConfiguration$2.class   OK
    testing: org/jboss/logmanager/ClassLoaderLogContextSelector$Gateway.class   OK
    testing: org/jboss/logmanager/formatters/MultistepFormatter.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$14.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$19.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$4.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$27.class   OK
    testing: org/jboss/logmanager/formatters/Formatters$15.class   OK
    testing: org/jboss/logmanager/CopyOnWriteWeakMap$Queue.class   OK
No errors detected in compressed data of /opt/jboss/jboss-eap/modules_bkp/system/layers/base/.overlays/layer-base-jboss-eap-7.1.6.CP/org/jboss/logmanager/main/jboss-logmanager-2.0.11.Final-redhat-00001.jar.
[root@sbrdeapllx104 servers]#
