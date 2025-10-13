/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
/////////////////////////////////////////////////////////////////////////////////////////////
import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        for (int i = 0; i < t; i++) {  // test case
            String s = sc.next();
            String res = new String(Base64.getDecoder().decode(s));
 
            System.out.println("#" + (i+1) + " " + res);
        }
    }
}
