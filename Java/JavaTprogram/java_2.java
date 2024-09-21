public class java_2 {
    public static void main(String args[]){
        String city="Dhaka, Bangladesh";

        if(city.endsWith("Bangladesh")){    //endWith keyword
            if(city.contains("Barishal")){      //contains keyword
                System.out.println("Your city is Barishal");
            }
            
            else if(city.contains("Sylhet")){
                System.out.println("Your city is Sylhet");
                
            }
            
            else {
                System.out.println("Your city is "+city.split(",")[0]);     //split keyword
            }
        }

        else 
        System.out.println("You are not living in Bangladesh");
    }
}
