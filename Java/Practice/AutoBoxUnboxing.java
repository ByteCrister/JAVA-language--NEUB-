public class AutoBoxUnboxing {
    public static void main(String[] args) {
        

        int primitiveIntegerValue = 100;//Initializing primitive type integer value
        
        Integer objectTypeInteger = Integer.valueOf(primitiveIntegerValue);//Boxing
        System.out.println(objectTypeInteger);

        primitiveIntegerValue = objectTypeInteger.intValue();//Unboxing
    }
}
