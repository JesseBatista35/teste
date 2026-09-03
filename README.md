Lívia, confirmado — as variáveis (_ENV.HTTP_PROXY, _ENV.HTTPS_PROXY, _ENV.NO_PROXY) foram inseridas no Variable Group SIPGC-API-AGRUPAMENTO-DES, que é específico do sipgc-api-agrupamento-des, não é uma library compartilhada. Nenhum outro back foi afetado — os demais serviços continuam apontando pros seus próprios grupos, sem alteração.

Rodamos um novo Release e o Pablo já validou que a chamada externa funcionou normalmente. Configuração persistida, não depende mais de ajuste manual no OKD.

