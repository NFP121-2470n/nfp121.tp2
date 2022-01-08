package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
          int fahrenheit = 0;
        float celsius = 0;
       
       try{
        for (int i=0; i<args.length;i++){
            fahrenheit =Integer.parseInt(args[i]);;
            celsius = fahrenheitEnCelsius(fahrenheit);
        
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
        }    
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
         float c,s;
        c= ((f-32)*5.0f)/9.0f;
        s=(c*10);
        s=(int)s/10.0f;
        return s;
     }

}
