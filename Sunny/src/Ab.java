

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Ab extends HttpServlet 
{
	String s1="",s2="",s3="",s4="";
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		s1=request.getParameter("val1");
		s2=request.getParameter("val2");
		if(s1.length() < s2.length())
		{ 
			s3=s1.charAt(0)+"."+s2.charAt(0)+""+s2.charAt(1)+""+s2.charAt(2);
				
		}
		else if(s1.length()==s2.length())
		{
			s3=s1.charAt(0)+"."+s1.charAt(1)+""+s1.charAt(2)+""+s2.charAt(1)+""+s2.charAt(2);
		}
		else
		{
			s3=s2.charAt(0)+"."+s1.charAt(0)+""+s1.charAt(1)+""+s2.charAt(2);
		}
		
		
		for(int i=0; i<s3.length();i++)
		{
			if(Character.isLetter(s3.charAt(i)))
			{
				if(Character.isLowerCase(s3.charAt(i)))
				{
					s4=s4+Character.toUpperCase(s3.charAt(i));
				}
				else
				{ 
					s4=s4+Character.toLowerCase(s3.charAt(i));
				}
				
			}
				else
				{
					s4=s4+s3.charAt(i);
				}
			}
				PrintWriter pw=response.getWriter();
				pw.print(s4);
			  s4="";
	   	}
				
	}			
					

