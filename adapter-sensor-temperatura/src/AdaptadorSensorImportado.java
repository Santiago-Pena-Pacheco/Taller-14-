
public class AdaptadorSensorImportado implements SensorTemperatura{
    private SensorImportado sensor;

    public AdaptadorSensorImportado (SensorImportado sensor){
        this.sensor = sensor;
    }

    @Override
    public String getNombre() {
        return sensor.getModelo();
    }

    public double leerCelsius() {
        return (sensor.readFahrenheit() - 32)*5/9;
    }

}