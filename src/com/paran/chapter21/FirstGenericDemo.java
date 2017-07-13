package com.paran.chapter21;

public class FirstGenericDemo {
	public static void main(String[] args){
		//Type argument
		Inventory<String> inst1 = new Inventory<String>("아이템1");
		Inventory<Item> inst2 = new Inventory<Item>(new Item());
		Inventory<?> inst3 = new Inventory<String>("와일드카드");
		Inventory<Object> inst4 = new Inventory<Object>(new Object());
		Inventory<SubItem> inst5 = new Inventory<SubItem>(new SubItem());
		
		Inventory<Item> it;//Item과 SubItem은 상속관계이지만
		Inventory<SubItem> it2;//it 와 it2는 상속관계가 아니다
		it = it2;
		
		
		showInvenItemA(inst1);
		showInvenItemA(inst2);
		showInvenItemA(inst3);
		showInvenItemA(inst4);
		showInvenItemA(inst5);
		
		showInvenItemB(inst1);
		showInvenItemB(inst2);
		showInvenItemB(inst3);
		showInvenItemB(inst4);
		showInvenItemB(inst5);
		
		showInvenItemC(inst1);
		showInvenItemC(inst2);
		showInvenItemC(inst3);
		showInvenItemC(inst4);
		showInvenItemC(inst5);
		
		showInvenItemD(inst1);
		showInvenItemD(inst2);
		showInvenItemD(inst3);
		showInvenItemD(inst4);
		showInvenItemD(inst5);
		
		
	}
	public static void showInvenItemA(Inventory<?> inven){
		//type argument가 뭐든지 pass
		inven.showInfo();
	}
	public static void showInvenItemB(Inventory<? extends Item> inven){
		//type argument가 Item is-a relation 이하(어퍼바운드)
		inven.showInfo();
	}
	public static void showInvenItemC(Inventory<? super Item> inven){
		//type argument가 Item 상위 (로우바운드)
		inven.showInfo();
	}
	public static void showInvenItemD(Inventory<Item> inven){
		inven.showInfo();
	}
}

class Inventory<T>{//타입 파라미터
	public T item;
	public Inventory(T item){
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public void showInfo(){
		System.out.println(item);
	}
}

class Item{
	String name;
	String id;
	String originalOwner;
}
class SubItem extends Item{
	
}