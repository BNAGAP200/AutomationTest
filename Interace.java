/*interface HousesSK {
    public void Flat();
    public void Bungalow();

}
interface HousesPK {
    public  void CommercialBuilding();
    public void  GovtBuilding();
}

class Mediator implements HousesSK,HousesPK {
    public void Flat() {
        System.out.println("The flat price  is: 10000£");
    }
    public void  Bungalow () {
        System.out.println("The bungalow price is : 10000000£");
    }
    public void CommercialBuilding(){
        System.out.println("depends on price quoted");
    }
    public void GovtBuilding(){
        System.out.println("Any previous Govt Project done");
    }
}

class Main {
    public static void main(String[] args) {
        Mediator myClient = new Mediator();
        myClient.Flat();
        myClient.Bungalow();
        Mediator myContractor = new Mediator();
        myContractor.CommercialBuilding();
        myContractor.GovtBuilding();
    }
}
*/
interface PropertySK {
    double calculatePrice();
}

interface PropertyPK {
    void provideDetails();
}

class Flat implements PropertySK {
    private double basePrice = 10000;

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}

class Bungalow implements PropertySK {
    private double basePrice = 10000000;

    @Override
    public double calculatePrice() {
        return basePrice;
    }
}

class CommercialBuilding implements PropertyPK {
    private double quotedPrice;

    public CommercialBuilding(double quotedPrice) {
        this.quotedPrice = quotedPrice;
    }

    @Override
    public void provideDetails() {
        System.out.println("Commercial building price: " + quotedPrice);
    }
}

class GovtBuilding implements PropertyPK {
    private boolean hasPreviousProjects;

    public GovtBuilding(boolean hasPreviousProjects) {
        this.hasPreviousProjects = hasPreviousProjects;
    }

    @Override
    public void provideDetails() {
        if (hasPreviousProjects) {
            System.out.println("Government building with previous projects.");
        } else {
            System.out.println("Government building without previous projects.");
        }
    }
}

class Mediator {
    public static void main(String[] args) {
        PropertySK flat = new Flat();
        PropertySK bungalow = new Bungalow();
        PropertyPK commercialBuilding = new CommercialBuilding(1500000);
        PropertyPK govtBuilding = new GovtBuilding(true);

        System.out.println("Flat price: " + flat.calculatePrice());
        System.out.println("Bungalow price: " + bungalow.calculatePrice());

        commercialBuilding.provideDetails();
        govtBuilding.provideDetails();
    }
}
