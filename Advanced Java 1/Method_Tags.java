package Advanced_Java_2;

public class Method_Tags {

    /**
     *
     * @param args These are the arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    /**
     *
     * @param i First number to be added
     * @param j Second number to be added
     * @return Sum of two numbers as integer
     * @throws Exception if i=0
     * @deprecated This method is deprecated please use + Operator
     */
         public int add(int i, int j) throws Exception{
             if(i==0){
                 throw new Exception();
             }
             int c;
             c= i+j;
             return c;
        }


}
