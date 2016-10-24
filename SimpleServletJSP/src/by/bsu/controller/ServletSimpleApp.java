package by.bsu.controller;

import by.bsu.service.TaxiCarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Igor on 19.10.2016.
 */
@WebServlet(name = "ServletSimpleApp")
public class ServletSimpleApp extends HttpServlet {
    private final String SHOW_CARS = "showCars";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        TaxiCarService service = new TaxiCarService();
        String page = request.getParameter(SHOW_CARS) != null ? SHOW_CARS : request.getParameter("sortCarsByModel") != null ?
                "sortCarsByModel" : "sortCarsByAge";
        if (request.getParameter("showCars") != null) {
            request.setAttribute("cars", service.getModels());
        } else if (request.getParameter("sortCarsByAge") != null) {
            request.setAttribute("ages", service.getSortedCarAge());
        } else if (request.getParameter("sortCarsByModel") != null) {
            request.setAttribute("models", service.getSortedModels());
        }
        request.getRequestDispatcher(page + ".jsp").forward(request, response);
    }
}
