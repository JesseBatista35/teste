package br.gov.caixa.nsgd.test.service;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.inject.Inject;

import org.jboss.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.gov.caixa.sid01.dto.request.ParametrosSistema;
import br.gov.caixa.sid01.dto.request.credito.CreditoBloqueadoRequest;
import br.gov.caixa.sid01.dto.request.credito.CreditoRequest;
import br.gov.caixa.sid01.dto.request.debito.DebitoBloqueadoRequest;
import br.gov.caixa.sid01.dto.request.debito.DebitoRequest;
import br.gov.caixa.sid01.dto.request.desfazimento.DesfazimentoCreditoRequest;
import br.gov.caixa.sid01.dto.request.desfazimento.DesfazimentoDebitoRequest;
import br.gov.caixa.sid01.dto.request.estorno.EstornoCreditoRequest;
import br.gov.caixa.sid01.dto.request.estorno.EstornoDebitoRequest;
import br.gov.caixa.sid01.service.LancamentoService;
import br.gov.caixa.sid01.util.security.SSOHandlerUtil;
import br.gov.caixa.sid01.util.security.SSOTokenClaim;
import br.gov.caixa.sid01.wscics.lancamentoV4.D01POSOLPort;
import br.gov.caixa.sid01.wscics.lancamentoV4.req.ProgramInterface.Request;
import br.gov.caixa.sid01.wscics.lancamentoV4.req.ProgramInterface.Request.D01WrsolEntrada;
import br.gov.caixa.sid01.wscics.lancamentoV4.resp.ProgramInterface.Response;
import br.gov.caixa.sid01.wscics.lancamentoV4.resp.ProgramInterface.Response.D01WrsolSaida;

public class LancamentoServiceTest {
	
	private static final String SUCCESS = "Success";
	private static final String CODIGO_OPERADOR = "codigoOperador";

	@Inject
	SSOTokenClaim token;

	@Inject
	private SSOHandlerUtil sso;
	
    @InjectMocks
    private LancamentoService lancamentoService;

    @Mock
    private D01POSOLPort port;

    @Mock
    private Logger log;

    @Mock
    private Response response;
    

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreditar() {
        // Prepare the input values
        CreditoRequest creditoRequest = Requests.getCreditoRequest();
        D01WrsolEntrada entrada = new D01WrsolEntrada();
        ParametrosSistema paramsReq = new ParametrosSistema();

        // Prepare the mock response
        D01WrsolSaida saida = new D01WrsolSaida();
        saida.setD01WrsolNuRetorno((short) 0);
        saida.setD01WrsolCoTipoMensagem("00");
        saida.setD01WrsolNuMensagem((short) 1);
        saida.setD01WrsolDeMensagem(SUCCESS);
        saida.setD01WrsolNuNsuNsgd(123456L);
        saida.setD01WrsolCoRetornoIso("ISO");

        when(response.getD01WrsolSaida()).thenReturn(saida);
        when(port.lancamentoV4(any(Request.class))).thenReturn(response);

        assertThrows(NullPointerException.class, () -> lancamentoService.creditar(creditoRequest, entrada, paramsReq, CODIGO_OPERADOR));

        verify(port).lancamentoV4(any(Request.class));
    }
    
    @Test
    void testDeditar() {
    	DebitoRequest debitoRequest = Requests.getDebitoRequest();
        D01WrsolEntrada entrada = new D01WrsolEntrada();
        ParametrosSistema paramsReq = new ParametrosSistema();

        // Prepare the mock response
        D01WrsolSaida saida = new D01WrsolSaida();
        saida.setD01WrsolNuRetorno((short) 0);
        saida.setD01WrsolCoTipoMensagem("00");
        saida.setD01WrsolNuMensagem((short) 1);
        saida.setD01WrsolDeMensagem(SUCCESS);
        saida.setD01WrsolNuNsuNsgd(123456L);
        saida.setD01WrsolCoRetornoIso("ISO");

        when(response.getD01WrsolSaida()).thenReturn(saida);
        when(port.lancamentoV4(any(Request.class))).thenReturn(response);

        assertThrows(NullPointerException.class, () -> lancamentoService.debitar(debitoRequest, entrada, paramsReq, CODIGO_OPERADOR));

        verify(port).lancamentoV4(any(Request.class));
    }
    
