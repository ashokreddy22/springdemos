package com.sample.S01springcoredi1;

import java.util.List;

public class course {
private String name;
private List<String> departments;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getDepartments() {
	return departments;
}
public void setDepartments(List<String> departments) {
	this.departments = departments;
}
@Override
public String toString() {
	return "college [name=" + name + ", departments=" + departments + "]";
}

}
