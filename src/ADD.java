public class ADD implements Chain {

    private Chain obj1;

    @Override
    public void CalucateNextChain(Calculate request) {

      if (request.getRequest().equals("Add")){

         int resutl = request.getNumber1() + request.getNumber2();
          System.out.println("Adding Result: " + resutl);

      }else {

          setNewChain(obj1);
      }

    }

    public void setNewChain(Chain newChain) {

        obj1 = newChain;

    }


}
