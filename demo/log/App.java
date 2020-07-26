package com.epam.logging_Demo;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {

    	
    	Scanner sc=new Scanner(System.in);
    	LOGGER.info("Enter values of princial amount,time,rate of interest");
    	int principalAmount=sc.nextInt();
    	int time=sc.nextInt();
    	double rateOfInterest=sc.nextDouble();
    	LOGGER.info("Enter material,area and automatedType");
    	String material=sc.next();
    	double area=sc.nextDouble();
    	String automatedType=sc.next();
    	simpleInterest si=new simpleInterest(principalAmount,time,rateOfInterest);
    	compoundInterest ci=new compoundInterest(principalAmount,time,rateOfInterest);
    	si.SI();
    	ci.CI();
    	constructionCost co=new constructionCost(material,area,automatedType);
    	co.finalCost();
    	sc.close();
    }
}