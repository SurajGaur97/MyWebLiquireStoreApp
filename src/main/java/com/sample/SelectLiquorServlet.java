package com.sample;

import com.sample.model.LiquorType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 3.4. Creating the Servlet Class:
 * Next, let's create the SelectLiquorSevlet.java class that handles the user request from the HTML page.
 */
@WebServlet(
    name = "selectliquorservlet",
    urlPatterns = "/SelectLiquor"
)
public class SelectLiquorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String liquorType = req.getParameter("Type");

        LiquorType lType = LiquorType.valueOf(liquorType);

        LiquorService liquorService = new LiquorService();
        List liquorBrands = liquorService.getAvailableBrands(lType);

        req.setAttribute("brands", liquorBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);
    }
}
