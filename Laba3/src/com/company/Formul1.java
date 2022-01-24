package com.company;

public class Formul1 {
    public static void main(String[] args) {
        double a=4.6, b=3.2, y=0;
        double[] x = {3.78, 1.54};

        for(int i=0;i<x.length; i++)
        {
            if(x[i]>=2)
            {
                y = Math.sqrt(1+x[i]*Math.sqrt(a*x[i]));
            }
            else if(x[i]<2)
            {
                y = Math.sin(b*x[i])+3;
            }
            System.out.printf("\nx=%f\ny=%f\n", x[i], y);
        }

    }
}
