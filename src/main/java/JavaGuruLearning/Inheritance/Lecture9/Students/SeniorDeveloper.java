package JavaGuruLearning.Inheritance.Lecture9.Students;

class SeniorDeveloper extends MidDeveloper{

    void solveProblems(){
        System.out.println("No problem");
    }

    @Override
    void askQuestions() {
        System.out.println("Answer questions");;
    }

    @Override
    void writeCode() {
        System.out.println("Super simple code with tests");
    }
}
