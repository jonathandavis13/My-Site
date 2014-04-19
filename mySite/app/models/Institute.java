package models;

import java.util.List;

import javax.persistence.*;

import play.db.ebean.*;

import com.avaje.ebean.*;

public class Institute extends Model {
	private String name;
	private String location;
	private String certificate;
	private List<Course> courses;
	
	public Institute() {
		super();
	}
	
	public static Finder<String,Skill> find = new Finder<String,Skill>(
		    String.class, Skill.class
		);

	public List<Course> getCourses(){
		return courses;
	}
	
	public void addCourses(List<Course> newCourses){
		for (Course  course : newCourses){
			addCourse(course);
		}
	}
	
	public void addCourse(Course newCourse){
		courses.add(newCourse);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

}
