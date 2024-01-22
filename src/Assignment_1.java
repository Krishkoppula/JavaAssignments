public class Assignment_1 {
    public static void main(String[] args) {
        String name = "Sai Krishna Reddy";
        int age = 20;
        double height = 5.9;
        char gender = 'M';
        boolean isStudent = true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("Is a student? " + isStudent);

        String[] studentNames = new String[10];
        studentNames[0] = "Alice";
        studentNames[1] = "Bob";
        studentNames[2] = "Choco";
        studentNames[3] = "David";
        studentNames[4] = "Eva";
        studentNames[5] = "Frank";
        studentNames[6] = "Grace";
        studentNames[7] = "Henry";
        studentNames[8] = "Ivy";
        studentNames[9] = "Jack";

        System.out.println("First student name: " + studentNames[0]);
        System.out.println("Last student name: " + studentNames[9]);

    ////////////////////////////////Assignemnt 1B//////////////////

               int resultA = -5 + 8 * 6;
                int resultB = (55 + 9) % 9;
                double resultC = 20 + -3 * 5 / 8.0;
                double resultD = 5 + 15 / 3.0 * 2 - 8 % 3.0;

                // Expected Output
                System.out.println("Result A: " + resultA);
                System.out.println("Result B: " + resultB);
                System.out.println("Result C: " + resultC);
                System.out.println("Result D: " + resultD);

    }
}


