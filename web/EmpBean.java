package web;

public class EmpBean {

	//フィールドの設定
	private String name = null;
	private int age = 0;

	//getter及びsetterの設定
	//フィールドのnameを取得し返す
	public String getName() {
		return name;
	}
	//フィールドのnameに引数として受け取った値を設定する
	public void setName(String name) {
		this.name = name;
	}
	//フィールドのageを取得し返す
	public int getAge() {
		return age;
	}
	//フィールドのageに引数として受け取った値を設定する
	public void setAge(int age) {
		this.age = age;
	}
}
