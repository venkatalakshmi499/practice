import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminoptionsComponent } from './adminoptions/adminoptions.component';
import { HomeComponent } from './home/home.component';
import { Library1Component } from './lib/library1/library1.component';
import { Library2Component } from './lib/library2/library2.component';
import { RentbooksComponent } from './lib/rentbooks/rentbooks.component';
import { LibraryComponent } from './library/library.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { UserregisterComponent } from './userregister/userregister.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'userlogin',component:UserloginComponent},
  {path:'userregister',component:UserregisterComponent},
  {path:'library',component:LibraryComponent},
  {path:'navbar',component:NavbarComponent},
  {path:'lib',component:Library1Component},
  {path:'libcart',component:Library2Component},
  {path:'rent',component:RentbooksComponent},
  {path:'admin',component:AdminoptionsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[HomeComponent,AdminloginComponent,UserloginComponent,UserregisterComponent,LibraryComponent,
  NavbarComponent,Library1Component,Library2Component,RentbooksComponent,AdminoptionsComponent]
