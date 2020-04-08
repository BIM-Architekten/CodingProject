package beispiele;

import java.util.ArrayList;

public class HalloWelt {
    
    public static void main(String[] args){
        ArrayList<String> begruessung = new ArrayList<String>();
        begruessung.add("Hallo");
        begruessung.add("Welt");
        begruessung.add("!");
        begruessung.add("GoGo");

        // Verwende hier die foreach Schleife
        for(String s : begruessung)
            System.out.println(s);
        }
    }

