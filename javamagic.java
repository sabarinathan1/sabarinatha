package test;

public class javamagic {
public static void main(String[] args) {
//	java to izua	
	String j="java";
	String emp="";
for(int i=0;i<j.length()-1;i++)
{
if(j.charAt(i)=='a')
	emp+='z';
else
	emp+=((char)(j.charAt(i)-1));
}
System.out.println(emp+""+j.charAt(j.length()-1));

}
}
