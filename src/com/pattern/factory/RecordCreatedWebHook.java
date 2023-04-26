package com.pattern.factory;

/**
 * 
 * @author prabhuddha.bhashitha
 *
 */
public class RecordCreatedWebHook implements WebHookService {

	@Override
	public void processEvent() {
		System.out.println("Process the activity creation event");
	}

}
