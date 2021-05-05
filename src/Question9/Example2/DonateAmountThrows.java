/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
class ThrowsDonate {
    public int donateAmount(int amount) throws ArithmeticException{
            return 120000/amount;
        }
    }

public class DonateAmountThrows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            ThrowsDonate td=new ThrowsDonate();
        
        int amount=12;
//        int amount=1;
        if(amount>10){
            throw new IllegalArgumentException("Amount cannot be greater than 10");
        }else{
            System.out.println(td.donateAmount(0));
        }
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch(RuntimeException ae){
            System.out.println(ae.getMessage());
        }
    }

}
