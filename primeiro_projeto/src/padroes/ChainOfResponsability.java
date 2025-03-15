package estrutura_de_dados;

import java.util.Scanner;

public class ChainOfResponsibility {

    // The Component interface defines the common behavior for all components
    interface Component {
        void showHelp();  // method to show help for a component
    }

    // Panel class, responsible for handling help related to a modal
    static class Panel implements Component {
        private String modalHelpText;
        private Component nextComponent;  // This represents the 'parent' component in the chain

        public Panel(String modalHelpText) {
            this.modalHelpText = modalHelpText;
        }

        // Set the next component in the chain
        public void setNextComponent(Component nextComponent) {
            this.nextComponent = nextComponent;
        }

        @Override
        public void showHelp() {
            if (modalHelpText != null) {
                System.out.println("Showing modal help: " + modalHelpText);
            } else if (nextComponent != null) {
                nextComponent.showHelp();  // Pass request to next component
            } else {
                System.out.println("No help available.");
            }
        }
    }

    // Dialog class, responsible for handling help related to a wiki page
    static class Dialog implements Component {
        private String wikiPageURL;
        private Component nextComponent;

        public Dialog(String wikiPageURL) {
            this.wikiPageURL = wikiPageURL;
        }

        // Set the next component in the chain
        public void setNextComponent(Component nextComponent) {
            this.nextComponent = nextComponent;
        }

        @Override
        public void showHelp() {
            if (wikiPageURL != null) {
                System.out.println("Opening wiki page: " + wikiPageURL);
            } else if (nextComponent != null) {
                nextComponent.showHelp();  // Pass request to next component
            } else {
                System.out.println("No help available.");
            }
        }
    }

    // Component class with tooltip text
    static class ComponentWithTooltip implements Component {
        private String tooltipText;
        private Component nextComponent;

        public ComponentWithTooltip(String tooltipText) {
            this.tooltipText = tooltipText;
        }

        // Set the next component in the chain
        public void setNextComponent(Component nextComponent) {
            this.nextComponent = nextComponent;
        }

        @Override
        public void showHelp() {
            if (tooltipText != null) {
                System.out.println("Showing tooltip: " + tooltipText);
            } else if (nextComponent != null) {
                nextComponent.showHelp();  // Pass request to next component
            } else {
                System.out.println("No help available.");
            }
        }
    }

    // Main method to test the chain of responsibility pattern
    public static void main(String[] args) {
        // Create different components
        Panel panel = new Panel("This is a help modal");
        Dialog dialog = new Dialog("http://example.com/help");
        ComponentWithTooltip component = new ComponentWithTooltip("This is a tooltip");

        // Build the chain: Panel -> Dialog -> Component
        panel.setNextComponent(dialog);
        dialog.setNextComponent(component);

        // Now calling showHelp on the panel should propagate through the chain
        panel.showHelp();
    }
}
