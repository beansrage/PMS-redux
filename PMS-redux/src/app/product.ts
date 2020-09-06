import { Interface } from "readline"


export interface Product {
    id: number;
    product_id: string;
    product_name: string;
    product_code: string;
    release_date: string;
    description: string; 
    price: number;
    star_rating: number;
    imgUrl: string;
// {
//     "id": 1,
//     "product_id": "1",
//     "product_name": "Tele-coms",
//     "product_code": "TC-1",
//     "release_date": "7/14/2021",
//     "description": "Celluar device used to communicate with various 'bots' ",
//     "price": 194.62,
//     "star_rating": 3.2,
//     "imgUrl": "assets/images/telecom.png"
//   }

}