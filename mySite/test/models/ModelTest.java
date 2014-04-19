package models;

import java.util.List;

import models.*;

import org.junit.*;

import static org.junit.Assert.*;
import play.Logger;
import play.test.WithApplication;
import static play.test.Helpers.*;


public class ModelTest extends WithApplication{
	@Before
	public void setUp(){
		start(fakeApplication(inMemoryDatabase()));
	}
	
	@Test
	public void createAndRetrieveJob(){
		new Job("Accenture").save();
		Job acc = Job.find.where().eq("company","Accenture").findUnique();
		assertNotNull(acc);
		assertEquals("Accenture",acc.getCompany());
		
	}
	
	//@Test
	public void findSkillsInvolving(){
		Job thd = new Job("The Home Depot");
		thd.save();
		
		Skill xml = new Skill("XML");
		xml.save();
		thd.addSkill(xml);
		Logger logger = new Logger();
		logger.info("\n\n"+thd.toString() +"\n\n"+xml.toString());
		
		
		List<Skill> results = Skill.findSkillsInvolving(thd.getCompany());
		assertEquals(1, results.size());
		assertEquals("XML", results.get(0).getName());
	}
}
