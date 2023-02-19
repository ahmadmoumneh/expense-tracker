import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountsComponent } from './modules/accounts/accounts.component';
import { CategoriesComponent } from './modules/categories/categories.component';
import { HistoryComponent } from './modules/history/history.component';
import { HomeComponent } from './modules/home/home.component';
import { ReportsComponent } from './modules/reports/reports.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'categories', component: CategoriesComponent},
  {path: 'accounts', component: AccountsComponent},
  {path: 'history', component: HistoryComponent},
  {path: 'reports', component: ReportsComponent},
  {path: '**', redirectTo: 'home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
