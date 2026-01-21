import java.util.Scanner;
class Volume
{
public static void main(String args[])
{
double rkm=6378;
double pi=3.14;
double volumekm=(4.0/3)*pi*rkm*rkm*rkm;
double rMiles=rkm/1.6;
double volumeMiles=(4.0/3)*pi*rMiles*rMiles*rMiles;
System.out.println("The volume of earth in cubic kilometers is"+volumekm);


System.out.println("The volume of earth in cubic miles is"+volumeMiles);
}
}

