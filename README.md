Beleza!
 
Precisava atualizar essa lista, para saber como estamos:
 
 
Módulo / pacote do inventário
	
Semáforo
	
Situação


SIFEC sifec-2.160.1.0.ear
	
🟢
	
O inventário já registrava teste do desenvolvedor. Hoje houve nova implantação doSIFEC 2.161.2.0, concluída com WFLYSRV0010, portanto o núcleo SIFEC está operacional no 7.4.


SICCR-PARÂMETROS sifec-ccr-parametros-3.3.1.1.ear
	
🟢
	
Implantado com sucesso. API respondendo e versão 3.3.1.1 confirmada. O front é acessado pelo menu Serviços > Tributos do SIFEC.


SICDT-FEC sifec-cdt-3.24.1.ear
	
🟢
	
Evoluiu para build 3.24.3.004. Redeploy concluído; web/API publicados. Houve teste de download PDF/CSV com sucesso e a build foi indicada como estável.


SICCR-PJ workflow-credito-pj-ear-8.40.1.ear
	
🟢
	
Já estava marcado como testado no inventário. No chat também aparece como "no ar e funcionando", inclusive perfil e lista de clientes.


HUB-WEB / SICCR-HUB-FRONTEND hub-web-ear-1.10.0.1.ear
	
🟡
	
Deploy concluído e /hub-web/ responde/redireciona para login. Porém funcionalidades dependentes do HUB-API continuam comprometidas.


SIBAN-MCM mcm-ear-1.0.1.23.ear
	
🟡
	
Versão da planilha implantada e datasource corrigido; ficoupronto para validação, mas não encontrei confirmação posterior de teste funcional


SIFEC-EMP sifec-emp-3.96.2.0.ear
	
🔴
	
Continua com necessidade de novo build devido ao CDI/WELD-001408


SIFEC-EMPRESAS sifec-empresas_TAS000022539216..ear
	
🔴
	
Inventário registra necessidade de correção CDI/WELD-001408. Ainda não encontrei confirmação de que o build corrigido tenha sido implantado e validado.


SIFEC-RURAL sifec-rural-2.115.1.0.ear
	
🔴
	
Continua dependendo de build compatível com JBoss 7.4, especialmente Jackson/RESTEasy provided.


SIRUR sifec-sirur-3.54.51.28.ear
	
🔴
	
Houve várias correções e build 3.55.51.02, mas o deploy de hoje ainda foi interrompido por @PersistenceContext referenciando entityManagerFactory. Portanto aindanão sobe.


LCR sifec_lcr_1.117.1.ear
	
🔴
	
O pacote correto finalmente foi implantado hoje às 14:59, mas o deploy foi revertido. Há erros CDI/WELD e incompatibilidade do SecurityInterceptor com RESTEasy do JBoss 7.4.


HUB-API hub-api-ear-2.2.0.ear
	
🔴
	
Deploy revertido. HUB-PU falha por named query usando parâmetro legado ?, incompatível com Hibernate do 7.4.


SIFEC-APX sifec-apx-1.7.9.4.ear
	
⚪
	
Consta no inventário e chegou a aparecer como próximo da fila, mas não há confirmação suficiente de funcionamento.


SIFEC-ARC sifec-arc.ear
	
⚪
	
Consta no inventário e estava entre os próximos da lista, sem validação conclusiva encontrada


SIFEC-BAN sifec-ban-1.7.0.ear
	
⚪
	
Sem evidência conclusiva localizada de deploy + teste funcional.


SICCR-BDCAIXA
	
🟡
	
O chat confirma que estava implantado no ambiente, mas não localizei validação funcional conclusiva.


SIFEC-BNDES sifec-bndes-1.0.4.2.ear
	
⚪
	
Sem evidência conclusiva de funcionamento.


SIFEC-CCR sifec-ccr-6.4.0.ear
	
🟡
	
Consta como implantado no ambiente, mas não encontrei validação funcional suficiente para colocar verde.


CONSTRUCARD sifec-construcard-1.23.1.2.ear
	
⚪
	
Sem evidência conclusiva de funcionamento.


SIFEC-FBN sifec-fbn-1.4.0.ear
	
⚪
	
Sem evidência conclusiva.


SIFEC-GARANTIAS sifec-garantias-1.8.0.3.ear
	
⚪
	
Sem confirmação suficiente de teste no 7.4.


MANTER DOCUMENTO sifec-manterdocumento-2.2.7.ear
	
⚪
	
Sem evidência conclusiva.


MINUTA GARANTIAS
	
🟡
	
O consolidado registra SIFEC-MINUTAS-FRONT implantado, porém não encontrei validação funcional posterior suficiente para verde.


SIFEC-ORIGINAÇÃO sifec-originacao-3.11.1.ear
	
⚪
	
Sem confirmação conclusiva de deploy/teste. 
 



 O que já avançamos dessa lista?
 
