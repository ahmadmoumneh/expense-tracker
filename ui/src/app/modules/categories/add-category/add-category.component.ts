import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Category } from 'src/app/classes/Category';
import { CategoryService } from 'src/app/services/category.service';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent implements OnInit {

  currentCategory: Category;
  
  @Output('addCategory') onAddCategory = new EventEmitter();

  constructor(private catgoryService: CategoryService){}

  ngOnInit() {
    this.currentCategory = new Category();
  }

  addCategory() {
    this.catgoryService.addCategory(this.currentCategory).subscribe(() => {
      this.onAddCategory.emit();
    });
  }
}
