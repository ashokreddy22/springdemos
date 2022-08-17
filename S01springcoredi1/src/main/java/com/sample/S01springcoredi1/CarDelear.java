package com.sample.S01springcoredi1;

import java.util.Set;

public class CarDelear {
private String dealername;
private Set<String> models;
public String getDealername() {
	return dealername;
}
public void setDealername(String dealername) {
	this.dealername = dealername;
}
public Set<String> getModels() {
	return models;
}
public void setModels(Set<String> models) {
	this.models = models;
}
@Override
public String toString() {
	return "CarDelear [dealername=" + dealername + ", models=" + models + "]";
}

}
