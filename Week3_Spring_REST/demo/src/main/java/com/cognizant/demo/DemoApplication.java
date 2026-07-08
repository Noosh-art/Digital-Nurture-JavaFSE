package com.cognizant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
public class DemoApplication {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) throws Exception {

		SpringApplication.run(DemoApplication.class, args);


	}

	public static void displayDate() throws Exception {

		LOGGER.info("START");

		ApplicationContext context =
				new ClassPathXmlApplicationContext("date-format.xml");

		SimpleDateFormat format =
				context.getBean("dateFormat", SimpleDateFormat.class);

		Date date = format.parse("31/12/2018");

		LOGGER.debug("Date : {}", date);

		LOGGER.info("END");

	}
	public static void displayCountry() {

		LOGGER.info("START");

		ApplicationContext context =
				new ClassPathXmlApplicationContext("country.xml");

		Country country1 = context.getBean("country", Country.class);

		Country country2 = context.getBean("country", Country.class);

		LOGGER.debug("Country1 : {}", country1);

		LOGGER.debug("Country2 : {}", country2);

		LOGGER.debug("Same Object : {}", country1 == country2);

		LOGGER.info("END");
	}
}

