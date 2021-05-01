package agenda02;

public class testaTemperatura {
    public static void main(String[] args) {
        temperatura converte = new temperatura();
        converte.celsius = 100 ;

        System.out.println("Temperaturas: \n "+converte.getCelsius()+"ºC - "+ converte.getFarenheit()+"ºF - "+converte.getKelvin()+"ºK");

    }
    
}