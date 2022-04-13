public class Call_By_Value {
    int a=26; //global variable
    void sub(int a)
    {
        a=a-6; // local variable
        System.out.println("In function "+a);
    }
    public static void main(String[]args) {
        Call_By_Value obj =new Call_By_Value();
        System.out.println("Before calling function "+obj.a);
        obj.sub(16);
        System.out.println("After calling function "+obj.a);
        
    }
    
}
