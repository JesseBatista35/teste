2026-08-19T17:34:53.9970998Z ##[section]Starting: check-case-sensitivity.js
2026-08-19T17:34:53.9974482Z ==============================================================================
2026-08-19T17:34:53.9974562Z Task         : Bash
2026-08-19T17:34:53.9974648Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-08-19T17:34:53.9974710Z Version      : 3.227.0
2026-08-19T17:34:53.9974754Z Author       : Microsoft Corporation
2026-08-19T17:34:53.9974910Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-08-19T17:34:53.9974979Z ==============================================================================
2026-08-19T17:34:54.1485654Z Generating script.
2026-08-19T17:34:54.1498361Z ========================== Starting Command Output ===========================
2026-08-19T17:34:54.1506317Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/396bc525-8c83-41a9-afb7-5e31db72aa1b.sh
2026-08-19T17:34:54.1558279Z === Arquivos existentes ===
2026-08-19T17:34:54.1584526Z -rw-r--r--. 1 root root  109 ago 19 14:34 categoria.model.ts
2026-08-19T17:34:54.1585175Z -rw-r--r--. 1 root root  109 ago 19 14:34 Categoria.model.ts
2026-08-19T17:34:54.1585485Z === Diferenca entre os dois arquivos ===
2026-08-19T17:34:54.1611112Z /opt/ads-agent/_work/_temp/396bc525-8c83-41a9-afb7-5e31db72aa1b.sh: line 6: diff: command not found
2026-08-19T17:34:54.1612401Z === Quem importa categoria.model minusculo ===
2026-08-19T17:34:54.1694382Z src/app/components/cadastro/categoria/listar-categoria/grid-categoria/grid-categoria.component.spec.ts:9:import { CategoriaGet } from "./../../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1695185Z src/app/components/cadastro/categoria/listar-categoria/grid-categoria/grid-categoria.component.ts:12:import { CategoriaGet } from "./../../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1695603Z src/app/components/cadastro/categoria/listar-categoria/listar-categoria.component.spec.ts:7:import { CategoriaGet } from "./../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1695957Z src/app/components/cadastro/categoria/listar-categoria/listar-categoria.component.ts:4:import { CategoriaGet } from "./../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1696338Z src/app/components/cadastro/categoria/listar-categoria/listar-categoria.resolver.ts:5:import { CategoriaGet } from "./../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1696754Z src/app/components/cadastro/categoria/manter-categoria/dados-categoria/dados-categoria.component.ts:5:import { CategoriaGet, CategoriaPatch, CategoriaPost } from "./../../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1697168Z src/app/components/cadastro/categoria/manter-categoria/manter-categoria.component.spec.ts:10:} from "../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1697571Z src/app/components/cadastro/categoria/manter-categoria/manter-categoria.component.ts:5:import { CategoriaGet, CategoriaPatch, CategoriaPost } from "./../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1698000Z src/app/components/cadastro/fornecedor/listar-fornecedor/grid-fornecedor/grid-fornecedor.component.ts:23:import { CategoriaGet } from './../../../../../model/cadastro/categoria/v1/categoria.model';
2026-08-19T17:34:54.1698394Z src/app/components/endomarketing/listar-endomarketing/listar-endomarketing.component.spec.ts:7:import { CategoriaGet } from "../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1698816Z src/app/components/endomarketing/listar-endomarketing/listar-endomarketing.component.ts:10:import { CategoriaGet } from './../../../model/cadastro/categoria/v1/categoria.model';
2026-08-19T17:34:54.1699223Z src/app/components/endomarketing/manter-endomarketing/dados-endomarketing/dados-endomarketing.component.ts:11:import { CategoriaGet } from './../../../../model/cadastro/categoria/v1/categoria.model';
2026-08-19T17:34:54.1699705Z src/app/components/identidade-visual/manter-identidade-visual/categorias-identidade-visual.resolver.ts:6:import { CategoriaGet } from "../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1700404Z src/app/components/identidade-visual/manter-identidade-visual/dados-identidade-visual/dados-identidade-visual.component.ts:11:import { CategoriaGet } from "./../../../../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1700926Z src/app/components/sam/manter-sam/dados-sam/dados-sam.component.ts:26:import { CategoriaGet } from './../../../../model/comum/categoria.model';
2026-08-19T17:34:54.1701218Z src/app/model/endomarketing/endomarketing.model.ts:1:import { CategoriaGet } from './../comum/categoria.model';
2026-08-19T17:34:54.1701456Z src/app/model/solicitacao/v1/endomarketing.model.ts:1:import { CategoriaGet } from "../../comum/categoria.model";
2026-08-19T17:34:54.1701777Z src/app/model/solicitacao/v1/solicitacao.model.ts:1:import { CategoriaGet } from "../../comum/categoria.model";
2026-08-19T17:34:54.1702107Z src/app/services/categoria.service.spec.ts:10:import { CategoriaGet, CategoriaPatch, CategoriaPost } from "./../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1702396Z src/app/services/categoria.service.ts:9:import { CategoriaGet, CategoriaPatch, CategoriaPost } from "./../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1702633Z src/app/validators/categoria.validator.ts:9:import { CategoriaGet } from "../model/cadastro/categoria/v1/categoria.model";
2026-08-19T17:34:54.1702973Z src/testing/stub/cadastro/categoria/v1/categoria.stub.ts:1:import { CategoriaGet } from './../../../../../app/model/cadastro/categoria/v1/categoria.model';
2026-08-19T17:34:54.1703220Z === Quem importa Categoria.model maiusculo ===
2026-08-19T17:34:54.1771220Z src/app/model/identidade-visual/Marca.model.ts:4:import { CategoriaGet } from './Categoria.model';
2026-08-19T17:34:54.1771664Z src/testing/stub/comum/v1/categoria.stub.ts:1:import { CategoriaGet } from '../../../../app/model/identidade-visual/Categoria.model';
2026-08-19T17:34:54.1772017Z src/testing/stub/identidade-visual/v1/categoria-stub.ts:1:import { CategoriaGet } from './../../../../app/model/identidade-visual/Categoria.model';
2026-08-19T17:34:54.1834380Z ##[section]Finishing: check-case-sensitivity.js
