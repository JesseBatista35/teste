1. Crie a variável com o valor real

Nome: SECRET_MINISTERIO_FARMACIA_API_KEY
Valor: l79721b771df984cd49f161f881fd65734 (o mesmo que está hoje na MINISTERIO_FARMACIA_API_KEY)
Clique no cadeado para marcar como secret

2. Crie a variável que a esteira injeta no pod

Nome: _SECRET.MINISTERIO_FARMACIA_API_KEY
Valor: #{SECRET_MINISTERIO_FARMACIA_API_KEY}#
