
package salaries;

import Entities.Seller;
import Services.SellerService;

public class Salaries {

   
    public static void main(String[] args) {
        SellerService ss= new SellerService();
        Seller  s1 = ss.register();
        ss.monthlySalary(s1);
        ss.holidays(s1);
    }
    
}
