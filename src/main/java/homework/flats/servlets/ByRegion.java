package homework.flats.servlets;

import homework.commonInit.Init;
import homework.flats.entities.Flat;
import homework.flats.services.FilterService;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YBolshakova
 */
@WebServlet("/selectByRegion")
public class ByRegion extends HttpServlet {
    private final FilterService service;
    private Init init;
    
    public ByRegion(){
       this.init = Init.getInit();
        this.service = init.getService();
    }

    

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("byRegion.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(ByParameters.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ByParameters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String regiot = request.getParameter("region");
        List<Flat> flats = service.selectByRegion(regiot);
        request.setAttribute("list", flats);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(ByRegion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
