public class Mult implements Chain{
    private Chain obj1;

    @Override
    public void CalucateNextChain(Calculate request) {

        if (request.getRequest().equals("Mult")){

            int resutl = request.getNumber1() * request.getNumber2();
            System.out.println("Multiply Result: " + resutl);

        }else {

            setNewChain(obj1);
        }

    }

    public void setNewChain(Chain newChain) {

        obj1 = newChain;

    }

}
