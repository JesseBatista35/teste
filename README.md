Isso ajuda bastante, obrigado. Como o Client_ID é o mesmo nos dois ambientes e o login funciona nos dois, o mais provável é que o token gerado no TQS tenha uma aud diferente da que a API do papel-TQS está esperando — talvez o front esteja pedindo um scope/resource diferente dependendo do ambiente, e o Azure AD está devolvendo um token com audience default (tipo Microsoft Graph) em vez do audience da nossa API.

Consegue decodificar o token que você usou no teste? É rápido: pega o valor depois de "Bearer " e cola em https://jwt.ms (site oficial da Microsoft, mais seguro que jwt.io pra token real) — não precisa de acesso a nada, o JWT não é criptografado.

Me passa o valor do campo aud (audience) e iss (issuer) que aparecer lá. Se o aud não bater com api://ef9bda30-3695-462e-911b-5252dcf3b2de (que é o Audience configurado no backend), confirma a causa — e aí o ajuste é no front (MSAL/scope configurado pra TQS), não no backend.
