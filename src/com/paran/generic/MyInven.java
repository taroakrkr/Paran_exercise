package com.paran.generic;

import java.util.ArrayList;
import java.util.List;


public class MyInven{
	public static void main(String[] args){
		Inventory<Item> player = new Inventory<Item>();
		player.inventory.add(new Weapon("무기", "연습 용무기", "보통", 100, 1, 5, 0, false, 10, 50,"연습용무기다."));
		player.inventory.add(new Armour("방어구", "연습용 방어구", "보통", 100, 1, 10, 3, false, 30,"연습용방어구다."));
		player.inventory.add(new Accessory("악세서리", "연습용 악세서리", "레어", 500, 5, 10, 1, true, 10,"조금 희귀한 악세서리."));
		player.inventory.add(new ConsumeItem("소비", "체력포션", "흔함", 3, 20, "체력을 회복시켜준다."));
		player.inventory.add(new Material("재료", "철광석", "보통", 10, 5, "철광석이다. 재료로 사용가능하다."));
		for(int i = 0 ; i < player.inventory.size() ; i++){
			player.inventory.get(i).showInfo();
		}
		//System.out.println(((Weapon) player.inventory.get(0)).getCritical());
		
	}
}
class Inventory<T extends Item>{
	List<T> inventory = new ArrayList<T>();
}

abstract class Item{
	private String itemType;
	private String name;
	private String rareness;
	private String text;
	private int countItem;
	private int price;
	
	public Item(String itemType, String name, String rareness, int countItem, int price, String text){
		this.itemType = itemType;
		this.name = name;
		this.rareness = rareness;
		this.countItem = countItem;
		this.price = price;
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRareness() {
		return rareness;
	}
	public void setRareness(String rareness) {
		this.rareness = rareness;
	}
	public int getCountItem() {
		return countItem;
	}
	public void setCountItem(int countItem) {
		this.countItem = countItem;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	abstract void showInfo();
}

abstract class Equipment extends Item{
	private int demandLevel;
	private int power;
	private int grade;
	private boolean using;
	public Equipment(String itemType, String name, String rareness, int price, int demandLevel, int power, int grade, boolean using, String text){
		super(itemType, name,rareness, 1,price, text);
		this.demandLevel = demandLevel;
		this.power = power;
		this.grade = grade;
		this.using = using;
	}
	public int getDemandLevel() {
		return demandLevel;
	}
	public void setDemandLevel(int demandLevel) {
		this.demandLevel = demandLevel;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public boolean isUsing() {
		return using;
	}
	public void setUsing(boolean using) {
		this.using = using;
	}
	@Override
	public void setCountItem(int countItem){
	}
}
class Weapon extends Equipment{
	private int critical;
	private int accuracy;
	public Weapon(String itemType, String name, String rareness, int price, int demandLevel, int power, int grade, boolean using, int critical, int accuracy, String text){
		super(itemType, name,rareness,price,demandLevel,power,grade,using,text);
		this.critical = critical;
		this.accuracy = accuracy;
	}
	public int getCritical() {
		return critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	@Override
	public void showInfo() {
		System.out.println("타입 : "+super.getItemType() + " / 이름 : "+super.getName() + " / 희귀도 : "+super.getRareness() + " / 요구레벨 : "+super.getDemandLevel() + " / 등급 : "+super.getGrade() + " / 공격력 : "+super.getPower() + " / 가격 : "+super.getPrice()+ " / 착용중 : "+super.isUsing() + " / 크리티컬 : "+ critical + " / 정확도 : "+accuracy + " / 설명 : "+super.getText());
	}
}
class Armour extends Equipment{
	private int avoidability;
	public Armour(String itemType, String name, String rareness, int price, int demandLevel, int power, int grade, boolean using, int avoidability, String text){
		super(itemType, name,rareness,price,demandLevel,power,grade,using,text);
		this.avoidability = avoidability;
	}
	public int getAvoidability() {
		return avoidability;
	}
	public void setAvoidability(int avoidability) {
		this.avoidability = avoidability;
	}
	@Override
	void showInfo() {
		System.out.println("타입 : "+super.getItemType() + " / 이름 : "+super.getName() + " / 희귀도 : "+super.getRareness() + " / 요구레벨 : "+super.getDemandLevel() + " / 등급 : "+super.getGrade() + " / 방어력 : "+super.getPower() + " / 가격 : "+super.getPrice()+ " / 착용중 : "+super.isUsing() + " / 회피율 : "+ avoidability + " / 설명 : "+super.getText());
	}
	
}
class Accessory extends Equipment{
	private int luck;
	public Accessory(String itemType, String name, String rareness, int price, int demandLevel, int power, int grade, boolean using, int luck, String text){
		super(itemType, name,rareness,price,demandLevel,power,grade,using, text);
		this.luck = luck;
	}
	public int getLuck() {
		return luck;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	@Override
	void showInfo() {
		System.out.println("타입 : "+super.getItemType() + " / 이름 : "+super.getName() + " / 희귀도 : "+super.getRareness() + " / 요구레벨 : "+super.getDemandLevel() + " / 등급 : "+super.getGrade() + " / 방어력 : "+super.getPower() + " / 가격 : "+super.getPrice()+ " / 착용중 : "+super.isUsing() + " / 행운 : "+ luck + " / 설명 : "+super.getText());
	}
	
}
class ConsumeItem extends Item{
	public ConsumeItem(String itemType, String name, String rareness, int countItem,int price, String text){
		super(itemType, name,rareness, countItem, price, text);
	}

	@Override
	void showInfo() {
		System.out.println("타입 : "+super.getItemType() + " / 이름 : "+super.getName() + " / 희귀도 : "+super.getRareness() + " / 가격 : "+super.getPrice()+ " / 개수 : "+super.getCountItem() + " / 설명 : "+super.getText());
	}
}

class Material extends Item{
	public Material(String itemType, String name, String rareness, int countItem,int price, String text){
		super(itemType, name,rareness, countItem, price, text);
	}

	@Override
	void showInfo() {
		System.out.println("타입 : "+super.getItemType() + " / 이름 : "+super.getName() + " / 희귀도 : "+super.getRareness() + " / 가격 : "+super.getPrice()+ " / 개수 : "+super.getCountItem() + " / 설명 : "+super.getText());
	}
}