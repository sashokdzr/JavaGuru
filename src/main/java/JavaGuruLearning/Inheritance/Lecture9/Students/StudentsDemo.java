package JavaGuruLearning.Inheritance.Lecture9.Students;

class StudentsDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.learn();
        System.out.println("===Junior===");
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.debug();
        juniorDeveloper.askQuestions();
        juniorDeveloper.learn();
        System.out.println("===Middle===");
        MidDeveloper midDeveloper = new MidDeveloper();
        midDeveloper.writeCode();
        midDeveloper.debug();
        midDeveloper.askQuestions();
        midDeveloper.learn();
        System.out.println("===Senior===");
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.askQuestions();
        seniorDeveloper.writeCode();
        seniorDeveloper.debug();
        seniorDeveloper.learn();
        seniorDeveloper.solveProblems();

    }
}
