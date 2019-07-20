package pl.com.carrental.servlet;

import pl.com.carrental.implementation.CarDaoImpl;
import pl.com.carrental.model.Car;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddCarServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String brand = req.getParameter("brand");
        String model = req.getParameter("model");
        int productionYear = Integer.parseInt(req.getParameter("productionYear"));
        int meterStatus = Integer.parseInt(req.getParameter("meterStatus"));
        int gasoline = Integer.parseInt(req.getParameter("gasoline"));


        Car newCar = new Car(-1, brand, model, productionYear, meterStatus, gasoline);

        CarDaoImpl.getInstance().addCar(newCar);

        resp.sendRedirect("index.jsp");


    }


}
