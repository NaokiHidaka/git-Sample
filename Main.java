import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Data hero = new Data();
		hero.setName("naoki");
		hero.setHp(10);
		hero.setMp(5);
		hero.setAtk(3);
		hero.setDf(1);
		hero.setLv(1);
		System.out.println("----HERO DATA----");
		hero.printData();

	}
}