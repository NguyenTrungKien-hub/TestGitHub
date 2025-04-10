package OOP;

import java.util.*;
class Sinhvien {
	private String mssv;
	private String name;
	private float diemLT;
	private float diemTH;

	Sinhvien() {}
	Sinhvien(String mssv, String name, float diemLT, float diemTH) {
		this.mssv = mssv;
		this.name = name;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public void setMssv(String mssv)
	{
		this.mssv=mssv;
	}
	public String getMssv()
	{
		return this.mssv;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setDiemLtT(float diemLT)
	{
		this.diemLT = diemLT;
	}
	public float getDiemLT()
	{
		return this.diemLT;
	}
	public void setDiemHT(float diemTH)
	{
		this.diemTH=diemTH;
	}
	public float getDiemHT()
	{
		return this.diemTH;
				
	}
	public double Average()
	{
		return (this.diemTH + this.diemLT) / 2;
	}
	public String toString()
	{
		return ("MSSV:" +this.mssv+ "Name:" +this.name+ "DiemLT:" +this.diemLT+ "Diem TH:" +diemTH);
	}
}
public class SINHVIEN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sinhvien sv1 = new Sinhvien("29219049544" , "Nguyen Trung Kien" , 8 , 8);
		Sinhvien sv2 = new Sinhvien("29219048272","Nguyen Gia Bao", 9 ,7);
		Sinhvien sv3 = new Sinhvien();
		System.out.println("Nhap MSSv sv3 :");
		String a = sc.nextLine();
		sv3.getMssv();
		System.out.println("Nhap ten sv3 :");
		String b = sc.nextLine();
		sv3.getName();
		System.out.println("Nhap diemLT sv3 :");
		float c = sc.nextFloat();
		sv3.getDiemLT();
		System.out.println("Nhap diemTH sv3 :");
		float d = sc.nextFloat();
		sv3.getDiemHT();
		ArrayList<Sinhvien> arrList = new ArrayList<>();
		arrList.add(sv1);
		arrList.add(sv2);
		arrList.add(sv3);
		for (Sinhvien sv : arrList) {
			System.out.println(sv.toString());
		}
		Sinhvien topStudent = arrList.get(0);
		for (Sinhvien sv : arrList) {
			if (sv.Average() > topStudent.Average()) {
				topStudent = sv;
			}
		}
		System.out.println("Sinh vien voi diem cao nhat : " +topStudent.getName());
		sc.close();
		

	}

}
