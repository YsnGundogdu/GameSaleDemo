import Abstract.GameService;
import Concrete.*;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;
import Entity.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Gamer gamer = new Gamer(100,"yasin@gundogdu.com","Yasin","Gündoğdu","27140453084", 2000);
        Gamer gamer1 = new Gamer(150,"ali@demir.com","Ali","Demir","68855058572",1971);
        Gamer gamer2 = new Gamer(200,"oguz@turan.com","Oğuz","Turan","98745632158",1998);


        UserCheckManager userCheckManager = new UserCheckManager();
        userCheckManager.CheckIfRealPerson(gamer);
        userCheckManager.CheckIfRealPerson(gamer1);
        userCheckManager.CheckIfRealPerson(gamer2);


        Game game = new Game(1,100.0,25,75.0,"Counter Strike Global Offensive","");
        Game game1 = new Game(2,200.0,50,100.0,"Uncharted 2: Among Thieves", "");
        Game game2 = new Game(3,400.0,25,300.0,"FIFA21", "");


        Campaign campaign = new Campaign(1001,"CSGOX25",25);
        Campaign campaign1 = new Campaign(1002,"UNCTEDX50",50);
        Campaign campaign2 = new Campaign(1003,"FIFAX25",25);


        UserManager userManager = new UserManager();
        userManager.add(gamer);
        userManager.delete(gamer1);
        userManager.update(gamer2);


        System.out.println();
        System.out.println();


        ProductManager productManager = new ProductManager();
        productManager.add(game);
        productManager.delete(game1);
        productManager.update(game2);


        System.out.println();
        System.out.println();


        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.delete(campaign1);
        campaignManager.update(campaign2);


        System.out.println();
        System.out.println();


        SaleManger saleManger = new SaleManger();
        saleManger.sold(gamer,game,campaign);
        saleManger.sold(gamer1,game1,campaign1);
        saleManger.sold(gamer2,game2,campaign2);




    }
}
