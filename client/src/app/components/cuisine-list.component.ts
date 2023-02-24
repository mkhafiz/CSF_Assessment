import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cuisine-list',
  templateUrl: './cuisine-list.component.html',
  styleUrls: ['./cuisine-list.component.css']
})
export class CuisineListComponent implements OnInit {

	// TODO Task 2
	// For View 1
GetCuisines():void {
  return Restaurant.cusisine;

}
}
