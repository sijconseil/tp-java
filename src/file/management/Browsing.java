package file.management;

import java.io.File;

public class Browsing {
		public static final String INDENT = "\t";
		
		public static int CPT_NODE= 0;
		public static int CPT_SIZE= 0;
	
		public static void fileview(String path) {
			fileviewIndent(new File(path), "");
		}
	
		private static void fileviewIndent(File file, String indent) {
			System.out.println(indent+file.getName());
			if (!file.isDirectory()) return ;
			for(File f: file.listFiles()) fileviewIndent(f, indent+INDENT);
		}
		public static float MB = 1024*1024;
		private static float toMb(long length) {
			return length/MB;
		}
		
		public static void fileviewWithSize(String path) {
			fileviewWithSize(new File(path), "");
		}
		private static void fileviewWithSize(File file, String indent) {
			CPT_NODE++;
			if(file.isFile()) {
				System.out.println(indent+file.getName()+ " == "+toMb(file.length()));
			}
			if(file.isDirectory()) {
				// calculer d'abords la taille
				System.out.println(indent+file.getName()+ " == "+toMb(getSize(file)));
				
				for(File f: file.listFiles())fileviewWithSize(f, indent+INDENT);
			}
			
		}
		
		
		private static long getSize(File file) {
			CPT_SIZE++;
			if(file.isFile()) {
				return file.length();
			}
			if(file.isDirectory()) {
				long res = 0;
				for(File f: file.listFiles()) res+=getSize(f);
				return res;
			}
			// si ni fichier ni repertoire
			return 0;
		}
		
		
		
		public static void main(String[] args) {
			fileviewWithSize("C:\\Users\\fabien\\OneDrive\\pro\\_FORMATION");
			System.out.println(CPT_NODE+"  "+CPT_SIZE);
		}

}
