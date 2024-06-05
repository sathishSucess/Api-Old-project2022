package org.testngtask.sabasir;

import org.testng.annotations.DataProvider;

public class SperateDataProviderClass {

	@DataProvider(name = "Adactin automation")
	private Object[][] bulkDataOfAdactinApplication() {

		return new Object[][] {
				{ "sathishFam", "741@85BN", "London", "Hotel Sunshine", "Double", "1 - One", "25/08/2022", "26/08/2022",
						"2 - Two", "0 - None", "Sathish", "Kumar", "Omr Chennai", "2534567892534567", "VISA",
						"November", "2022", "1311" },
				{ "sathishFam", "741@85BN", "Melbourne", "Hotel Hervey", "Standard", "2 - Two", "25/08/2022",
						"26/08/2022", "3 - Three", "3 - Three", "Mohan", "Ram", "kani Madurai", "1334567892534567",
						"American Express", "November", "2022", "1311" },
				{ "sathishFam", "741@85BN", "Brisbane", "Hotel Cornice", "Deluxe", "3 - Three", "25/08/2022",
						"26/08/2022", "4 - Four", "1 - One", "Sab", "Den", "velea Kelembakam", "1434567892534567",
						"Master Card", "November", "2022", "1311" },
				{ "sathishFam", "741@85BN", "Adelaide", "Hotel Creek", "Super Deluxe", "8 - Eight", "25/08/2022",
						"26/08/2022", "1 - One", "3 - Three", "Sam", "Sung", "sabuthin Menabakam", "2634567892534567",
						"Master Card", "November", "2022", "1311" },
				{ "sathishFam", "741@85BN", "New York", "Hotel Sunshine", "Double", "4 - Four", "25/08/2022",
						"26/08/2022", "3 - Three", "4 - Four", "Mathew", "Raja", "kani Madurai", "1734567892534567",
						"American Express", "November", "2022", "1711" },
				{ "sathishFam", "741@85BN", "London", "Hotel Cornice", "Standard", "5 - Five", "25/08/2022",
						"26/08/2022","4 - Four","2 - Two", "Mano", "Arton", "Omr Chennai","1004567892534567", "VISA",
						"November", "2022", "1711" },
				{ "sathishFam", "741@85BN", "Los Angeles", "Hotel Cornice", "Super Deluxe", "6 - Six", "25/08/2022",
						"26/08/2022", "3 - Three", "0 - None", "Dan", "Samos", "Ramsam Gundy", "1874567892534567",
						"Other", "November", "2022", "1911", "", },
				{ "sathishFam", "741@85BN", "London", "Hotel Sunshine", "Double", "7 - Seven", "25/08/2022",
						"26/08/2022", "1 - One", "3 - Three", "Master", "Kan", "Madhu Manikam Road", "1934567892534567",
						"American Express", "November", "2022", "1811" },
				{ "sathishFam", "741@85BN", "Paris", "Hotel Hervey", "Deluxe", "10 - Ten", "25/08/2022", "26/08/2022",
						"4 - Four", "0 - None", "Sami", "Kumar", "Semba Trichy", "2634567892534567", "VISA", "November",
						"2022", "2611" } };
	}

}
