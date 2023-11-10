package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    //TH

    Job jobData = new Job("Product tester",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobData = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", jobData.getName());
        assertEquals("ACME", jobData.getEmployer().getValue());
        assertEquals("Desert", jobData.getLocation().getValue());
        assertEquals("Quality control", jobData.getPositionType().getValue());
        assertEquals("Persistence", jobData.getCoreCompetency().getValue());
        System.out.println(jobData.getLocation().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobsString = job1.toString();

        String expected = System.lineSeparator() +
                "ID: " + jobData.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        // start and end with a new
        assertTrue(jobsString.startsWith(System.lineSeparator()));
        assertTrue(jobsString.endsWith(System.lineSeparator()));





    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = job.toString();

        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        assertEquals(expected, jobString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String jobString = job.toString();


        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();

        assertEquals(expected, jobString);


    }


}
