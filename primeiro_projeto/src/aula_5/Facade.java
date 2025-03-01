package aula_5;

public class Facade {
	
	class VideoConverter{
		<CodecFactory> void converterVideo(String filename, String format) {
			VideoFile videoFile = new VideoFile(filename);
	        BitrateReader bitrateReader = new BitrateReader();
	        AudioMixer audioMixer = new AudioMixer();
	        CodecFactory codecFactory = new CodecFactory();
	        VideoConverter videoConverter = new VideoConverter();
		}
	}
	
	class VideoFile {

		public VideoFile(String filename) {
			// TODO Auto-generated constructor stub
		}
		
	}
	
	class AudioMixer{
			
	}
	
	class BitrateReader{
		
	}
	
	class CodecFactiry{
		
	}

	class OggCompressionCodec{
		
	}
	
	class MPEG4CompressionCodec{
		
	}
	

}
