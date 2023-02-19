import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddCategoryComponent } from './add-category/add-category.component';
import { CategoriesComponent } from './categories.component';
import { CategoryListComponent } from './category-list/category-list.component';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AddCategoryComponent,
    CategoriesComponent,
    CategoryListComponent
  ],
  imports: [
    CommonModule,
    FormsModule
  ]
})
export class CategoriesModule { }
