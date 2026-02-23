package belajar.pakage.data;

import java.util.Objects;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return  "Product name: "+ name + " , price "+ price;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }

    // ini di generate otomatis code.generate.equals()andhashcode()
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    // ini di code manual
//    public boolean equals(Object o){
//        if(o == this){
//            return true;
//        }
//
//        if(!(o instanceof Product)){
//         return false;
//        }
//        Product product = (Product) o;
//
//        if(this.price != product.price){
//            return false;
//        }
//        if(this.name != null){
//            return this.name.equals(product.name);
//        }else{
//            return product.name == null;
//        }
//    }
}
