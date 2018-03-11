class Data{
	public String name;
	public int hp;
	public int mp;
	public int atk;
	public int df;
	public int lv;

	public void setName(String name){
		this.name = name;
	}
	public void setHp(int hp){
		this.hp = hp;
	}
	public void setMp(int Mp){
		this.mp = mp;
	}
	public void setAtk(int atk){
		this.atk = atk;
	}
	public void setDf(int df){
		this.df = df;
	}
	public void setLv(int lv){
		this.lv = lv;
	}

	public void printData(){
		System.out.println("Name:" + this.name);
		System.out.println("HP:" + this.hp);
		System.out.println("MP:" + this.mp);
		System.out.println("Lv:" + this.lv);
	}
}