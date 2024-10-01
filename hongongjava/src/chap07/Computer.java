package chap07;

public class Computer extends Calculator{
	//메소드 재정의
	@Override // 부모객체 재정의
	double areaCircle(double r) {// 선언부는 수정 못함
		
		// return super.areaCircle(r); //내용은 수정 가능
		return Math.PI * r * r;
	}
	
	double ac(double r) {
		if(r >= 10) {
			double rs = super.areaCircle(r);
			return rs;
		}else {
			double rs = areaCircle(r);
			return rs;
		}
	}
}//end class
