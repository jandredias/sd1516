package pt.upa.broker.ws.cli;

public class BrokerClientException extends Exception {

	private static final long serialVersionUID = 1L;

	public BrokerClientException() {
    }

    public BrokerClientException(String message) {
        super(message);
    }

    public BrokerClientException(Throwable cause) {
        super(cause);
    }

    public BrokerClientException(String message, Throwable cause) {
        super(message, cause);
    }

}
