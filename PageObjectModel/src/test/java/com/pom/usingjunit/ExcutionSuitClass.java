package com.pom.usingjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AdctinClass.class,SearchHotelPage.class,SelectHotelPage.class,BookHotelPage.class,BookingConformationPage.class})
public class ExcutionSuitClass {

}
