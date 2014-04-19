package models;
import javax.persistence.*;

import play.db.ebean.*;
import play.db.ebean.Model.Finder;

import com.avaje.ebean.*;
public class Experience  extends Model{
	private double yearsOfExperience;
	 public Experience(){
		 
	 }
	public double getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(double yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public static Finder<String,Experience> find = new Finder<String,Experience>(
		    String.class, Experience.class
	);

}
