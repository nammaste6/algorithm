public class HappyNumberSolution {
    static Set<Integer> m = new HashSet<Integer>();
    public boolean isHappy(int n){
	int result = n;
	while(result >= 10){
	    result = recursive(result);
	    if(m.contains(result)) return false;
	    m.add(result);
    	}
	if(result == 1 || result == 7) return true;
	return false;
    }

    public static int recursive(int n){
	int result = 0;
	while(n >= 10){
	    int tmp = n%10;
	    if(tmp == 0 && n/10 == 1 && result == 0) return 1;
	    result += tmp * tmp;
	    n = n/10;
	}
	result += n*n;
	return result;
    }
}
