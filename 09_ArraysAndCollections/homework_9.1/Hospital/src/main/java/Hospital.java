public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        int minTemperature = 32;
        int maxTemperature = 40;

        float[] temperatureData = new float[patientsCount];
        for (int i = 0; i<patientsCount; i++){
            temperatureData[i] =
                    (float) Math.random() * (maxTemperature - minTemperature) + minTemperature;
        }
        return temperatureData;
    }

    public static String getReport(float[] temperatureData) {

        int healthyPatients = 0;
        float summedTemperature = 0;
        float minHealthyTemperature = 36.2f;
        float maxHealthyTemperature = 36.9f;
        for (float temperature: temperatureData){
            if (temperature >= minHealthyTemperature && temperature <=maxHealthyTemperature){
                healthyPatients++;
            }
            summedTemperature += temperature;
        }

        String[] stringData = new String[temperatureData.length];
        for (int i = 0; i<temperatureData.length; i++){
            temperatureData[i] = Math.round(temperatureData[i]*10)/10.f;
            stringData[i] = Float.toString(temperatureData[i]);
        }
        String temperatures = String.join(" ", stringData);

        float averageTemperature = summedTemperature/ temperatureData.length;

        String report =
                "Температуры пациентов: " + temperatures +
                        "\nСредняя температура: " + Math.round(averageTemperature*100)/100.00f +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}
