package com.sample.S01springcoredi1;

public class ShoppingCart {
private Item items;

public Item getItems() {
	return items;
}

public void setItems(Item items) {
	this.items = items;
}

@Override
public String toString() {
	return "ShoppingCart [items=" + items + "]";
}

}
