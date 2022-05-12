public class Bugalter extends BdPeople implements Zachetka{
    @Override
    public void giveInfo() {
        // не придумал ничего лучше чем зарание записать(
        setPerson("/NAME/ ");
        setNumber((int) (Math.random() * 100) + (int) (Math.random() * 100));
        setAssessmentMath(1 + (int) (Math.random()*5));
        setAssessmentPhysics(1 + (int) (Math.random()*5));
        setAssessmentPhilosophy(1 + (int) (Math.random()*5));
    }

    @Override
    public void getInfo() {
        System.out.printf(" NAME = %s  with number=%s and grades M/Phy/Phi %s %s %s %n",getPerson(),getNumber(),getAssessmentMath(),getAssessmentPhysics(),getAssessmentPhilosophy());
        System.out.printf(" average score = %s %n",(getAssessmentMath()+getAssessmentPhysics()+getAssessmentPhilosophy())/3.0);
    }
}
