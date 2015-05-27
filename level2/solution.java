package​ ​com.google.challenges;​ ​

public​ ​class​ ​Answer​ ​{​ ​​ ​​ ​
​ ​​ ​​ ​​ ​public​ ​static​ ​int​ ​answer(int[]​ ​x)​ ​{​ ​
		int sum = 0;

		for(int num : x){
			sum += num;
		}

		if((int result = sum % x.length) != 0)
			return result;
		else
			return x.length;
​ ​​ ​​ ​​ ​}​ ​
}