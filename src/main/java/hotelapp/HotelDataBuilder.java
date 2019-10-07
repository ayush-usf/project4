package hotelapp;

import java.nio.file.Path;

/** Class HotelDataBuilder. Loads hotel info from input files to ThreadSafeHotelData (using multithreading). */
public class HotelDataBuilder {
	private ThreadSafeHotelData hdata; // the "big" ThreadSafeHotelData that will contain all hotel and reviews info
	// FILL IN CODE: add other instance variables as needed

	/** Constructor for class HotelDataBuilder.
	 *  @param data */
	public HotelDataBuilder(ThreadSafeHotelData data) {
		// FILL IN CODE

	}

	/** Constructor for class HotelDataBuilder that takes ThreadSafeHotelData and
	 * the number of threads to create as a parameter.
	 * @param data
	 * @param numThreads
	 */
	public HotelDataBuilder(ThreadSafeHotelData data, int numThreads) {
		// FILL IN CODE
	}


	/**
	 * Read the json file with information about the hotels and load it into the
	 * appropriate data structure(s).
	 * @param jsonFilename
	 */
	public void loadHotelInfo(String jsonFilename) {
		// FILL IN CODE (from lab 1)


	}

	/** Loads reviews from json files. Recursively processes subfolders.
	 *  Each json file with reviews should be processed concurrently (you need to create a new runnable job for each
	 *  json file that you encounter)
	 *  @param dir
	 */
	public void loadReviews(Path dir) {
		// FILL IN CODE

	}

	/** Prints all hotel info to the file. Calls hdata's printToFile method. */
	public void printToFile(Path filename) {
		// FILL IN CODE
	}

	// FILL IN CODE: add an inner class and other methods as needed
	// Note: You need to have an inner class that implements Runnable and parses each json file with reviews

}
