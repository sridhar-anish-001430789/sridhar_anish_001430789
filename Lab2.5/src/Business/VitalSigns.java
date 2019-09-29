/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author anish
 */
public class VitalSigns {

    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;
    private Double maxbp;
    private Double minbp;

    public Double getMaxbp() {
        return maxbp;
    }

    public void setMaxbp(Double maxbp) {
        this.maxbp = maxbp;
    }

    public Double getMinbp() {
        return minbp;
    }

    public void setMinbp(Double minbp) {
        this.minbp = minbp;
    }

    public VitalSigns(double temperature, double bloodPressure, int pulse, String date) {
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulse = pulse;
        this.date = date;
    }

    public VitalSigns() {
    }

    public double getTemperature() {
        return this.temperature;
    }

    public double getBloodPressure() {
        return this.bloodPressure;
    }

    public int getPulse() {
        return this.pulse;
    }

    public String getDate() {
        return this.date;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    public void setBloodPressure(double blood) {
        this.bloodPressure = blood;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return this.date;
    }

}
