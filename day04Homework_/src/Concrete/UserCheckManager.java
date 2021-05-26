package Concrete;

import Abstract.UserCheckService;
import Entity.Gamer;
import WS.WTUKPSPublicSoap;


public class UserCheckManager implements UserCheckService {

    public boolean CheckIfRealPerson(Gamer gamer){
        boolean result=false;
        WTUKPSPublicSoap soap=new WTUKPSPublicSoap();
        try {
            result=soap.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()), gamer.getFirstName().toUpperCase(), gamer.getLasName().toUpperCase(), gamer.getBirthDate());

        }
        catch(Exception e) {
            System.out.println("Person is not valid!");
        }

        return result;
    }


}
