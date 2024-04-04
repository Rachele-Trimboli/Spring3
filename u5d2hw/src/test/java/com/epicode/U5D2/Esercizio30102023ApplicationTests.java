package com.epicode.U5D2;


import com.epicode.U5D2.entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Esercizio30102023ApplicationTests {




	@Test
	public void correttaCreazioneDrink(){
		Drink drink1 = new Drink("wine",200,12.50);
		assertEquals("wine",drink1.getName());
		assertEquals(200,drink1.getCalories());
		assertEquals(12.50,drink1.getPrice());
	}


	@Test
	public void verificaCheSiSiaCreataLaPizza(){
		Topping topping1 = new Topping("Mozzarella",150,2.50);
		Topping topping2 = new Topping("Pomodoro",10,0.50);
		Pizza pizza = new Pizza("Margherita",List.of(topping1,topping2),false);
		assertEquals("Margherita", pizza.getName());
		assertEquals("Mozzarella", topping1.getName());
		assertEquals("Pomodoro", topping2.getName());
	}

	@Test
	public void verificaCheSiCreiIlMenu(){
		Topping topping1 = new Topping("Mozzarella",150,2.50);
		Topping topping2 = new Topping("Pomodoro",10,0.50);
		Pizza pizza = new Pizza("Margherita",List.of(topping1,topping2),false);
		Drink drink = new Drink("Birra",250,6);
		Menu menu = new Menu(List.of(pizza),List.of(drink),List.of(topping1,topping2));
		assertEquals(2,menu.getToppingList().size());
		assertEquals(1,menu.getDrinkList().size());
		assertEquals(1,menu.getPizzaList().size());
	}

	@Test
	public void correttaCreazioneOrdine(){
		Table table1 = new Table(2,5,true,1);
		Order ordine1 = new Order(3,table1);
		assertNotNull(table1);
		assertNotNull(ordine1);
		assertNotEquals(0,ordine1.getTotal());
		assertTrue(table1.isFree());
	}







	@Test
	void contextLoads() {
	}

}
