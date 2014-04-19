package models;

import java.util.List;
import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;

@Entity
public class Skill extends Model {
	@Id
	private String name;
	
	public Skill(){
		
	}
	
	public Skill(String name){
		this.name = name;
	}
	public static Finder<String,Skill> find = new Finder<String,Skill>(
		    String.class, Skill.class
		);
	
	public static List<Skill> findSkillsInvolving(String company){
		return find.fetch("job").where().eq("company", company).findList();
	}

	@Override
	public String toString() {
		return "Skill [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