    @Test
    void testDeditarBloqueado() {
    	DebitoBloqueadoRequest debitoRequest = Requests.getMockDeditoBloqueado();
        D01WrsolEntrada entrada = new D01WrsolEntrada();
        ParametrosSistema paramsReq = new ParametrosSistema();

        // Prepare the mock response
        D01WrsolSaida saida = new D01WrsolSaida();
        saida.setD01WrsolNuRetorno((short) 0);
        saida.setD01WrsolCoTipoMensagem("00");
        saida.setD01WrsolNuMensagem((short) 1);
        saida.setD01WrsolDeMensagem(SUCCESS);
        saida.setD01WrsolNuNsuNsgd(123456L);
        saida.setD01WrsolCoRetornoIso("ISO");

        when(response.getD01WrsolSaida()).thenReturn(saida);
        when(port.lancamentoV4(any(Request.class))).thenReturn(response);

        assertThrows(NullPointerException.class, () -> lancamentoService.debitarBloqueado(debitoRequest, entrada, paramsReq, CODIGO_OPERADOR));

        verify(port).lancamentoV4(any(Request.class));
    }

    @Test
    void testCreditarBloqueado() {
    	CreditoBloqueadoRequest debitoRequest = Requests.getMockCreditoBloqueado();
    	D01WrsolEntrada entrada = new D01WrsolEntrada();
    	ParametrosSistema paramsReq = new ParametrosSistema();
    	
    	// Prepare the mock response
    	D01WrsolSaida saida = new D01WrsolSaida();
    	saida.setD01WrsolNuRetorno((short) 0);
    	saida.setD01WrsolCoTipoMensagem("00");
    	saida.setD01WrsolNuMensagem((short) 1);
    	saida.setD01WrsolDeMensagem(SUCCESS);
    	saida.setD01WrsolNuNsuNsgd(123456L);
    	saida.setD01WrsolCoRetornoIso("ISO");
    	
    	when(response.getD01WrsolSaida()).thenReturn(saida);
    	when(port.lancamentoV4(any(Request.class))).thenReturn(response);
    	
    	assertThrows(NullPointerException.class, () -> lancamentoService.creditarBloqueado(debitoRequest, entrada, paramsReq, CODIGO_OPERADOR));
    	
    	verify(port).lancamentoV4(any(Request.class));
    }
    
    @Test
    void testEstornarCredito() {
    	EstornoCreditoRequest debitoRequest = Requests.getEstornoCreditoRequest();
    	D01WrsolEntrada entrada = new D01WrsolEntrada();
    	ParametrosSistema paramsReq = new ParametrosSistema();
    	
    	// Prepare the mock response
    	D01WrsolSaida saida = new D01WrsolSaida();
    	saida.setD01WrsolNuRetorno((short) 0);
    	saida.setD01WrsolCoTipoMensagem("00");
    	saida.setD01WrsolNuMensagem((short) 1);
    	saida.setD01WrsolDeMensagem(SUCCESS);
    	saida.setD01WrsolNuNsuNsgd(123456L);
    	saida.setD01WrsolCoRetornoIso("ISO");
    	
    	when(response.getD01WrsolSaida()).thenReturn(saida);
    	when(port.lancamentoV4(any(Request.class))).thenReturn(response);
    	
    	assertThrows(NullPointerException.class, () -> lancamentoService.estornarCredito(debitoRequest, entrada, paramsReq, CODIGO_OPERADOR));
    	
    	verify(port).lancamentoV4(any(Request.class));
    }

    
    @Test
    void testEstornarDebito() {
    	EstornoDebitoRequest debitoRequest = Requests.getEstornoDebitoRequest();
    	D01WrsolEntrada entrada = new D01WrsolEntrada();
    	ParametrosSistema paramsReq = new ParametrosSistema();
    	
    	// Prepare the mock response
    	D01WrsolSaida saida = new D01WrsolSaida();
    	saida.setD01WrsolNuRetorno((short) 0);
    	saida.setD01WrsolCoTipoMensagem("00");
    	saida.setD01WrsolNuMensagem((short) 1);
    	saida.setD01WrsolDeMensagem(SUCCESS);
    	saida.setD01WrsolNuNsuNsgd(123456L);
    	saida.setD01WrsolCoRetornoIso("ISO");
    	
    	when(response.getD01WrsolSaida()).thenReturn(saida);
    	when(port.lancamentoV4(any(Request.class))).thenReturn(response);
    	
    	assertThrows(NullPointerException.class, () -> lancamentoService.estornarDebito(debitoRequest, entrada, paramsReq, CODIGO_OPERADOR));
    	
    	verify(port).lancamentoV4(any(Request.class));
    }
    
