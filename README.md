## exercise of  https://javabypatel.blogspot.com/2018/06/java-8-stream-practice-problems.html

- Get student with exact match name "jayesh"
- Get student with matching address "1235"
- Get all student having mobile numbers 3333.
- Get all student having mobile number 1233 and 1234
- Create a List<Student> from the List<TempStudent>
- Convert List<Student> to List<String> of student name
- Sort List<String>
 
## another one exercise of https://math.hws.edu/javanotes/c10/ex5-ans.html 
- print the number of students (without using scoreData.length)
- print the average score for all of the students
- print the number of students who got an A (score greater than or equal to 90)
- use the collect() stream operation to create a List<String> that contains the names of students whose score was less than 70; the names should be in the form first name followed by last name
- print the names from the List that was generated in the previous task
- print out the students' names and scores, ordered by last name
- print out the students' names and scores, ordered by score

### the model is:

> package Models;

public class ScoreInfo {

   private String lastName;
   private String firstName;

   private int score;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ScoreInfo(String lastName, String firstName, int score) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = score;
    }

    public ScoreInfo() {
    }

    @Override
    public String toString() {
        return "ScoreInfo{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", score=" + score +
                '}';
    }
}


