import java.util.ArrayList;
import java.util.Scanner;

abstract class BookingSystem {
    protected ArrayList<Student> registeredStudents = new ArrayList<>();
    protected FitnessClass fitnessClass;

    public BookingSystem(FitnessClass fitnessClass) {
        this.fitnessClass = fitnessClass;
    }

    public abstract boolean bookClass(Student student);
    public abstract boolean cancelClass(Student student);
    public abstract void showClassDetails();
    public abstract void showRegisteredStudents();
}

class FitnessClass {
    private String className;
    private String instructor;
    private String schedule;

    public FitnessClass(String className, String instructor, String schedule) {
        this.className = className;
        this.instructor = instructor;
        this.schedule = schedule;
    }

    public void showClassDetails() {
        System.out.println("Class: " + className);
        System.out.println("Instructor: " + instructor);
        System.out.println("Schedule: " + schedule);
    }

    public String getClassName() {
        return className;
    }

    public String getSchedule() {
        return schedule;
    }
}

class YogaClass extends FitnessClass {
    public YogaClass(String instructor, String schedule) {
        super("Yoga", instructor, schedule);
    }
}

class ZumbaClass extends FitnessClass {
    public ZumbaClass(String instructor, String schedule) {
        super("Zumba", instructor, schedule);
    }
}

class CyclingClass extends FitnessClass {
    public CyclingClass(String instructor, String schedule) {
        super("Cycling", instructor, schedule);
    }
}

class DanceClass extends FitnessClass {
    public DanceClass(String instructor, String schedule) {
        super("Dance", instructor, schedule);
    }
}

class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }
}

class YogaBookingSystem extends BookingSystem {
    public YogaBookingSystem(YogaClass yogaClass) {
        super(yogaClass);
    }

    @Override
    public boolean bookClass(Student student) {
        for (Student s : registeredStudents) {
            if (s.getStudentId().equals(student.getStudentId())) {
                System.out.println(student.getName() + " is already booked for this class.");
                return false;
            }
        }
        registeredStudents.add(student);
        System.out.println(student.getName() + " successfully booked for the Yoga class.");
        return true;
    }

    @Override
    public boolean cancelClass(Student student) {
        for (Student s : registeredStudents) {
            if (s.getStudentId().equals(student.getStudentId())) {
                registeredStudents.remove(s);
                System.out.println(student.getName() + " has successfully canceled the Yoga class.");
                return true;
            }
        }
        System.out.println(student.getName() + " is not booked for this class.");
        return false;
    }

    @Override
    public void showClassDetails() {
        fitnessClass.showClassDetails();
    }

