Prezados,
Referente ao erro relatado, identificamos que houve um timeout momentâneo na consulta ao Vault (BeyondTrust) através da url https://sicsn.caixa/BeyondTrust/api/public/v3, o que impediu a recuperação das credenciais durante o rollout do deployment em TQS, ocasionando o timeout da task de verificação de status (Verificando Status do Deployment).
Realizamos um novo deploy manualmente e desta vez a consulta ao Vault foi concluída normalmente, permitindo que o rollout finalizasse com sucesso. O pod subiu corretamente (sisbg-backend-tqs-9-zb7bh) e a aplicação sisbg-intranet foi iniciada normalmente pelo Quarkus.
A release SISBG-backend-1.0.0.26(2) foi concluída com sucesso no ambiente TQS, conforme evidência em anexo.
Diante do exposto, solicitamos o encerramento desta WO.
Atenciosamente,
Jessé Batista








