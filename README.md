
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# X=/opt/ctmage/ctm/cm/AI/apps-repo/IIFX/IIFX.xml
grep -n "<name type=\"string\">" $X | head -10
sed -n '300,480p' $X | grep -inE "<name|extractFrom|SESSIONID|TOKEN|regex|startsWith|endsWith|Set-Cookie|cookie|paramName|expression|jsonPath" | grep -v client_secret
149:              <name type="string">Proxy</name>
363:              <name type="string">Gerar token</name>
491:              <name type="string">Login no Beyond Trust</name>
660:              <name type="string">Obter credencial</name>
780:              <name type="string">Logout no Beyond Trust</name>
882:              <name type="string">Executar job</name>
1079:          <name type="string">Sistema</name>
1094:          <name type="string">URL</name>
1107:          <name type="string">CLIENTID</name>
1120:          <name type="string">SECRET</name>
7:                          <keepParamName type="string">TOKEN</keepParamName>
25:                  <elementPath type="string">access_token</elementPath>
26:                  <extractFrom type="string">BODY</extractFrom>
64:              <name type="string">Gerar token</name>
95:                  <oauth2tokenParamName type="string"/>
117:              <restURLPath type="string">/BeyondTrust/api/public/v3/auth/connect/token</restURLPath>
118:              <setCookie type="boolean">false</setCookie>
162:              <cookies type="string">{{SESSIONID}}</cookies>
165:              <headers type="string">Authorization=Bearer {{TOKEN}}&amp;Content-Type=application/json&amp;Accept=application/json</headers>
169:                  <value type="string">Bearer {{TOKEN}}</value>
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
