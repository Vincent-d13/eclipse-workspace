package p1;

public class recursiveMember {

	public static void main(String[] args) {

		String [] str = {"A", "B", "C", "D"};
		System.out.println(isMember(str, "A"));
		

	}
	
	public static int currentIdx = 0;

	public static boolean isMember(String[] arr, String key) {
		boolean found = false;
		
		if (arr.length > currentIdx) {
			
			if (arr[currentIdx] == key) {
				
				found = true;
			} else {
				currentIdx++;
				
				if (arr.length > currentIdx) {
					found = isMember(arr, key);
				}
			}
		}

		return found;
	}
	
	/*

if (arr.length == 0) {

}

if (arr[0	 == key )
return 

arrays.copyofrange(arr, 1 , arr.length)
search(arr, key

if (start > end) 
return not found 
if (arr[start] == key)
return 

search(arr, start+ 1, end key

	*/

}
