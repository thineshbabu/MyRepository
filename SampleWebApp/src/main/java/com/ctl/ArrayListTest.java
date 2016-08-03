package com.ctl;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Thinesh");
		list.add("Sharme");
		list.add("Iniyavan");
		for(String s: list)
		{
			System.out.println("Name = " + s + " ");
		}
	}
}
