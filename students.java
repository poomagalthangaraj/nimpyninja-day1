package myfirstpackage;

public class students {
	
    int mark_eng;
    int mark_mat;
    int mark_scie;
    int mark_soc;
    int studnum;
    int total_mark;
    float avg_mark;
	
	public void total(int stud, int m1, int m2, int m3, int m4) {
		
	    total_mark = (m1 + m2 + m3 + m4);
	    System.out.println("Student " + stud + " Total mark is : "+ total_mark);
	    
	}
	
	public void avg(int stud, int m1, int m2, int m3, int m4) {
		
		avg_mark = (total_mark / 4);
	    System.out.println("Student " + stud + " Average mark is : "+ avg_mark);
	    
	}
	
	public static void main(String[] args) {
	    
		students objstudmrk = new students();
		objstudmrk.studnum = 1;
		objstudmrk.mark_eng = 100;
		objstudmrk.mark_mat = 100;
		objstudmrk.mark_scie = 100;
		objstudmrk.mark_soc = 100;
	    
		objstudmrk.total(objstudmrk.studnum, objstudmrk.mark_eng, objstudmrk.mark_mat, objstudmrk.mark_scie, objstudmrk.mark_soc);
		objstudmrk.avg(objstudmrk.studnum, objstudmrk.mark_eng, objstudmrk.mark_mat, objstudmrk.mark_scie, objstudmrk.mark_soc);
	    
		students objstudmrk2 = new students();
		objstudmrk2.studnum = 2;
		objstudmrk2.mark_eng = 90;
		objstudmrk2.mark_mat = 90;
		objstudmrk2.mark_scie = 90;
		objstudmrk2.mark_soc = 90;
	    
		objstudmrk2.total(objstudmrk2.studnum, objstudmrk2.mark_eng, objstudmrk2.mark_mat, objstudmrk2.mark_scie, objstudmrk2.mark_soc);
		objstudmrk2.avg(objstudmrk2.studnum, objstudmrk2.mark_eng, objstudmrk2.mark_mat, objstudmrk2.mark_scie, objstudmrk2.mark_soc);
		
		students objstudmrk3 = new students();
		objstudmrk3.total(3, 80, 80, 80, 80);
		objstudmrk3.avg(3, 80, 80, 80, 80);
	    
		students objstudmrk4 = new students();
		objstudmrk4.total(4, 70, 70, 70, 70);
		objstudmrk4.avg(4, 70, 70, 70, 70);
}
}