segue enviroment.ts


import {
  Ambiente,
  buildApiUrl,
  getJsonPlaceholderAPI,
  getRequiredRuntimeEnvBoolean,
  getRequiredRuntimeEnvString,
  getRequiredRuntimeEnvStringFrom,
  normalizeBaseUrl,
} from './environment.model';

export const ambiente: Ambiente = Ambiente.DES;

const endpoint = normalizeBaseUrl(
  getRequiredRuntimeEnvStringFrom(['API_BASE_PATH', 'HTTP_SERVICE_API'])
);
const ssoUrl = getRequiredRuntimeEnvString('SSO_BASE_PATH');
const realm = getRequiredRuntimeEnvString('REALM');
const clientId = getRequiredRuntimeEnvString('CLIENT_ID');
const versao = getRequiredRuntimeEnvString('VERSAO');

export const environment = {
  production: false,
  disableAuthKeycloak: getRequiredRuntimeEnvBoolean('DISABLE_AUTH_KEYCLOAK'),
  ambiente: 'des',
  VERSION: versao,
  versao,
  API_DES_URL: getJsonPlaceholderAPI(),
  API_PRD_URL: getJsonPlaceholderAPI(),
  endpoint,
  apiUrl: buildApiUrl(endpoint),
  auth: {
    identityServerUrl: ssoUrl,
    realm,
    clientId,
  },
  ssoConfig: {
    url: ssoUrl,
    realm,
    clientId,
  },
};
