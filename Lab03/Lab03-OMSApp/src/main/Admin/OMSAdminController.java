package main.Admin;

import javax.swing.JPanel;

import media.Admin.AdminBookPageController;

public class OMSAdminController {
	
	public JPanel getBookPage() {
		AdminBookPageController controller = new AdminBookPageController();
		return controller.getDataPagePane();
	}
}
 