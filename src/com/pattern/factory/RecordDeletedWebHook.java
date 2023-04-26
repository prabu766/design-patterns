package com.pattern.factory;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class RecordDeletedWebHook implements WebHookService {

	@Override
	public void processEvent() {
		System.out.println("Process the activity deleted event");
	}

}
