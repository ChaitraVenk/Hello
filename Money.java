package com.handson.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Money {

	/* VARIABLE DECLARATION */
	static double amount;
	static double changedAmount;
	static String from = new String();
	static String to = new String();
	static String val = new String();
	Map<String, Double> curr = new HashMap<String, Double>();

	/* CONSTRUCTOR */
	public Money() {
		curr.put("USD_to_INR", 67.53);
		curr.put("GBP_to_INR", 98.63);
		curr.put("EUR_to_INR", 75.55);
	}

	/* CONVERSION OF CURRENCIES */
	public double changeCurrency(String from, String to, double amount) {

		/* FROM USD TO OTHERS */
		if (from.equalsIgnoreCase("USD")) {

			if (to.equalsIgnoreCase("INR")) {
				amount = amount * (curr.get("USD_to_INR"));
			}

			else if (to.equalsIgnoreCase("GBP")) {
				amount = (amount * (curr.get("USD_to_INR")))
						/ curr.get("GBP_to_INR");
			} else if (to.equalsIgnoreCase("EUR")) {
				amount = (amount * (curr.get("USD_to_INR")))
						/ curr.get("EUR_to_INR");
			}

		}

		// FROM GBP TO OTHERS
		if (from.equalsIgnoreCase("GBP")) {

			if (to.equalsIgnoreCase("INR")) {
				amount = amount * (curr.get("GBP_to_INR"));
			}

			else if (to.equalsIgnoreCase("USD)")) {
				amount = (amount * (curr.get("GBP_to_INR")))
						/ curr.get("USD_to_INR");
			} else if (to.equalsIgnoreCase("EUR")) {
				amount = (amount * (curr.get("GBP_to_INR")))
						/ curr.get("EUR_to_INR");
			}
		}

		// FROM EUR TO OTHERS
		if (from.equalsIgnoreCase("EUR")) {

			if (to.equalsIgnoreCase("INR")) {
				amount = amount * (curr.get("EUR_to_INR"));
			}

			else if (to.equalsIgnoreCase("GBP")) {
				amount = (amount * (curr.get("EUR_to_INR")))
						/ curr.get("GBP_to_INR");
			} else if (to.equalsIgnoreCase("USD")) {
				amount = (amount * (curr.get("EUR_to_INR")))
						/ curr.get("USD_to_INR");
			}

		}
		// FROM INR TO OTHERS
		if (from.equalsIgnoreCase("INR")) {

			if (to.equalsIgnoreCase("USD")) {
				amount = amount / (curr.get("USD_to_INR"));
			}

			else if (to.equalsIgnoreCase("GBP")) {
				amount = amount / curr.get("GBP_to_INR");
			} else if (to.equalsIgnoreCase("EUR")) {
				amount = amount / curr.get("EUR_to_INR");
			}

		}
		return amount;
	}

	public static void main(String[] args) throws IOException {

		System.out.println("Currency codes:- ");
		System.out.println("USD");
		System.out.println("GBP");
		System.out.println("EUR");
		System.out.println("INR");
		System.out.println();
		boolean curr = false;

		System.out.println("Please enter from currency ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
			from = br.readLine();
			System.out.println("Please enter to currency ");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(
					System.in));

			to = br1.readLine();
			System.out.println("Please enter value ");

			BufferedReader br2 = new BufferedReader(new InputStreamReader(
					System.in));

			val = br2.readLine();
			amount = Double.parseDouble(val);
			
			try {
				if(!validateCurrencyCode(from, to))
				{
					
				}

		} catch (Exception e) {
			System.out.println("" + e.getMessage());
		}
			
			Money m = new Money();
			changedAmount = m.changeCurrency(from, to, amount);
			System.out.println("The converted amount is: " + changedAmount);
		
	}

	
	public static boolean validateCurrencyCode(String from, String to)
			throws Exception {
		
		boolean isError = false;
		
		if (!((from.equalsIgnoreCase("USD")) || (from.equalsIgnoreCase("GBP"))
				|| (from.equalsIgnoreCase("EUR")) || (from
					.equalsIgnoreCase("INR")))) {
			isError = true;
			throw new Exception("enter correct 'FROM' currency code");
			
		} else if (!((to.equalsIgnoreCase("USD"))
				|| (to.equalsIgnoreCase("GBP")) || (to.equalsIgnoreCase("EUR")) || (to
					.equalsIgnoreCase("INR")))) {
			isError = true;
			
			throw new Exception("enter correct 'TO' currency code");
		}
		
		return isError;

	}

}

