class Palindrome{



public static void main(String []args){

	//Remove any non alphanumeric characters

	//String arr[]= new String [4];
	String arr[]= {"a","b","b","a"};
	
	System.out.println("Palindrome Found "+Palindrome.isPalindrome(arr));

}


private static boolean isPalindrome(String arr[]){
	int currIndex=0;
	for(String str: arr){
		
		if(str==arr[(arr.length-currIndex)-1]){
			System.out.println("One Palindrome Found");
		}else{
			return false;
		}
		currIndex++;
	}
	

	return true;
}


}