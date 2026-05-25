
Olá, time SINAF Web! 👋

Verificamos o erro de 403 reportado e já fizemos a análise dos logs do pod. Seguem as evidências:

🔍 *Conclusão:* O problema **não está na esteira** — a aplicação sobe normalmente e o deploy ocorre sem erros.

O 403 ocorre em runtime, quando o SINAF tenta buscar um documento anexo no SIECM:

```
16:14:02,615 SEVERE [ImpressaoUtil] erro_imprimir_anexo:
java.io.IOException: Server returned HTTP response code: 403
URL: https://siecm.des.caixa/siecm-web/ECM/getDocumento/true/6fd0da72...
```

O fluxo que dispara o erro é:
`ImpressaoFleUtil.anexa` → `ImpressaoFleUtil.imprimir`

A chamada usa `FileUtils.copyURLToFile` que **não envia headers de autenticação**, e o SIECM está retornando 403, indicando que pode ter havido alguma mudança de política de acesso ou autenticação no lado deles.

✅ Esteira: OK
✅ Deploy/startup da aplicação: OK
❌ Chamada ao SIECM em tempo de execução: 403

Precisamos que o time acione o **SIECM** para verificar se passou a ser exigida alguma autenticação (token, certificado mTLS, etc.) no endpoint `/ECM/getDocumento` no ambiente DES.

Qualquer dúvida, estamos à disposição! 🙏
