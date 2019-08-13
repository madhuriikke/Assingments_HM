
 // Find the extension of a given string file. input: "hello.jpeg" output: "jpeg"
  
  //substring tokenizer as
  
  
  
  public class Assing1_14 {
  
  public static void main(String[] args) {
	  String s = "hello.jpeg";
				int location = 0 ;
			for(int i=0;i<s.length();i++)
			{
				char c= '.';
				
				if(c==s.charAt(i))
				{
					location = i ;
				}
			}
			String ans = s.substring(location+1,s.length());
			System.out.println(ans);
			
			
  
  }
  
  }
 