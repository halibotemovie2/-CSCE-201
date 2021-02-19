public class Fruit {
    private String name;
    public Fruit(){
        name="这是默认构造器，请输入名字";
    }
    public Fruit(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setName(String newname){
        name=newname;
    }
}
