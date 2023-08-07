package springCoreApp;

import java.util.ArrayList;
import java.util.List;

public class Market {
 private List<Products> productList = new ArrayList<>();
 private String name;
 private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProductList(List<Products> productList) {
        this.productList = productList;
    }
 public void busketStatus(){
     for (Products product: productList) {
         System.out.println(product.getProduct());
     }
 }
}
