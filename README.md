[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# sed -n '480,860p' $X | grep -inE "<name|restURLPath|header|cookie|SESSIONID|TOKEN|authoriz|extract" | grep -v "client_secret"
12:              <name type="string">Login no Beyond Trust</name>
36:                  <oauth2APIAuthorizationEndpoint type="string"/>
43:                  <oauth2tokenParamName type="string"/>
48:                  <oauthHeaders type="string"/>
49:                  <oauthHeadersCheck type="boolean">false</oauthHeadersCheck>
50:                  <oauthHeadersPairs class="array"/>
65:              <restURLPath type="string">/BeyondTrust/api/public/v3/Auth/SignAppin</restURLPath>
66:              <setCookie type="boolean">true</setCookie>
77:              <useWsHeaderTableParameter type="boolean">false</useWsHeaderTableParameter>
79:              <wsHeaderTableParameter type="string"/>
96:              <WSheaders type="string"/>
109:              <cookies type="string">{{SESSIONID}}</cookies>
111:              <extractInfo class="array">
112:                <extractInfoElement class="object">
117:                      <doOption type="string">extract</doOption>
120:                        <extractData class="object">
123:                          <keepExtracted type="boolean">true</keepExtracted>
128:                        </extractData>
143:                  <extractFrom type="string">BODY</extractFrom>
156:                </extractInfoElement>
157:              </extractInfo>
158:              <headers type="string">Content-Type=application/json&amp;Accept=application/json</headers>
159:              <headersPairs class="array">
160:                <headersPairsElement class="object">
163:                </headersPairsElement>
164:                <headersPairsElement class="object">
167:                </headersPairsElement>
168:              </headersPairs>
181:              <name type="string">Obter credencial</name>
205:                  <oauth2APIAuthorizationEndpoint type="string"/>
212:                  <oauth2tokenParamName type="string"/>
217:                  <oauthHeaders type="string"/>
218:                  <oauthHeadersCheck type="boolean">false</oauthHeadersCheck>
219:                  <oauthHeadersPairs class="array"/>
234:              <restURLPath type="string">/BeyondTrust/api/public/v3/Secrets-Safe/Secrets?FolderPath={{FOLDER}}</restURLPath>
235:              <setCookie type="boolean">true</setCookie>
246:              <useWsHeaderTableParameter type="boolean">false</useWsHeaderTableParameter>
248:              <wsHeaderTableParameter type="string"/>
265:              <WSheaders type="string"/>
279:              <cookies type="string">{{SESSIONID}}</cookies>
281:              <extractInfo class="array"/>
282:              <headers type="string">Content-Type=application/json</headers>
283:              <headersPairs class="array">
284:                <headersPairsElement class="object">
287:                </headersPairsElement>
288:              </headersPairs>
301:              <name type="string">Logout no Beyond Trust</name>
325:                  <oauth2APIAuthorizationEndpoint type="string"/>
332:                  <oauth2tokenParamName type="string"/>
337:                  <oauthHeaders type="string"/>
338:                  <oauthHeadersCheck type="boolean">false</oauthHeadersCheck>
339:                  <oauthHeadersPairs class="array"/>
354:              <restURLPath type="string">/BeyondTrust/api/public/v3/Auth/Signout</restURLPath>
355:              <setCookie type="boolean">true</setCookie>
366:              <useWsHeaderTableParameter type="boolean">false</useWsHeaderTableParameter>
368:              <wsHeaderTableParameter type="string"/>
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]#
