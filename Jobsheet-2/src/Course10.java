public class Course10 {
    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    public Course10() {

    }

    public Course10(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }

    void showInformation() {
        System.out.println("Course code: " + kodeCourse);
        System.out.println("Course name: " + name);
        System.out.println("Credits: " + credits);
        System.out.println("Number of hour(s): " + numberOfHours);
    }

    void updateSKS(int sksNew) {
        credits = sksNew;
        if (credits == sksNew) {
            System.out.println("Credits has been changed to " + sksNew);
        }
    }

    void addHour(int hours) {
        numberOfHours += hours;
    }

    void reduceHours(int hours) {
        if(numberOfHours < hours) {
            System.out.println("Reducing declined. Reduced hours is bigger than the subtracted hours.");
        } else {
            numberOfHours -= hours;
            System.out.println("Current hours of the course: " + numberOfHours); 
        }
    }
}
