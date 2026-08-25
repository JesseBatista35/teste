acabei de receber outra deamnda :


Estou com problema no github, ele não carrega algumas informações e recursos, isso está me impossibilitando de ajudar o pessoal em code review e também aplicar os PR.

Investigando no Copilot cheguei nesse resultado:

COPILOT

GitHub Enterprise acessado via MAC apresenta carregamento infinito em componentes de Pull Request apenas neste Mac.

Investigação realizada:

-Safari e Edge apresentam o mesmo comportamento.
-DNS e SSL validados.
-Requests retornam HTTP 200.

DevTools registra erro:
TypeError: Loading chunk 38963 failed after 3 retries

Originado de:
github.githubassets.com.mcas.ms/assets/...

Stacktrace envolve:
inline.cdn.mcas.ms/proxyweb/js-wrapper.js

A página principal do PR é renderizada, porém componentes dinâmicos permanecem em loading infinito.



é o mesmo caso?
