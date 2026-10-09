É lá que está a lógica real. O link é:

https://github.com/CAIXAPLATFORM/github-actions/tree/main/actions/ios/distribute-testflight

Abra o action.yml e os scripts da pasta, e veja em cada um dos 4 métodos (api-key, apple-id, altool, auto) se os groups são usados de fato. O mais provável é que api-key e apple-id usem fastlane pilot, que aceita grupos, e que o altool ignore os grupos.

O que esse arquivo já conf
