Carlos Augusto, tudo bem? Poderia entrar numa chamada rápida aqui no Teams? Encontramos a causa raiz do problema do SIFUG-Dataprev: a senha configurada na property do keystore está incorreta pro novo certificado.

Preciso que você digite a senha correta diretamente no arquivo de configuração no servidor (mesmo princípio da sala de inserção de senhas - eu compartilho a tela e passo o controle, você só digita o valor, sem precisar me falar a senha em voz alta ou por texto).

Já deixo os comandos prontos aqui pra ser rápido assim que você entrar:

1) Fazer backup da property atual antes de mexer:
cp /infra_app/config/sifug/sifug_sifgd.properties /infra_app/config/sifug/sifug_sifgd.properties.bak_$(date +%Y%m%d%H%M)

2) Abrir o arquivo pra edição:
vi /infra_app/config/sifug/sifug_sifgd.properties

3) Localizar a linha (buscar no vi com /keystore.if104.password):
api.dataprev.consignado.keystore.if104.password=123456

Nesse ponto eu paro e passo o controle da tela pra você trocar só o valor depois do "=" pela senha correta, salvar (Esc, :wq) e devolver o controle.

Me avisa quando puder entrar.
