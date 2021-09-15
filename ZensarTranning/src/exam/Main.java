package exam;
import java.util.Scanner;
public class Main 
{
	public String doubleChar(String str)
	{
	int len = str.length();
	char ch;
	String result;
	StringBuilder stbuilt =new StringBuilder(len*2);
	for(int i=0; i < len ;)
	{
		ch = str.charAt(i);
		stbuilt.append(ch);
		stbuilt.append(ch);
	}
	return stbuilt.toString();
	}
}
