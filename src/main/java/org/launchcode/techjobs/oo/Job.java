package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
//TH
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    //TH

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    //TH


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    //use lineSeparator in the Job class (???) TH

    @Override
    public String toString() {
        //if empty put in data not available.....
// use isEmpty
        //for each parmater in job instance check if the parameter is empty


        //if (job.getValue.isEmpty() )

//        return System.lineSeparator() +           right one
//                "ID: " + id + System.lineSeparator() +
//                "Name: " + name + System.lineSeparator() +
//                "Employer: " + employer.getValue() + System.lineSeparator() +
//                "Location: " + location.getValue() + System.lineSeparator() +
//                "Position Type: " + positionType.getValue() + System.lineSeparator() +
//                "Core Competency: " + coreCompetency.getValue() + System.lineSeparator();

        StringBuilder jobString = new StringBuilder();

        jobString.append(System.lineSeparator() + "ID: " + id + System.lineSeparator());
        jobString.append("Name: " + (name.isEmpty() ? "Data not available" : name) + System.lineSeparator());
        jobString.append("Employer: " + (employer.getValue().isEmpty() ? "Data not available" : employer.getValue()) + System.lineSeparator());
        jobString.append("Location: " + (location.getValue().isEmpty() ? "Data not available" : location.getValue()) + System.lineSeparator());
        jobString.append("Position Type: " + (positionType.getValue().isEmpty() ? "Data not available" : positionType.getValue()) + System.lineSeparator());
        jobString.append("Core Competency: " + (coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency.getValue()) + System.lineSeparator());

        return jobString.toString();
    }

}
