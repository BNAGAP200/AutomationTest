
 class Encapsulation {
    private String name = "Balaji";
    private int age = 26;
    private String lastname = "Nagappan";

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getLastname(){
        return lastname;
    }

class Encapsulation2 extends Encapsulation{
        public void en2(){
            System.out.println("the second methhod..");
        }
}
    public static void main(String[] args) {
        Encapsulation encapsObj = new Encapsulation();

encapsObj.setAge(35);

        System.out.println("Name: " + encapsObj.getName());
        System.out.println("Age: " + encapsObj.getAge());
        System.out.println("LastName: "+encapsObj.getLastname());

    }
}