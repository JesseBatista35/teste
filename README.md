Pessoal, habilitei o debug SSL (-Djavax.net.debug=ssl) no server srjtqapllx0021_sifug_inter_8080 e já reiniciei. Estou com o log em acompanhamento em tempo real.

Alguém consegue disparar o teste de integração com o Dataprev agora? Assim que rodar, consigo capturar o detalhe do handshake SSL e ver exatamente onde está travando.


tail -f /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/*.log


ls -la /opt/open/jboss/7.0.0/domain/servers/srjtqapllx0021_sifug_inter_8080/log/

