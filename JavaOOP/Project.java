public class Project{
    private String name;
    private String description;

    public Project(){

    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
        elevatorPitch(name, description);
    }
    public String getProjectName(){
        return name;
    }
    public void setProjectName(String name){
        this.name = name;
    }
    public String getProjectDescription(){
        return description;
    }
    public void setProjectDescription(String description){
        this.description = description;

    }
    public void elevatorPitch(String name, String description){
        System.out.println(name+": "+description); 
    }

}