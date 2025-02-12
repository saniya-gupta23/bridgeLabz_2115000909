class Student {
    int rollNumber;
    String name;
    int age;
    char grade;
    Student next;

    public Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    private Student head;

    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.next = head;
        head = newStudent;
    }

    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newStudent;
    }

    public void addAtPosition(int rollNumber, String name, int age, char grade, int position) {
        if (position <= 0) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        Student newStudent = new Student(rollNumber, name, age, grade);
        Student temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) return;
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) return;
        temp.next = temp.next.next;
    }

    public Student searchByRollNumber(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public void updateGrade(int rollNumber, char newGrade) {
        Student temp = searchByRollNumber(rollNumber);
        if (temp != null) {
            temp.grade = newGrade;
        }
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        
        list.addAtEnd(1, "Saniya", 20, 'A');
        list.addAtEnd(2, "Nomicy", 21, 'B');
        list.addAtBeginning(3, "Samiksha", 22, 'C');
        list.addAtPosition(4, "Sanjana", 23, 'B', 2);

        System.out.println("All Students:");
        list.displayAll();

        list.updateGrade(2, 'A');
        System.out.println("\nAfter Updating Grade of Roll Number 2:");
        list.displayAll();

        list.deleteByRollNumber(3);
        System.out.println("\nAfter Deleting Roll Number 3:");
        list.displayAll();

        Student searchResult = list.searchByRollNumber(1);
        if (searchResult != null) {
            System.out.println("\nFound Student: Roll Number: " + searchResult.rollNumber + ", Name: " + searchResult.name);
        } else {
            System.out.println("\nStudent Not Found");
        }
    }
}




























