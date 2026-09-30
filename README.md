1. Details

Name: SIFEC-CCR-EAP7-JDK8
Description: REQ000146318691 - Cenário 1: JBoss EAP 7 mantendo Java 8

2. Add applications: upload do SIFEC-CCR.ear.

3. Set transformation target: selecione só o card Application server migration → JBoss EAP 7.

Select packages: deixe o padrão, mas confira se br.gov.caixa está marcado. Libs de terceiros (hibernate, jackson etc.) podem ficar de fora, senão o relatório incha e demora.

4. Advanced → Options: se houver campo source, informe eap6 (ou java-ee). O resto pode ficar como está.

5. Review → Save and run.

Depois repita tudo para o cenário 2:

Name: SIFEC-CCR-EAP7-JDK17
Targets: JBoss EAP 7 + OpenJDK 17. Se o card OpenJDK tiver seletor de versão, escolha 17.

Opcional, enquanto roda: veja o que muda entre os dois EARs, porque isso já adianta a análise da REQ de parâmetros:

powershell
cd $env:USERPROFILE\Downloads
Compare-Object (tar -tf SIFEC-CCR.ear) (tar -tf sifec-ccr-parametros.ear)
