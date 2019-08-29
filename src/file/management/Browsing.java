package file.management;

import java.io.File;
import java.util.HashMap;

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
			sizeMap.clear();
			File root = new File(path);
			getSize(root);
			fileviewWithSize(root, "");
		}
		private static void fileviewWithSize(File file, String indent) {
			CPT_NODE++;
			if(file.isFile()) {
				System.out.println(indent+file.getName()+ " == "+toMb(sizeMap.get(file.getAbsolutePath())));
			}
			if(file.isDirectory()) {
				// calculer d'abords la taille
				System.out.println(indent+file.getName()+ " == "+toMb(sizeMap.get(file.getAbsolutePath())));
				
				for(File f: file.listFiles())fileviewWithSize(f, indent+INDENT);
			}
			
		}
		
		private static HashMap<String, Long> sizeMap = new HashMap<>();
		
		private static long getSize(File file) {
			CPT_SIZE++;
			if(file.isFile()) {
				sizeMap.put(file.getAbsolutePath(), file.length());
				// j'ai une préférence pour le absolute path qui est sensé être le plus complet
				// ne pas utiliser le file.getName() car si plusieurs fichiers de meme nom dans des répertoires 
				// différentes alors bug
				return file.length();
			}
			if(file.isDirectory()) {
				long res = 0;
				for(File f: file.listFiles()) res+=getSize(f);
				sizeMap.put(file.getAbsolutePath(), res);
				return res;
			}
			// si ni fichier ni repertoire
			return 0;
		}
		
		
		
		public static void main(String[] args) throws Exception{
			
			fileviewWithSize("C:\\Users\\fabien\\OneDrive\\pro\\_FORMATION");
			System.out.println(CPT_NODE+"  "+CPT_SIZE);
		}

}
