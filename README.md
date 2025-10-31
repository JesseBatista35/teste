<nb-layout [nbSpinner]="carregando">
  <nb-layout-header fixed class= 'nb-layout-header noprint' *ngIf="auth">

      <a routerLink="/" (click)="flip()" >
        <img src="assets/imagens/logo_caixa_transparent.png" width="110px" style="padding: 5px 0px 0px 0px;">
        <span class='color-title' style="margin-left: 10px;"><b>IF</b></span><span class='color-title' style=" margin-left: 10px;">InfraFácil</span>
      </a>      
        <app-chat-boot-ia></app-chat-boot-ia>
    <span class="flex-expand"></span>
    
      <span class='color-title' *ngIf="strSistemaAmbienteAtivo!='' && !isTeia  && !isTeiaSuporte" >{{strSistemaAmbienteAtivo}} | </span>
    <span class='color-title' *ngIf="strSistemaAmbienteAtivo!='' && !isTeia  && !isTeiaSuporte" >&nbsp;&nbsp;Trocar:&nbsp;&nbsp;</span>
    <span class='color-title' *ngIf="strSistemaAmbienteAtivo=='' && !isTeia  && !isTeiaSuporte" >&nbsp;&nbsp;Selecione o sistema:&nbsp;&nbsp;</span>
    <input type="text"  *ngIf="!isTeia  && !isTeiaSuporte"
              nbInput 
              size="small" 
              fullWidth
              style="width: 23%;"
              placeholder="Digite o sistema"
              [(ngModel)] = "sisfiltro" 
              (ngModelChange)="onModelChange($event)"
              [nbAutocomplete]="autoNgModel"
              />
              <nb-autocomplete #autoNgModel >

                <nb-option *ngFor="let option of filteredNgModelOptions$ | async" [value]="option['sistema']" (click)="selecionarSistema()">
                  {{ option['sistema'] }}
                </nb-option>
          
              </nb-autocomplete>:&nbsp;&nbsp;     
    <nb-actions size="small" class="pull-right">         
      <nb-action  icon="power-outline" class='red-icon' nbTooltip="Sair do portal Infra Fácil"  nbTooltipStatus="show" (click)="sair()" *ngIf="auth"></nb-action>
    </nb-actions> 
    
       
  </nb-layout-header>
  <nb-sidebar class="nb-sidebar" state="{{stateMenu}}" tag="menuside" [fixed]="false" *ngIf="auth">      
    <nb-menu [items]="items"></nb-menu>
  </nb-sidebar>

  <nb-layout-column class="position-relative {{backgroundClass}}">
    
    <div class="position-absolute" *ngIf="auth">
      <nb-icon (click)="menuChangeState()" class="icon-menu-expanded" icon="{{iconeMenu}}"></nb-icon>
    </div>
    
        <nb-card accent="info" >
          <nb-card-header class="noprint">
            <div class="d-flex justify-content-between" >
              <div>
                {{titulo}}
              </div>
              <div>

                <button style="margin-left: 140px" nbButton status="basic" ghost (click)="ajuda()" nbTooltip="Precisando de Ajuda? Clique aqui"  nbTooltipStatus="info">
                <nb-icon icon="question-mark-circle-outline"></nb-icon></button>
              </div>
            </div>            

          </nb-card-header>
          <nb-card-body>            
            <router-outlet></router-outlet>
          </nb-card-body>
        </nb-card> 

  </nb-layout-column>

</nb-layout>







