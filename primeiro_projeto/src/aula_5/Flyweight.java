package aula_5;

public class Flyweight {

	class TreeFactory extends TreeType{

		private String[] treeTypes;

		public TreeFactory(String name, String color, String texture, String[] treeTypes) {
			super(name, color, texture);
			this.treeTypes = treeTypes;
		}
		

		public String[] getTreeTypes(String name, String color, String texture) {
			return treeTypes;
		}

		public void setTreeTypes(String[] treeTypes) {
			this.treeTypes = treeTypes;
		}
		
		
		
	}
	
	class TreeType{
		
		private String name;
		private String color;
		private String texture;
		
		public TreeType(String name, String color, String texture) {
			super();
			this.name = name;
			this.color = color;
			this.texture = texture;
		}
		
		public void treeType(String name, String color, String texture) {
			
		}
		
		public void draw(String canvas, int x, int y) {
			
		}
		
	}
}
