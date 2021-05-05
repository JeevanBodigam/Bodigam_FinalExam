/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
public class FibnocciDriver {
    
    static int calFib(int n){
        switch (n) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                return calFib(n-1)+calFib(n-2); //recursive call
        }
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aNumber=10;
        System.out.println("The First  10 fibnocci numbers are: ");
        for(int i=0;i<aNumber;i++){
            System.out.print(calFib(i)+" ");
        }
    }
    
}
