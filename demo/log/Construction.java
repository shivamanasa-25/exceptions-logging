package com.epam.logging_Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	String materials1;
	double area1;
	String automatedType1;
	double a=0;
	public constructionCost(String materials2, double area2, String automatedType2) {
		// TODO Auto-generated constructor stub
		this.materials1=materials2;
		this.area1=area2;
		this.automatedType1=automatedType2;
	}
	public void finalCost() {
		if((automatedType1.equals("no"))) 

		{
			if(materials1.equals("standard")) {
				a=1200*area1;
			}
			else if(materials1.equals("AboveStandard")) {
				a=1500*area1;
			}
			else if(materials1.equals("HighStandard")) {
				a=1800*area1;
			}
		}
		else if((materials1.equals("HighStandard")) && (automatedType1.equals("yes"))){
		
				a=2500*area1;
		}
		else {
			LOGGER.info("invalid input");
		}
		LOGGER.info("Final ConstructionCost is: "+ a);
	}
}