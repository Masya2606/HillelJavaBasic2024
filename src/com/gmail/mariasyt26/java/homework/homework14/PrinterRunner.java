package com.gmail.mariasyt26.java.homework.homework14;

public class PrinterRunner implements Printer {
    public static void main(String[] args) {
        /*Car car = new Car();
        System.out.println(car);

        Car.Engine engine = car.new Engine("top engine");
        System.out.println(engine);
        */

        PrinterRunner messagePrinter = new PrinterRunner();
        PrinterRunner.Message message = new Message("", "Maria");
        messagePrinter.print(message);

        PrinterRunner messagePrinter2 = new PrinterRunner();
        PrinterRunner.Message message2 = new Message("hello", "Maria");
        messagePrinter2.print(message2);

        PrinterRunner messagePrinter3 = new PrinterRunner();
        PrinterRunner.Message message3 = new Message("", "");
        messagePrinter3.print(message3);

    }

    @Override
    public void print(Message message) {
        if ((message.getSender() == null || (message.getSender()).equals("")) && (message.getText() == null || (message.getText()).equals(""))) {
            Printer emptyMessage = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyMessage.print(message);
        } else if (message.getSender() == null || (message.getSender()).equals("")) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }
}

