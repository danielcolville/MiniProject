package session3;


public class Pal {
	static boolean canFormPalindrome(String str) { 
	      
	    // Create a count array and initialize all 
	    // values as 0 
	    int count[] = new int[256]; 
	    for(int i=0;i<count.length;i++) {
	    	count[i]=0;
	    }
	    //Arrays.fill(count, 0); 
	    
	    // For each character in input strings, 
	    // increment count in the corresponding 
	    // count array 
	    for (int i = 0; i < str.length(); i++) 
	    count[(int)(str.charAt(i))]++; 
	  
	    // Count odd occurring characters 
	    int odd = 0; 
	    for (int i = 0; i < 256; i++)  
	    { 
	    if ((count[i] % 2) == 1) 
	        odd++; 
	  
	    if (odd > 1) 
	        return false; 
	    } 
	  
	    // Return true if odd count is 0 or 1, 
	    return true; 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="racrace";
		int l=str.length();
		if(!canFormPalindrome(str)) {
			System.out.println(-1);
		}
		boolean isPal=true;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(l-i-1)) {
				
			}
			else {
				isPal=false;
			}
		}
		if(isPal) {
			System.out.println(0);
		}
		char[] ca=str.toCharArray();
		int count=0;
		int it=str.length();
		for(int i=0;i<it/2;i++) {
			if(ca[i]==ca[l-i-1]) {
				
			}
			else {
				System.out.println("else");
				//System.out.println(ca[i]+" "+i);
				
//				System.out.println(c+" "+i+" "+(l-i-1));
				while(ca[i]!=ca[l-i-1]) {
					int c=str.lastIndexOf(ca[i]);
					System.out.println(ca[i]+" "+ca[l-i-1]+" "+i+" "+(l-i-1));
					if(c>l-i-1) {
						int temp=str.lastIndexOf(ca[i]);
						char temp2=ca[temp];
						ca[c]=ca[c-1];
						ca[c-1]=temp2;
						count++;
						
						for(int k=0;k<ca.length;k++) {
							System.out.println(ca[k]);
						}
						
					}
					else {
					int temp=str.lastIndexOf(ca[i]);
					char temp2=ca[temp];
					ca[c]=ca[c+1];
					ca[c+1]=temp2;
					count++;
					for(int k=0;k<ca.length;k++) {
						System.out.println(ca[k]);
					}
					
					}
					
					//break;
					str="";
					for(int k=0;k<ca.length;k++) {
						str+=ca[k];
					}
					//str=ca.toString();
				}
			}
		}
		System.out.println(count);
	}

}
