public class LecturerMain10 {
    public static void main(String[] args) {
        Lecturer10 lctrr1 = new Lecturer10();
        lctrr1.idLecturer = "001";
        lctrr1.name = "Fauzan Farhan";
        lctrr1.activeStatus = true;
        lctrr1.yearOfEntry = 2025;
        lctrr1.expertiseCompetency = "Development";

        Lecturer10 lctrr2 = new Lecturer10("002", "Al Qodri", false, 2000, "Meditation");

        lctrr1.setStatusActive(false);
        System.out.println(lctrr2.name + "'s length of time of working period is " + lctrr2.calculateTimeWork(2026));
        System.out.println(lctrr2.changeSkill("Airbender"));
        lctrr1.displayInformation();
        lctrr2.displayInformation();
    }
}
