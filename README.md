Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Commits
/

SIMKT-backend
Search


Caixa

Overview

Boards

Repos
Files
Commits
Pushes
Branches
Tags
Pull requests

Pipelines

Test Plans

Artifacts
Project settings
FIX: STRY16444 - Correções item envio email / FEAT: 16439 - Incluir Relatório...
Browse Files

655b40e0

Rogerio Pontes
committed
quinta-feira
CD053_2026_PI3_Sprint4
failed
Files
Details
Parent 1 → This commit

Filter
12 changed files

Inline



SIMKT-backend


ApplicationSimkt.java
+2
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/constant/ApplicationSimkt.java
View
@NoArgsConstructor
public final class ApplicationSimkt {
    public static final String ENDPOINT_RELATORIO_GERENCIAL = "/api/v1/relatorios/gerenciais*";
	public static final String PREFIXO_USUARIO_CAIXA = "C";
	public static final int TAMANHO_MATRICULA = 6;
	public static final String ENDPOINT_DASHBOARD = "/api/v1/dashboard*";

RelatorioGerencialController.java
+51
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/controller/RelatorioGerencialController.java
View
package br.gov.caixa.pedes.sistemas.simkt.controller;
import java.net.URI;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.gov.caixa.pedes.sistemas.simkt.dto.CampoRelatorioGerencialDTO;
import br.gov.caixa.pedes.sistemas.simkt.dto.RelatorioGerencialDTO;
import br.gov.caixa.pedes.sistemas.simkt.service.RelatorioGerencialService;
import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api/v1/relatorios/gerenciais")
@RequiredArgsConstructor
public class RelatorioGerencialController {
    private final RelatorioGerencialService service;
    @GetMapping
    public List<RelatorioGerencialDTO> listar() { return service.listar(); }
    @GetMapping("/{id}")
    public RelatorioGerencialDTO obter(@PathVariable Long id) { return service.obter(id); }
    @GetMapping("/campos/{tipoId}")
    public List<CampoRelatorioGerencialDTO> campos(@PathVariable Long tipoId) { return service.campos(tipoId); }
    @PostMapping("/rascunho")
    public ResponseEntity<RelatorioGerencialDTO> rascunho(@RequestBody RelatorioGerencialDTO dto) {
        return resposta(dto, false);
    }
    @PostMapping("/finalizar")
    public ResponseEntity<RelatorioGerencialDTO> finalizar(@RequestBody RelatorioGerencialDTO dto) {
        return resposta(dto, true);
    }
    private ResponseEntity<RelatorioGerencialDTO> resposta(RelatorioGerencialDTO dto, boolean finalizar) {
        RelatorioGerencialDTO salvo = service.salvar(dto, finalizar);
        if (dto.getId() != null) { return ResponseEntity.ok(salvo); }
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/v1/relatorios/gerenciais/{id}").buildAndExpand(salvo.getId()).toUri();
        return ResponseEntity.created(location).body(salvo);
    }
}

MapCsvEnum.java
+3
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/domain/enums/MapCsvEnum.java
View
public enum MapCsvEnum {
    RELATORIO_GERENCIAL_MANTER("RELATORIO_GERENCIAL_MANTER", ApplicationSimkt.ROLES_ADMINISTRADOR,
            ApplicationSimkt.ENDPOINT_RELATORIO_GERENCIAL),
    MENSAGERIA_ADMINISTRADOR_DASHBOARD("MENSAGERIA_ADMINISTRADOR", ApplicationSimkt.ROLES_ADMINISTRADOR_MATRIZ, ApplicationSimkt.ENDPOINT_DASHBOARD),
    MENSAGERIA_INCLUIR_DASHBOARD("MENSAGERIA_INCLUIR", ApplicationSimkt.ROLES_ADMINISTRADOR_MATRIZ, ApplicationSimkt.ENDPOINT_DASHBOARD),
    MENSAGERIA_CONSULTAR_DASHBOARD("MENSAGERIA_CONSULTAR", ApplicationSimkt.ROLES_AUDITOR_ADMINISTRADOR_MARKETING_NEGOCIO_MATRIZ, ApplicationSimkt.ENDPOINT_DASHBOARD),

CampoRelatorioGerencialDTO.java
+15
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/dto/CampoRelatorioGerencialDTO.java
View
package br.gov.caixa.pedes.sistemas.simkt.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampoRelatorioGerencialDTO {
    private String chave;
    private String nome;
    private String categoria;
}

RelatorioGerencialDTO.java
+16
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/dto/RelatorioGerencialDTO.java
View
package br.gov.caixa.pedes.sistemas.simkt.dto;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
@Data
public class RelatorioGerencialDTO {
    private Long id;
    private Long tipoSolicitacaoId;
    private String tipoSolicitacaoNome;
    private String situacao;
    private Long versao;
    private List<CampoRelatorioGerencialDTO> campos = new ArrayList<>();
}

MessageKey.java
+7
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/message/MessageKey.java
View
@Getter
public enum MessageKey {
    RELATORIO_GERENCIAL_TIPO_OBRIGATORIO("relatorioGerencial.tipoObrigatorio"),
    RELATORIO_GERENCIAL_TIPO_INVALIDO("relatorioGerencial.tipoInvalido"),
    RELATORIO_GERENCIAL_CAMPO_OBRIGATORIO("relatorioGerencial.campoObrigatorio"),
    RELATORIO_GERENCIAL_CAMPO_INVALIDO("relatorioGerencial.campoInvalido"),
    RELATORIO_GERENCIAL_DUPLICADO("relatorioGerencial.duplicado"),
    RELATORIO_GERENCIAL_CONFLITO("relatorioGerencial.conflito"),
    ERRO_NAO_ESPERADO("erro.naoEsperado"),
    REGISTRO_NAO_ENCONTRADO("erro.registroNaoEncontrado"),
    REGISTROS_NAO_ENCONTRADOS("erro.registrosNaoEncontrados"),

RelatorioGerencialRepository.java
+80
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/repository/RelatorioGerencialRepository.java
View
package br.gov.caixa.pedes.sistemas.simkt.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import br.gov.caixa.pedes.sistemas.simkt.dto.CampoRelatorioGerencialDTO;
import br.gov.caixa.pedes.sistemas.simkt.dto.RelatorioGerencialDTO;
import lombok.RequiredArgsConstructor;
/** Persistência isolada da configuração, sem alterar entidades compartilhadas. */
@Repository
@RequiredArgsConstructor
public class RelatorioGerencialRepository {
    private static final String TABELA = "mktsm001.hu16439_relatorio_gerencial";
    private static final String CAMPOS = "mktsm001.hu16439_relatorio_campo";
    private static final String SELECT = "SELECT r.id, r.co_solicitacao_tipo, t.no_solicitacao_tipo, r.situacao, r.versao FROM "
            + TABELA + " r JOIN mktsm001.mkttb027_solicitacao_tipo t ON t.co_solicitacao_tipo = r.co_solicitacao_tipo";
    private static final RowMapper<RelatorioGerencialDTO> MAPPER = (rs, row) -> {
        RelatorioGerencialDTO dto = new RelatorioGerencialDTO();
        dto.setId(rs.getLong("id"));
        dto.setTipoSolicitacaoId(rs.getLong("co_solicitacao_tipo"));
        dto.setTipoSolicitacaoNome(rs.getString("no_solicitacao_tipo"));
        dto.setSituacao(rs.getString("situacao"));
        dto.setVersao(rs.getLong("versao"));
        return dto;
    };
    private final JdbcTemplate jdbc;
    public List<RelatorioGerencialDTO> listar() {
        return jdbc.query(SELECT + " ORDER BY t.no_solicitacao_tipo, r.id", MAPPER);
    }
    public Optional<RelatorioGerencialDTO> obter(Long id) {
        List<RelatorioGerencialDTO> registros = jdbc.query(SELECT + " WHERE r.id = ?", MAPPER, id);
        if (registros.isEmpty()) { return Optional.empty(); }
        RelatorioGerencialDTO relatorio = registros.get(0);
        relatorio.setCampos(jdbc.query("SELECT chave, nome, categoria FROM " + CAMPOS
                + " WHERE relatorio_id = ? ORDER BY ordem",
                (rs, row) -> new CampoRelatorioGerencialDTO(rs.getString("chave"), rs.getString("nome"),
                        rs.getString("categoria")), id));
        return Optional.of(relatorio);
    }
    public boolean tipoJaCadastrado(Long tipoId, Long id) {
        Long total = jdbc.queryForObject("SELECT COUNT(*) FROM " + TABELA
                + " WHERE co_solicitacao_tipo = ? AND id <> ?", Long.class,
                tipoId, id == null ? -1L : id);
        return total != null && total > 0;
    }
    public Long inserir(RelatorioGerencialDTO dto, String situacao, String usuario) {
        return jdbc.queryForObject("INSERT INTO " + TABELA
                + " (co_solicitacao_tipo, situacao, usuario_atualizacao) VALUES (?, ?, ?) RETURNING id",
                Long.class, dto.getTipoSolicitacaoId(), situacao, usuario);
    }
    public boolean atualizar(RelatorioGerencialDTO dto, String situacao, String usuario) {
        return jdbc.update("UPDATE " + TABELA
                + " SET co_solicitacao_tipo = ?, situacao = ?, usuario_atualizacao = ?,"
                + " atualizado_em = CURRENT_TIMESTAMP, versao = versao + 1"
                + " WHERE id = ? AND versao = ? AND situacao = 'RASCUNHO'",
                dto.getTipoSolicitacaoId(), situacao, usuario, dto.getId(), dto.getVersao()) == 1;
    }
    public void substituirCampos(Long id, List<CampoRelatorioGerencialDTO> campos) {
        jdbc.update("DELETE FROM " + CAMPOS + " WHERE relatorio_id = ?", id);
        jdbc.batchUpdate("INSERT INTO " + CAMPOS
                + " (relatorio_id, chave, nome, categoria, ordem) VALUES (?, ?, ?, ?, ?)",
                campos, 100, (ps, campo) -> {
                    ps.setLong(1, id);
                    ps.setString(2, campo.getChave());
                    ps.setString(3, campo.getNome());
                    ps.setString(4, campo.getCategoria());
                    ps.setInt(5, campos.indexOf(campo));
                });
    }
}

CampoRelatorioGerencialService.java
+50
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/service/CampoRelatorioGerencialService.java
View
package br.gov.caixa.pedes.sistemas.simkt.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import br.gov.caixa.pedes.sistemas.simkt.dto.CampoRelatorioGerencialDTO;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CampoRelatorioGerencialService {
    public static final String PRINCIPAL = "PRINCIPAL";
    public static final String ADICIONAL = "ADICIONAL";
    private final JdbcTemplate jdbc;
    public boolean tipoAtivo(Long tipoId) {
        Integer total = jdbc.queryForObject("SELECT COUNT(*) FROM mktsm001.mkttb027_solicitacao_tipo"
                + " WHERE co_solicitacao_tipo = ? AND ic_solicitacao_tipo_ativo = 1"
                + " AND ic_solicitacao_tipo_excluido = 0", Integer.class, tipoId);
        return total != null && total > 0;
    }
    public List<CampoRelatorioGerencialDTO> listar(Long tipoId) {
        // Campos fixos existentes no domínio Solicitacao; chaves estáveis para consumo pelo gerador.
        List<CampoRelatorioGerencialDTO> campos = new ArrayList<>(Arrays.asList(
                principal("coSolicitacao", "ID SIMKT"), principal("codigoSispa", "Código SISPA"),
                principal("situacao", "Situação"), principal("dtInclusao", "Data de inclusão"),
                principal("dataInicio", "Data de início"), principal("dataFim", "Data de fim"),
                principal("noProcesso", "Número do processo"), principal("iniciativa", "Tipo de iniciativa")));
        // A HU fornece mkttb005_item. A relação existente na parametrização restringe por tipo.
        campos.addAll(jdbc.query("SELECT DISTINCT i.co_item, i.no_item FROM mktsm001.mkttb005_item i"
                + " JOIN mktsm001.mkttb019_parametrizacao_grupo_item gi ON gi.co_item = i.co_item"
                + " JOIN mktsm001.mkttb018_parametrizacao_grupo g ON g.co_parametrizacao_grupo = gi.co_parametrizacao_grupo"
                + " JOIN mktsm001.mkttb017_parametrizacao_roteiro r ON r.co_parametrizacao_roteiro = g.co_parametrizacao_roteiro"
                + " JOIN mktsm001.mkttb015_parametrizacao_etapa e ON e.co_parametrizacao_etapa = r.co_parametrizacao_etapa"
                + " JOIN mktsm001.mkttb011_parametrizacao p ON p.co_parametrizacao = e.co_parametrizacao"
                + " WHERE p.co_solicitacao_tipo = ? AND p.st_parametrizacao = 'A' AND gi.de_item = 'COMUM'"
                + " ORDER BY i.no_item, i.co_item",
                (rs, row) -> new CampoRelatorioGerencialDTO("item:" + rs.getLong("co_item"),
                        rs.getString("no_item"), ADICIONAL), tipoId));
        return campos;
    }
    private CampoRelatorioGerencialDTO principal(String propriedade, String nome) {
        return new CampoRelatorioGerencialDTO("principal:" + propriedade, nome, PRINCIPAL);
    }
}

RelatorioGerencialService.java
+106
/src/main/java/br/gov/caixa/pedes/sistemas/simkt/service/RelatorioGerencialService.java
View
package br.gov.caixa.pedes.sistemas.simkt.service;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.gov.caixa.pedes.sistemas.simkt.dto.CampoRelatorioGerencialDTO;
import br.gov.caixa.pedes.sistemas.simkt.dto.RelatorioGerencialDTO;
import br.gov.caixa.pedes.sistemas.simkt.exception.BusinessException;
import br.gov.caixa.pedes.sistemas.simkt.exception.ResourceNotFoundException;
import br.gov.caixa.pedes.sistemas.simkt.message.MessageKey;
import br.gov.caixa.pedes.sistemas.simkt.repository.RelatorioGerencialRepository;
import br.gov.caixa.pedes.sistemas.simkt.integration.sso.service.AuthenticationService;
import br.gov.caixa.pedes.sistemas.simkt.constant.ApplicationSimkt;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class RelatorioGerencialService {
    public static final String RASCUNHO = "RASCUNHO";
    public static final String ATIVO = "ATIVO";
    private final RelatorioGerencialRepository repository;
    private final CampoRelatorioGerencialService catalogo;
    private final AuthenticationService authentication;
    @Transactional(readOnly = true)
    public List<RelatorioGerencialDTO> listar() {
        autorizar();
        return repository.listar();
    }
    @Transactional(readOnly = true)
    public RelatorioGerencialDTO obter(Long id) {
        autorizar();
        return repository.obter(id).orElseThrow(() -> new ResourceNotFoundException(MessageKey.REGISTRO_NAO_ENCONTRADO));
    }
    @Transactional(readOnly = true)
    public List<CampoRelatorioGerencialDTO> campos(Long tipoId) {
        autorizar();
        validarTipo(tipoId);
        return catalogo.listar(tipoId);
    }
    @Transactional
    public RelatorioGerencialDTO salvar(RelatorioGerencialDTO dto, boolean finalizar) {
        autorizar();
        if (dto == null) { throw new BusinessException(MessageKey.PARAMETROS_INVALIDOS); }
        validarTipo(dto.getTipoSolicitacaoId());
        List<CampoRelatorioGerencialDTO> campos = validarCampos(dto, finalizar);
        if (repository.tipoJaCadastrado(dto.getTipoSolicitacaoId(), dto.getId())) {
            throw new BusinessException(MessageKey.RELATORIO_GERENCIAL_DUPLICADO);
        }
        String situacao = finalizar ? ATIVO : RASCUNHO;
        String usuario = authentication.getUserDetails().getUserName();
        Long id = dto.getId();
        try {
            if (id == null) {
                id = repository.inserir(dto, situacao, usuario);
            } else if (dto.getVersao() == null || !repository.atualizar(dto, situacao, usuario)) {
                throw new BusinessException(MessageKey.RELATORIO_GERENCIAL_CONFLITO);
            }
            repository.substituirCampos(id, campos);
        } catch (DuplicateKeyException exception) {
            // A restrição UNIQUE fecha a corrida entre duas transações de cadastro.
            throw new BusinessException(MessageKey.RELATORIO_GERENCIAL_DUPLICADO);
        }
        return obter(id);
    }
    private List<CampoRelatorioGerencialDTO> validarCampos(RelatorioGerencialDTO dto, boolean finalizar) {
        List<CampoRelatorioGerencialDTO> recebidos = dto.getCampos();
        if (recebidos == null || finalizar && recebidos.isEmpty()) {
            throw new BusinessException(MessageKey.RELATORIO_GERENCIAL_CAMPO_OBRIGATORIO);
        }
        Map<String, CampoRelatorioGerencialDTO> permitidos = catalogo.listar(dto.getTipoSolicitacaoId()).stream()
                .collect(Collectors.toMap(CampoRelatorioGerencialDTO::getChave, Function.identity()));
        Set<String> chaves = new HashSet<>();
        List<CampoRelatorioGerencialDTO> resultado = new ArrayList<>();
        for (CampoRelatorioGerencialDTO campo : recebidos) {
            if (campo == null || !permitidos.containsKey(campo.getChave()) || !chaves.add(campo.getChave())) {
                throw new BusinessException(MessageKey.RELATORIO_GERENCIAL_CAMPO_INVALIDO);
            }
            resultado.add(permitidos.get(campo.getChave()));
        }
        return resultado;
    }
    private void validarTipo(Long tipoId) {
        if (tipoId == null) { throw new BusinessException(MessageKey.RELATORIO_GERENCIAL_TIPO_OBRIGATORIO); }
        if (!catalogo.tipoAtivo(tipoId)) { throw new BusinessException(MessageKey.RELATORIO_GERENCIAL_TIPO_INVALIDO); }
    }
    private void autorizar() {
        if (!authentication.getUserRoles().contains(ApplicationSimkt.ROLES_ADMINISTRADOR)) {
            throw new BusinessException(MessageKey.USUARIO_NAO_AUTORIZADO);
        }
    }
}

messages.properties
+7
/src/main/resources/messages.properties
View
erro.nomeCardObrigatorio=O nome do card \u00e9 obrigat\u00f3rio.
erro.periodoRelatorioInvalido=O per\u00edodo informado deve estar dentro dos dois anos anteriores \u00e0 data de emiss\u00e3o do relat\u00f3rio.
erro.agrupadorVigenteMesmoTipo=N\u00e3o \u00e9 permitido ter dois agrupadores vigentes para o mesmo tipo de solicita\u00e7\u00e3o!
relatorioGerencial.tipoObrigatorio=Selecione um tipo de solicitação.
relatorioGerencial.tipoInvalido=O tipo de solicitação deve estar ativo e não excluído.
relatorioGerencial.campoObrigatorio=Selecione pelo menos um campo para compor o relatório.
relatorioGerencial.campoInvalido=Existem campos duplicados ou indisponíveis para o tipo de solicitação selecionado.
relatorioGerencial.duplicado=Existe um relatório já cadastrado para o tipo de solicitação selecionado
relatorioGerencial.conflito=O relatório foi alterado por outra sessão ou não está mais em rascunho. Recarregue a configuração.

mpas.csv
/src/main/resources/mpas.csv
View

RelatorioGerencialServiceTest.java
/src/test/java/br/gov/caixa/pedes/sistemas/simkt/service/RelatorioGerencialServiceTest.java
View
Row 2. Clickable
