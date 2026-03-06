public class Static {
    public static void main(String[] args) {
        Data d= new Data();
        d.schoolName = "Jana Jyoti Secondary Lalbandi, Sarlahi";
        d.getName(23, 75);
        d.setName();

        Data d2= new Data();
        System.out.println(d2.schoolName);
    }
}

class Data{
	static String schoolName;
    int marks, percentage;

	void getName(int marks,  int  percentage){
        this.marks= marks;
		this.percentage = percentage;
	}
	void setName(){
		System.out.println(marks);
		System.out.println(percentage);
	}
}