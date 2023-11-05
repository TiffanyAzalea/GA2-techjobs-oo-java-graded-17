package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    //TH
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobData = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobData instanceof Job);
        assertEquals("Product tester", jobData.getName());
        assertTrue(jobData.getEmployer() instanceof Employer);
        assertEquals("ACME", jobData.getEmployer().getValue());
        assertTrue(jobData.getLocation() instanceof Location);
        assertEquals("Desert", jobData.getLocation().getValue());
        assertTrue(jobData.getPositionType() instanceof PositionType);
        assertEquals("Quality control", jobData.getPositionType().getValue());
        assertTrue(jobData.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", jobData.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Do I need to do something with ID???
        assertFalse(job1.equals(job2));
    }
}
