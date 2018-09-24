
public class Calculate {

int num1, num2;
String request;

    public Calculate(int newnum1, int newnum2, String nRequest){

        this.num1 = newnum1;
        this.num2 = newnum2;
        this.request = nRequest;

    }

    public String getRequest(){
        return request;
    }

    public int getNumber1(){
        return num1;
    }

    public int getNumber2(){
        return num2;
    }
}
