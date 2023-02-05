package org.campus02.postl;

public class BMICalculator {
    private double weightInKG;
    private double heightInMeters;

    public double getWeightInKG() {
        return weightInKG;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    private double calculateBMI(){
        return weightInKG / (heightInMeters * heightInMeters);

    }

    public BMICalculator(double weightInKG, double heightInMeters) {
        this.weightInKG = weightInKG;
        this.heightInMeters = heightInMeters;
    }

    public String result(){
        double bmi = calculateBMI();

        if(bmi<18.5){
            return "underweight";
        } else if(bmi<25){
            return "normal";
        }else if(bmi<30){
            return "oerweight";
        } else return "obese";

    }
}
