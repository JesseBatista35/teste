<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<ui:composition xmlns="http://www.w3.org/1999/xhtml" xmlns:h="http://java.sun.com/jsf/html" xmlns:f="http://java.sun.com/jsf/core" xmlns:p="http://primefaces.org/ui" xmlns:ui="http://java.sun.com/jsf/facelets" template="/template/template.xhtml">
	<ui:define name="conteudo">
		<div class="container corpo">

			<ul class="breadcrumb">
				<li class="strong"><h:outputText value="#{mensagens['display.voce.esta.em']}" /></li>
				<li><a href="#"> <h:outputText value="#{mensagens['display.menu']}" />
				</a> <span class="divider">/ </span></li>
				<li><a href="#"><h:outputText value="#{mensagens['display.mantem.operacao.habitacional']}" /></a> <span class="divider">/ </span></li>
				<li class="active"><h:outputText value="#{mensagens['display.inclui.operacao.habitacional']}" /></li>
			</ul>
			<h:messages id="mensagem" escape="false" infoClass="alert alert-info" warnClass="alert" errorClass="alert alert-error" />
			<h:form prependId="false" acceptcharset="UTF-8">
				<h:inputHidden id="validator" validator="identificarOperacaoHabitacionalValidator" />
				<div class="page-header">
					<h3><h:outputText value="#{mensagens['display.inclui.operacao.habitacional']}" /></h3>
				</div>
				<fieldset>
					<div class="row">
						<div class="span">
							<label><h:outputText value="#{mensagens['display.agente.financeiro']}: " /></label>
							<h:selectOneMenu id="agenteFinanceiro" data-live-search="true" styleClass="span4 selectpickerComplete show-tick form-control" value="#{identificarOperacaoHabitacionalBean.agenteSelecionado}">
								<f:selectItem itemValue="" itemLabel="" />
								<f:selectItems value="#{identificarOperacaoHabitacionalBean.listaAgenteFinanceiro}" var="agente" itemLabel="#{agente.agenteCompleto}" itemValue="#{agente.agenteCompleto}" />
								<p:ajax global="false" event="change" oncomplete="focar('nuContrato')"/>
							</h:selectOneMenu>
						</div>
					</div>

					<div class="row">
						<div class="span">
							<label><h:outputText value="#{mensagens['display.numero.contrato']}: " /></label>
							<h:inputText id="nuContrato" styleClass="span3" onkeyup="return pular(this, 'hipoteca', event)" value="#{identificarOperacaoHabitacionalBean.nuContrato}" maxlength="13" autocomplete="off" />
						</div>

						<div class="span">
							<label><h:outputText value="#{mensagens['display.hip']}: " /></label>
							<h:inputText class="span1" id="hipoteca" onkeyup="return pular(this, 'btnPesquisar', event)" value="#{identificarOperacaoHabitacionalBean.hipoteca}" maxlength="1" autocomplete="off" />
						</div>
					</div>
				</fieldset>
				<div class="form-actions">
					<h:commandLink id="btnPesquisar" onclick="showModal('ajaxStatus')" action="#{identificarOperacaoHabitacionalBean.validarContrato()}" styleClass="btn btn-warning">
						<span> <h:outputText value="#{mensagens['display.botao.validar']}" />
						</span>
					</h:commandLink>
				</div>
			</h:form>
		</div>
		<script src="#{facesContext.externalContext.request.contextPath}/resources/js/agenteFinanceiro.js"></script>
	</ui:define>
</ui:composition>
