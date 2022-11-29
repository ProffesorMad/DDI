package servlet;

import java.io.IOException;
import java.util.Optional;



import model.Items;
import repository.ItemsRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/insertChamps")
public class InsertChampsServlet extends BaseServlet{

	ItemsRepository repository = new ItemsRepository();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Items champ = getItemFromRequest(req);
	
		repository.insert(champ);
		redirect(req, resp, "/index.jsp");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

}