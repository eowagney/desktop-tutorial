package aula_5;

public class Proxy {

	public class Facade {
	    
	    // Subclasses internas
	    class VideoConverter {
	        void converterVideo(String filename, String format) {
	            System.out.println("Convertendo vídeo: " + filename + " para o formato " + format);
	        }
	    }
	    
	    class VideoFile {
	        String filename;
	        
	        VideoFile(String filename) {
	            this.filename = filename;
	        }
	    }
	    
	    class AudioMixer {
	        void mixAudio() {
	            System.out.println("Misturando áudio...");
	        }
	    }
	    
	    class BitrateReader {
	        void read(String filename) {
	            System.out.println("Lendo o arquivo de vídeo: " + filename);
	        }
	    }
	    
	    class CodecFactory {
	        String getCodec(String format) {
	            if (format.equalsIgnoreCase("ogg")) {
	                return "OggCompressionCodec";
	            } else if (format.equalsIgnoreCase("mp4")) {
	                return "MPEG4CompressionCodec";
	            }
	            return "Codec Desconhecido";
	        }
	    }
	    
	    class OggCompressionCodec {
	        void compress() {
	            System.out.println("Comprimindo com Ogg...");
	        }
	    }
	    
	    class MPEG4CompressionCodec {
	        void compress() {
	            System.out.println("Comprimindo com MPEG4...");
	        }
	    }
	    
	    // Método Facade para simplificar a interação com o usuário
	    public void processarVideo(String filename, String format) {
	        // Instanciando as classes internas
	        VideoFile videoFile = new VideoFile(filename);
	        BitrateReader bitrateReader = new BitrateReader();
	        AudioMixer audioMixer = new AudioMixer();
	        CodecFactory codecFactory = new CodecFactory();
	        VideoConverter videoConverter = new VideoConverter();
	        
	        // Lógica para processar o vídeo
	        bitrateReader.read(filename);
	        
	        String codec = codecFactory.getCodec(format);
	        
	        if (codec.equals("OggCompressionCodec")) {
	            OggCompressionCodec oggCodec = new OggCompressionCodec();
	            oggCodec.compress();
	        } else if (codec.equals("MPEG4CompressionCodec")) {
	            MPEG4CompressionCodec mpegCodec = new MPEG4CompressionCodec();
	            mpegCodec.compress();
	        } else {
	            System.out.println("Codec não suportado.");
	        }
	        
	        audioMixer.mixAudio();
	        videoConverter.converterVideo(filename, format);
	    }
	    
	    public static void main(String[] args) {
	        // Criando a fachada para facilitar o uso
	        Facade facade = new Facade();
	        
	        // Exemplo de uso com entrada do usuário
	        facade.processarVideo("video_exemplo.mp4", "mp4");
	    }
	}

	
}
