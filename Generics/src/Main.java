public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);

//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);
////        adelaideCrows.addPlayer(pat);
////        adelaideCrows.addPlayer(beckham);
//
//        System.out.println(adelaideCrows.numPlayers());
//
//        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
//        baseballTeam.addPlayer(pat);

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);
        adelaideCrows.matchResult(fremantle,2,1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();

    }
}