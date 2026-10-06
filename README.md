
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# grep -n -B20 -A3 "<keepParamName" $X | grep -E "keepParamName|elementPath|extractFrom|regex|Header|cookie"
243-              <cookies type="string"/>
261:                          <keepParamName type="string">SESSIONID</keepParamName>
306:                          <keepParamName type="string">TOKEN</keepParamName>
588-              <cookies type="string">{{SESSIONID}}</cookies>
604:                          <keepParamName type="string">CREDENCIAL</keepParamName>
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# grep -n "SESSIONID" $X
261:                          <keepParamName type="string">SESSIONID</keepParamName>
461:              <cookies type="string">{{SESSIONID}}</cookies>
588:              <cookies type="string">{{SESSIONID}}</cookies>
758:              <cookies type="string">{{SESSIONID}}</cookies>
1197:          <name type="string">SESSIONID</name>
1236:      <name type="string">SESSIONID</name>
[root@caddeapllx2695 tmp]#
