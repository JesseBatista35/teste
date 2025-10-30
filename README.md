<div class="container">

  <!-- Card de Dicas -->
  <nb-card class="mb-4">
    <nb-card-header>Dicas</nb-card-header>
    <nb-card-body>
      <p>Selecione o tipo de teste para realizar uma simulação de regra de firewall.</p>
    </nb-card-body>
  </nb-card>

  <!-- Dropdown de Opções de Teste -->
  <div class="w-full mb-4">
    <label class="label">Opções de teste</label>
    <nb-select placeholder="Selecione" [(selected)]="selectedTestType" (selectedChange)="onTestTypeChange()">
      <nb-option value="container">Container</nb-option>
      <nb-option value="vm" disabled>VM (Em breve)</nb-option>
      <nb-option value="mainframe" disabled>Mainframe (Em breve)</nb-option>
    </nb-select>
  </div>

  <!-- Cards de informações (mostram apenas se tipo de teste for Container) -->
  <div *ngIf="selectedTestType === 'container'" class="mt-4 space-y-4">

    <!-- Card: Informações do ambiente -->
    <nb-card>
      <nb-card-header>Informações do ambiente</nb-card-header>
      <nb-card-body>
        <div class="grid gap-4 md:grid-cols-3">
          <div class="form-group">
            <label>Cluster</label>
            <input nbInput fullWidth placeholder="Cluster" [(ngModel)]="environment.cluster" />
          </div>

          <div class="form-group">
            <label>Projeto</label>
            <input nbInput fullWidth placeholder="Projeto" [(ngModel)]="environment.projeto" />
          </div>

          <div class="form-group">
            <label>IP de saída</label>
            <input nbInput fullWidth placeholder="IP de saída" [(ngModel)]="environment.ipSaida" />
          </div>
        </div>
      </nb-card-body>
    </nb-card>

    <!-- Card: Dados para teste -->
    <nb-card>
      <nb-card-header>Dados para teste</nb-card-header>
      <nb-card-body>
        <div class="grid gap-4 md:grid-cols-3">
          <div class="form-group">
            <label>Protocolo de teste</label>
            <nb-select placeholder="Selecione" [(selected)]="testData.protocol">
              <nb-option value="tcp">TCP</nb-option>
              <nb-option value="udp">UDP</nb-option>
            </nb-select>
          </div>

          <div class="form-group">
            <label>IP de destino ou domínio</label>
            <input nbInput fullWidth placeholder="Ex: 192.168.0.1 ou google.com" [(ngModel)]="testData.ipDestino" />
          </div>

          <div class="form-group">
            <label>Porta</label>
            <input nbInput fullWidth type="number" placeholder="Porta" [(ngModel)]="testData.porta" />
          </div>
        </div>

        <div class="mt-3">
          <button nbButton status="primary" (click)="addTestData()" [disabled]="testList.length >= maxTests">+</button>
        </div>

        <!-- Lista de IPs adicionados -->
        <div *ngIf="testList.length > 0" class="mt-4">
          <nb-list>
            <nb-list-item *ngFor="let item of testList; let i = index" class="d-flex justify-between align-center">
              <span>{{ item.protocol.toUpperCase() }} - {{ item.ipDestino }}:{{ item.porta }}</span>
              <button nbButton ghost status="danger" size="tiny" (click)="removeTest(i)">
                <nb-icon icon="trash-2-outline"></nb-icon>
              </button>
            </nb-list-item>
          </nb-list>
        </div>
      </nb-card-body>
    </nb-card>

  </div>
</div>

