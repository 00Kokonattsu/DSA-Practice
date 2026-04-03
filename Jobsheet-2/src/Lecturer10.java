public class Lecturer10 {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    Lecturer10() {

    }

    Lecturer10(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    void displayInformation() {
        System.out.println("Lecturer ID: " + idLecturer);
        System.out.println("Lecturer name: " + name);
        System.out.println("Status: " + (activeStatus == true ? "Active" : "Inactive"));
        System.out.println("Entry year: " + yearOfEntry);
        System.out.println("Expertise: " + expertiseCompetency);
    }

    void setStatusActive(boolean status) {
        activeStatus = status;
    }

    int calculateTimeWork(int YearNow) {
        return YearNow - yearOfEntry;
    }

    String changeSkill(String Skill) {
        expertiseCompetency = Skill;
        return "This lecturer's expertise is now " + Skill;
    }
}
