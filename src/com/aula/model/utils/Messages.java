package com.aula.model.utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Messages {
	public static void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
