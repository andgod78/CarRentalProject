package pl.com.carrental.servlet;

import pl.com.carrental.model.Car;
import pl.com.carrental.model.CarRental;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AddCar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getServletContext().getAttribute("car") == null){
            req.getServletContext().setAttribute("car",CarRental.createCars());
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getServletContext().getAttribute("car") == null){
            req.getServletContext().setAttribute("car", CarRental.createCars());

            int id = Integer.parseInt(req.getParameter("id"));
            String brand = req.getParameter("brand");
            String model = req.getParameter("model");
            int productionYear = Integer.parseInt(req.getParameter("productionYear"));
            int meterStatus = Integer.parseInt(req.getParameter("meterStatus"));
            int gasoline = Integer.parseInt(req.getParameter("gasoline"));

            Car newCar = new Car(id,brand,model,productionYear,meterStatus,gasoline);

            List<Car> carList = (List<Car>) req.getServletContext().getAttribute("car");
            carList.add(newCar);

            req.getServletContext().setAttribute("car",carList);



            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req,resp);

        }
    }
}