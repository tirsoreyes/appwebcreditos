package com.itsav.creditos.appwebcreditos;

import org.apache.commons.codec.digest.DigestUtils;

public class TicketHelper {

	private static final String KEY = ":)";

	public String encript(String texto){
		String textoEncriptado = DigestUtils.sha512Hex(texto+KEY);
		return textoEncriptado;
	}
}
