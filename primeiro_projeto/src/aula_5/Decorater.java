package aula_5;

public class Decorater {

	interface DataSource{
		void writeData(String data);
		void readData();
			
	}
	

	class FileDataSource implements DataSource{
		private String filename;
		
		FileDataSource(String filename){
			this.filename = filename;
		}

		public String getFilename() {
			return filename;
		}

		public void setFilename(String filename) {
			this.filename = filename;
		}
		
		void FileDataSource1(final String filename) {
			// TODO Auto-generated method stub
		}
		

		public void writeData(String data) {
			// TODO Auto-generated method stub
			
		}

		public void readData() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class DataSourceDecorater implements DataSource{
		private DataSource wrappee;

		@Override
		public void writeData(String data) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void readData() {
			// TODO Auto-generated method stub
			
		}
	}
	
	
}
