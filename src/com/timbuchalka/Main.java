package com.timbuchalka;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class Main {

    private static void genericsIntroduction() {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {

        for (int i : n) {
            System.out.println(i * 2);
        }
    }


    private static void ourGenericsClass() {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this wont work");
//        brokenTeam.addPlayer("no-one"); // error
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthron");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1 ,0);
        hawthorn.matchResult(adelaideCrows, 3 ,8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        adelaideCrows.matchResult(baseballTeam, 1, 1);



    }




    public static void main(String[] args) {

//        genericsIntroduction();
        ourGenericsClass();

    }
}
