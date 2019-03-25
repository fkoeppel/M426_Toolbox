/*
 * author:		Kimi Janshon
 * element:		035
 * date:		25.03.19
 * 
 */

package Toolbox;

public class Pythagoras {
    private String firstSite;
    private String secondSite;
    private double numb1;
    private double numb2;
    
    public double getOtherNumber(double numb1, String firstSite, double numb2, String secondSite) {
        this.numb1 = numb1;
        this.numb2 = numb2;
        this.firstSite = firstSite.toLowerCase();
        this.secondSite = secondSite.toLowerCase();
        String both = this.firstSite+this.secondSite;
        double res = -1.0;
        
        if (both.equals("ab") || both.equals("ba")) {
            res = this.getC();
        }else if (both.equals("ac") || both.equals("ca") || both.equals("bc") || both.equals("cb")) {
            res = this.getAorB();
        }
        return res;
    }
    
    private double getAorB() {
        double aorb, c, sum, res;
        if (this.firstSite == "c") {
            c = this.numb1;
            aorb = this.numb2;
        }else {
            aorb = this.numb1;
            c = this.numb2;
        }
        sum = (c*c) - (aorb*aorb);
        res = Math.sqrt(sum);
        return res;
    }
    
    private double getC() {
        double a, b, sum, res;
        if (this.firstSite == "a") {
            a = this.numb1;
            b = this.numb2;
        }else {
            b = this.numb1;
            a = this.numb2;
        }
        sum = (a*a) + (b*b);
        res = Math.sqrt(sum);
        return res;
    }
}
