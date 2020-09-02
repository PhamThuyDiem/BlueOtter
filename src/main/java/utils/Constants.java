package utils;

import utils.helpers.PropertiesHelper;

public class Constants {

	public static final String URL = PropertiesHelper.getPropValue("profile.url");
	public static final String USERNAME = PropertiesHelper.getPropValue("profile.username");
	public static final String PASSWORD = PropertiesHelper.getPropValue("profile.password");

	// Timeout variables
	public static final int DRIVER_TIMEOUT = Integer.parseInt(PropertiesHelper.getPropValue("driver.timeout"));
	public static final int DRIVER_PAGELOAD_TIMEOUT = Integer
			.parseInt(PropertiesHelper.getPropValue("driver.pageload.timeout"));
	public static final int LONG_TIME = Integer.parseInt(PropertiesHelper.getPropValue("common.long.time"));
	public static final int MEDIUM_TIME = Integer.parseInt(PropertiesHelper.getPropValue("common.medium.time"));
	public static final int SHORT_TIME = Integer.parseInt(PropertiesHelper.getPropValue("common.short.time"));
	public static final int VERY_SHORT_TIME = Integer.parseInt(PropertiesHelper.getPropValue("common.very.short.time"));

	//REPORT
	public static final String GENERATE_ALLURE_REPORT = "allure generate --clean";
}