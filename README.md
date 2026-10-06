
[root@caddeapllx2695 tmp]#
[root@caddeapllx2695 tmp]# sed -n '245,300p' $X | grep -vE "^\s*$" | grep -v client_secret
              <extractInfo class="array">
                <extractInfoElement class="object">
                  <cdataPath type="string"/>
                  <cdataop type="string">any</cdataop>
                  <doSection class="array">
                    <doSectionElement class="object">
                      <doOption type="string">extract</doOption>
                      <extHandleData class="object">
                        <colNum type="string">1</colNum>
                        <colSperator type="string">;</colSperator>
                        <extOption type="string">column</extOption>
                        <extractData class="object">
                          <cdataElem type="string">wholeElm</cdataElem>
                          <cdataPath type="string"/>
                          <keepExtracted type="boolean">true</keepExtracted>
                          <keepParamEncrypt type="boolean">true</keepParamEncrypt>
                          <keepParamName type="string">SESSIONID</keepParamName>
                          <operator type="string">eq</operator>
                          <value type="string"/>
                        </extractData>
                        <fileName type="string"/>
                        <pattern type="string"/>
                        <previewLine type="string">ASP.NET_SessionId=o0fyuf3is2o0354v1wdynfhl; path=/; secure; HttpOnly; SameSite=Lax;</previewLine>
                        <rmvBlanks type="boolean">false</rmvBlanks>
                        <searchForTextEnd type="string"/>
                        <searchForTextEndIndex class="object"/>
                        <searchForTextStart type="string"/>
                        <searchForTextStartIndex type="number">0</searchForTextStartIndex>
                        <siblingElem type="string"/>
                      </extHandleData>
                      <uid type="string">0.41187127717819527</uid>
                    </doSectionElement>
                  </doSection>
                  <elementName type="string">Set-Cookie</elementName>
                  <elementPath type="string"/>
                  <extractFrom type="string">HEADER</extractFrom>
                  <httpCode type="string">successful</httpCode>
                  <httpCodeOther type="string"/>
                  <onOption type="string">start</onOption>
                  <onOptionVal type="string"/>
                  <onSection class="array"/>
                  <onSectionOperator type="string">and</onSectionOperator>
                  <operator type="string">any</operator>
                  <resElement type="string"/>
                  <secValue type="string"/>
                  <uid type="string">0.7615633508804065</uid>
                  <value type="string"/>
                </extractInfoElement>
                <extractInfoElement class="object">
                  <cdataPath type="string"/>
                  <cdataop type="string">any</cdataop>
                  <doSection class="array">
                    <doSectionElement class="object">
                      <doOption type="string">runtimeParam</doOption>
                      <extHandleData class="object">
                        <extractData class="object">
[root@caddeapllx2695 tmp]#
