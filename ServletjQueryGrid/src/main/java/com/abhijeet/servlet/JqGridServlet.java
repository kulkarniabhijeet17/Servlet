package com.abhijeet.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abhijeet.model.JqGridModel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JqGridServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JqGridModel gridModel1 = new JqGridModel();
		gridModel1.setId(1);
		gridModel1.setFirstName("Abhijeet");
		gridModel1.setLastName("Kulkarni");
		gridModel1.setCity("Pune");
		gridModel1.setState("Maharashtra");

		JqGridModel gridModel2 = new JqGridModel();
		gridModel2.setId(2);
		gridModel2.setFirstName("Snehal");
		gridModel2.setLastName("Kulkarni");
		gridModel2.setCity("Barshi");
		gridModel2.setState("Maharashtra");

		List<JqGridModel> jqGridModels = new ArrayList<>();
		jqGridModels.add(gridModel1);
		jqGridModels.add(gridModel2);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonArray = gson.toJson(jqGridModels);
		jsonArray = "{\"page\":1,\"total\":\"2\",\"records\":" + jqGridModels.size() + ",\"rows\":" + jsonArray + "}";

		System.out.println(jsonArray);

		response.getWriter().print(jsonArray);
	}
}