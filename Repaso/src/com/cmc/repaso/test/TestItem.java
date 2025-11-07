package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item=new Item();
		item.setProductosActuales(20);
		
		item.Imprimir();
		
		item.vender(10);
		
		item.Imprimir();
		
		item.devolver(5);
		
		item.Imprimir();
		
	}

}
