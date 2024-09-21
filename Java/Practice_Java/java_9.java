public class java_9{
    public static void main(String args[]){

        String fname="Sadiqul Islam";
        String lname=" Shakib";
        String name=fname+lname;

        System.out.println(name);
        System.out.println(name.length());

        if(fname.compareTo(lname)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal !");
        }

        String n=name.substring(14, name.length());
        System.out.println(n);

        StringBuilder n1=new StringBuilder("Bangla");
        System.out.println(n1);
        int l=n1.length();
        for(int i=0; i<l; i++){
            System.out.println(n1.charAt(i));
        }

        n1.setCharAt(5,'d');
        System.out.println(n1);

        n1.insert(0,'_');
        System.out.println(n1);

        n1.delete(6,7);
        System.out.println(n1);

        n1.append("adesh_");
        System.out.println(n1);
    }
}