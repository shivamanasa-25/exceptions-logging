package com.epam.logging_Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	int pa;
	int ti;
	double ra;
	public simpleInterest(int p, int t, double r) {
		// TODO Auto-generated constructor stub
		this.pa=p;
		this.ti=t;
		this.ra=r;
	}
	public void SI() {
		double res= (pa*ti*ra)/100;
		LOGGER.info("Simple Interest is : "+res);
	}
}