import { setupZoneTestEnv } from "jest-preset-angular/setup-env/zone";
setupZoneTestEnv();

/**
 * Mock das variáveis de ambiente runtime (_ENV), injetadas em produção via
 * script env.js carregado no index.html. Necessário pois os testes rodam em
 * Node/jsdom, sem esse script de injeção real.
 */
(globalThis as any)._ENV = {
  API_BASE_PATH: 'http://localhost/api',
  HTTP_SERVICE_API: 'http://localhost/api',
};

/**
 * Mocking Inputmask library for Jest tests.
 */
jest.mock('inputmask', () => {
  const mockFunctions = {
    mask: jest.fn(),
    remove: jest.fn(),
    getemptymask: jest.fn().mockReturnValue(''),
    hasMaskedValue: jest.fn().mockReturnValue(false),
    isValid: jest.fn().mockReturnValue(true),
  };
  const mockInputmask = function(_: any) {
    return { ...mockFunctions };
  };
  Object.assign(mockInputmask, mockFunctions);
  mockInputmask.default = {
    ...mockFunctions,
    __proto__: mockInputmask
  };
  mockInputmask.Inputmask = mockInputmask;
  return mockInputmask;
});
jest.mock('inputmask/dist/inputmask.es6.js', () => {
  return jest.requireMock('inputmask');
});