    @Override
    public void showRegisteredStudents() {
        System.out.println("Registered Students for Yoga:");
        for (Student student : registeredStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class ZumbaBookingSystem extends BookingSystem {
    public ZumbaBookingSystem(ZumbaClass zumbaClass) {
        super(zumbaClass);
    }

    @Override
    public boolean bookClass(Student student) {
        for (Student s : registeredStudents) {
            if (s.getStudentId().equals(student.getStudentId())) {
                System.out.println(student.getName() + " is already booked for this class.");
                return false;
            }
        }
        registeredStudents.add(student);
        System.out.println(student.getName() + " successfully booked for the Zumba class.");
        return true;
    }

    @Override
    public boolean cancelClass(Student student) {
        for (Student s : registeredStudents) {
            if (s.getStudentId().equals(student.getStudentId())) {
                registeredStudents.remove(s);
                System.out.println(student.getName() + " has successfully canceled the Zumba class.");
                return true;
            }
        }
        System.out.println(student.getName() + " is not booked for this class.");
        return false;
    }

    @Override
    public void showClassDetails() {
        fitnessClass.showClassDetails();
    }

    @Override
    public void showRegisteredStudents() {
        System.out.println("Registered Students for Zumba:");
        for (Student student : registeredStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class CyclingBookingSystem extends BookingSystem {
    public CyclingBookingSystem(CyclingClass cyclingClass) {
        super(cyclingClass);
    }

    @Override
    public boolean bookClass(Student student) {
        for (Student s : registeredStudents) {
            if (s.getStudentId().equals(student.getStudentId())) {
                System.out.println(student.getName() + " is already booked for this class.");
                return false;
            }
        }
        registeredStudents.add(student);
        System.out.println(student.getName() + " successfully booked for the Cycling class.");
        return true;
    }

    @Override
    public boolean cancelClass(Student student) {
        for (Student s : registeredStudents) {
            if (s.getStudentId().equals(student.getStudentId())) {
                registeredStudents.remove(s);
                System.out.println(student.getName() + " has successfully canceled the Cycling class.");
                return true;
            }
        }
        System.out.println(student.getName() + " is not booked for this class.");
        return false;
    }

    @Override
    public void showClassDetails() {
        fitnessClass.showClassDetails();
    }

    @Override
    public void showRegisteredStudents() {
        System.out.println("Registered Students for Cycling:");
        for (Student student : registeredStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class DanceBookingSystem extends BookingSystem {
    public DanceBookingSystem(DanceClass danceClass) {
        super(danceClass);
    }

    @Override
    public boolean bookClass(Student student) {
        for (Student s : registeredStudents) {
            if (s.getStudentId().equals(student.getStudentId())) {
                System.out.println(student.getName() + " is already booked for this class.");
                return false;
            }
        }
        registeredStudents.add(student);
        System.out.println(student.getName() + " successfully booked for the Dance class.");
        return true;
    }

    @Override
    public boolean cancelClass(Student student) {
        for (Student s : registeredStudents) {
            if (s.getStudentId().equals(student.getStudentId())) {
                registeredStudents.remove(s);
                System.out.println(student.getName() + " has successfully canceled the Dance class.");
                return true;
            }
        }
        System.out.println(student.getName() + " is not booked for this class.");
        return false;
    }

    @Override
    public void showClassDetails() {
        fitnessClass.showClassDetails();
    }

    @Override
    public void showRegisteredStudents() {
        System.out.println("Registered Students for Dance:");
        for (Student student : registeredStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

public class FitnessClassBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        YogaClass yogaClass = new YogaClass("Kori", "Mon, Wed, Fri - 9:00 AM");
        ZumbaClass zumbaClass = new ZumbaClass("Julius", "Tue, Thu - 5:00 PM");
        CyclingClass cyclingClass = new CyclingClass("Jessica", "Mon, Fri - 7:00 AM");
        DanceClass danceClass = new DanceClass("Carlo", "Sat - 3:00 PM");

        BookingSystem yogaBookingSystem = new YogaBookingSystem(yogaClass);
        BookingSystem zumbaBookingSystem = new ZumbaBookingSystem(zumbaClass);
        BookingSystem cyclingBookingSystem = new CyclingBookingSystem(cyclingClass);
        BookingSystem danceBookingSystem = new DanceBookingSystem(danceClass);

        boolean continueTransactions = true;

        while (continueTransactions) {
            printDecorativeHeader("Welcome to FitLife");

            System.out.println("Please choose an option:");
            System.out.println("1 - View available fitness classes");
            System.out.println("2 - Book a fitness class");
            System.out.println("3 - View registered students for a class");
            System.out.println("4 - Cancel a booking");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    printFitnessClassTable();
                    break;

                case 2:
                    System.out.print("Enter your name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter your student ID: ");
                    String studentId = scanner.nextLine();
                    Student student = new Student(studentName, studentId);

                    System.out.println("\nAvailable fitness classes:");
                    printFitnessClassTable();

                    System.out.print("\nEnter the number of the class you want to book: ");
                    int classChoice;
                    try {
                        classChoice = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
                        scanner.nextLine();
                        continue;
                    }

                    BookingSystem selectedSystem = null;

                    switch (classChoice) {
                        case 1 -> selectedSystem = yogaBookingSystem;
                        case 2 -> selectedSystem = zumbaBookingSystem;
                        case 3 -> selectedSystem = cyclingBookingSystem;
                        case 4 -> selectedSystem = danceBookingSystem;
                        default -> {
                            System.out.println("Invalid class selection. Please choose a valid class number.");
                            continue;
                        }
                    }

                    if (selectedSystem != null) {
                        selectedSystem.bookClass(student);
                        selectedSystem.showClassDetails();
                    }
                    break;

                case 3:
                    System.out.print("Enter the class number to view registered students: ");
                    int classViewChoice;
                    try {
                        classViewChoice = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
                        scanner.nextLine();
                        continue;
                    }

                    switch (classViewChoice) {
                        case 1 -> yogaBookingSystem.showRegisteredStudents();
                        case 2 -> zumbaBookingSystem.showRegisteredStudents();
                        case 3 -> cyclingBookingSystem.showRegisteredStudents();
                        case 4 -> danceBookingSystem.showRegisteredStudents();
                        default -> System.out.println("Invalid class selection. Please choose a valid class number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter your name: ");
                    String cancelName = scanner.nextLine();
                    System.out.print("Enter your student ID: ");
                    String cancelId = scanner.nextLine();
                    Student cancelStudent = new Student(cancelName, cancelId);

                    System.out.println("\nChoose the class to cancel booking:");
                    printFitnessClassTable();

                    int cancelClassChoice;
                    try {
                        cancelClassChoice = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 and 4.");
                        scanner.nextLine();
                        continue;
                    }

                    switch (cancelClassChoice) {
                        case 1 -> yogaBookingSystem.cancelClass(cancelStudent);
                        case 2 -> zumbaBookingSystem.cancelClass(cancelStudent);
                        case 3 -> cyclingBookingSystem.cancelClass(cancelStudent);
                        case 4 -> danceBookingSystem.cancelClass(cancelStudent);
                        default -> System.out.println("Invalid class selection. Please choose a valid class number.");
                    }
                    break;

                    case 5:
                        continueTransactions = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } 
        

        printDecorativeFooter("Thank you for using FitLife!");
        scanner.close();
    }

    private static void printFitnessClassTable() {
        System.out.println("+----------------+----------------+--------------------------+");
        System.out.println("| Class Number   | Class Name     | Schedule                |");
        System.out.println("+----------------+----------------+--------------------------+");
        System.out.println("| 1              | Yoga           | Mon, Wed, Fri - 9:00 AM |");
        System.out.println("| 2              | Zumba          | Tue, Thu - 5:00 PM      |");
        System.out.println("| 3              | Cycling        | Mon, Fri - 7:00 AM      |");
        System.out.println("| 4              | Dance          | Sat - 3:00 PM           |");
        System.out.println("+----------------+----------------+--------------------------+");
    }

    private static void printDecorativeHeader(String title) {
        System.out.println("*********************************************");
        System.out.println("*                                           *");
        System.out.printf("%30s%18s\n", title, "                ");
        System.out.println("*     Your Partner in Fitness and Fun!      *");
        System.out.println("*                                           *");
        System.out.println("*********************************************\n");
    }

    private static void printDecorativeFooter(String message) {
        System.out.println("\n*********************************");
        System.out.println("  " + message);
        System.out.println("*********************************");
    }
}