  public class Iphone {
    String colour = "blue";
    int size = 156;
    public void model14() {
        System.out.println("it supports hd recording");
    }
}
class Iphone14pro extends Iphone {

    public void modell14pro() {
        System.out.println("it supports uhd recording");
        System.out.println(super.colour);
        System.out.println(super.size);
        super.model14();

    }


    public static void main(String[] args) {
        Iphone14pro iphone14proobj = new Iphone14pro();
        iphone14proobj.modell14pro();

    }
}



