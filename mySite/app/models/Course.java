package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.*;

public class Course  extends Model{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course(){
		
	}
	
	public static Finder<String,Course> find = new Finder<String,Course>(
		    String.class, Course.class
	);
	
	
}
