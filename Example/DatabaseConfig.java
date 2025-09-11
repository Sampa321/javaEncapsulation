package ClassPractice.OOPS.ConstructorsCode.ThisKeyword;

public class CallingInstanceMethod {
    int value;
    public CallingInstanceMethod(int value)
    {
        this.value=value;
    }
    public void add(int num)
    {
        this.value+=num;
    }
    public void multiply(int n)
    {
        this.value*=n;
    }
    public void displayInfo()
    {
        System.out.println("value:"+value);
    }
    public static void main(String[] args) {
        CallingInstanceMethod O1=new CallingInstanceMethod(10);
        O1.displayInfo();
        O1.add(2);
        O1.displayInfo();
        O1.multiply(4);
        O1.displayInfo();
    }
}
