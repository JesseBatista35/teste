
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# unzip -l /tmp/bkp_sirotcon/sirotcon-ejb.jar | grep -i "br/gov/caixa/log"
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]#
[root@caddeapllx955 p585600]# cd /tmp && rm -rf earchk && mkdir earchk && cd earchk
unzip -l /opt/jboss-eap/standalone/deployments/sigsj_intranet-ear.ear | grep -iE "sirot|log|\.war"
unzip -o -q /opt/jboss-eap/standalone/deployments/sigsj_intranet-ear.ear sigsj_intranet.war
unzip -l sigsj_intranet.war | grep -iE "WEB-INF/lib/.*(sirot|log|cef|caixa)"
 48722588  10-22-2026 15:16   sigsj_intranet.war
  3143386  10-22-2026 15:16   sigsjintrastatic.war
    60686  10-20-2026 17:29   WEB-INF/lib/commons-logging-1.1.1.jar
   111209  10-21-2026 14:51   WEB-INF/lib/sirotcon-ejb-lib-2.3.0.2-farm.jar
   449964  10-22-2026 15:16   WEB-INF/lib/sirotcon-ejb-2.3.0.1-farm.jar
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#
[root@caddeapllx955 earchk]#


<?xml version="1.0" encoding="UTF-8"?>

<jboss-deployment-structure xmlns="urn:jboss:deployment-structure:1.2">

    <ear-subdeployments-isolated>false</ear-subdeployments-isolated>

    <deployment>

        <exclusions>
            <module name="javax.faces.api" />
            <module name="com.sun.jsf-impl" />
            <module name="org.jboss.as.jsf" />
            <module name="org.jboss.as.jsf-integration" />
        </exclusions>

    </deployment>

    <sub-deployment name="sigsj_intranet.war">
        <exclusions>
            <module name="javax.faces.api" />
            <module name="com.sun.jsf-impl" />
            <module name="org.jboss.as.jsf" />
            <module name="org.jboss.as.jsf-integration" />
        </exclusions>
    </sub-deployment>

</jboss-deployment-structure>


Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SIGSJ-intranet
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
SIGSJ-intranet

.settings
.vscode
sigsj_intranet-ear
.settings
org.eclipse.core.resources.prefs
org.eclipse.m2e.core.prefs
org.eclipse.wst.common.project.facet.core.xml
org.eclipse.wst.validation.prefs
META-INF
application.xml
jboss-deployment-structure.xml
.project
pom.xml
sigsj_intranet-static
.settings
src
main
webapp
arquivos
imagens
javascript
stylesheet
index.html
.project
pom.xml
sigsj_intranet-war
.settings
RSA
src
.project
.tern-project
build_desenv.properties

merge-develop

/
sigsj_intranet-ear
/
META-INF
/
jboss-deployment-structure.xml
jboss-deployment-structure.xml

Edit

Contents
History
Compare
Blame

123456789101112131415161718192021222324252627
<?xml version="1.0" encoding="UTF-8"?>

<jboss-deployment-structure xmlns="urn:jboss:deployment-structure:1.2">

    <ear-subdeployments-isolated>false</ear-subdeployments-isolated>

    <deployment>

        <exclusions>
            <module name="javax.faces.api" />
…            <module name="com.sun.jsf-impl" />
            <module name="org.jboss.as.jsf" />
            <module name="org.jboss.as.jsf-integration" />
        </exclusions>
    </sub-deployment>

</jboss-deployment-structure>
