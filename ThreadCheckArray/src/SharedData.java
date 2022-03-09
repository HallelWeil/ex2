import java.util.ArrayList;

/**
 * Description of SharedData save all the shared data for the threads
 */
public class SharedData {
	/**
	 * description of array the input array
	 */
	private ArrayList<Integer> array;
	/**
	 * description of winArray boolean array, true if the number in the same index
	 * is in the result
	 */
	private boolean[] winArray;
	/**
	 * description of flag synchronized, true if a thread found result
	 */
	private boolean flag;
	/** b - the number we try to get */
	private final int b;

	/**
	 * constructor, get the input array and the num to get
	 * 
	 * @param array the input array
	 * @param b     the result
	 */
	public SharedData(ArrayList<Integer> array, int b) {

		this.array = array;
		this.b = b;
	}

	/**
	 * return the WinArray
	 * 
	 * @return the WinArray
	 */
	public boolean[] getWinArray() {
		return winArray;
	}

	/**
	 * set the win array
	 * 
	 * @param winArray
	 */
	public void setWinArray(boolean[] winArray) {
		this.winArray = winArray;
	}

	/**
	 * return the input array
	 * 
	 * @return return the array
	 */
	public ArrayList<Integer> getArray() {
		return array;
	}

	/**
	 * return b
	 * 
	 * @return return b
	 */
	public int getB() {
		return b;
	}

	/**
	 * return the flag
	 * 
	 * @return return the flag
	 */
	public boolean getFlag() {
		return flag;
	}

	/**
	 * set the flag
	 * 
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
