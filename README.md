Assunto: Imagem openshift/httpd-24-rhel7:2.4-cef indisponível no registry do cluster NPRD (manifest unknown)

Prezados,

Durante o atendimento da WO0000081742301 (SIPAR-INTER, DES), identificamos que a imagem httpd-24-rhel7:2.4-cef do namespace openshift não está mais disponível no registry interno do cluster api.nprd.caixa.

Evidências:

A ImageStreamTag continua existindo e aponta para o digest sha256:acf76a30d454816ddfe5064e6abc61c1ad58b9bcb5116ca908ff0911c5d6c62d (oc describe istag httpd-24-rhel7:2.4-cef -n openshift).
O pull desse digest falha com:
reading manifest sha256:acf76a30... in image-registry.openshift-image-registry.svc:5000/openshift/httpd-24-rhel7: manifest unknown
A imagem era referenciada pela DeploymentConfig sipar-inter-frontend-des (namespace sipar-des), que ficou em ImagePullBackOff ao ser reagendada.
O ImagePruner do cluster está ativo (schedule padrão, keepTagRevisions: 3). Como a imagem estava em uso por uma DC, a remoção não deveria ter ocorrido pelo prune. Há indício de perda de conteúdo no storage do registry, já que o metadado existe e o blob não.

Solicitações:

Republicar a imagem httpd-24-rhel7:2.4-cef no registry do NPRD. Ela é usada pelo template/release padrão de Apache (apache24-https-caixa-release) e pelas releases do Azure DevOps que referenciam nome_imagem=httpd-24-rhel7 / tag_imagem=2.4-cef.
Verificar se outras imagens do namespace openshift estão na mesma situação (tag existente e manifest ausente), pois outras aplicações podem falhar ao ter os pods reagendados.
Se possível, informar a causa (execução do prune, manutenção ou migração do storage do registry).

Contorno aplicado em DES: para não bloquear o atendimento, a DC sipar-inter-frontend-des foi temporariamente alterada para a imagem openshift/httpd:2.4-el8. Após a republicação, a aplicação voltará a usar a imagem padrão via release.

Atenciosamente,
