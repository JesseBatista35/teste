Bom dia! Sobre a linha 341 do initializeHttpClient - tenho uma hipótese específica pra vocês conferirem.

O certificado antigo (IF104.p12) tinha o alias "1" dentro do keystore. O certificado novo que instalamos (fornecido pelo Carlos Augusto/CESET) tem o alias "dinamo hsm" - confirmamos isso via keytool -list no servidor.

Se o código busca a chave/certificado por um alias fixo hardcoded (tipo keyStore.getKey("1", senha) ou algo similar), a busca vai retornar null com o alias novo, e qualquer operação em cima disso (.getEncoded(), .getAlgorithm() etc.) gera exatamente esse NullPointerException sem mensagem clara - bate com o comportamento que vocês estão vendo.

Podem conferir se existe essa referência de alias fixo no código perto da linha 341? Se for isso, a correção seria ajustar pro alias correto (dinamo hsm) ou, melhor ainda, pegar o primeiro alias disponível dinamicamente via keyStore.aliases(), já que esse nome pode mudar a cada renovação de certificado.
