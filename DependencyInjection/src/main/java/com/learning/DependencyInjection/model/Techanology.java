package com.learning.DependencyInjection.model;

import org.springframework.stereotype.Component;

@Component
public class Techanology {
private int techid;
private String techName;
public int getTechid() {
	return techid;
}
public void setTechid(int techid) {
	this.techid = techid;
}
public String getTechName() {
	return techName;
}
public void setTechName(String techName) {
	this.techName = techName;
}

public void tech() {
	System.out.println("Sucessfully");
}
@Override
public String toString() {
	return "Techanology [techid=" + techid + ", techName=" + techName + "]";
}


}
