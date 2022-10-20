package Sat;
import java.util.Scanner;
public class sat {
    private int sati, minute, sekunde;
    public static void main(String[] args){
        Scanner ulaz = new Scanner(System.in);
        int s = ulaz.nextInt(), m = ulaz.nextInt(), sec = ulaz.nextInt();
        sat sat = new sat(s, m, sec);
        sat.Ispisi();
        sat.Sljedeci();
        sat.Ispisi();
        sat.PomjeriZa(-48);
        sat.Ispisi();
        sat.Postavi(0,0,0);
        sat.Ispisi();
    }
    public sat(int s, int m, int sec){
        Postavi(s, m, sec);
    }
    public void Postavi(int s, int m, int sec){
        sati = s; minute = m; sekunde = sec;
    }
    public void Sljedeci(){
        sekunde++;
        if(sekunde == 60) {
            sekunde = 0;
            minute++;
        }
        if(minute == 60){
            minute = 0;
            sati++;
        }
        if(sati == 24) sati = 0;
    }
    public void Prethodni(){
        sekunde--;
        if(sekunde == -1){
            sekunde = 59;
            minute --;
        }
        if(minute == -1){
            minute = 0;
            sati--;
        }
        if(sati == -1){
            sati = 23;
        }
    }
    public void PomjeriZa(int pomak){
        if(pomak > 0) for(int i = 0; i < pomak; i++) Sljedeci();
        else for(int i = 0; i > pomak; i--) Prethodni();
    }
    public int DajSate(){return sati;}
    public int DajMinute(){return minute;}
    public int DajSekunde(){return sekunde;}
    public void Ispisi(){System.out.println(sati + ":" + minute + ":" + sekunde);}
}


