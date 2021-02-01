package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 631503
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("message", "--");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        String second = request.getParameter("second");

        request.setAttribute("first", first);
        request.setAttribute("second", second);

        try {

            if (first.equals("") || second.equals("")) {
                request.setAttribute("message", "Invalid");

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            }

            if (request.getParameter("Addition") != null) {
                int add = Integer.valueOf(first) + Integer.valueOf(second);

                request.setAttribute("message", add);

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);

                return;
            }

            if (request.getParameter("Subtraction") != null) {
                int subtract = Integer.valueOf(first) - Integer.valueOf(second);

                request.setAttribute("message", subtract);

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);

                return;
            }

            if (request.getParameter("Multiplication") != null) {
                int multiply = Integer.valueOf(first) * Integer.valueOf(second);

                request.setAttribute("message", multiply);

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);

                return;
            }

            if (request.getParameter("Modulus") != null) {
                int mod = Integer.valueOf(first) % Integer.valueOf(second);

                request.setAttribute("message", mod);

                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);

                return;
            }
            
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        }
    }

}
