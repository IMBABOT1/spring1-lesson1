package ru.geekbrains.spring1.lesson1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {

    private List<Product> products;

    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1l, "title1", 10),
                new Product(1l, "title2", 10),
                new Product(3l, "title3", 10),
                new Product(4l, "title4", 10),
                new Product(5l, "title5", 10),
                new Product(6l, "title6", 10),
                new Product(7l, "title7", 10),
                new Product(8l, "title8", 10),
                new Product(9l, "title9", 10),
                new Product(10l, "title10", 10)
        ));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < products.size(); i++) {
            resp.getWriter().printf("<h1>" + products.get(i) + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }

}
