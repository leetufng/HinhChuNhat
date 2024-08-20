package LeTung_20109351;

import java.util.Scanner;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if (d>0) {
			this.chieuDai = d;
		} else {
			System.out.println("loi");

		}
		
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r<=0) {
			System.out.println("loi");
			
		} else {
			this.chieuRong = r;
		}
		
	}
	public HinhChuNhat( ) {}
	public HinhChuNhat(double d, double r) {
			if (d>0) {
				this.chieuDai = d;
			} else {
				System.out.println("loi");

			}
			if (r<=0) {
				System.out.println("loi");
				
			} else {
				this.chieuRong = r;
			}
		
	
	}
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
		
	}
	public String toString() {
		System.out.printf("10s, ");
		return super.toString();
	}
	public static void main(String[] args) {
		HinhChuNhat h1= new HinhChuNhat();
		h1.setChieuDai(5);
		h1.setChieuRong(3);
		System.out.println("ket qua");
		System.out.println("chieu dai la:"+h1.getChieuDai());
		System.out.println("chieu rong la:"+h1.getChieuRong());
		System.out.println("chu vi la:"+h1.getChuVi());
		System.out.println("dien tich la:"+h1.getDienTich());
		HinhChuNhat h2= new HinhChuNhat(10, 8);
		System.out.println("ket qua");
		System.out.println("chieu dai la:"+h2.getChieuDai());
		System.out.println("chieu rong la:"+h2.getChieuRong());
		System.out.println("chu vi la:"+h2.getChuVi());
		System.out.println("dien tich la:"+h2.getDienTich());
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap tu ban phim");
		System.out.println("nhap chieu dai:");
		double d= sc.nextDouble();
		h1.setChieuDai(d);
		System.out.println("nhap chieu rong");
		double r= sc.nextDouble();
		h1.setChieuRong(r);
		
	}
}
