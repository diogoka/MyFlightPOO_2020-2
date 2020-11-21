public class Geo {
    private double latitude;
    private double longitude;

public Geo (double umaLatitude, double umaLongitude){
        this.latitude = umaLatitude;
        this.longitude = umaLongitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public static double calcular(Geo obj, Geo obj2) {
        double earthR = 6372.8;
        double dLat = Math.toRadians(obj2.latitude - obj.latitude);
        double dLon = Math.toRadians(obj2.longitude - obj.longitude);
        obj.latitude = Math.toRadians(obj.latitude);
        obj2.latitude = Math.toRadians(obj2.latitude);

        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(obj.latitude) * Math.cos(obj2.latitude);
        double c = 2 * Math.asin(Math.sqrt(a));
        return earthR * c;
    }

       public String toString(){
        return "Dados da Geo Localização: \n Latitude: \n" + latitude + "Longitude: " + longitude;
    }

}

