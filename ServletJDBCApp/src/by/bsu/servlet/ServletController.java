package by.bsu.servlet;

import by.bsu.dao.impl.TaxiCarDaoImpl;
import by.bsu.service.TaxiCarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Asus on 31.10.2016.
 */
@WebServlet(name = "ServletController")
public class ServletController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final String SHOW_CARS = "showCars";
    private final String SORT_CARS_MODEL = "sortCarsByModel";
    private final String SORT_CARS_AGE = "sortCarsByAge";

    public ServletController() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        TaxiCarDaoImpl taxiDao = new TaxiCarDaoImpl();
        TaxiCarService service = new TaxiCarService();
        service.setTaxiCarDao(taxiDao);
        String page = request.getParameter(SHOW_CARS) != null ? SHOW_CARS : request.getParameter(SORT_CARS_MODEL) != null ?
                SORT_CARS_MODEL : SORT_CARS_AGE;
        if (request.getParameter(SHOW_CARS) != null) {
            try {
                request.setAttribute("cars", service.getTaxiCars());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        } else if (request.getParameter(SORT_CARS_AGE) != null) {
            try {
                request.setAttribute("ages", service.getSortedCarAge());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        } else if (request.getParameter(SORT_CARS_MODEL) != null) {
            try {
                request.setAttribute("models", service.getSortedModels());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        request.getRequestDispatcher(page + ".jsp").forward(request, response);
    }
}
