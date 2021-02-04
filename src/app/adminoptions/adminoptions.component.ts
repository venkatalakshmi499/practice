import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminoptions',
  templateUrl: './adminoptions.component.html',
  styleUrls: ['./adminoptions.component.css']
})
export class AdminoptionsComponent implements OnInit {

  constructor(private routes : Router) { }

  ngOnInit(): void {
  }
  btnClick=  () => {
    this.routes.navigate(['/rent']);
};

btnClick1=  () => {
  this.routes.navigate(['/lib']);
};
}
