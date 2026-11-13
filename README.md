1. Na 471 (root): a 6.3.0, que está ativa no 7.4

Primeiro, veja o nome exato do WAR da API dentro do EAR:

unzip -l /opt/jboss/jboss-eap/dc/data/content/e6/ed64ba9ddcbc4ef402e34a524d7018581eed75/content | grep -i "\.war"

Se aparecer ccr-api.war, rode:

unzip -p /opt/jboss/jboss-eap/dc/data/content/e6/ed64ba9ddcbc4ef402e34a524d7018581eed75/content ccr-api.war > /tmp/ccr-api-630.war && unzip -p /tmp/ccr-api-630.war WEB-INF/web.xml | grep -nE "url-pattern|auth-method|realm-name|role-name|security-constraint|http-method"
2. No 6.4 (10.116.88.20): a 6.5.0, do intranet5

Primeiro, localize o arquivo do pacote:

S=$(sudo grep -A1 'deployment name="SIFEC-CCR5"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -o 'sha1="[^"]*"' | head -1 | cut -d'"' -f2); F=/opt/jboss/jboss-eap/dc/data/content/${S:0:2}/${S:2}/content; echo $F; sudo ls -l $F

Depois, na mesma sessão, extraia o web.xml:

sudo unzip -p $F ccr-api.war > /tmp/ccr-api-650.war && unzip -p /tmp/ccr-api-650.war WEB-INF/web.xml | grep -nE "url-pattern|auth-method|realm-name|role-name|security-constraint|http-method"

