package com.sample.S01springcoredi1;

import java.util.Map;

public class Products {
private int id;
private Map<Integer,String>products;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Map<Integer, String> getProducts() {
	return products;
}
public void setProducts(Map<Integer, String> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Products [id=" + id + ", products=" + products + "]";
}

}
