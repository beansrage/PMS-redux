import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductsComponent } from "./products/products.component";
import { HomeComponent } from "./home/home.component";
// import { NavbarComponent } from "./navbar/navbar.component";
import { ContactComponent } from "./contact/contact.component";

const routes: Routes = [
  {path: "products", component: ProductsComponent },
  {path: "home", component: HomeComponent },
  {path: "contact", component: ContactComponent },
  // {path: "contact", component: ContactComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: '**', redirectTo: 'home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
