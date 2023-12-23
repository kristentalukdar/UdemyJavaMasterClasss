package CodingEx;

public class CodingEx12 {

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying=false;
        if(summer){
            if((temperature>=25) && (temperature<=45)){
                isPlaying=true;
            }
        }
        else{
            if((temperature>=25) && (temperature<=35)){
                isPlaying=true;
            }
        }
        return isPlaying;
    }

    public static void main(String[] args) {

    }
}
