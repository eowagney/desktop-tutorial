package padroes;

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
		
		

		public DataSourceDecorater(DataSource wrappee) {
			super();
			this.wrappee = wrappee;
		}

		public void DataSourceDecorator(DataSource s) {
			
		}
		@Override
		public void writeData(String data) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void readData() {
			// TODO Auto-generated method stub
			
		}
	}
	
	 class EncrypitionDecorator extends DataSourceDecorater{

		public EncrypitionDecorator(DataSource wrappee) {
			super(wrappee);
			// TODO Auto-generated constructor stub
		}
		
		
	}
	
	 class CompressionDecorar extends DataSourceDecorater{

		public CompressionDecorar(DataSource wrappee) {
			super(wrappee);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	
}
