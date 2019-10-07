package hotelapp;

import java.nio.file.Path;
import java.util.List;
import customLock.ReentrantReadWriteLock;

/**
 * Class ThreadSafeHotelData - extends class HotelData (rename your class from project 1 as needed).
 * Thread-safe, uses ReentrantReadWriteLock to synchronize access to all data structures.
 */
public class ThreadSafeHotelData extends HotelData {

	private ReentrantReadWriteLock lock = null;

	/**
	 * Default constructor.
	 */
	public ThreadSafeHotelData() {
		// FILL IN CODE: call parent's constructor and initialize the lock

	}


	/**
	 * Overrides addHotel method from HotelData class to make it thread-safe; uses the lock.
	 * Create a Hotel given the parameters, and add it to the appropriate data
	 * structure(s).
	 * 
	 * @param hotelId
	 *            - the id of the hotel
	 * @param hotelName
	 *            - the name of the hotel
	 * @param city
	 *            - the city where the hotel is located
	 * @param state
	 *            - the state where the hotel is located.
	 * @param streetAddress
	 *            - the building number and the street
	 * @param lat
	 * @param lon
	 */
	public void addHotel(String hotelId, String hotelName, String city, String state, String streetAddress, double lat,
			double lon) {
			// FILL IN CODE

	}

	/**
	 * Overrides addReview method from HotelData class to make it thread-safe; uses the lock.
	 *
	 * @param hotelId
	 *            - the id of the hotel reviewed
	 * @param reviewId
	 *            - the id of the review
	 * @param rating
	 *            - integer rating 1-5.
	 * @param reviewTitle
	 *            - the title of the review
	 * @param review
	 *            - text of the review
	 * @param isRecom
	 *            - whether the user recommends it or not
	 * @param date
	 *            - date of the review
	 * @param username
	 *            - the nickname of the user writing the review.
	 * @return true if successful, false if unsuccessful because of invalid date
	 *         or rating. Needs to catch and handle the following exceptions:
	 *         ParseException if the date is invalid InvalidRatingException if
	 *         the rating is out of range
	 */
	public boolean addReview(String hotelId, String reviewId, int rating, String reviewTitle, String review,
			boolean isRecom, String date, String username) {

		// FILL IN CODE

		return false; // change

	}

	/** Overrides toString method of class HotelData to make it thread-safe.
	 * Returns a string representing information about the hotel with the given
	 * id, including all the reviews for this hotel separated by
	 * --------------------
	 * Format of the string: HoteName: hotelId
	 * streetAddress city, state
	 * --------------------
	 * Review by username: rating
	 * ReviewTitle ReviewText
	 * --------------------
	 * Review by username: rating
	 * ReviewTitle ReviewText ...
	 * 
	 * @param hotelId
	 * @return - output string.
	 */
	public String toString(String hotelId) {
		// FILL IN CODE

		return ""; // change
	}

	/**
	 * Overrides the method printToFile of the parent class to make it thread-safe.
	 * Save the string representation of the hotel data to the file specified by
	 * filename in the following format: an empty line A line of 20 asterisks
	 * ******************** on the next line information for each hotel, printed
	 * in the format described in the toString method of this class.
	 * 
	 * The hotels should be sorted by hotel ids
	 * 
	 * @param filename
	 *            - Path specifying where to save the output.
	 */
	public void printToFile(Path filename) {
		// FILL IN CODE

	}

	/**
	 * Overrides a method of the parent class to make it thread-safe.
	 * Return an alphabetized list of the ids of all hotels
	 * 
	 * @return
	 */
	public List<String> getHotels() {
		// FILL IN CODE

		return null; // change
	}

	// Override other methods as needed
}
