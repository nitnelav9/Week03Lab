
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "--");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);
        
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("result", "--");
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        request.setAttribute("first", first );
        request.setAttribute("second", second);
        boolean first_letter = letters(first);
        boolean second_letter = letters(second);
        
        
        if(first==null || first =="" || first_letter || second==null || second =="" || second_letter && (request.getParameter("add") != null
                || request.getParameter("sub") != null || request.getParameter("mul") != null && request.getParameter("per") != null))
        {
            request.setAttribute("result", "invalid");
            
        }
        else if(request.getParameter("add") != null)
        {
            request.setAttribute("result", (Integer.parseInt(first)+Integer.parseInt(second)));
        }
        else if(request.getParameter("sub") != null)
        {
            request.setAttribute("result", (Integer.parseInt(first)-Integer.parseInt(second)));
        }
        else if(request.getParameter("mul") != null)
        {
            request.setAttribute("result", (Integer.parseInt(first)*Integer.parseInt(second)));
        }
        else if(request.getParameter("pe") != null)
        {
            request.setAttribute("result", (Integer.parseInt(first)%Integer.parseInt(second)));
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request,response);

    }
    
    boolean letters(String input)
    {
        for(int i =0;i<input.length();i++)
        {
            if(Character.isLetter(input.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }

 
}

