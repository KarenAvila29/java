package com.krakedev.conexionbdd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA="yyyy/MM/dd";
	private static final String FORMATO_HORA="hh:mm:ss";
	private static final Logger  LOGGER=LogManager.getLogger(Convertidor.class);
	
	public static Date ConvertirFecha(String fechaStr) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate=null;
		try {
			LOGGER.trace("Convirtiendo fecha "+fechaStr);
			 fechaDate=sdf.parse(fechaStr);
			 LOGGER.trace("fecga convertida "+fechaDate);
		} catch (ParseException e) {
			LOGGER.error("La fecha no tiene el formato correcto " + fechaStr,e);
			//e.printStackTrace();
			//lanzar mensaje
			throw new Exception("La fecha no tiene el formato correcto " + fechaStr);
		}
		return fechaDate;
	}
	
	public static Date ConvertirHora(String horaStr) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat(FORMATO_HORA);
		Date horaDate=null;
		try {
			 horaDate=sdf.parse(horaStr);
		} catch (ParseException e) {
			LOGGER.error("La hora no tiene el formato correcto " + horaStr,e);
			//e.printStackTrace();
			//lanzar mensaje
			throw new Exception("La hora no tiene el formato correcto " + horaStr );
		}
		return horaDate;
	}

}
