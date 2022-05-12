public class Info implements Interface {
    private Person people;
    public Info(Person people) {
        this.people = people;
    }

    public Info() {
        people.setPerson("/NAME/ ");
        people.setNumber((int) (Math.random() * 100) + (int) (Math.random() * 100));
        people.setAssessmentMath(1 + (int) (Math.random()*5));
        people.setAssessmentPhysics(1 + (int) (Math.random()*5));
        people.setAssessmentPhilosophy(1 + (int) (Math.random()*5));
        people.setAssessmentPhilosophy(1 + (int) (Math.random()*5));
    }

    @Override
    public void fillInfo() {
        // не придумал ничего лучше чем зарание записать(
        people.setPerson("/NAME/ ");
        people.setNumber((int) (Math.random() * 100) + (int) (Math.random() * 100));
        people.setAssessmentMath(1 + (int) (Math.random()*5));
        people.setAssessmentPhysics(1 + (int) (Math.random()*5));
        people.setAssessmentPhilosophy(1 + (int) (Math.random()*5));
        people.setAssessmentPhilosophy(1 + (int) (Math.random()*5));
    }

    @Override
    public void getInfo() {
        System.out.printf(" NAME = %s  with number=%s and grades M/Phy/Phi %s %s %s %n",
                people.getPerson(),
                people.getNumber(),
                people.getAssessmentMath(),
                people.getAssessmentPhysics(),
                people.getAssessmentPhilosophy());
        System.out.printf(" average score = %s %n",
                (people.getAssessmentMath()+people.getAssessmentPhysics()+people.getAssessmentPhilosophy())/3.0);
    }
}
