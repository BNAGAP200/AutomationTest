
/*class Worldcup {
    void w1() {
        System.out.println("Players will be selected");
    }
}


interface Odi {
    void o1();
}


interface Test {
    void t1();
}



    public class Hybridinherritance extends Worldcup implements Odi , Test {
        public void o1() {
            System.out.println("player can be eligible");

        }

        public void t1() {
            System.out.println("Player can be eligible");
        }

        public static void main(String[] args) {
            Hybridinherritance hybridinheritanceobj = new Hybridinherritance();
            hybridinheritanceobj.o1();
            hybridinheritanceobj.w1();
        }
    }
*/
class CricketEvent {
    CricketEvent() {
        System.out.println("A cricket event is taking place");
    }
}

class WorldCup extends CricketEvent {
    void selectPlayers() {
        System.out.println("Players will be selected for the World Cup");
    }
}

interface ODI {
    void performODIMatch();
}

interface TestMatch {
    void performTestMatch();
}

public class AdvancedHybridInheritance extends WorldCup implements ODI, TestMatch {
    AdvancedHybridInheritance() {
        System.out.println("Creating an instance for the advanced hybrid inheritance example");
    }

    public void performODIMatch() {
        System.out.println("ODI match is being played");
    }

    public void performTestMatch() {
        System.out.println("Test match is being played");
    }

    public static void main(String[] args) {
        AdvancedHybridInheritance hybridInheritanceObj = new AdvancedHybridInheritance();
        hybridInheritanceObj.selectPlayers();
        hybridInheritanceObj.performODIMatch();
        hybridInheritanceObj.performTestMatch();
    }
}







