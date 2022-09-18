
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mmval
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);
        
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        boolean letter = false;
        for(int i =0;i<age.length();i++)
        {
            if(Character.isLetter(age.charAt(i)))
            {
                letter=true;
            }
        }
        
        if(age==null || age =="" || letter)
        {
            request.setAttribute("message", "You must give your current age!<br>");
            
        }
        else
        {
            String result = "Your age next birthday will be "+(Integer.parseInt(age)+1+"<br>");
            request.setAttribute("message",result);
        }
       
    
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);

    }

}
