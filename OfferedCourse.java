public class OfferedCourse extends Course {
    private String instructor;

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return this.instructor;
    }

    public String toString() {
        return "Course: " + getName() + ", Instructor: " + instructor;
    }

}
