package com.example.demo.model;

import javax.annotation.Generated;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Voiture")
public class Project {
 @Transient
    public static final String SEQUENCE_NAME = "user_sequence";
@Id

private long id;
private String mark;
private String energie;
public Project() {
	
}
public Project(long id, String mark, String energie) {

	this.id = id;
	this.mark = mark;
	this.energie = energie;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMark() {
	return mark;
}
public void setMark(String mark) {
	this.mark = mark;
}
public String getEnergie() {
	return energie;
}
public void setEnergie(String energie) {
	this.energie = energie;
}
@Override
public String toString() {
	return "Project [id=" + id + ", mark=" + mark + ", energie=" + energie + "]";
}

}
