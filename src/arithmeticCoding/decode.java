package arithmeticCoding;

import java.math.*;

public class decode {
		public String[] decoding(double C) {
			String[] string2 = {"a","b","c","d"};
			double[] A1 = {10 ,100,1000,1000} ; //字符发送概率
			double [] B1 = {0.0,0.1,0.110,0.111,1.0};  //叠加概率
			String[] strings = new String[4];
			int flag = 0 ;
			for(int j = 0 ; j < 4 ; j++){
				for(int i = 1 ;i < 5 ;i++){
					if (C >= B1[i-1] && C < B1[i]) {
						strings[j] = string2[i-1];
						flag = i-1 ;
					}
				}	
				BigDecimal c = new BigDecimal(Double.toString(C));
				BigDecimal d = new BigDecimal(Double.toString(B1[flag]));
				C = c.subtract(d).doubleValue();
				BigDecimal a = new BigDecimal(Double.toString(C));
				BigDecimal b = new BigDecimal(Double.toString(A1[flag]));
				C = a.multiply(b).doubleValue();
			}
			return strings ;
		}
}
