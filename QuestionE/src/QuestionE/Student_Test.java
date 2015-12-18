package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Date dBirthDate1 = null;
		try {
			dBirthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date dBirthDate2 = null;
		try {
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1973-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date dBirthDate3 = null;
		try {
			dBirthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1974-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date dBirthDate4 = null;
		try {
			dBirthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("1975-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date dBirthDate5 = null;
		try {
			dBirthDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("1976-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert1", "Randall", "Gibbons", dBirthDate1, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Bert2", "Randall", "Gibbons", dBirthDate2, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu3 = new Student("Bert3", "Randall", "Gibbons", dBirthDate3, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu4 = new Student("Bert4", "Randall", "Gibbons", dBirthDate4, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu5 = new Student("Bert5", "Randall", "Gibbons", dBirthDate5, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");

		HashMap hm = new HashMap();
		hm.put(stu1.getPersonID(), stu1);
		hm.put(stu2.getPersonID(), stu2);
		hm.put(stu3.getPersonID(), stu3);
		hm.put(stu4.getPersonID(), stu4);
		hm.put(stu5.getPersonID(), stu5);

		int hashMapSize = hm.size();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		int hashMapSize;
		hashMapSize = hm.size();
		assertTrue(hashMapSize==5);
	}

}