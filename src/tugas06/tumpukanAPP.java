
package tugas06;

public class tumpukanAPP {
    
    public static void main (String [] args){
        pile tumpukan=new pile(10);
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println(" ");
        
        
        tumpukan.push(50);
        tumpukan.baca();
        
        
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(60);
       
        System.out.println(" ");
        tumpukan.pop();
        
        System.out.println(" ");
        tumpukan.push(50);
        
        System.out.println(" ");
        
        
        
        long nilaitop = tumpukan.pop();
        System.out.println("nilai top = " + nilaitop);
        
    }
         
         
    }

    

