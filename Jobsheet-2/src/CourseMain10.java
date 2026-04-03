public class CourseMain10 {
    public static void main(String[] args) {
        Course10 crs1 = new Course10();
        crs1.kodeCourse = "001";
        crs1.name = "Data Structure and Algorithm";
        crs1.credits = 4;
        crs1.numberOfHours = 4;

        Course10 crs2 = new Course10("002", "DSA Practice", 3, 3);

        crs1.updateSKS(4);
        crs1.addHour(2);
        crs1.reduceHours(1);
        crs1.showInformation();

        crs2.updateSKS(4);
        crs2.addHour(2);
        crs2.reduceHours(1);
        crs2.showInformation();
    }
}
