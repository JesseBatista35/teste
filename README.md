Fala! A build do SIDSC-storybook-v21 passou (branch develop-v21, commit 82ab188d). Para isso, fiz dois ajustes direto na branch:

1) package.json
A esteira roda os testes com cobertura (npm test -- --no-watch --coverage) para o Sonar, e faltava o pacote de cobertura do Vitest. A build parava com:
Cannot find dependency '@vitest/coverage-v8'

Incluí nas devDependencies, na mesma versão do vitest:
"@vitest/coverage-v8": "^4.0.8"

2) projects/sdsc/src/lib/components/header/header.spec.ts
O teste "should create" do DscHeader falhava porque o mock do DscDrawerService só tinha o método open, e o drawer-outlet usa outros membros do serviço (isOpen, config):
TypeError: this.drawerService.isOpen is not a function
TypeError: this.config is not a function

Troquei o mock pelo serviço real, interceptando só o open:
- removi a classe DrawerServiceMock;
- nos providers, ficou DscDrawerService (o serviço real);
- no beforeEach: drawer = TestBed.inject(DscDrawerService); vi.spyOn(drawer, 'open').mockImplementation(() => undefined);

Os testes que verificam drawer.open continuam iguais e funcionando.

Resultado: 65 arquivos de teste e 908 testes rodando, cobertura gerada e build ok.

Próximo passo é a release da v21 em DES. A configuração já está pronta (.s2i/bin na branch, sidsc-nginx.conf no repo de config e cota do namespace ampliada).

Se forem mexer no DscDrawerService ou no drawer-outlet, vale conferir os specs que usam mock do serviço, porque pode acontecer a mesma coisa.
