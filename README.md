À
Suporte/CAIXA

Favor devolver para NPRD

Conforme trecho de log na release a sessão foi criada com sucesso no selenium:

2026-09-24T15:58:26.8763806Z INFORMAÇÕES: URL do Selenium Grid configurada: https://selenium-router-selenium-grid.apps.produtos4.caixa
2026-09-24T15:58:26.8764008Z set. 24, 2026 12:58:26 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-24T15:58:26.8764237Z INFORMAÇÕES: Browser solicitado: chrome
2026-09-24T15:58:26.8764388Z set. 24, 2026 12:58:26 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-24T15:58:26.8764849Z INFORMAÇÕES: Capacidades enviadas ao Grid: Capabilities {acceptInsecureCerts: true, browserName: chrome, platformName: linux}
2026-09-24T15:58:26.8765240Z set. 24, 2026 12:58:26 PM org.openqa.selenium.remote.tracing.opentelemetry.OpenTelemetryTracer createTracer
2026-09-24T15:58:26.8765568Z INFORMAÇÕES: Using OpenTelemetry for tracing
2026-09-24T15:58:27.6777109Z set. 24, 2026 12:58:27 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-24T15:58:27.6777636Z INFORMAÇÕES: Sessão criada com sucesso.
2026-09-24T15:58:27.6777831Z set. 24, 2026 12:58:27 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-24T15:58:27.6778097Z INFORMAÇÕES: Browser efetivamente entregue pelo Grid: chrome
2026-09-24T15:58:27.6778294Z set. 24, 2026 12:58:27 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-24T15:58:27.6778536Z INFORMAÇÕES: Versão do navegador: 120.0.6099.224
2026-09-24T15:58:27.6778738Z set. 24, 2026 12:58:27 PM com.deque.axe.DriverInitializer initializeDriver
2026-09-24T15:58:27.6778917Z INFORMAÇÕES: Platform: linux
2026-09-24T15:58:27.6779086Z set. 24, 2026 12:58:27 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-24T15:58:27.6779309Z INFORMAÇÕES: WebDriver inicializado com sucesso.
2026-09-24T15:58:27.6779503Z set. 24, 2026 12:58:27 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-24T15:58:27.6779721Z INFORMAÇÕES: WebDriver inicializado com sucesso.

Proceder com a análise do problema:

2026-09-24T15:58:43.3076266Z [SSO] Falha na etapa: BOTAO_ENTRAR
2026-09-24T15:58:43.4074098Z set. 24, 2026 12:58:43 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-24T15:58:43.4075119Z GRAVE: Erro durante a configuração inicial (setUpOnce): Erro ao realizar login. Etapa: BOTAO_ENTRAR
2026-09-24T15:58:43.4075615Z set. 24, 2026 12:58:43 PM com.deque.axe.AcessibilidadeTest setUpOnce
2026-09-24T15:58:43.4076521Z GRAVE: Erro durante a configuração inicial (setUpOnce): Erro ao realizar login. Etapa: BOTAO_ENTRAR
2026-09-24T15:58:43.4076903Z set. 24, 2026 12:58:43 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-24T15:58:43.4077139Z INFORMAÇÕES: Finalizando o WebDriver.
2026-09-24T15:58:43.4077323Z set. 24, 2026 12:58:43 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-24T15:58:43.4077540Z INFORMAÇÕES: Finalizando o WebDriver.
2026-09-24T15:58:43.4077681Z set. 24, 2026 12:58:43 PM com.deque.axe.DriverInitializer quitDriver
2026-09-24T15:58:43.4077900Z INFORMAÇÕES: Finalizando WebDriver...
2026-09-24T15:58:43.4262034Z set. 24, 2026 12:58:43 PM com.deque.axe.DriverInitializer quitDriver
2026-09-24T15:58:43.4262761Z INFORMAÇÕES: WebDriver finalizado.
2026-09-24T15:58:43.4262952Z set. 24, 2026 12:58:43 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-24T15:58:43.4263195Z INFORMAÇÕES: WebDriver finalizado com sucesso.
2026-09-24T15:58:43.4263353Z set. 24, 2026 12:58:43 PM com.deque.axe.AcessibilidadeTest tearDownOnce
2026-09-24T15:58:43.4263618Z INFORMAÇÕES: WebDriver finalizado com sucesso.
2026-09-24T15:58:43.4529408Z [ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 16.70 s <<< FAILURE! -- in com.deque.axe.AcessibilidadeTest
2026-09-24T15:58:43.4530912Z [ERROR] com.deque.axe.AcessibilidadeTest -- Time elapsed: 16.70 s <<< ERROR!
2026-09-24T15:58:43.4531196Z java.lang.RuntimeException: Erro durante a configuração inicial (setUpOnce).
2026-09-24T15:58:43.4531445Z 	at com.deque.axe.AcessibilidadeTest.setUpOnce(AcessibilidadeTest.java:132)
2026-09-24T15:58:43.4531651Z 	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
2026-09-24T15:58:43.4531873Z 	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
2026-09-24T15:58:43.4532221Z Caused by: java.lang.RuntimeException: Erro ao realizar login. Etapa: BOTAO_ENTRAR
2026-09-24T15:58:43.4532434Z 	at com.deque.axe.SSOLoginAutomation.performLoginIfRequired(SSOLoginAutomation.java:140)
2026-09-24T15:58:43.4532656Z 	at com.deque.axe.AcessibilidadeTest.setUpOnce(AcessibilidadeTest.java:123)
2026-09-24T15:58:43.4533048Z 	... 2 more

Analista: Wanderson França
Matricula: P911751
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS


