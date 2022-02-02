public class Student {

    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student() {
        grade = 4.0;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }

    Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    void upYear(int yearInCollege) {
        if (isDegree == false) {
            yearInCollege = yearInCollege + 1;
            if (yearInCollege == 4) {
                isDegree = true;
            }
        } else {
            System.out.println("The student has already graduated");
        }
    }
    double receiveScholarship(double min, double amount){
            if (grade >= min && age < 30) {
                money = money + amount;
                System.out.println("Student total money = " + money);
            } else {
                System.out.println("Student grade and/or age doesn't qualify for scholarship");
            }
            return money;
        }
    }


