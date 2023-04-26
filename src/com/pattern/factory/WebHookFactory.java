package com.pattern.factory;

/**
 * 1. Factory design pattern is a creational design pattern.
 * 2. If a supper class( or interface or abstract class) has multiple sub classes, Factory method is used to get the required subclass by giving a identification.
 * 3. This patterns takes the object creational part out of the client code, so it is easy to do any changes to object creation as there is no need to change the client code
 * 4. Another advantage is that, here we have the central place to do any validation before creating any object
 * 5. In JDK there are multiple placeses which uses the factory pattern.
 *    4.1. java.util.Calendar class getInstance() method
 * @author prabhuddha.bhashitha
 *
 */
public class WebHookFactory {

	public static WebHookService getWebHookService(String type) {
		switch (type) {
		case "CREATED":
			return new RecordCreatedWebHook();
		case "DELETED":
			return new RecordDeletedWebHook();
		default:
			return null;
		}

	}
	
	public static void main(String[] args) {
		WebHookService whService = getWebHookService("CREATED");
		whService.processEvent();
	}
}
