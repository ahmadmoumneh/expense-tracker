import { Component, Input, OnInit } from '@angular/core';
import { Category } from 'src/app/classes/Category';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})
export class CategoryListComponent{
  @Input() categories: Category[];
}
