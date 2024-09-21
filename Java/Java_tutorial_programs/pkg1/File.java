package pkg1;

public class File {
    public int id;
    public String name;

    public File(int i, String j){
        id=i;
        name=j;
    }

    public void show(){
        System.out.println("Name : "+name+", ID : "+id);
    }

}