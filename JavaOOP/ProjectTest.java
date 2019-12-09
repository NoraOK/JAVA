public class ProjectTest{
    public static void main(String[] args){
        Project first = new Project();
        first.setProjectName("Best Project");
        first.setProjectDescription("Everyone's favorite project.");
        // System.out.println(first.getProjectName());
        // System.out.println(first.getProjectDescription());
        Project second = new Project("Good Project");
        second.setProjectDescription("Everyone's okay project.");
        // second.elevatorPitch(second.getProjectName(), second.getProjectDescription());
        Project third = new Project("Worst Project", "Everyone's least favorite project.");
    }
}