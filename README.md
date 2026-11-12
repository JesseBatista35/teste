Lucas, ajustado! Em TQS o cofre estava gerando os arquivos na pasta SIINP_TQS (maiúsculo, igual DES), mas a variável VAULT_LOCATION do grupo de TQS ainda apontava para siinp_tqs (minúsculo). Por isso a aplicação não encontrava nenhum secret, inclusive a SECURITY_CRYPTO_KEY. Corrigi a variável e fiz a release da 1.91.0.4 em TQS. O pod subiu normal e todos os secrets foram carregados sem erro. Pode validar aí do seu lado?

Só um alerta: o TQS2 usa o mesmo cofre e ainda está configurado em minúsculo, então vai precisar do mesmo ajuste antes do próximo deploy lá.
