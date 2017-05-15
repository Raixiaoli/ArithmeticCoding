package arithmeticCoding;
import java.math.*;


public class code {
	public double coding (String[] string1,String[] string2) {
		double A = 1.0 ,C = 0.0 ;
		double[] A1 = {0.1 ,0.01,0.001,0.001} ; //字符发送概率
		double[] B1 = {0.0,0.1,0.11,0.111};  //叠加概率
		double[] A2 = new double[4];
		double[] B2 = {0,0,0,0};
	    for(int i=0;i<4;i++){
	        for(int j=0;j<4;j++){
	        	if(string1[i].equals(string2[j])) {
	        		A2[i] = A1[j];
	        		B2[i] = B1[j];
				}
	        }
	    }
	    for (int i = 0; i < 4; i++) {
        	BigDecimal c = new BigDecimal(Double.toString(C));
			BigDecimal d = new BigDecimal(Double.toString(B2[i]));
			BigDecimal a = new BigDecimal(Double.toString(A));
			BigDecimal b = new BigDecimal(Double.toString(A2[i]));
			BigDecimal e = new BigDecimal(Double.toString(a.multiply(d).doubleValue()));
			C = c.add(e).doubleValue();
			A = a.multiply(b).doubleValue(); 	
		}
        String string3 = Double.toString(C);
        char a[] = string3.toCharArray();
        System.out.println("序列的编码的为：" + new String(a,2,a.length-2));
        return C ;
	}
}
