class myException extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "This is to message";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "This is get message";
    }
}

// class claa extends Exception{
//     @Override
//     public String toString() {
//         // TODO Auto-generated method stub
//         return super.toString();
//     }
//     @Override
//     public String getMessage() {
//         // TODO Auto-generated method stub
//         return super.getMessage();
//     }
// }

class CustomException extends Exception{
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"Name can not be greater than 5 letters";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return super.getMessage()+"Make sure that you gave right name";
    }
}

public class CustomException_1 {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            try {
                throw new myException();
                // throw new ArithmeticException("This is an ArithmeticException");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println(e);
            }
        }

        String name="Im Shakib";
        if(name.length()>5){
            try{
                throw new CustomException();
            }catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }
}
