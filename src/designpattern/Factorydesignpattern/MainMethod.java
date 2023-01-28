package designpattern.Factorydesignpattern;

import Oops.Casting.Main;
import designpattern.Factorydesignpatternphone.Android;
import designpattern.Factorydesignpatternphone.OS;
import designpattern.Factorydesignpatternphone.OSFactory;

public class MainMethod {
    public static void main(String[]args){

        OSFactory osf=new OSFactory();
       OS obj=osf.getInstance("Open");
        obj.Spec();
    }
}
