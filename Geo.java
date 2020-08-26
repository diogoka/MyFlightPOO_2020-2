public class Geo {
    private double latitude;
    private double longitude;

public Geo (double umaLatitude, double umaLongitude){
        latitude = umaLatitude;
        longitude = umaLongitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

       public String toString(){
        return "Dados da Geo Localização: \n Latitude: \n" + latitude + "Longitude: " + longitude;
    }

}

