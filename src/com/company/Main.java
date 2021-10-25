package com.company;

public class Main
{
    public static void main(String[] args)
    {
	    boolean flag = false;
	    int [] a = {1, 2, 3};
	    int [] b = {4, 5};

	    for (int n = 0; n < a.length; n++)
	    {
	    	int m = 0;
			while (m < b.length && !flag)
			{
				if (a[n] == b[m])
					flag = true;
				m++;
			}
		}
        System.out.println (flag);
    }
}
