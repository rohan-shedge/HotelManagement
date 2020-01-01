package com.mahabaleshwar.FeatureSwitch;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public enum FeatureSwitch{
	
	DATABASECONNECTIVITY("01.03.2020","rohan_it05@hotmail.com");
	
    private final Date cleanupDate;
    private final String author;
    private boolean activated = false;
	
	FeatureSwitch(String cleanupDateStr, String author){
        SimpleDateFormat cleanupDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date cleanupDate = null;
        if (cleanupDateStr != null) {
            try {
                cleanupDate = cleanupDateFormat.parse(cleanupDateStr);
            } catch (ParseException ignored) {
            }
        }
        this.cleanupDate = cleanupDate;
        this.author = author;
        activated = isPropertySet(name());
	}
	
    private boolean isPropertySet(String propertyName)
    {
        String value = System.getProperty(propertyName);
        if (StringUtils.isBlank(value))
            value = System.getenv(propertyName);

        return ("on".equalsIgnoreCase(value) || "true".equalsIgnoreCase(value));
    }

	public void setActivated(boolean activated2) {
			this.activated = activated2;
	}

	public Boolean isActivated() {
		return activated == true;
	}

	

}
