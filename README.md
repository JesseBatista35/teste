import { setupZoneTestEnv } from "jest-preset-angular/setup-env/zone";

setupZoneTestEnv();

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
