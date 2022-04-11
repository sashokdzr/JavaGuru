package JavaGuruLearning.Inheritance.Lecture9.Students;

class MidDeveloper extends JuniorDeveloper{

    void writeCode(){
        System.out.println("Write code with tests");

    }

    @Override
    void askQuestions() {
        System.out.println("Asking right questions");
    }

    @Override
    void learn() {
        System.out.println("Fast learning");
    }
}
