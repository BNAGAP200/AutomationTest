class Captain {
    String allround = "OK";
    String bowler = "OK";
    String batsman = "OK";

    void m1() {
        System.out.println("captain is all rounder");
    }
}

class Bowler {
    String Bowling = "Average";
    String Batting = "Not bad";
    int str = 100;

    void m2() {
        System.out.println("selected");
        System.out.println("Str avg:"+str);
    }
}

class JuniorBowler extends Bowler {
    String Bowling = "Not bad";
    String Batting = "Not bad";

    void m3() {
        System.out.println("waiting list");
    }
}

public class Javainheritance {
    public static void main(String[] args) {
        Bowler bowobj = new Bowler();
        JuniorBowler junbowlerobj = new JuniorBowler();
        bowobj.m2();
        junbowlerobj.m2();
        junbowlerobj.m3();

    }
}


   /* class Bowler extends Captain {
        String bowler = "BOWL";

        void m2() {
            System.out.println("Bowler is not all rounder");
        }
    }

   class Batsman extends Captain {
        String batting = "ok";


        void m3() {
            System.out.println("Batsman is not all rounder");

        }
    }
    class Umpire extends Captain {
        String Ump = "ok";
        void  m4 (){
            System.out.println("Wicket giver");
        }
    }

    public class Javainheritance {
    public static void main(String[] args) {
        Bowler bowobj = new Bowler();
        bowobj.m1();
        Batsman batsobj = new Batsman();
        batsobj.m1();
        batsobj.m3();
        Umpire Umpobj = new Umpire();
        batsobj.m1();
        bowobj.m2();
       Umpobj.m4();/*
       /*
    */


