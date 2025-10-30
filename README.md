html

<div class="container">
  <!-- Card de Dicas -->
  <mat-card class="mb-4">
    <mat-card-title>Dicas</mat-card-title>
    <mat-card-content>
      <p>Selecione o tipo de teste para realizar uma simulação de regra de firewall.</p>
    </mat-card-content>
  </mat-card>

  <!-- Dropdown de Opções de Teste -->
  <mat-form-field appearance="outline" class="w-full">
    <mat-label>Opções de teste</mat-label>
    <mat-select [(ngModel)]="selectedTestType" (selectionChange)="onTestTypeChange()">
      <mat-option [value]="'container'">Container</mat-option>
      <mat-option [value]="'vm'" disabled>VM (Em breve)</mat-option>
      <mat-option [value]="'mainframe'" disabled>Mainframe (Em breve)</mat-option>
    </mat-select>
  </mat-form-field>

  <!-- Cards de informações (mostram apenas se tipo de teste for Container) -->
  <div *ngIf="selectedTestType === 'container'" class="mt-4 space-y-4">
    
    <!-- Card: Informações do ambiente -->
    <mat-card>
      <mat-card-title>Informações do ambiente</mat-card-title>
      <mat-card-content class="grid gap-4 md:grid-cols-3">
        <mat-form-field appearance="outline">
          <mat-label>Cluster</mat-label>
          <input matInput [(ngModel)]="environment.cluster" />
        </mat-form-field>

        <mat-form-field appearance="outline">
          <mat-label>Projeto</mat-label>
          <input matInput [(ngModel)]="environment.projeto" />
        </mat-form-field>

        <mat-form-field appearance="outline">
          <mat-label>IP de saída</mat-label>
          <input matInput [(ngModel)]="environment.ipSaida" />
        </mat-form-field>
      </mat-card-content>
    </mat-card>

    <!-- Card: Dados para teste -->
    <mat-card>
      <mat-card-title>Dados para teste</mat-card-title>
      <mat-card-content class="space-y-4">
        <div class="grid gap-4 md:grid-cols-3">
          <mat-form-field appearance="outline">
            <mat-label>Protocolo de teste</mat-label>
            <mat-select [(ngModel)]="testData.protocol">
              <mat-option value="tcp">TCP</mat-option>
              <mat-option value="udp">UDP</mat-option>
            </mat-select>
          </mat-form-field>

          <mat-form-field appearance="outline">
            <mat-label>IP de destino ou domínio</mat-label>
            <input matInput [(ngModel)]="testData.ipDestino" />
          </mat-form-field>

          <mat-form-field appearance="outline">
            <mat-label>Porta</mat-label>
            <input matInput type="number" [(ngModel)]="testData.porta" />
          </mat-form-field>
        </div>

        <button mat-raised-button color="primary" (click)="addTestData()" [disabled]="testList.length >= maxTests">
          +
        </button>

        <!-- Lista de IPs adicionados -->
        <div *ngIf="testList.length > 0">
          <mat-list>
            <mat-list-item *ngFor="let item of testList; let i = index">
              <span>{{ item.protocol.toUpperCase() }} - {{ item.ipDestino }}:{{ item.porta }}</span>
              <button mat-icon-button color="warn" (click)="removeTest(i)">
                <mat-icon>delete</mat-icon>
              </button>
            </mat-list-item>
          </mat-list>
        </div>
      </mat-card-content>
    </mat-card>

  </div>
</div>



component.ts



import { Component } from '@angular/core';

@Component({
  selector: 'app-teste-fw',
  templateUrl: './teste-fw.component.html',
  styleUrls: ['./teste-fw.component.css']
})
export class TesteFwComponent {
  selectedTestType: string | null = null;

  environment = {
    cluster: '',
    projeto: '',
    ipSaida: ''
  };

  testData = {
    protocol: '',
    ipDestino: '',
    porta: ''
  };

  testList: any[] = [];
  maxTests = 6; // pode mudar para 8 se preferirem

  onTestTypeChange() {
    // Limpa campos quando muda o tipo
    this.environment = { cluster: '', projeto: '', ipSaida: '' };
    this.testData = { protocol: '', ipDestino: '', porta: '' };
    this.testList = [];
  }

  addTestData() {
    if (!this.testData.protocol || !this.testData.ipDestino || !this.testData.porta) {
      alert('Preencha todos os campos!');
      return;
    }

    if (this.testList.length >= this.maxTests) {
      alert(`Máximo de ${this.maxTests} IPs atingido.`);
      return;
    }

    this.testList.push({ ...this.testData });
    this.testData = { protocol: '', ipDestino: '', porta: '' };
  }

  removeTest(index: number) {
    this.testList.splice(index, 1);
  }
}


css.


.container {
  max-width: 1000px;
  margin: 20px auto;
  display: flex;
  flex-direction: column;
}

.mb-4 {
  margin-bottom: 16px;
}

.w-full {
  width: 100%;
}

.mt-4 {
  margin-top: 16px;
}

.space-y-4 > * + * {
  margin-top: 16px;
}


app.module.ts

import { FormsModule } from '@angular/forms';
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';

@NgModule({
  imports: [
    FormsModule,
    MatCardModule,
    MatFormFieldModule,
    MatSelectModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    MatListModule
  ]
})
export class AppModule { }



if (this.services.restrito_regra_firewall) {
      restritoChildren.push({
        title: 'Regra de Firewall',
        link: '/restrito/regras-firewall',
      });
    }


