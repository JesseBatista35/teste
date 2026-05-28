Agora você precisa atualizar o standalone-full-ha.xml no repositório com a correção do invalidation-cache também, para que o pipeline não sobrescreva o arquivo corrigido na próxima release. No repo, no bloco do hibernate dentro do infinispan, troca:
xml<!-- DE: -->
<invalidation-cache name="entity" mode="SYNC">
    <transaction mode="NON_XA"/>
    <eviction strategy="LRU" max-entries="10000"/>
    <expiration max-idle="100000"/>
</invalidation-cache>

<!-- PARA: -->
<local-cache name="entity">
    <transaction mode="NON_XA"/>
    <eviction strategy="LRU" max-entries="10000"/>
    <expiration max-idle="100000"/>
</local-cache>
O arquivo que te entreguei antes já tinha essa correção — provavelmente o pipeline sobrescreveu com o arquivo antigo do repo. Atualiza o repo e está resolvido de vez!
