package padroes;

class Player {
    private State state;
    private String UI = "Default UI";
    private int volume = 50;
    private String[] playlist = {"Song 1", "Song 2", "Song 3"};
    private String currentSong = playlist[0];

    public Player() {
        this.state = new ReadyState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }

    public void startPlayback() {
        System.out.println("Iniciando reprodução: " + currentSong);
    }

    public void stopPlayback() {
        System.out.println("Parando reprodução.");
    }

    public void nextSong() {
        int currentIndex = -1;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i].equals(currentSong)) {
                currentIndex = i;
                break;
            }
        }
        if (currentIndex != -1 && currentIndex < playlist.length - 1) {
            currentSong = playlist[currentIndex + 1];
            System.out.println("Próxima música: " + currentSong);
        } else {
            System.out.println("Não há próxima música.");
        }
    }

    public void previousSong() {
        int currentIndex = -1;
        for (int i = 0; i < playlist.length; i++) {
            if (playlist[i].equals(currentSong)) {
                currentIndex = i;
                break;
            }
        }
        if (currentIndex != -1 && currentIndex > 0) {
            currentSong = playlist[currentIndex - 1];
            System.out.println("Música anterior: " + currentSong);
        } else {
            System.out.println("Não há música anterior.");
        }
    }

    public void fastForward() {
        System.out.println("Avançando música.");
    }

    public void rewind() {
        System.out.println("Retrocedendo música.");
    }

    public String getUI() {
        return UI;
    }

    public int getVolume() {
        return volume;
    }

    public String getCurrentSong() {
        return currentSong;
    }
}

abstract class State {
    protected Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract void clickLock();
    public abstract void clickPlay();
    public abstract void clickNext();
    public abstract void clickPrevious();
}

class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public void clickLock() {
        System.out.println("Bloqueando player...");
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        System.out.println("Iniciando reprodução...");
        player.startPlayback();
        player.changeState(new PlayingState(player));
    }

    @Override
    public void clickNext() {
        System.out.println("Pulando para a próxima música...");
        player.nextSong();
    }

    @Override
    public void clickPrevious() {
        System.out.println("Voltando para a música anterior...");
        player.previousSong();
    }
}

class LockedState extends State {
    public LockedState(Player player) {
        super(player);
    }

    @Override
    public void clickLock() {
        System.out.println("Desbloqueando player...");
        player.changeState(new ReadyState(player));
    }

    @Override
    public void clickPlay() {
        System.out.println("Player bloqueado. Não é possível reproduzir.");
    }

    @Override
    public void clickNext() {
        System.out.println("Player bloqueado. Não é possível pular música.");
    }

    @Override
    public void clickPrevious() {
        System.out.println("Player bloqueado. Não é possível voltar música.");
    }
}

class PlayingState extends State {
    public PlayingState(Player player) {
        super(player);
    }

    @Override
    public void clickLock() {
        System.out.println("Bloqueando player...");
        player.changeState(new LockedState(player));
    }

    @Override
    public void clickPlay() {
        System.out.println("Parando reprodução...");
        player.stopPlayback();
        player.changeState(new ReadyState(player));
    }

    @Override
    public void clickNext() {
        System.out.println("Pulando para a próxima música...");
        player.nextSong();
    }

    @Override
    public void clickPrevious() {
        System.out.println("Voltando para a música anterior...");
        player.previousSong();
    }
}

public class STATE {
    public static void main(String[] args) {
        Player player = new Player();

        player.clickPlay();
        player.clickNext();
        player.clickLock();
        player.clickPlay();
        player.clickLock();
        player.clickPrevious();
    }
}