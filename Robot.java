public class Robot {
    private String name;
    private String act;

    Robot (String name,String act){
        this.name=name;
        this.act=act;
    }
    public String getName() {
        return name;
    }
    public String getAct() {
        return act;
    }
    public Robot (){
        this.name="Robot";
        this.act="просто працюю";
    }
    public void work(){
        System.out.println("Я"+" "+this.name+"-я"+" "+this.act+"!");
    }
}
