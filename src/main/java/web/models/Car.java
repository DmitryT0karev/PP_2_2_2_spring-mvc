package web.models;

public class Car {
    private String modelCar;
    private int series;
    private int year;

    public Car(String modelCar, int series, int year) {
        this.modelCar = modelCar;
        this.series = series;
        this.year = year;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", series=" + series +
                ", year=" + year +
                '}';
    }
}

