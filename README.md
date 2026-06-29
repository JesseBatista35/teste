O projeto é um sistema legado que está em migração para a esteira devops e esta pipeline deve se adequar as necessidades do mesmo.

Solicito que seja alterada a versão do java para 1.8, no máximo 11 na pipeline :
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=491998&environmentId=2288041

Pois a integração com o vault é necessária para compatibilidade de outras pipelines que estão em evolução.


Grato


tinha essa imgem na build:

7.4.14-openjdk-17-bt-23 essa imgem  é excluisiva para beyundtrut que ainda nao tem nessa release so tem os vaults certo


troquei para a imagem

7.4.14-openjdk-17, e execultei a buil e depois o deploy.. masi antes ja tinha erro...