    @Test
    void testDesfazerCredito() {
    	DesfazimentoCreditoRequest debitoRequest = Requests.getDesfazimentoCreditoRequest();
    	D01WrsolEntrada entrada = new D01WrsolEntrada();
    	ParametrosSistema paramsReq = new ParametrosSistema();
    	
    	// Prepare the mock response
    	D01WrsolSaida saida = new D01WrsolSaida();
    	saida.setD01WrsolNuRetorno((short) 0);
    	saida.setD01WrsolCoTipoMensagem("00");
    	saida.setD01WrsolNuMensagem((short) 1);
    	saida.setD01WrsolDeMensagem(SUCCESS);
    	saida.setD01WrsolNuNsuNsgd(123456L);
    	saida.setD01WrsolCoRetornoIso("ISO");
    	
    	when(response.getD01WrsolSaida()).thenReturn(saida);
    	when(port.lancamentoV4(any(Request.class))).thenReturn(response);
    	
    	assertThrows(NullPointerException.class, () -> lancamentoService.desfazerCredito(debitoRequest, entrada, paramsReq, CODIGO_OPERADOR));
    	
    	verify(port).lancamentoV4(any(Request.class));
    }
    
    @Test
    void testDesfazerDebito() {
    	DesfazimentoDebitoRequest debitoRequest = Requests.getDesfazimentoDebitoRequest();
    	D01WrsolEntrada entrada = new D01WrsolEntrada();
    	ParametrosSistema paramsReq = new ParametrosSistema();
    	
    	// Prepare the mock response
    	D01WrsolSaida saida = new D01WrsolSaida();
    	saida.setD01WrsolNuRetorno((short) 0);
    	saida.setD01WrsolCoTipoMensagem("00");
    	saida.setD01WrsolNuMensagem((short) 1);
    	saida.setD01WrsolDeMensagem(SUCCESS);
    	saida.setD01WrsolNuNsuNsgd(123456L);
    	saida.setD01WrsolCoRetornoIso("ISO");
    	
    	when(response.getD01WrsolSaida()).thenReturn(saida);
    	when(port.lancamentoV4(any(Request.class))).thenReturn(response);
    	
    	assertThrows(NullPointerException.class, () -> lancamentoService.desfazerDebito(debitoRequest, entrada, paramsReq, CODIGO_OPERADOR));
    	
    	verify(port).lancamentoV4(any(Request.class));
    }
}






Skip to main content
Azure DevOps
projetos
/
Caixa
/
Repos
/
Files
/

SID01-lancamentos-financeiros
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
SID01-lancamentos-financeiros

org.eclipse.jdt.core.prefs
org.eclipse.m2e.core.prefs
org.hibernate.eclipse.console.prefs
src
main
test
java
br
gov
caixa
nsgd
test
service
CifEnumTest.java
D01POSOLPortMock.java
LancamentoDebitoCreditoBloqueadoServiceImplExtends.java
LancamentoServiceTest.java
LancementoServiceSegundo.java
ParseDadosInformadosTest.java
ParseEntradaTest.java
Requests.java
ServiceRequestFacadeTest.java
util
validation
LongAsDataYmdNotOptionalValidatorTest.java
StringAsCifCreditoBloqueadoTest.java
StringAsCifDebitoBloqueadoTest.java
StringAsIdemPotenciaValidatorTest.java
DateUtilTest.java
LongAsDataYmdNotOptionalValidatorTest.java
ParseUtilTest.java
StringAsIdemPotenciaValidatorTest.java
TesteGenerico.java
sid01
util
CnpjAlfanumericoUtilsTest.java

develop


/
test
/
java
/
br
/
gov
/
caixa
/
nsgd
/
test
/
service
/
LancamentoServiceTest.java
LancamentoServiceTest.java

Edit

Contents
History
Compare
Blame

1234567891011121314151617181920212223242526272829303132333435363738394041424344
package br.gov.caixa.nsgd.test.service;


import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.inject.Inject;

…    	saida.setD01WrsolCoRetornoIso("ISO");
    	
    	when(response.getD01WrsolSaida()).thenReturn(saida);
    	when(port.lancamentoV4(any(Request.class))).thenReturn(response);
    	
    	assertThrows(NullPointerException.class, () -> lancamentoService.desfazerDebito(debitoRequest, entrada, paramsReq, CODIGO_OPERADOR));
    	
    	verify(port).lancamentoV4(any(Request.class));
    }
}
