import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  private productUrl = "http://localhost:8080/products";

  constructor(private http: HttpClient) { }

  getProducts() {
    return this.http.get(this.productUrl);
  }
}
