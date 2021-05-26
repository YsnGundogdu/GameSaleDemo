package Abstract;

import Entity.Gamer;


public interface UserCheckService {
    static boolean CheckIfRealPerson(Gamer gamer){
        return false;
    }
}
