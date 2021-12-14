public class Employees {

    String name;
    String jobTitle;
    int eID;
    int experienceYears;
    double salary;

    public int geteID() {
        return eID;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", eID=" + eID +
                ", experienceYears=" + experienceYears +
                ", salary=" + salary +
                '}';
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public Employees(String name, String jobTitle, int eID, int experienceYears, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.eID = eID;
        this.experienceYears = experienceYears;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employees() {
    }
}
