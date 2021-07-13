package polymorphism2;


class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}}

class Human extends Animal{
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�");
	}}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}}


public class AnimalTest1{
	public static void main(String[] args) {
		
		AnimalTest1 aTest = new AnimalTest1();
		
		aTest.moveAnimal1(new Human());
		aTest.moveAnimal2(new Tiger());
		aTest.moveAnimal3(new Eagle());
	}
	
	
	  public void moveAnimal1(Human h) { // Human h new Human();
		  h.move(); }
	  public void moveAnimal2(Tiger t) { 
		  t.move(); }
	  public void moveAnimal3(Eagle e) { 
		  e.move(); }
}