import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationComponent } from 'src/app/components/navigation/navigation.component';
import { HomeComponent } from './home.component';
import { CategoriesComponent } from '../categories/categories.component';
import { AccountsComponent } from '../accounts/accounts.component';
import { HistoryComponent } from '../history/history.component';
import { ReportsComponent } from '../reports/reports.component';

@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    HomeComponent
  ]
})
export class HomeModule { }
