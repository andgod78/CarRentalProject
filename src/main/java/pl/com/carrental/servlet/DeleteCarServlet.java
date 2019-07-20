package pl.com.carrental.servlet;

import pl.com.carrental.implementation.CarDaoImpl;
import pl.com.carrental.model.Car;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeleteCarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index2.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*if (req.getServletContext().getAttribute("car") != null) {

            int idOfCarToDelete = Integer.parseInt(req.getParameter("car_id"));

            List<Car> carList = (List<Car>) req.getServletContext().getAttribute("car");
            for (Car car : carList) {
                if (car.getId() == idOfCarToDelete) {
                    carList.remove(car);
                }
            }
            req.getServletContext().setAttribute("car", carList);*/

        int id = Integer.parseInt(req.getParameter("car_id"));

        CarDaoImpl.getInstance().deleteCar(id);
        resp.sendRedirect("index.jsp");

    }
}

