package br.gov.caixa.spi.dict.ejb;


import br.gov.caixa.mpi.dict.api.dto.DevolucaoDto;
import br.gov.caixa.mpi.dict.api.dto.ListaResponseDto;
import br.gov.caixa.spi.dict.client.RefundMpiDict;
import br.gov.caixa.spi.dict.dao.DevolucaoBacenDao;
import br.gov.caixa.spi.dict.util.JBossProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EventoDevolucaoBacenEjbTest {

    public static final String DATA_INICIO = "12/10";
    public static final String DATA_FIM = "12/11";
    public static final String ISPB = "ispb";

    @InjectMocks
    private EventoDevolucaoBacenEjb eventoDevolucaoBacenEjb;

    @Mock
    private JBossProperties jBossProperties;

    @Mock
    private RefundMpiDict devolucaoMpiDict;

    @Mock
    private DevolucaoBacenDao devolucaoDao;

    @Mock
    private EventoDevolucaoBacenHelperEjb eventoDevolucaoBacenHelperEjb;

    @Test
    public void cadastrarDevolucoesBacenTest(){

        DevolucaoDto devolucaoDto = new DevolucaoDto();

        ListaResponseDto<DevolucaoDto> lista1 = new ListaResponseDto<>();

        lista1.setMaisElementos(true);

        lista1.setLista(new ArrayList<>());

        lista1.getLista().add(devolucaoDto);

        ListaResponseDto<DevolucaoDto> lista2 = new ListaResponseDto<>();

        lista2.setMaisElementos(false);

        lista2.setLista(new ArrayList<>());

        lista2.getLista().add(devolucaoDto);

        when(devolucaoMpiDict.listDevolucao(any())).thenReturn(lista1, lista2);
        when(jBossProperties.getIspbCaixa()).thenReturn(ISPB);
        when(eventoDevolucaoBacenHelperEjb.trataNovaDevolucao(any())).thenReturn(true);

        eventoDevolucaoBacenEjb.cadastrarDevolucoesBacen(DATA_INICIO, DATA_FIM);
        assertEquals(2,eventoDevolucaoBacenEjb.cadastrarDevolucoesBacen(DATA_INICIO, DATA_FIM));

    }

    @Test
    public void cadastrarDevolucoesBacenTestJaCadastrado(){

        DevolucaoDto devolucaoDto = new DevolucaoDto();

        ListaResponseDto<DevolucaoDto> lista1 = new ListaResponseDto<>();

        lista1.setMaisElementos(false);

        lista1.setLista(new ArrayList<>());

        lista1.getLista().add(devolucaoDto);

        ListaResponseDto<DevolucaoDto> lista2 = new ListaResponseDto<>();

        lista2.setMaisElementos(true);

        lista2.setLista(new ArrayList<>());

        lista2.getLista().add(devolucaoDto);

        ListaResponseDto<DevolucaoDto> lista3 = new ListaResponseDto<>();

        lista3.setMaisElementos(false);

        lista3.setLista(new ArrayList<>());

        lista3.getLista().add(devolucaoDto);

        when(devolucaoDao.existeDevolucaoPorProtocoloBacen(any())).thenReturn(true);
        when(devolucaoMpiDict.listDevolucao(any())).thenReturn(lista1, lista2, lista3);
        when(jBossProperties.getIspbCaixa()).thenReturn(ISPB);
        when(eventoDevolucaoBacenHelperEjb.trataNovaDevolucao(any())).thenReturn(true);

        eventoDevolucaoBacenEjb.cadastrarDevolucoesBacen(DATA_INICIO, DATA_FIM);

        assertEquals(2,eventoDevolucaoBacenEjb.cadastrarDevolucoesBacen(DATA_INICIO, DATA_FIM));
    }


}
