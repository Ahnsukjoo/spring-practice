package org.zerock.w1.calc;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.zerock.w1.HelloServlet;

@WebServlet(name = "calcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HelloServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        System.out.printf(" num1: %s", num1);
        System.out.printf(" num2: %s", num2);
    }
}