Me manda as duas saídas. Se as URLs protegidas forem diferentes (por exemplo, o /v8/* protegido na 6.3 e liberado na 6.5), está confirmado que basta atualizar a versão.



[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]# unzip -l /opt/jboss/jboss-eap/dc/data/content/e6/ed64ba9ddcbc4ef402e34a524d7018581eed75/content | grep -i "\.war"
 16044112  10-29-2026 09:55   ccr-api.war
 13051574  10-29-2026 09:55   ccr-web.war
[root@cbrdeapllx471 p585600]#


[root@cbrdeapllx471 p585600]# unzip -p /opt/jboss/jboss-eap/dc/data/content/e6/ed64ba9ddcbc4ef402e34a524d7018581eed75/content ccr-api.war > /tmp/ccr-api-630.war && unzip -p /tmp/ccr-api-630.war WEB-INF/web.xml | grep -nE "url-pattern|auth-method|realm-name|role-name|security-constraint|http-method"
58:             <url-pattern>/credito-consignado/*</url-pattern>
64:             <url-pattern>/credito-consignado/*</url-pattern>
71:             <role-name>uma_authorization</role-name>
75:             <role-name>FEC_CANAL_TOKEN_SERVICO</role-name>
80:             <role-name>FEC0100</role-name>
84:             <role-name>FEC0101</role-name>
88:             <role-name>FEC0102</role-name>
92:             <role-name>FEC0103</role-name>
96:             <role-name>FEC0109</role-name>
100:    <!-- <security-constraint>
104:                    <url-pattern>/credito-consignado/*</url-pattern>
105:                    <http-method>GET</http-method>
106:                    <http-method>POST</http-method>
110:                    <role-name>uma_authorization</role-name>
111:                    <role-name>FEC_CANAL_TOKEN_SERVICO</role-name>
112:                    <role-name>FEC0100</role-name>
113:                    <role-name>FEC0101</role-name>
114:                    <role-name>FEC0102</role-name>
115:                    <role-name>FEC0103</role-name>
116:                    <role-name>FEC0109</role-name>
118:    </security-constraint> -->
120:    <!-- <security-constraint>
124:                    <url-pattern>/credito-consignado/swagger.json</url-pattern>
125:                    <http-method>GET</http-method>
126:                    <http-method>POST</http-method>
128:    </security-constraint> -->
130:    <security-constraint>
134:                    <url-pattern>/credito-consignado/callback/v1/serpro/*</url-pattern>
135:                    <http-method>GET</http-method>
136:                    <http-method>POST</http-method>
138:    </security-constraint>
140:    <security-constraint>
144:                    <url-pattern>/credito-consignado/mock/*</url-pattern>
145:                    <http-method>GET</http-method>
146:                    <http-method>POST</http-method>
147:                    <http-method>DELETE</http-method>
148:                    <http-method>PUT</http-method>
150:    </security-constraint>
152:    <security-constraint>
156:                    <url-pattern>/credito-consignado/teste/*</url-pattern>
157:                    <http-method>GET</http-method>
158:                    <http-method>POST</http-method>
160:    </security-constraint>
162:    <!-- <security-constraint>
166:                    <url-pattern>/credito-consignado/v1/convenios</url-pattern>
167:                    <http-method>GET</http-method>
170:                    <role-name>FEC0103</role-name>
171:                    <role-name>FEC0109</role-name>
173:    </security-constraint>
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#
[root@cbrdeapllx471 p585600]#




-sh-4.1$ S=$(sudo grep -A1 'deployment name="SIFEC-CCR5"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -o 'sha1="[^"]*"' | head -1 | cut -d'"' -f2); F=/opt/jboss/jboss-eap/dc/data/content/${S:0:2}/${S:2}/content; echo $F; sudo ls -l $F
/opt/jboss/jboss-eap/dc/data/content/e5/97cd8c20fc21761b250dd9c70fd5ead5b2044b/content
-rw-rw-r-- 1 jboss jboss 77302605 Nov 10 17:01 /opt/jboss/jboss-eap/dc/data/content/e5/97cd8c20fc21761b250dd9c70fd5ead5b2044b/content
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ sudo unzip -p $F ccr-api.war > /tmp/ccr-api-650.war && unzip -p /tmp/ccr-api-650.war WEB-INF/web.xml | grep -nE "url-pattern|auth-method|realm-name|role-name|security-constraint|http-method"
58:             <url-pattern>/credito-consignado/*</url-pattern>
64:             <url-pattern>/credito-consignado/*</url-pattern>
71:             <role-name>uma_authorization</role-name>
75:             <role-name>FEC_CANAL_TOKEN_SERVICO</role-name>
80:             <role-name>FEC0100</role-name>
84:             <role-name>FEC0101</role-name>
88:             <role-name>FEC0102</role-name>
92:             <role-name>FEC0103</role-name>
96:             <role-name>FEC0109</role-name>
100:    <!-- <security-constraint>
104:                    <url-pattern>/credito-consignado/*</url-pattern>
105:                    <http-method>GET</http-method>
106:                    <http-method>POST</http-method>
110:                    <role-name>uma_authorization</role-name>
111:                    <role-name>FEC_CANAL_TOKEN_SERVICO</role-name>
112:                    <role-name>FEC0100</role-name>
113:                    <role-name>FEC0101</role-name>
114:                    <role-name>FEC0102</role-name>
115:                    <role-name>FEC0103</role-name>
116:                    <role-name>FEC0109</role-name>
118:    </security-constraint> -->
120:    <!-- <security-constraint>
124:                    <url-pattern>/credito-consignado/swagger.json</url-pattern>
125:                    <http-method>GET</http-method>
126:                    <http-method>POST</http-method>
128:    </security-constraint> -->
130:    <security-constraint>
134:                    <url-pattern>/credito-consignado/callback/v1/serpro/*</url-pattern>
135:                    <http-method>GET</http-method>
136:                    <http-method>POST</http-method>
138:    </security-constraint>
140:    <security-constraint>
144:                    <url-pattern>/credito-consignado/mock/*</url-pattern>
145:                    <http-method>GET</http-method>
146:                    <http-method>POST</http-method>
147:                    <http-method>DELETE</http-method>
148:                    <http-method>PUT</http-method>
150:    </security-constraint>
152:    <security-constraint>
156:                    <url-pattern>/credito-consignado/teste/*</url-pattern>
157:                    <http-method>GET</http-method>
158:                    <http-method>POST</http-method>
160:    </security-constraint>
162:    <!-- <security-constraint>
166:                    <url-pattern>/credito-consignado/v1/convenios</url-pattern>
167:                    <http-method>GET</http-method>
170:                    <role-name>FEC0103</role-name>
171:                    <role-name>FEC0109</role-name>
173:    </security-constraint>
-sh-4.1$
-sh-4.1$
-sh-4.1$
