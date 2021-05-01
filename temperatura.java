package agenda02;

public class temperatura {
    int celsius;

    public int getCelsius() {
        return celsius;
    }
    
    public int getFarenheit() {
        int Farenheit = (int) (1.8*celsius+32);
        
        return Farenheit ;
    }

    public int getKelvin(){
        int kelvin = (int) (celsius+273);

        return kelvin;
    }
}
