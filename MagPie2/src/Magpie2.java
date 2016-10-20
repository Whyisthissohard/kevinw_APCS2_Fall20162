
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} 
		else if (statement.indexOf("Dreyer") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "They seem nice.";
		} 
		else if (statement.indexOf("Scrub") >= 0
				|| statement.indexOf("Stop") >= 0
				|| statement.indexOf("Stupid") >= 0
				|| statement.indexOf("Chinese") >= 0) {
			response = "Shut up.";
		} else if (statement.length()<=0)
			response = "Say something,please";
			
			else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "I'm getting closer.";
		} else if (whichResponse == 1) {
			response = "I can smell your fear.";
		} else if (whichResponse == 2) {
			response = "Look behind you.";
		} else if (whichResponse == 3) {
			response = "dank meme.";
		}else if (whichResponse == 4) {
			response = "Harambe didn't die for this.";
		}else if (whichResponse == 5) {
			response = "I see you.";
		}

		return response;
	}
}
