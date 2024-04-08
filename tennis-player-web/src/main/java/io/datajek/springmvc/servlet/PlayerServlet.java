package io.datajek.springmvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;

@WebServlet(urlPatterns = "/player.do")
public class PlayerServlet extends HttpServlet {

    private PlayerService service = new PlayerService();


//start in terminal with ./mvnw tomcat7:run or ./mvnw clean tomcat7:run
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        /* First Part
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>" +
                "<title>Servlet.Player DB</title>" +
                "</head>");
        out.println("<body>" +
                "<H2>Welcome to the Tennis Players database!</H2>" +
                "</body>");
        out.println("</html>");
        */

        /* Second Part
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
         */

        /* Third Part
        String playerName = request.getParameter("name");
        System.out.println(playerName);
        request.setAttribute("name", playerName);
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
         */



        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);


    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        /*Fourth Part
        String playerName = request.getParameter("name");
        request.setAttribute("name", playerName);
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);
        */

    String playerName = request.getParameter("name");

        Player player = service.getPlayerByName(playerName);

        request.setAttribute("name", playerName);
        request.setAttribute("country", player.getNationality());
        request.setAttribute("dob", player.getBirthDate());
        request.setAttribute("titles", player.getTitles());
        request.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(request, response);



    }
}
