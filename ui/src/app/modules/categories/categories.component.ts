import { Component } from '@angular/core';
import { Category } from 'src/app/classes/Category';
import { CategoryService } from 'src/app/services/category.service';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent {
  categories: Category[] = [];

  constructor(private categoryService: CategoryService){}

  ngOnInit() {
    this.updateList();
  }

  updateList() {
    this.categoryService.getAllCategories().subscribe(categories => {
      this.categories = categories;
    });
  }
}
