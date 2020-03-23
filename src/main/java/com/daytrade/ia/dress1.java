//package com.daytrade.ia;
//import java.util.*;
//import java.lang.*;
//import javax.swing.*;
//import java.util.Collection.*;
//import java.util.Set.*;
//public class dress1
//{
//    static int i,j;
//
//    static float[] count=new float[3];static int[] count1=new int[3];
//    static String[] shop=new String[] {"Jean and Tops","Jean and T-shirt","Jean and Shirt/T-shirt","Sherwani","Pyjamas","Formal shirt and Pant","Shorts and shirt","Coat Suit","Sari","Skirt and Tops","Ghagra Choli","Salwar kameez","Churidaar","Pattu Pavadai","Frock"};
//    static int[] divac= {10,9,8,1,1,2,1,1,7,1,1,1,5,1,1};
//    static int[] kalac=  {1,1,1,2,1,1,1,1,10,1,8,2,2,9,1};
//    static int[] megac= {7,5,6,3,2,8,2,6,2,4,2,1,2,2,2};
//    static String[] selected=new String[15];
//    static boolean value;
//    public static void main(String arg[])
//    {
//
//    count[0]=0;count[1]=0;count[2]=0;
//    Set uni = new HashSet();
//    uni.add("Jean and Tops");
//    uni.add("Jean and T-shirt");
//    uni.add("Sari");
//    uni.add("Skirt and Tops");
//    uni.add("Ghagra Choli");
//    uni.add("Salwar kameez");
//    uni.add("Churidaar");
//    uni.add("Pattu Pavadai");
//    uni.add("Sherwani");
//    uni.add("Frock");
//    uni.add("Formal shirt and Pant");
//    uni.add("Jean and Shirt/T-shirt");
//    uni.add("Shorts and shirt");
//    uni.add("Coat Suit");
//    uni.add("Pyjamas");
//
//    Set male = new HashSet();
//    male.add("Sherwani");
//    male.add("Pyjamas");
//    male.add("Formal shirt and Pant");
//    male.add("Jean and Shirt/T-shirt");
//    male.add("Shorts and shirt");
//    male.add("Coat Suit");
//    Set fem = new HashSet();
//    fem.add("Jean and Tops");
//    fem.add("Jean and T-shirt");
//    fem.add("Sari");
//    fem.add("Skirt and Tops");
//    fem.add("Ghagra Choli");
//    fem.add("Salwar kameez");
//    fem.add("Churidaar");
//    fem.add("Pattu Pavadai");
//    fem.add("Frock");
//
//    Set l20=new HashSet();
//    l20.add("Jean and Tops");
//    l20.add("Jean and T-shirt");
//    l20.add("Skirt and Tops");
//    l20.add("Churidaar");
//    l20.add("Pattu Pavadai");
//    l20.add("Frock");
//    Set g20=new HashSet();
//    g20.add("Jean and T-shirt");
//    g20.add("Sari");
//    g20.add("Salwar kameez");
//    g20.add("Churidaar");
//
//    Set ml20=new HashSet();
//    ml20.add("Pyjamas");
//    ml20.add("Shorts and shirt");
//    Set mg20=new HashSet();
//    mg20.add("Sherwani");
//    mg20.add("Formal shirt and Pant");
//    mg20.add("Coat Suit");
//    mg20.add("Jean and Shirt/T-shirt");
//
//    Set mpl1000= new HashSet();
//    mpl1000.add("Pyjamas");
//    mpl1000.add("Shorts and shirt");
//    mpl1000.add("Formal shirt and Pant");
//    Set mpg1000=new HashSet();
//    mpg1000.add("Sherwani");
//    mpg1000.add("Coat Suit");
//    mpg1000.add("Jean and Shirt/T-shirt");
//
//    Set pl1000=new HashSet();
//    pl1000.add("Frock");
//    pl1000.add("Skirt and Tops");
//    pl1000.add("Churidaar");
//    pl1000.add("Salwar kameez");
//    Set pg1000=new HashSet();
//    pg1000.add("Jean and Tops");    
//    pg1000.add("Jean and T-shirt");
//    pg1000.add("Sari");
//    pg1000.add("Ghagra Choli");
//    pg1000.add("Pattu Pavadai");
//
//    Scanner input=new Scanner(System.in);
//    System.out.println("Enter M for Male and F for Female");
//    String st=input.nextLine();
//            Set int1 = new HashSet (uni);
//    if(st.equals("M"))
//    {
//        System.out.println("Male");
//        int1.retainAll(male);
//
//    Scanner input1=new Scanner(System.in);
//    System.out.println("Enter 1 if age <20 or enter 2 if age > 20");
//    String st1=input1.nextLine();
//            Set int2= new HashSet (int1);
//    if(st1.equals("1"))
//           {
//    System.out.println("Age Less than 20 Male");
//    int2.retainAll(ml20);
//    }
//    else if(st1.equals("2"))
//    {
//        System.out.println("Age Greater than 20 Male");
//        int2.retainAll(mg20);
//    }
//    Scanner input2=new Scanner(System.in);
//    System.out.println("Enter 1.Price Range < 1000 or 2. Price Range >1000");
//    String st2=input2.nextLine();
//            Set int3= new HashSet (int2);
//            if(st2.equals("1"))
//            {
//                System.out.println("Price Less than 1000 ,Male");
//                int3.retainAll(mpl1000);
//            }
//            else if(st2.equals("2"))
//            {
//                System.out.println("Price Greater than 1000 ,Male");
//                int3.retainAll(mpg1000);
//            }
//
//            i=0;    
//            for(Object object : int3)
//            {
//                String element = (String) object;
//                selected[i++]=element;
//                System.out.println(element);
//            }
//            calc();
//
//        } /*end of male*/
//
//        else if(st.equals("F"))
//        {
//
//            System.out.println("Female");
//                int1.retainAll(fem);
//            Scanner input1=new Scanner(System.in);
//
//            System.out.println("Enter 1 if age <20 or enter 2 if age > 20");
//            String st1=input1.nextLine();
//            Set int2= new HashSet (int1);
//            if(st1.equals("1"))
//            {
//                System.out.println("Age Less than 20 Female");
//                int2.retainAll(l20);
//            }
//            else if(st1.equals("2"))
//            {
//                System.out.println("Age Greater than 20 Female");
//                int2.retainAll(g20);
//            }   
//    Scanner input2=new Scanner(System.in);
//    System.out.println("Enter 1.Price Range < 1000 or 2. Price Range >1000");
//    String st2=input2.nextLine();
//            Set int3= new HashSet (int2);
//            if(st2.equals("1"))
//            {
//                System.out.println("Price Less than 1000 ,Female");
//                int3.retainAll(pl1000);
//            }
//            else if(st2.equals("2"))
//            {
//                System.out.println("Price Greater than 1000 ,Female");
//                int3.retainAll(pg1000);
//            }
//
//            i=0;
//            for(Object object : int3)
//            {
//                String element = (String) object;
//                selected[i++]=element;
//                System.out.println(element);
//            }
//            calc();
//        }/*end of female*/
//
//    }/*end of main*/
//
//    public static void calc()
//    {
//        float finalcount=0;
//
//
//        int k=0;
//
//        while(k<i)
//        {
//            for(j=0;j<15;j++)
//            {
//                value=selected[k].equals(shop[j]);
//                if(value)
//                {
//                    break;
//                }
//            }/*end of j*/
//            count[0]=count[0]+divac[j];
//            count[1]=count[1]+kalac[j];
//            count[2]=count[2]+megac[j];
//            k++;
//            }/*end of while*/
//
//            for(int c=0;c<3;c++)
//            {
//            finalcount=finalcount+count[c];
//            }
//            for(int c=0;c<3;c++)
//            {
//
//                count[c]=((count[c]*100)/finalcount);
//            }
//            System.out.println("Availability of dresses available in various shops are:");
//            System.out.println("Diva is "+count[0]+"%");
//            System.out.println("Kalanikethan is "+count[1]+"%");
//            System.out.println("Megamart is "+count[2]+"%");
//    }
// }/*end of class*/