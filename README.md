Prezados,

Identificamos que a falha na validação da VEC ocorria porque a compilação estava sendo feita a partir da tag 0.0.0.2b, que não segue o padrão de versionamento estabelecido pelo PPDS (CE GEQTI 011/2024). Conforme a norma, apenas tags no formato numérico puro VM.Vm.Patch.Build (ex: 0.0.0.2) são aceitas para aprovação na VEC e liberação em TQS/HMP/PRD. Por não estar no padrão, o build era publicado como SNAPSHOT no Nexus, o que também impedia a tag de aparecer na seleção de Artifact no momento da release.

Ação realizada: foi criada a tag 0.0.0.3, seguindo o padrão numérico correto, e uma nova compilação foi executada a partir dela. A tag ficou disponível corretamente na seleção do Artifact e a release em TQS foi executada com sucesso.

Segue referência da documentação oficial sobre o processo:
https://devops.caixa/projetos/Caixa/_wiki/wikis/Caixa.wiki/1689/Valida%C3%A7%C3%A3o-da-VEC

Deploy em TQS concluído com sucesso. Encerrando a W.O.

Atenciosamente,
Jessé Batista
