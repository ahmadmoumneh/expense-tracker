import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavigationComponent } from 'src/app/components/navigation/navigation.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [
    CommonModule,
    NavigationComponent
  ],
  exports: [
    HomeComponent
  ]
})
export class HomeModule { }
