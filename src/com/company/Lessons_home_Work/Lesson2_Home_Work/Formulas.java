package com.company.Lesson2_home_Work.Lesson2_Home_Work;

import static java.lang.Math.*;

public class Formulas {
    public static void main(String[] args){
        form9();
        form10();
        form11();
        form12();
        form13();
        form14();
        form15();
        form16();
        form17();
        form18();
        form19();
        form20();
        form21();
        form22();
        form23();
        form24();
        form25();
        form26();
    }

    public static double form9(){
        int x=5;
        double y = 1.1*pow(E, -x)+abs(cos(sqrt(PI*x)))-3/8;
        System.out.println("Form 9 "+y);
    return y;
    }

    public static double form10(){
        int x=5;
        double y =1/3*sqrt(abs(sin(x)))*pow(pow(E, 0.12*x),1/3);
        System.out.println("Form 10 "+y);
        return y;
    }

    public static double form11(){
        int x=5;
        double y =2*PI*x-abs(sin(sqrt(10.5*x)))*1/pow(pow(x, 2), 1/3)+1/7;
        System.out.println("Form 11 "+y);
        return y;
    }

    public static double form12(){
        int x=5;
        double y =log(sqrt(abs(2-x))+1/2)*1/2+pow(E, -x)+pow(2/x, 1/3);
        System.out.println("Form 12 "+y);
        return y;
    }

    public static double form13(){
        int x=5;
        double y =pow(pow(E, -2+x), 1/5)*1/sqrt(pow(x, 2)+pow(x,4)+log(abs(x-3.14)));
        System.out.println("Form 13 "+y);
        return y;
    }

    public static double form14(){
        int x=5;
        double y =(sqrt(pow(sin(x/2),3))+pow(pow(E, 1.3*x),1/3)+pow(pow(E, -1.3*x),1/3))*1/abs(x+5/2);
                System.out.println("Form 14 "+y);
        return y;
    }

    public static double form15(){
        int x=5;
        double y =(abs(x*log(x-4))*sqrt(x))*1/pow(pow(E, 4*x-1),1/5);
                System.out.println("Form 15 "+y);
        return y;
    }

    public static double form16(){
        int x=5;
        double y =pow(pow(E, 2*x)*sqrt(x)-x+1/3/x,1/3)*abs(cos(2.5*x));
                System.out.println("Form 16 "+y);
        return y;
    }

    public static double form17(){
        int x=5;
        double y =pow(x,3)/3-pow(E,x)*log(abs(pow(1.3,3+pow(x,3))))+4/3;
                System.out.println("Form 17 "+y);
        return y;
    }

    public static double form18(){
        int x=5;
        double y =abs(7.2-10*x)/pow(pow(x,2)+pow(E,x),1/3)*atan(4*(x/3)/sqrt(pow(1.1,3)+pow(x,2)));
        System.out.println("Form 18 "+y);
        return y;
    }

    public static double form19(){
        int x=5;
        double y =acos((tan(5*x/PI)))+pow(x,3.2)/28;
        System.out.println("Form 19 "+y);
        return y;
    }

    public static double form20(){
        int x=5;
        double y =(pow(log(2*x),1/3)+tan(cos(PI*x)))*abs(log(x/10.5)+1/3);
        System.out.println("Form 20 "+y);
        return y;
    }

    public static double form21(){
        int x=5;
        double y =(pow(log(x),1/4)+acos(x+3))*1/abs(x+pow(2*x,2));
        System.out.println("Form 21 "+y);
        return y;
    }

    public static double form22(){
        int x=5;
        double y =asin(log(x)/pow(x,2)+5*x+1)*pow(x,3.2)/28;
        System.out.println("Form 22 "+y);
        return y;
    }

    public static double form23(){
        int x=5;
        double y =acos(tan(5*x/PI))*pow(x,5.7)/23;
        System.out.println("Form 23 "+y);
        return y;
    }

    public static double form24(){
        int x=5;
        double y =atan(abs(8.3-pow(21*x,2)-0.8*x)/pow(2.5+1/pow(x,2),1/3));
        System.out.println("Form 24 "+y);
        return y;
    }

    public static double form25(){
        int x=5;
        double y =pow(log(acos(pow(x,3.4)+pow(2.5*x,1.2)-0.7)/pow(pow(E,2.5*x),1/3)),1/4)+1;
        System.out.println("Form 25 "+y);
        return y;
    }

    public static double form26(){
        int x=5;
        double y =log(sin(x))+pow(2*E,x)+2*cos(x)+2;
        System.out.println("Form 26 "+y);
        return y;
    }
}
