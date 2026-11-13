Próximo passo: deploy do SIRUR

1. Confira que a janela 1 (log da 473) está aberta.

2. Na 471, entre no CLI:

/opt/jboss/jboss-eap/bin/jboss-cli.sh --connect --controller=localhost:9999

3. Quando o prompt mudar para [domain@localhost:9999 /], rode um comando por vez:

deploy /tmp/sifec-sirur-3.55.51.02.ear --name=SIRUR --runtime-name=sifec-sirur-3.55.51.02.ear --force

Esse primeiro só troca o arquivo e não mostra nada. Depois rode:

/server-group=sifec-intranet/deployment=SIRUR:add(enabled=true)

4. Olhe o resultado:

"outcome" => "success" e, na janela 1, WFLYSRV0010: "SIRUR" foi implantado: ✅ subiu.
"outcome" => "failed": me manda a saída do CLI e o log da janela 1.
