package data.structure;

public class TestException {
	
	public static class BusinessException extends Exception{
		public BusinessException(String string, RandomException e) {
			super(string,e);
		}

		private static final long serialVersionUID = 1L;
	}
	
	public static class RandomException extends Exception {
		private static final long serialVersionUID = 1L;
	}
	
	public static void doRandom() throws RandomException {
		if(Math.random()>0.9) {
			throw new RandomException();
		}
		System.out.println("TOTO EST PASSE");
	}
	
	public static void useRandom() throws Exception , BusinessException, RandomException  {
		
			try {
				doRandom();
			} catch (RandomException e) {
				System.out.println("OULALA CA CEST PAS BIEN PASSE");
				throw new BusinessException("EN desssous ca va bien !",e);
			}
		
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
				try {
					useRandom();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
