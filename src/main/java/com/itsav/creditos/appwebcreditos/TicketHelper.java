package com.itsav.creditos.appwebcreditos;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class TicketHelper {

	private static final String KEY = ":)";

	public String encript(String texto){
		String textoEncriptado = DigestUtils.sha512Hex(texto+KEY);
		return textoEncriptado;
	}
	
	
	
		
		public java.sql.Date traeFecha (){
			java.util.Date fechaDate = new java.util.Date();
			String fecha = String.valueOf(fechaDate);
			java.sql.Date fechaActual = new java.sql.Date(fechaDate.getTime());
			
			
			
			return fechaActual;
		}
		public java.sql.Date StringToDate (String dateString){
			
			java.sql.Date sqlDate= null;;
			try {
				
			
			 SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
			 java.util.Date utilDate = spf.parse(dateString);
			 sqlDate  = new java.sql.Date(utilDate.getTime());
			 } catch (Exception e) {
					// TODO: handle exception
				} 
			 		
			
			return sqlDate;
		}
		
		public String DatetoString(java.util.Date dateFecha){
			String fechaString="";
			DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 fechaString = fechaHora.format(dateFecha);
			
			
			
			return fechaString;
		}
		
		public String generaClave(String email){
			
			java.util.Date fecha = new java.util.Date();
			DateFormat fechaHora = new SimpleDateFormat("HH:mm:ss");
			String horaString = fechaHora.format(fecha);
			String []claves = horaString.split(":");
			String[]emails = email.split("@");
			Random rnd = new Random();
			int rand= (int) (rnd.nextDouble() * 10 + 1);
			
			int aleatoreo =rand+Integer.parseInt(claves[1])+Integer.parseInt(claves[2]);
			
			String clave = emails[0]+aleatoreo; 
			
			
			
			return clave;
		}
		
		public String sendEmail (String email, String cuerpo){
			
			Email correo = new SimpleEmail();
			correo.setHostName("smtp.googlemail.com");
			correo.setSmtpPort(465);
			correo.setAuthenticator(new DefaultAuthenticator("empleover365@gmail.com"
					+ "", "Morphy0159!"));
			correo.setSSLOnConnect(true);
			try {
				correo.setFrom("empleover365@gmail.com");
			
			correo.setSubject("Empleoveracruz.gob.mx");
			correo.setMsg(cuerpo);
			correo.addTo(email);
			correo.send();
			} catch (EmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Error al enviar email: "+e);
				return "false";
			}
			
			
			return "true";
		}
		

		
		
		public static byte[] getBytes(InputStream is) throws IOException {

		    int len;
		    int size = 1024;
		    byte[] buf;

		    if (is instanceof ByteArrayInputStream) {
		      size = is.available();
		      buf = new byte[size];
		      len = is.read(buf, 0, size);
		    } else {
		      ByteArrayOutputStream bos = new ByteArrayOutputStream();
		      buf = new byte[size];
		      while ((len = is.read(buf, 0, size)) != -1)
		        bos.write(buf, 0, len);
		      buf = bos.toByteArray();
		    }
		    return buf;
		  }


	

	
	
	
	
	
	
	
	
}
