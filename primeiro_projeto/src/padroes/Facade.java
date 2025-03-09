package padroes;

public class Facade {

    public void converterVideo(String filename, String format) {
        VideoFile videoFile = new VideoFile(filename);
        CodecFactory codecFactory = new CodecFactory();
        BitrateReader bitrateReader = new BitrateReader();
        AudioMixer audioMixer = new AudioMixer();

        Object codec;
        if (format.equalsIgnoreCase("mp4")) {
            codec = new MPEG4CompressionCodec();
        } else {
            codec = new OggCompressionCodec();
        }

        System.out.println("Converting " + filename + " to format " + format + "...");
        
        bitrateReader.read(videoFile);
        audioMixer.mix();
        
        System.out.println("Conversion completed!");
    }
}

class VideoFile {
    private String filename;

    public VideoFile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }
}

class BitrateReader {
    public void read(VideoFile file) {
        System.out.println("Reading bitrate from " + file.getFilename());
    }
}

class AudioMixer {
    public void mix() {
        System.out.println("Mixing audio...");
    }
}

class CodecFactory {
    public Object getCodec(String format) {
        if (format.equalsIgnoreCase("mp4")) {
            return new MPEG4CompressionCodec();
        } else {
            return new OggCompressionCodec();
        }
    }
}

class OggCompressionCodec {
    public OggCompressionCodec() {
        System.out.println("OggCompressionCodec created");
    }
}

class MPEG4CompressionCodec {
    public MPEG4CompressionCodec() {
        System.out.println("MPEG4CompressionCodec created");
    }
}