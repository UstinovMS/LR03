package com.company;

public class Formul2 {
    public static void main(String[] args) {
        double a=1.8, b=3.3, y=0;
        double[] x = {2.46, 4.3, 6.82};

        for(int i=0;i<x.length; i++)
        {
            if(x[i]<=3)
            {
                y = Math.pow(x[i]*a+1, 4);
            }
            else if(x[i]>3 && x[i]<=5)
            {
                y = 1/(2*x[i]*x[i]+b*Math.log(x[i]));
            }
            else if(x[i]>5)
            {
                y = a*Math.cos(Math.pow(b+x[i],2));
            }

            System.out.printf("\nx=%f\ny=%f\n", x[i], y);
        }

    }
}
