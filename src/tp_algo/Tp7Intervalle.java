package tp_algo;

public class Tp7Intervalle {

	
	public static void main(String[] args) {
		
	}
	
	public static boolean between(long value, long min, long max) {
		return value >= min && value <=max;
	}

	public static boolean overlap(long start1, long end1, long start2, long end2) {
		if(start2 > end1) return false;
		if(end2 < start1) return false;
		return true;
		// OK return start2 > end1 || end2 < start1 ? false: true;
		// OK !!! return !(start2 > end1 || end2 < start1);
		// methode 1 : 4 cas: 
		      /*
		       			start1                  end1
		 cas1      start2       end2
		 cas2      start2                                 end2
		 cas3                   start2   end2            
		 cas4                   start2                    end2
		 
		 cas qui chevauchent pas sont : 
		 cas5     start2    end2      start1  end1
		 cas6:    start1    end1     start2   end2      **/
		
	}
}
