package estrutura_de_dados;
import java.util.Scanner;

public class Command {
    private static Scanner scanner;

    public static void main(String[] args) {
        // Criando o objeto Aplication com os parâmetros corretos
        CommandHistory history = new CommandHistory(); // Inicializando o histórico
        Aplication buttons = new Aplication(new String[] {"Editor1", "Editor2"}, "Editor1", history);
        
        // Exemplo de como executar o comando
        buttons.executeCommand(new CopyCommand("Editor1", "Copying text", "Backup"));
        buttons.executeCommand(new PasteCommand("Editor1", "Pasting text", "Backup"));
    }

    // Classe Aplication, que simula um aplicativo com editores
    static class Aplication {
        private String[] editors;
        private String activeEditor;
        private CommandHistory history;

        public Aplication(String[] editors, String activeEditor, CommandHistory history) {
            this.editors = editors;
            this.activeEditor = activeEditor;
            this.history = history;
        }

        public void executeCommand(Command command) {
            command.execute();
            history.push(command); // Salva o comando no histórico
        }

        public void undo() {
            Command lastCommand = history.pop();
            if (lastCommand != null) {
                lastCommand.undo();
            }
        }
    }

    // Classe CommandHistory que gerencia o histórico de comandos
    static class CommandHistory {
        private Command[] history;
        private int index = 0;

        public CommandHistory() {
            this.history = new Command[10]; // Capacidade inicial de 10 comandos
        }

        // Adiciona o comando ao histórico
        void push(Command c) {
            if (index < history.length) {
                history[index++] = c;
            }
        }

        // Retira o último comando do histórico
        Command pop() {
            if (index > 0) {
                return history[--index];
            }
            return null; // Caso não haja comando no histórico
        }
    }

    // Classe Command, que é a base para outros tipos de comandos
    static class Command {
        private String app;
        private String editor;
        private String backup;

        public Command(String app, String editor, String backup) {
            this.app = app;
            this.editor = editor;
            this.backup = backup;
        }

        // Método que executa o comando
        void execute() {
            // Implementação do comando
        }

        // Método que desfaz a execução do comando
        void undo() {
            // Implementação de desfazer
        }
    }

    // Comandos específicos, como CopyCommand, CutCommand, etc.
    static class CopyCommand extends Command {
        public CopyCommand(String app, String editor, String backup) {
            super(app, editor, backup);
        }

        @Override
        void execute() {
            System.out.println("Copiando texto...");
        }
    }

    static class CutCommand extends Command {
        public CutCommand(String app, String editor, String backup) {
            super(app, editor, backup);
        }

        @Override
        void execute() {
            System.out.println("Cortando texto...");
        }
    }

    static class PasteCommand extends Command {
        public PasteCommand(String app, String editor, String backup) {
            super(app, editor, backup);
        }

        @Override
        void execute() {
            System.out.println("Colando texto...");
        }
    }

    static class UndoCommand extends Command {
        public UndoCommand(String app, String editor, String backup) {
            super(app, editor, backup);
        }

        @Override
        void execute() {
            System.out.println("Desfazendo ação...");
        }
    }

    // Classe Editor, que simula um editor de texto
    static class Editor {
        private String text;

        public Editor(String text) {
            this.text = text;
        }

        public void getSelection() {
            // Retorna o texto selecionado
        }

        public void deleteSelection() {
            // Deleta o texto selecionado
        }

        public void replaceSelection(String text) {
            // Substitui o texto selecionado
            this.text = text;
        }
    }
}
