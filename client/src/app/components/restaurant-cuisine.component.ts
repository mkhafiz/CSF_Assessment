import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-restaurant-cuisine',
  templateUrl: './restaurant-cuisine.component.html',
  styleUrls: ['./restaurant-cuisine.component.css']
})
export class RestaurantCuisineComponent implements OnInit {
	
	// TODO Task 3
	// For View 2

  constructor() { }

  ngOnInit(): void {

  }

  GetSpecificCuisines(cusisine: any): string {
    return Restaurant.cusisine;
  }

  backPage() {
    
  }

}
