aaah calmae, agora entendi o q vc tá falando
 
vdd, os scripts estão desabilitados desde junho
 
tô habilitando aqui, conforme for se der algum BO me avise pf
 
 
entao
 
eu fiz na draft. 
 
ai ele da erro de PKIX
 
Jesse Mouta Pereira Batista
eu fiz na draft.
fiz um teste onde estão habilitadas. 
 
ué
 
ERROR: SonarQube server [https://sonar.apps.produtos4.caixa] can not be reached Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target
 
tá dizendo q eu desabilitei isso em junho por conta de uma falha do elastic em Junho
 
 
Jesse Mouta Pereira Batista
ERROR: SonarQube server [ https://sonar.apps.produtos4.caixa] can not be reached Caused by: javax.net.ssl.SSLHandshakeException: PKIX path building failed: sun.security.provider.certpath.SunCertPathB…
mmmmmm 
 
o sonar ta eh https há séculos , estranho isso ... antes de 23 de junho tava ativa a task
 
vou testar aqui novamente
 
Pipelines - Run 1.3.0.27 logs
execução de maio 
 
aqui aparentemente "passou" 
 
Belza
 
tá certo que ... 
aqui pelo visto o redirect automático de rede ainda n tava rolando pro https
 
pode ser que pooooooooo isso, essa execução de maio tenha passado
 
e na sua draft , esteja tomando falha ... 
 
sim verdade
 
vou desativar de novo essas tasks ^^ pq certamente vai falhar, esse assunto do Sonar com https é antiiiiiiigo
 
kkk
 
com dotnet não funcionou como previsto
 
tem até um chat antigo disso
 
sim, vai quebrar tudo. 
 
pq como v pode ver ... o plugin do sonar é diferente pro dotnet, n funciona igual ao java ... foi uma merda isso no passado e esse assunto morreu
 
saquei
 
vou montar aqui um texto para responder a .w.o
 
