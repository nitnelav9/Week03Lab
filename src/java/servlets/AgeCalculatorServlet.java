
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
        
        
        if(age==null || age =="")
        {
            request.setAttribute("message", "You must give your current age!<br>");
            
        }
        else if(Integer.parseInt(age)>=0)
        {
            String result = "Your age next birthday will be "+(Integer.parseInt(age)+1+"<br>");
            request.setAttribute("message",result);
        }
        else
        {
            request.setAttribute("message", "You must give your current age!<br>");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request,response);

    }

}
