package models;

import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;
import java.util.*;

@Entity
public class Job extends Model{
	@Id
	private String company;
	private Date startDate;
	private Date endDate;
	private String summary;
	private double monthLength;
	private String location;
	private List<Skill> skills = new ArrayList<Skill>();
	
	public Job(String company){
		this.company = company;
	}

	public Job(String company, Date startDate){
		this.company = company;
		this.startDate = startDate;
	}

	public Job(String company, Date startDate, Date endDate){
		this.company = company;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public static Finder<String,Job> find = new Finder<String,Job>(
	    String.class, Job.class
	);
	
	

	public List<Skill> getSkills(){
		return skills;
	}
	
	public void addSkills(List<Skill> newSkills){
		for (Skill skill : newSkills){
			skills.add(skill);
		}
	}
	
	public void addSkill(Skill newSkill){
		skills.add(newSkill);
	}
	
	@Override
	public String toString() {
		return "Job [company=" + company + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", summary=" + summary
				+ ", monthLength=" + monthLength + ", location=" + location
				+ ", skills=" + skills + "]";
	}

	public String getCompany() {
		return company;
	}
	
	

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public double getMonthLength() {
		return monthLength;
	}

	public void setMonthLength(double monthLength) {
		this.monthLength = monthLength;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	} 

	
}
