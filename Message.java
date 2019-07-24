public final class Message {

    private static int idCount = 1;

    private static int nextId() {
        return idCount++;
    }

    final String messageBody;
    final Long deliveryDelayMs;
    final Integer messageId;

    Message(String messageBody) {
        this(messageBody, 0L);
    }

    Message(
        String messageBody,
        Long deliveryDelayMs
    ) {
        this.messageId = nextId();
        this.messageBody = messageBody;
        this.deliveryDelayMs = deliveryDelayMs;
    }

}
