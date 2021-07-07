
public class LinearSearch {

	public static void main(String[] args) {
		//create some dummy data for our method
        
		char letter = 'm';
		//char letter = '0';
		
        //char[] letters =null;
		
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        
        //call your methods here
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.findIndex(letter, letters));
    }

    //create your first method here
	public int findIndex(char target, char[] data) {
		//handles NullPointerException to return -1 since we know we can't find a match if the data parameter is null
		if (data == null) return -1;
		
		int result = -1;
		
		//loop through the data
		for(int i = 0; i < data.length; i++) {
			char temp = data[i];
			
			//test current element against target
			if (temp == target) {
				return i; //return the current index
			}
		}
		return result;
	}

}
