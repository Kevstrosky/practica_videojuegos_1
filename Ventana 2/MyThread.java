import javax.swing.*;

public class MyThread extends Thread {
    JLabel texto1;
    int n = 10;
    boolean giro = true;
    public void run(){
        while(true){
                try{
                    Thread.sleep(10);
                    if(giro==true){
                        texto1.setBounds(n,10,50,25);
                        n++;
                        System.out.println(n);
                        if(n == 260){
                            giro = false;
                        }
                    }
                    if(giro==false){
                        texto1.setBounds(n,10,50,25);
                        n--;
                        System.out.println(n);
                        if(n == 10){
                            giro = true;
                        }
                    }
                
                }catch(Exception e){}
        }
    }//end run 
}